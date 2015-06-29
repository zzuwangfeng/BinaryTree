package com.main.model;

public class BinaryTree {
	
	
	public void printNode(TreeNode node) {
		System.out.print("----------"+node.getData());
		
	}

	class TreeNode {
		private String data;
		private TreeNode leftNode;
		private TreeNode rightNode;
		
		public TreeNode(String data,TreeNode leftNode,TreeNode rightNode) {
			this.data = data;
			this.leftNode = leftNode;
			this.rightNode = rightNode;
			
		}

		public String getData() {
			return data;
		}

		public void setData(String data) {
			this.data = data;
		}

		public TreeNode getLeftNode() {
			return leftNode;
		}

		public void setLeftNode(TreeNode leftNode) {
			this.leftNode = leftNode;
		}

		public TreeNode getRightNode() {
			return rightNode;
		}

		public void setRightNode(TreeNode rightNode) {
			this.rightNode = rightNode;
		}
	}
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		TreeNode node = tree.init();
		System.out.println("*********************");
		System.out.println("先序遍历。。。。。。。。。");
		tree.xianIterator(node);
		System.out.println("");
		
		tree.turnNode(node);
		System.out.println("*********************");
		System.out.println("翻转二叉树后先序遍历。。。。。。。。。");
		tree.xianIterator(node);
		System.out.println("");
//		System.out.println("*********************");
//		System.out.println("中序遍历。。。。。。");
//		tree.zhongIterator(node);
		
		
		
//		System.out.println("*********************");
//		System.out.println("后序遍历。。。。。。");
//		tree.houIterator(node);
	}
	
	public TreeNode init() {
		  TreeNode D = new TreeNode("D", null, null);  
		  
	        TreeNode H = new TreeNode("H", null, null);  
	  
	        TreeNode I = new TreeNode("I", null, null);  
	  
	        TreeNode J = new TreeNode("J", null, null);  
	  
	        TreeNode P = new TreeNode("P", null, null);  
	  
	        TreeNode G = new TreeNode("G", P, null);  
	  
	        TreeNode F = new TreeNode("F", null, J);  
	  
	        TreeNode E = new TreeNode("E", H, I);  
	  
	        TreeNode B = new TreeNode("B", D, E);  
	  
	        TreeNode C = new TreeNode("C", F, G);  
	  
	        TreeNode A = new TreeNode("A", B, C);  
	  
	        return A;
	}
	
	public void xianIterator(TreeNode node) {
		if (node == null) {
			return;
		}
		this.printNode(node);
		if (node.getLeftNode() != null) {
			this.xianIterator(node.getLeftNode());
		}
		if (node.getRightNode() != null) {
			this.xianIterator(node.getRightNode());
		}
	}
	
	public void zhongIterator(TreeNode node) {
		if (node == null) {
			return;
		}
		if (node.getLeftNode() != null) {
			this.zhongIterator(node.getLeftNode());
		}
		this.printNode(node);
		
		if (node.getRightNode() != null) {
			this.zhongIterator(node.getRightNode());
		}
	}
	
	public void houIterator(TreeNode node) {
		
		if (node == null) {
			return;
		}
		if (node.getLeftNode() != null) {
			this.houIterator(node.getLeftNode());
			
		}
		if (node.getRightNode() != null) {
			this.houIterator(node.getRightNode());
		}
		
		this.printNode(node);
		
	}
	
	public TreeNode turnNode(TreeNode node) {
		if (node == null) {
			return null;
		}
//		this.printNode(node);
		TreeNode tmpNode = null;
		tmpNode = node.getLeftNode();
		node.leftNode = node.getRightNode();
		node.rightNode = tmpNode;
		
		node.leftNode = turnNode(node.getLeftNode());
		node.rightNode = turnNode(node.getRightNode());
		
		return node;
		
	}
}
	
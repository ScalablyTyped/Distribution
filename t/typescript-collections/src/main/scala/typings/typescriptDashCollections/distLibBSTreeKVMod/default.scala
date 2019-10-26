package typings.typescriptDashCollections.distLibBSTreeKVMod

import typings.typescriptDashCollections.distLibUtilMod.ICompareFunction
import typings.typescriptDashCollections.distLibUtilMod.ILoopFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-collections/dist/lib/BSTreeKV", JSImport.Default)
@js.native
/**
  * Creates an empty binary search tree.
  * @class <p>A binary search tree is a binary tree in which each
  * internal node stores an element such that the elements stored in the
  * left subtree are less than it and the elements
  * stored in the right subtree are greater.</p>
  * <p>Formally, a binary search tree is a node-based binary tree data structure which
  * has the following properties:</p>
  * <ul>
  * <li>The left subtree of a node contains only nodes with elements less
  * than the node's element</li>
  * <li>The right subtree of a node contains only nodes with elements greater
  * than the node's element</li>
  * <li>Both the left and right subtrees must also be binary search trees.</li>
  * </ul>
  * <p>If the inserted elements are custom objects a compare function must
  * be provided at construction time, otherwise the <=, === and >= operators are
  * used to compare elements. Example:</p>
  * <pre>
  * function compare(a, b) {
  *  if (a is less than b by some ordering criterion) {
  *     return -1;
  *  } if (a is greater than b by the ordering criterion) {
  *     return 1;
  *  }
  *  // a must be equal to b
  *  return 0;
  * }
  * </pre>
  * @constructor
  * @param {function(Object,Object):number=} compareFunction optional
  * function used to compare two elements. Must return a negative integer,
  * zero, or a positive integer as the first argument is less than, equal to,
  * or greater than the second.
  */
class default[K, V /* <: K */] () extends BSTreeKV[K, V] {
  def this(compareFunction: ICompareFunction[K]) = this()
  /* CompleteClass */
  override var compare: js.Any = js.native
  /* CompleteClass */
  override var nElements: js.Any = js.native
  /* CompleteClass */
  override var root: js.Any = js.native
  /**
    * Adds the specified element to this tree if it is not already present.
    * @param {Object} element the element to insert.
    * @return {boolean} true if this tree did not already contain the specified element.
    */
  /* CompleteClass */
  override def add(element: V): Boolean = js.native
  /**
    * Removes all of the elements from this tree.
    */
  /* CompleteClass */
  override def clear(): Unit = js.native
  /**
    * Returns true if this tree contains the specified element.
    * @param {Object} element element to search for.
    * @return {boolean} true if this tree contains the specified element,
    * false otherwise.
    */
  /* CompleteClass */
  override def contains(element: K): Boolean = js.native
  /**
    * @private
    */
  /* CompleteClass */
  /* private */ override def createNode(element: js.Any): js.Any = js.native
  /**
    * Executes the provided function once for each element present in this tree in inorder.
    * Equivalent to inorderTraversal.
    * @param {function(Object):*} callback function to execute, it is
    * invoked with one argument: the element value, to break the iteration you can
    * optionally return false.
    */
  /* CompleteClass */
  override def forEach(callback: ILoopFunction[V]): Unit = js.native
  /**
    * Returns the height of this tree.
    * @return {number} the height of this tree or -1 if is empty.
    */
  /* CompleteClass */
  override def height(): Double = js.native
  /**
    * @private
    */
  /* CompleteClass */
  /* private */ override def heightAux(node: js.Any): js.Any = js.native
  /**
    * Executes the provided function once for each element present in this tree in
    * in-order.
    * @param {function(Object):*} callback function to execute, it is invoked with one
    * argument: the element value, to break the iteration you can optionally return false.
    */
  /* CompleteClass */
  override def inorderTraversal(callback: ILoopFunction[V]): Unit = js.native
  /**
    * @private
    */
  /* CompleteClass */
  /* private */ override def inorderTraversalAux(node: js.Any, callback: js.Any, signal: js.Any): js.Any = js.native
  /* CompleteClass */
  /* private */ override def insertNode(node: js.Any): js.Any = js.native
  /**
    * Returns true if this tree contains no elements.
    * @return {boolean} true if this tree contains no elements.
    */
  /* CompleteClass */
  override def isEmpty(): Boolean = js.native
  /**
    * Executes the provided function once for each element present in this tree in
    * level-order.
    * @param {function(Object):*} callback function to execute, it is invoked with one
    * argument: the element value, to break the iteration you can optionally return false.
    */
  /* CompleteClass */
  override def levelTraversal(callback: ILoopFunction[V]): Unit = js.native
  /**
    * @private
    */
  /* CompleteClass */
  /* private */ override def levelTraversalAux(node: js.Any, callback: js.Any): js.Any = js.native
  /**
    * Returns the maximum element of this tree.
    * @return {*} the maximum element of this tree or undefined if this tree is
    * is empty.
    */
  /* CompleteClass */
  override def maximum(): js.UndefOr[V] = js.native
  /**
    * @private
    */
  /* CompleteClass */
  /* private */ override def maximumAux(node: js.Any): js.Any = js.native
  /**
    * Returns the minimum element of this tree.
    * @return {*} the minimum element of this tree or undefined if this tree is
    * is empty.
    */
  /* CompleteClass */
  override def minimum(): js.UndefOr[V] = js.native
  /**
    * @private
    */
  /* CompleteClass */
  /* private */ override def minimumAux(node: js.Any): js.Any = js.native
  /**
    * Executes the provided function once for each element present in this tree in post-order.
    * @param {function(Object):*} callback function to execute, it is invoked with one
    * argument: the element value, to break the iteration you can optionally return false.
    */
  /* CompleteClass */
  override def postorderTraversal(callback: ILoopFunction[V]): Unit = js.native
  /**
    * @private
    */
  /* CompleteClass */
  /* private */ override def postorderTraversalAux(node: js.Any, callback: js.Any, signal: js.Any): js.Any = js.native
  /**
    * Executes the provided function once for each element present in this tree in pre-order.
    * @param {function(Object):*} callback function to execute, it is invoked with one
    * argument: the element value, to break the iteration you can optionally return false.
    */
  /* CompleteClass */
  override def preorderTraversal(callback: ILoopFunction[V]): Unit = js.native
  /**
    * @private
    */
  /* CompleteClass */
  /* private */ override def preorderTraversalAux(node: js.Any, callback: js.Any, signal: js.Any): js.Any = js.native
  /**
    * Removes the specified element from this tree if it is present.
    * @return {boolean} true if this tree contained the specified element.
    */
  /* CompleteClass */
  override def remove(element: K): Boolean = js.native
  /**
    * @private
    */
  /* CompleteClass */
  /* private */ override def removeNode(node: js.Any): js.Any = js.native
  /**
    * Looks for the value with the provided search key.
    * @param {Object} element The key to look for
    * @return {Object} The value found or undefined if it was not found.
    */
  /* CompleteClass */
  override def search(element: K): js.UndefOr[V] = js.native
  /**
    * @private
    */
  /* CompleteClass */
  /* private */ override def searchNode(node: js.Any, element: js.Any): js.Any = js.native
  /**
    * Returns the number of elements in this tree.
    * @return {number} the number of elements in this tree.
    */
  /* CompleteClass */
  override def size(): Double = js.native
  /**
    * Returns an array containing all of the elements in this tree in in-order.
    * @return {Array} an array containing all of the elements in this tree in in-order.
    */
  /* CompleteClass */
  override def toArray(): js.Array[V] = js.native
  /**
    * @private
    */
  /* CompleteClass */
  /* private */ override def transplant(n1: js.Any, n2: js.Any): js.Any = js.native
}


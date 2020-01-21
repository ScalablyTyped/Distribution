package typings.typescriptCollections.bstreekvMod

import typings.typescriptCollections.utilMod.ILoopFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BSTreeKV[K, V /* <: K */] extends js.Object {
  var compare: js.Any
  var nElements: js.Any
  var root: js.Any
  /**
    * Adds the specified element to this tree if it is not already present.
    * @param {Object} element the element to insert.
    * @return {boolean} true if this tree did not already contain the specified element.
    */
  def add(element: V): Boolean
  /**
    * Removes all of the elements from this tree.
    */
  def clear(): Unit
  /**
    * Returns true if this tree contains the specified element.
    * @param {Object} element element to search for.
    * @return {boolean} true if this tree contains the specified element,
    * false otherwise.
    */
  def contains(element: K): Boolean
  /**
    * @private
    */
  /* private */ def createNode(element: js.Any): js.Any
  /**
    * Executes the provided function once for each element present in this tree in inorder.
    * Equivalent to inorderTraversal.
    * @param {function(Object):*} callback function to execute, it is
    * invoked with one argument: the element value, to break the iteration you can
    * optionally return false.
    */
  def forEach(callback: ILoopFunction[V]): Unit
  /**
    * Returns the height of this tree.
    * @return {number} the height of this tree or -1 if is empty.
    */
  def height(): Double
  /**
    * @private
    */
  /* private */ def heightAux(node: js.Any): js.Any
  /**
    * Executes the provided function once for each element present in this tree in
    * in-order.
    * @param {function(Object):*} callback function to execute, it is invoked with one
    * argument: the element value, to break the iteration you can optionally return false.
    */
  def inorderTraversal(callback: ILoopFunction[V]): Unit
  /**
    * @private
    */
  /* private */ def inorderTraversalAux(node: js.Any, callback: js.Any, signal: js.Any): js.Any
  /* private */ def insertNode(node: js.Any): js.Any
  /**
    * Returns true if this tree contains no elements.
    * @return {boolean} true if this tree contains no elements.
    */
  def isEmpty(): Boolean
  /**
    * Executes the provided function once for each element present in this tree in
    * level-order.
    * @param {function(Object):*} callback function to execute, it is invoked with one
    * argument: the element value, to break the iteration you can optionally return false.
    */
  def levelTraversal(callback: ILoopFunction[V]): Unit
  /**
    * @private
    */
  /* private */ def levelTraversalAux(node: js.Any, callback: js.Any): js.Any
  /**
    * Returns the maximum element of this tree.
    * @return {*} the maximum element of this tree or undefined if this tree is
    * is empty.
    */
  def maximum(): js.UndefOr[V]
  /**
    * @private
    */
  /* private */ def maximumAux(node: js.Any): js.Any
  /**
    * Returns the minimum element of this tree.
    * @return {*} the minimum element of this tree or undefined if this tree is
    * is empty.
    */
  def minimum(): js.UndefOr[V]
  /**
    * @private
    */
  /* private */ def minimumAux(node: js.Any): js.Any
  /**
    * Executes the provided function once for each element present in this tree in post-order.
    * @param {function(Object):*} callback function to execute, it is invoked with one
    * argument: the element value, to break the iteration you can optionally return false.
    */
  def postorderTraversal(callback: ILoopFunction[V]): Unit
  /**
    * @private
    */
  /* private */ def postorderTraversalAux(node: js.Any, callback: js.Any, signal: js.Any): js.Any
  /**
    * Executes the provided function once for each element present in this tree in pre-order.
    * @param {function(Object):*} callback function to execute, it is invoked with one
    * argument: the element value, to break the iteration you can optionally return false.
    */
  def preorderTraversal(callback: ILoopFunction[V]): Unit
  /**
    * @private
    */
  /* private */ def preorderTraversalAux(node: js.Any, callback: js.Any, signal: js.Any): js.Any
  /**
    * Removes the specified element from this tree if it is present.
    * @return {boolean} true if this tree contained the specified element.
    */
  def remove(element: K): Boolean
  /**
    * @private
    */
  /* private */ def removeNode(node: js.Any): js.Any
  /**
    * Looks for the value with the provided search key.
    * @param {Object} element The key to look for
    * @return {Object} The value found or undefined if it was not found.
    */
  def search(element: K): js.UndefOr[V]
  /**
    * @private
    */
  /* private */ def searchNode(node: js.Any, element: js.Any): js.Any
  /**
    * Returns the number of elements in this tree.
    * @return {number} the number of elements in this tree.
    */
  def size(): Double
  /**
    * Returns an array containing all of the elements in this tree in in-order.
    * @return {Array} an array containing all of the elements in this tree in in-order.
    */
  def toArray(): js.Array[V]
  /**
    * @private
    */
  /* private */ def transplant(n1: js.Any, n2: js.Any): js.Any
}

object BSTreeKV {
  @scala.inline
  def apply[K, V /* <: K */](
    add: V => Boolean,
    clear: () => Unit,
    compare: js.Any,
    contains: K => Boolean,
    createNode: js.Any => js.Any,
    forEach: ILoopFunction[V] => Unit,
    height: () => Double,
    heightAux: js.Any => js.Any,
    inorderTraversal: ILoopFunction[V] => Unit,
    inorderTraversalAux: (js.Any, js.Any, js.Any) => js.Any,
    insertNode: js.Any => js.Any,
    isEmpty: () => Boolean,
    levelTraversal: ILoopFunction[V] => Unit,
    levelTraversalAux: (js.Any, js.Any) => js.Any,
    maximum: () => js.UndefOr[V],
    maximumAux: js.Any => js.Any,
    minimum: () => js.UndefOr[V],
    minimumAux: js.Any => js.Any,
    nElements: js.Any,
    postorderTraversal: ILoopFunction[V] => Unit,
    postorderTraversalAux: (js.Any, js.Any, js.Any) => js.Any,
    preorderTraversal: ILoopFunction[V] => Unit,
    preorderTraversalAux: (js.Any, js.Any, js.Any) => js.Any,
    remove: K => Boolean,
    removeNode: js.Any => js.Any,
    root: js.Any,
    search: K => js.UndefOr[V],
    searchNode: (js.Any, js.Any) => js.Any,
    size: () => Double,
    toArray: () => js.Array[V],
    transplant: (js.Any, js.Any) => js.Any
  ): BSTreeKV[K, V] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), clear = js.Any.fromFunction0(clear), compare = compare.asInstanceOf[js.Any], contains = js.Any.fromFunction1(contains), createNode = js.Any.fromFunction1(createNode), forEach = js.Any.fromFunction1(forEach), height = js.Any.fromFunction0(height), heightAux = js.Any.fromFunction1(heightAux), inorderTraversal = js.Any.fromFunction1(inorderTraversal), inorderTraversalAux = js.Any.fromFunction3(inorderTraversalAux), insertNode = js.Any.fromFunction1(insertNode), isEmpty = js.Any.fromFunction0(isEmpty), levelTraversal = js.Any.fromFunction1(levelTraversal), levelTraversalAux = js.Any.fromFunction2(levelTraversalAux), maximum = js.Any.fromFunction0(maximum), maximumAux = js.Any.fromFunction1(maximumAux), minimum = js.Any.fromFunction0(minimum), minimumAux = js.Any.fromFunction1(minimumAux), nElements = nElements.asInstanceOf[js.Any], postorderTraversal = js.Any.fromFunction1(postorderTraversal), postorderTraversalAux = js.Any.fromFunction3(postorderTraversalAux), preorderTraversal = js.Any.fromFunction1(preorderTraversal), preorderTraversalAux = js.Any.fromFunction3(preorderTraversalAux), remove = js.Any.fromFunction1(remove), removeNode = js.Any.fromFunction1(removeNode), root = root.asInstanceOf[js.Any], search = js.Any.fromFunction1(search), searchNode = js.Any.fromFunction2(searchNode), size = js.Any.fromFunction0(size), toArray = js.Any.fromFunction0(toArray), transplant = js.Any.fromFunction2(transplant))
  
    __obj.asInstanceOf[BSTreeKV[K, V]]
  }
}


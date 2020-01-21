package typings.typescriptCollections.linkedListMod

import typings.typescriptCollections.utilMod.IEqualsFunction
import typings.typescriptCollections.utilMod.ILoopFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkedList[T] extends js.Object {
  /**
    * First node in the list
    * @type {Object}
    * @private
    */
  var firstNode: ILinkedListNode[T] | Null = js.native
  /**
    * Last node in the list
    * @type {Object}
    * @private
    */
  var lastNode: js.Any = js.native
  /**
    * Number of elements in the list
    * @type {number}
    * @private
    */
  var nElements: js.Any = js.native
  /**
    * Adds an element to this list.
    * @param {Object} item element to be added.
    * @param {number=} index optional index to add the element. If no index is specified
    * the element is added to the end of this list.
    * @return {boolean} true if the element was added or false if the index is invalid
    * or if the element is undefined.
    */
  def add(item: T): Boolean = js.native
  def add(item: T, index: Double): Boolean = js.native
  /**
    * Removes all of the elements from this list.
    */
  def clear(): Unit = js.native
  /**
    * Returns true if this list contains the specified element.
    * <p>If the elements inside the list are
    * not comparable with the === operator a custom equals function should be
    * provided to perform searches, the function must receive two arguments and
    * return true if they are equal, false otherwise. Example:</p>
    *
    * <pre>
    * const petsAreEqualByName = function(pet1, pet2) {
    *  return pet1.name === pet2.name;
    * }
    * </pre>
    * @param {Object} item element to search for.
    * @param {function(Object,Object):boolean=} equalsFunction Optional
    * function used to check if two elements are equal.
    * @return {boolean} true if this list contains the specified element, false
    * otherwise.
    */
  def contains(item: T): Boolean = js.native
  def contains(item: T, equalsFunction: IEqualsFunction[T]): Boolean = js.native
  /**
    * @private
    */
  /* private */ def createNode(item: js.Any): js.Any = js.native
  /**
    * Returns the element at the specified position in this list.
    * @param {number} index desired index.
    * @return {*} the element at the given index or undefined if the index is
    * out of bounds.
    */
  def elementAtIndex(index: Double): js.UndefOr[T] = js.native
  /**
    * Returns true if this list is equal to the given list.
    * Two lists are equal if they have the same elements in the same order.
    * @param {LinkedList} other the other list.
    * @param {function(Object,Object):boolean=} equalsFunction optional
    * function used to check if two elements are equal. If the elements in the lists
    * are custom objects you should provide a function, otherwise
    * the === operator is used to check equality between elements.
    * @return {boolean} true if this list is equal to the given list.
    */
  def equals(other: js.Any): Boolean = js.native
  def equals(other: js.Any, equalsFunction: IEqualsFunction[T]): Boolean = js.native
  /**
    * @private
    */
  /* private */ def equalsAux(n1: js.Any, n2: js.Any, eqF: js.Any): js.Any = js.native
  /**
    * Returns the first element in this list.
    * @return {*} the first element of the list or undefined if the list is
    * empty.
    */
  def first(): js.UndefOr[T] = js.native
  /**
    * Executes the provided function once for each element present in this list in order.
    * @param {function(Object):*} callback function to execute, it is
    * invoked with one argument: the element value, to break the iteration you can
    * optionally return false.
    */
  def forEach(callback: ILoopFunction[T]): Unit = js.native
  /**
    * Returns the index in this list of the first occurrence of the
    * specified element, or -1 if the List does not contain this element.
    * <p>If the elements inside this list are
    * not comparable with the === operator a custom equals function should be
    * provided to perform searches, the function must receive two arguments and
    * return true if they are equal, false otherwise. Example:</p>
    *
    * <pre>
    * const petsAreEqualByName = function(pet1, pet2) {
    *  return pet1.name === pet2.name;
    * }
    * </pre>
    * @param {Object} item element to search for.
    * @param {function(Object,Object):boolean=} equalsFunction Optional
    * function used to check if two elements are equal.
    * @return {number} the index in this list of the first occurrence
    * of the specified element, or -1 if this list does not contain the
    * element.
    */
  def indexOf(item: T): Double = js.native
  def indexOf(item: T, equalsFunction: IEqualsFunction[T]): Double = js.native
  /**
    * Returns true if this list contains no elements.
    * @return {boolean} true if this list contains no elements.
    */
  def isEmpty(): Boolean = js.native
  /**
    * Returns the last element in this list.
    * @return {*} the last element in the list or undefined if the list is
    * empty.
    */
  def last(): js.UndefOr[T] = js.native
  /**
    * @private
    */
  /* private */ def nodeAtIndex(index: js.Any): js.Any = js.native
  /**
    * Removes the first occurrence of the specified element in this list.
    * <p>If the elements inside the list are
    * not comparable with the === operator a custom equals function should be
    * provided to perform searches, the function must receive two arguments and
    * return true if they are equal, false otherwise. Example:</p>
    *
    * <pre>
    * const petsAreEqualByName = function(pet1, pet2) {
    *  return pet1.name === pet2.name;
    * }
    * </pre>
    * @param {Object} item element to be removed from this list, if present.
    * @return {boolean} true if the list contained the specified element.
    */
  def remove(item: T): Boolean = js.native
  def remove(item: T, equalsFunction: IEqualsFunction[T]): Boolean = js.native
  /**
    * Removes the element at the specified position in this list.
    * @param {number} index given index.
    * @return {*} removed element or undefined if the index is out of bounds.
    */
  def removeElementAtIndex(index: Double): js.UndefOr[T] = js.native
  /**
    * Reverses the order of the elements in this linked list (makes the last
    * element first, and the first element last).
    */
  def reverse(): Unit = js.native
  /**
    * Returns the number of elements in this list.
    * @return {number} the number of elements in this list.
    */
  def size(): Double = js.native
  /**
    * Returns an array containing all of the elements in this list in proper
    * sequence.
    * @return {Array.<*>} an array containing all of the elements in this list,
    * in proper sequence.
    */
  def toArray(): js.Array[T] = js.native
}


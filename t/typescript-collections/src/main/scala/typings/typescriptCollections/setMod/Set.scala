package typings.typescriptCollections.setMod

import typings.typescriptCollections.utilMod.ILoopFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Set[T] extends js.Object {
  /**
    * Dictionary key and value holds the elements in the set.
    * @type {Object}
    * @protected
    */
  var dictionary: typings.typescriptCollections.dictionaryMod.default[T, _]
  /**
    * Adds the specified element to this set if it is not already present.
    * @param {Object} element the element to insert.
    * @return {boolean} true if this set did not already contain the specified element.
    */
  def add(element: T): Boolean
  /**
    * Removes all of the elements from this set.
    */
  def clear(): Unit
  /**
    * Returns true if this set contains the specified element.
    * @param {Object} element element to search for.
    * @return {boolean} true if this set contains the specified element,
    * false otherwise.
    */
  def contains(element: T): Boolean
  /**
    * Performs a difference between this and another set.
    * Removes from this set all the values that are present in the given set.
    * @param {collections.Set} otherSet other set.
    */
  def difference(otherSet: Set[T]): Unit
  /**
    * Executes the provided function once for each element
    * present in this set.
    * @param {function(Object):*} callback function to execute, it is
    * invoked with one arguments: the element. To break the iteration you can
    * optionally return false.
    */
  def forEach(callback: ILoopFunction[T]): Unit
  /**
    * Performs an intersection between this and another set.
    * Removes all values that are not present this set and the given set.
    * @param {collections.Set} otherSet other set.
    */
  def intersection(otherSet: Set[T]): Unit
  /**
    * Returns true if this set contains no elements.
    * @return {boolean} true if this set contains no elements.
    */
  def isEmpty(): Boolean
  /**
    * Checks whether the given set contains all the elements in this set.
    * @param {collections.Set} otherSet other set.
    * @return {boolean} true if this set is a subset of the given set.
    */
  def isSubsetOf(otherSet: Set[T]): Boolean
  /**
    * Removes the specified element from this set if it is present.
    * @return {boolean} true if this set contained the specified element.
    */
  def remove(element: T): Boolean
  /**
    * Returns the number of elements in this set.
    * @return {number} the number of elements in this set.
    */
  def size(): Double
  /**
    * Returns an array containing all of the elements in this set in arbitrary order.
    * @return {Array} an array containing all of the elements in this set.
    */
  def toArray(): js.Array[T]
  /**
    * Performs a union between this and another set.
    * Adds all values from the given set to this set.
    * @param {collections.Set} otherSet other set.
    */
  def union(otherSet: Set[T]): Unit
}

object Set {
  @scala.inline
  def apply[T](
    add: T => Boolean,
    clear: () => Unit,
    contains: T => Boolean,
    dictionary: typings.typescriptCollections.dictionaryMod.default[T, _],
    difference: Set[T] => Unit,
    forEach: ILoopFunction[T] => Unit,
    intersection: Set[T] => Unit,
    isEmpty: () => Boolean,
    isSubsetOf: Set[T] => Boolean,
    remove: T => Boolean,
    size: () => Double,
    toArray: () => js.Array[T],
    union: Set[T] => Unit
  ): Set[T] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), clear = js.Any.fromFunction0(clear), contains = js.Any.fromFunction1(contains), dictionary = dictionary.asInstanceOf[js.Any], difference = js.Any.fromFunction1(difference), forEach = js.Any.fromFunction1(forEach), intersection = js.Any.fromFunction1(intersection), isEmpty = js.Any.fromFunction0(isEmpty), isSubsetOf = js.Any.fromFunction1(isSubsetOf), remove = js.Any.fromFunction1(remove), size = js.Any.fromFunction0(size), toArray = js.Any.fromFunction0(toArray), union = js.Any.fromFunction1(union))
  
    __obj.asInstanceOf[Set[T]]
  }
}


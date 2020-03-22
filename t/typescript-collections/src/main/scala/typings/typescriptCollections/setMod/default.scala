package typings.typescriptCollections.setMod

import typings.typescriptCollections.utilMod.ILoopFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-collections/dist/lib/Set", JSImport.Default)
@js.native
/**
  * Creates an empty set.
  * @class <p>A set is a data structure that contains no duplicate items.</p>
  * <p>If the inserted elements are custom objects a function
  * which converts elements to strings must be provided. Example:</p>
  *
  * <pre>
  * function petToString(pet) {
  *  return pet.name;
  * }
  * </pre>
  *
  * @constructor
  * @param {function(Object):string=} toStringFunction optional function used
  * to convert elements to strings. If the elements aren't strings or if toString()
  * is not appropriate, a custom function which receives an object and returns a
  * unique string must be provided.
  */
class default[T] () extends Set[T] {
  def this(toStringFunction: js.Function1[/* item */ T, String]) = this()
  /**
    * Dictionary key and value holds the elements in the set.
    * @type {Object}
    * @protected
    */
  /* CompleteClass */
  override var dictionary: typings.typescriptCollections.dictionaryMod.default[T, _] = js.native
  /**
    * Adds the specified element to this set if it is not already present.
    * @param {Object} element the element to insert.
    * @return {boolean} true if this set did not already contain the specified element.
    */
  /* CompleteClass */
  override def add(element: T): Boolean = js.native
  /**
    * Removes all of the elements from this set.
    */
  /* CompleteClass */
  override def clear(): Unit = js.native
  /**
    * Returns true if this set contains the specified element.
    * @param {Object} element element to search for.
    * @return {boolean} true if this set contains the specified element,
    * false otherwise.
    */
  /* CompleteClass */
  override def contains(element: T): Boolean = js.native
  /**
    * Performs a difference between this and another set.
    * Removes from this set all the values that are present in the given set.
    * @param {collections.Set} otherSet other set.
    */
  /* CompleteClass */
  override def difference(otherSet: Set[T]): Unit = js.native
  /**
    * Executes the provided function once for each element
    * present in this set.
    * @param {function(Object):*} callback function to execute, it is
    * invoked with one arguments: the element. To break the iteration you can
    * optionally return false.
    */
  /* CompleteClass */
  override def forEach(callback: ILoopFunction[T]): Unit = js.native
  /**
    * Performs an intersection between this and another set.
    * Removes all values that are not present this set and the given set.
    * @param {collections.Set} otherSet other set.
    */
  /* CompleteClass */
  override def intersection(otherSet: Set[T]): Unit = js.native
  /**
    * Returns true if this set contains no elements.
    * @return {boolean} true if this set contains no elements.
    */
  /* CompleteClass */
  override def isEmpty(): Boolean = js.native
  /**
    * Checks whether the given set contains all the elements in this set.
    * @param {collections.Set} otherSet other set.
    * @return {boolean} true if this set is a subset of the given set.
    */
  /* CompleteClass */
  override def isSubsetOf(otherSet: Set[T]): Boolean = js.native
  /**
    * Removes the specified element from this set if it is present.
    * @return {boolean} true if this set contained the specified element.
    */
  /* CompleteClass */
  override def remove(element: T): Boolean = js.native
  /**
    * Returns the number of elements in this set.
    * @return {number} the number of elements in this set.
    */
  /* CompleteClass */
  override def size(): Double = js.native
  /**
    * Returns an array containing all of the elements in this set in arbitrary order.
    * @return {Array} an array containing all of the elements in this set.
    */
  /* CompleteClass */
  override def toArray(): js.Array[T] = js.native
  /**
    * Performs a union between this and another set.
    * Adds all values from the given set to this set.
    * @param {collections.Set} otherSet other set.
    */
  /* CompleteClass */
  override def union(otherSet: Set[T]): Unit = js.native
}


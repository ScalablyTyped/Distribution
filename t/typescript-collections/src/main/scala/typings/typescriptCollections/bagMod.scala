package typings.typescriptCollections

import typings.typescriptCollections.utilMod.ILoopFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bagMod {
  
  @JSImport("typescript-collections/dist/lib/Bag", JSImport.Default)
  @js.native
  /**
    * Creates an empty bag.
    * @class <p>A bag is a special kind of set in which members are
    * allowed to appear more than once.</p>
    * <p>If the inserted elements are custom objects a function
    * which converts elements to unique strings must be provided. Example:</p>
    *
    * <pre>
    * function petToString(pet) {
    *  return pet.name;
    * }
    * </pre>
    *
    * @constructor
    * @param {function(Object):string=} toStrFunction optional function used
    * to convert elements to strings. If the elements aren't strings or if toString()
    * is not appropriate, a custom function which receives an object and returns a
    * unique string must be provided.
    */
  class default[T] () extends Bag[T] {
    def this(toStrFunction: js.Function1[/* item */ T, String]) = this()
  }
  
  @js.native
  trait Bag[T] extends StObject {
    
    /**
      * Adds nCopies of the specified object to this bag.
      * @param {Object} element element to add.
      * @param {number=} nCopies the number of copies to add, if this argument is
      * undefined 1 copy is added.
      * @return {boolean} true unless element is undefined.
      */
    def add(element: T): Boolean = js.native
    def add(element: T, nCopies: Double): Boolean = js.native
    
    /**
      * Removes all of the elements from this bag.
      */
    def clear(): Unit = js.native
    
    /**
      * Returns true if this bag contains the specified element.
      * @param {Object} element element to search for.
      * @return {boolean} true if this bag contains the specified element,
      * false otherwise.
      */
    def contains(element: T): Boolean = js.native
    
    /**
      * Counts the number of copies of the specified object in this bag.
      * @param {Object} element the object to search for..
      * @return {number} the number of copies of the object, 0 if not found
      */
    def count(element: T): Double = js.native
    
    var dictionary: js.Any = js.native
    
    /**
      * Executes the provided function once for each element
      * present in this bag, including multiple copies.
      * @param {function(Object):*} callback function to execute, it is
      * invoked with one argument: the element. To break the iteration you can
      * optionally return false.
      */
    def forEach(callback: ILoopFunction[T]): Unit = js.native
    
    /**
      * Returns true if this bag contains no elements.
      * @return {boolean} true if this bag contains no elements.
      */
    def isEmpty(): Boolean = js.native
    
    var nElements: js.Any = js.native
    
    /**
      * Removes nCopies of the specified object to this bag.
      * If the number of copies to remove is greater than the actual number
      * of copies in the Bag, all copies are removed.
      * @param {Object} element element to remove.
      * @param {number=} nCopies the number of copies to remove, if this argument is
      * undefined 1 copy is removed.
      * @return {boolean} true if at least 1 element was removed.
      */
    def remove(element: T): Boolean = js.native
    def remove(element: T, nCopies: Double): Boolean = js.native
    
    /**
      * Returns the number of elements in this bag.
      * @return {number} the number of elements in this bag.
      */
    def size(): Double = js.native
    
    /**
      * Returns an array containing all of the elements in this big in arbitrary order,
      * including multiple copies.
      * @return {Array} an array containing all of the elements in this bag.
      */
    def toArray(): js.Array[T] = js.native
    
    /**
      * Returns a set of unique elements in this bag.
      * @return {collections.Set<T>} a set of unique elements in this bag.
      */
    def toSet(): typings.typescriptCollections.setMod.default[T] = js.native
    
    var toStrF: js.Any = js.native
  }
}

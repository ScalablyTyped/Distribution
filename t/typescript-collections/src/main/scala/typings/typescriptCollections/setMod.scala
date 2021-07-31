package typings.typescriptCollections

import typings.typescriptCollections.utilMod.ILoopFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setMod {
  
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
  class default[T] ()
    extends StObject
       with Set[T] {
    def this(toStringFunction: js.Function1[/* item */ T, String]) = this()
    
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
      * Dictionary key and value holds the elements in the set.
      * @type {Object}
      * @protected
      */
    /* CompleteClass */
    var dictionary: typings.typescriptCollections.dictionaryMod.default[T, js.Any] = js.native
    
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
  
  trait Set[T] extends StObject {
    
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
      * Dictionary key and value holds the elements in the set.
      * @type {Object}
      * @protected
      */
    var dictionary: typings.typescriptCollections.dictionaryMod.default[T, js.Any]
    
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
      dictionary: typings.typescriptCollections.dictionaryMod.default[T, js.Any],
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
    
    @scala.inline
    implicit class SetMutableBuilder[Self <: Set[?], T] (val x: Self & Set[T]) extends AnyVal {
      
      @scala.inline
      def setAdd(value: T => Boolean): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setContains(value: T => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDictionary(value: typings.typescriptCollections.dictionaryMod.default[T, js.Any]): Self = StObject.set(x, "dictionary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDifference(value: Set[T] => Unit): Self = StObject.set(x, "difference", js.Any.fromFunction1(value))
      
      @scala.inline
      def setForEach(value: ILoopFunction[T] => Unit): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIntersection(value: Set[T] => Unit): Self = StObject.set(x, "intersection", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsSubsetOf(value: Set[T] => Boolean): Self = StObject.set(x, "isSubsetOf", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemove(value: T => Boolean): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSize(value: () => Double): Self = StObject.set(x, "size", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToArray(value: () => js.Array[T]): Self = StObject.set(x, "toArray", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUnion(value: Set[T] => Unit): Self = StObject.set(x, "union", js.Any.fromFunction1(value))
    }
  }
}

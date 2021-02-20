package typings.typescriptCollections

import typings.typescriptCollections.utilMod.IEqualsFunction
import typings.typescriptCollections.utilMod.ILoopFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queueMod {
  
  @JSImport("typescript-collections/dist/lib/Queue", JSImport.Default)
  @js.native
  /**
    * Creates an empty queue.
    * @class A queue is a First-In-First-Out (FIFO) data structure, the first
    * element added to the queue will be the first one to be removed. This
    * implementation uses a linked list as a container.
    * @constructor
    */
  class default[T] () extends Queue[T]
  
  @js.native
  trait Queue[T] extends StObject {
    
    /**
      * Inserts the specified element into the end of this queue.
      * @param {Object} elem the element to insert.
      * @return {boolean} true if the element was inserted, or false if it is undefined.
      */
    def add(elem: T): Boolean = js.native
    
    /**
      * Removes all of the elements from this queue.
      */
    def clear(): Unit = js.native
    
    /**
      * Returns true if this queue contains the specified element.
      * <p>If the elements inside this stack are
      * not comparable with the === operator, a custom equals function should be
      * provided to perform searches, the function must receive two arguments and
      * return true if they are equal, false otherwise. Example:</p>
      *
      * <pre>
      * const petsAreEqualByName (pet1, pet2) {
      *  return pet1.name === pet2.name;
      * }
      * </pre>
      * @param {Object} elem element to search for.
      * @param {function(Object,Object):boolean=} equalsFunction optional
      * function to check if two elements are equal.
      * @return {boolean} true if this queue contains the specified element,
      * false otherwise.
      */
    def contains(elem: T): Boolean = js.native
    def contains(elem: T, equalsFunction: IEqualsFunction[T]): Boolean = js.native
    
    /**
      * Retrieves and removes the head of this queue.
      * @return {*} the head of this queue, or undefined if this queue is empty.
      */
    def dequeue(): js.UndefOr[T] = js.native
    
    /**
      * Inserts the specified element into the end of this queue.
      * @param {Object} elem the element to insert.
      * @return {boolean} true if the element was inserted, or false if it is undefined.
      */
    def enqueue(elem: T): Boolean = js.native
    
    /**
      * Executes the provided function once for each element present in this queue in
      * FIFO order.
      * @param {function(Object):*} callback function to execute, it is
      * invoked with one argument: the element value, to break the iteration you can
      * optionally return false.
      */
    def forEach(callback: ILoopFunction[T]): Unit = js.native
    
    /**
      * Checks if this queue is empty.
      * @return {boolean} true if and only if this queue contains no items; false
      * otherwise.
      */
    def isEmpty(): Boolean = js.native
    
    /**
      * List containing the elements.
      * @type collections.LinkedList
      * @private
      */
    var list: js.Any = js.native
    
    /**
      * Retrieves, but does not remove, the head of this queue.
      * @return {*} the head of this queue, or undefined if this queue is empty.
      */
    def peek(): js.UndefOr[T] = js.native
    
    /**
      * Returns the number of elements in this queue.
      * @return {number} the number of elements in this queue.
      */
    def size(): Double = js.native
  }
}

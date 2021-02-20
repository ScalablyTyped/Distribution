package typings.typescriptCollections

import typings.typescriptCollections.utilMod.ICompareFunction
import typings.typescriptCollections.utilMod.ILoopFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object priorityQueueMod {
  
  @JSImport("typescript-collections/dist/lib/PriorityQueue", JSImport.Default)
  @js.native
  /**
    * Creates an empty priority queue.
    * @class <p>In a priority queue each element is associated with a "priority",
    * elements are dequeued in highest-priority-first order (the elements with the
    * highest priority are dequeued first). Priority Queues are implemented as heaps.
    * If the inserted elements are custom objects a compare function must be provided,
    * otherwise the <=, === and >= operators are used to compare object priority.</p>
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
    * function used to compare two element priorities. Must return a negative integer,
    * zero, or a positive integer as the first argument is less than, equal to,
    * or greater than the second.
    */
  class default[T] () extends PriorityQueue[T] {
    def this(compareFunction: ICompareFunction[T]) = this()
  }
  
  @js.native
  trait PriorityQueue[T] extends StObject {
    
    /**
      * Inserts the specified element into this priority queue.
      * @param {Object} element the element to insert.
      * @return {boolean} true if the element was inserted, or false if it is undefined.
      */
    def add(element: T): Boolean = js.native
    
    /**
      * Removes all of the elements from this priority queue.
      */
    def clear(): Unit = js.native
    
    /**
      * Returns true if this priority queue contains the specified element.
      * @param {Object} element element to search for.
      * @return {boolean} true if this priority queue contains the specified element,
      * false otherwise.
      */
    def contains(element: T): Boolean = js.native
    
    /**
      * Retrieves and removes the highest priority element of this queue.
      * @return {*} the the highest priority element of this queue,
      *  or undefined if this queue is empty.
      */
    def dequeue(): js.UndefOr[T] = js.native
    
    /**
      * Inserts the specified element into this priority queue.
      * @param {Object} element the element to insert.
      * @return {boolean} true if the element was inserted, or false if it is undefined.
      */
    def enqueue(element: T): Boolean = js.native
    
    /**
      * Executes the provided function once for each element present in this queue in
      * no particular order.
      * @param {function(Object):*} callback function to execute, it is
      * invoked with one argument: the element value, to break the iteration you can
      * optionally return false.
      */
    def forEach(callback: ILoopFunction[T]): Unit = js.native
    
    var heap: js.Any = js.native
    
    /**
      * Checks if this priority queue is empty.
      * @return {boolean} true if and only if this priority queue contains no items; false
      * otherwise.
      */
    def isEmpty(): Boolean = js.native
    
    /**
      * Retrieves, but does not remove, the highest priority element of this queue.
      * @return {*} the highest priority element of this queue, or undefined if this queue is empty.
      */
    def peek(): js.UndefOr[T] = js.native
    
    /**
      * Returns the number of elements in this priority queue.
      * @return {number} the number of elements in this priority queue.
      */
    def size(): Double = js.native
  }
  object PriorityQueue {
    
    @scala.inline
    def apply[T](
      add: T => Boolean,
      clear: () => Unit,
      contains: T => Boolean,
      dequeue: () => js.UndefOr[T],
      enqueue: T => Boolean,
      forEach: ILoopFunction[T] => Unit,
      heap: js.Any,
      isEmpty: () => Boolean,
      peek: () => js.UndefOr[T],
      size: () => Double
    ): PriorityQueue[T] = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), clear = js.Any.fromFunction0(clear), contains = js.Any.fromFunction1(contains), dequeue = js.Any.fromFunction0(dequeue), enqueue = js.Any.fromFunction1(enqueue), forEach = js.Any.fromFunction1(forEach), heap = heap.asInstanceOf[js.Any], isEmpty = js.Any.fromFunction0(isEmpty), peek = js.Any.fromFunction0(peek), size = js.Any.fromFunction0(size))
      __obj.asInstanceOf[PriorityQueue[T]]
    }
    
    @scala.inline
    implicit class PriorityQueueMutableBuilder[Self <: PriorityQueue[_], T] (val x: Self with PriorityQueue[T]) extends AnyVal {
      
      @scala.inline
      def setAdd(value: T => Boolean): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setContains(value: T => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDequeue(value: () => js.UndefOr[T]): Self = StObject.set(x, "dequeue", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEnqueue(value: T => Boolean): Self = StObject.set(x, "enqueue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setForEach(value: ILoopFunction[T] => Unit): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHeap(value: js.Any): Self = StObject.set(x, "heap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPeek(value: () => js.UndefOr[T]): Self = StObject.set(x, "peek", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSize(value: () => Double): Self = StObject.set(x, "size", js.Any.fromFunction0(value))
    }
  }
}

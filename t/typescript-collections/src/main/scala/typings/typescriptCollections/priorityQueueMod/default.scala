package typings.typescriptCollections.priorityQueueMod

import typings.typescriptCollections.utilMod.ICompareFunction
import typings.typescriptCollections.utilMod.ILoopFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  /* CompleteClass */
  override var heap: js.Any = js.native
  /**
    * Inserts the specified element into this priority queue.
    * @param {Object} element the element to insert.
    * @return {boolean} true if the element was inserted, or false if it is undefined.
    */
  /* CompleteClass */
  override def add(element: T): Boolean = js.native
  /**
    * Removes all of the elements from this priority queue.
    */
  /* CompleteClass */
  override def clear(): Unit = js.native
  /**
    * Returns true if this priority queue contains the specified element.
    * @param {Object} element element to search for.
    * @return {boolean} true if this priority queue contains the specified element,
    * false otherwise.
    */
  /* CompleteClass */
  override def contains(element: T): Boolean = js.native
  /**
    * Retrieves and removes the highest priority element of this queue.
    * @return {*} the the highest priority element of this queue,
    *  or undefined if this queue is empty.
    */
  /* CompleteClass */
  override def dequeue(): js.UndefOr[T] = js.native
  /**
    * Inserts the specified element into this priority queue.
    * @param {Object} element the element to insert.
    * @return {boolean} true if the element was inserted, or false if it is undefined.
    */
  /* CompleteClass */
  override def enqueue(element: T): Boolean = js.native
  /**
    * Executes the provided function once for each element present in this queue in
    * no particular order.
    * @param {function(Object):*} callback function to execute, it is
    * invoked with one argument: the element value, to break the iteration you can
    * optionally return false.
    */
  /* CompleteClass */
  override def forEach(callback: ILoopFunction[T]): Unit = js.native
  /**
    * Checks if this priority queue is empty.
    * @return {boolean} true if and only if this priority queue contains no items; false
    * otherwise.
    */
  /* CompleteClass */
  override def isEmpty(): Boolean = js.native
  /**
    * Retrieves, but does not remove, the highest priority element of this queue.
    * @return {*} the highest priority element of this queue, or undefined if this queue is empty.
    */
  /* CompleteClass */
  override def peek(): js.UndefOr[T] = js.native
  /**
    * Returns the number of elements in this priority queue.
    * @return {number} the number of elements in this priority queue.
    */
  /* CompleteClass */
  override def size(): Double = js.native
}


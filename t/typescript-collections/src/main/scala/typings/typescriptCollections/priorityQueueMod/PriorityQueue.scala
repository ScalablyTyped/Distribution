package typings.typescriptCollections.priorityQueueMod

import typings.typescriptCollections.utilMod.ILoopFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PriorityQueue[T] extends js.Object {
  var heap: js.Any
  /**
    * Inserts the specified element into this priority queue.
    * @param {Object} element the element to insert.
    * @return {boolean} true if the element was inserted, or false if it is undefined.
    */
  def add(element: T): Boolean
  /**
    * Removes all of the elements from this priority queue.
    */
  def clear(): Unit
  /**
    * Returns true if this priority queue contains the specified element.
    * @param {Object} element element to search for.
    * @return {boolean} true if this priority queue contains the specified element,
    * false otherwise.
    */
  def contains(element: T): Boolean
  /**
    * Retrieves and removes the highest priority element of this queue.
    * @return {*} the the highest priority element of this queue,
    *  or undefined if this queue is empty.
    */
  def dequeue(): js.UndefOr[T]
  /**
    * Inserts the specified element into this priority queue.
    * @param {Object} element the element to insert.
    * @return {boolean} true if the element was inserted, or false if it is undefined.
    */
  def enqueue(element: T): Boolean
  /**
    * Executes the provided function once for each element present in this queue in
    * no particular order.
    * @param {function(Object):*} callback function to execute, it is
    * invoked with one argument: the element value, to break the iteration you can
    * optionally return false.
    */
  def forEach(callback: ILoopFunction[T]): Unit
  /**
    * Checks if this priority queue is empty.
    * @return {boolean} true if and only if this priority queue contains no items; false
    * otherwise.
    */
  def isEmpty(): Boolean
  /**
    * Retrieves, but does not remove, the highest priority element of this queue.
    * @return {*} the highest priority element of this queue, or undefined if this queue is empty.
    */
  def peek(): js.UndefOr[T]
  /**
    * Returns the number of elements in this priority queue.
    * @return {number} the number of elements in this priority queue.
    */
  def size(): Double
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
}


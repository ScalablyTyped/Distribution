package typings.typescriptCollections.priorityQueueMod

import typings.typescriptCollections.utilMod.ILoopFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PriorityQueue[T] extends js.Object {
  var heap: js.Any = js.native
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
  implicit class PriorityQueueOps[Self <: PriorityQueue[_], T] (val x: Self with PriorityQueue[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdd(value: T => Boolean): Self = this.set("add", js.Any.fromFunction1(value))
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    @scala.inline
    def setContains(value: T => Boolean): Self = this.set("contains", js.Any.fromFunction1(value))
    @scala.inline
    def setDequeue(value: () => js.UndefOr[T]): Self = this.set("dequeue", js.Any.fromFunction0(value))
    @scala.inline
    def setEnqueue(value: T => Boolean): Self = this.set("enqueue", js.Any.fromFunction1(value))
    @scala.inline
    def setForEach(value: ILoopFunction[T] => Unit): Self = this.set("forEach", js.Any.fromFunction1(value))
    @scala.inline
    def setHeap(value: js.Any): Self = this.set("heap", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsEmpty(value: () => Boolean): Self = this.set("isEmpty", js.Any.fromFunction0(value))
    @scala.inline
    def setPeek(value: () => js.UndefOr[T]): Self = this.set("peek", js.Any.fromFunction0(value))
    @scala.inline
    def setSize(value: () => Double): Self = this.set("size", js.Any.fromFunction0(value))
  }
  
}


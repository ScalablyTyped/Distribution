package typings.typescriptDashCollections.distLibHeapMod

import typings.typescriptDashCollections.distLibUtilMod.ICompareFunction
import typings.typescriptDashCollections.distLibUtilMod.ILoopFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-collections/dist/lib/Heap", JSImport.Default)
@js.native
/**
  * Creates an empty Heap.
  * @class
  * <p>A heap is a binary tree, where the nodes maintain the heap property:
  * each node is smaller than each of its children and therefore a MinHeap
  * This implementation uses an array to store elements.</p>
  * <p>If the inserted elements are custom objects a compare function must be provided,
  *  at construction time, otherwise the <=, === and >= operators are
  * used to compare elements. Example:</p>
  *
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
  *
  * <p>If a Max-Heap is wanted (greater elements on top) you can a provide a
  * reverse compare function to accomplish that behavior. Example:</p>
  *
  * <pre>
  * function reverseCompare(a, b) {
  *  if (a is less than b by some ordering criterion) {
  *     return 1;
  *  } if (a is greater than b by the ordering criterion) {
  *     return -1;
  *  }
  *  // a must be equal to b
  *  return 0;
  * }
  * </pre>
  *
  * @constructor
  * @param {function(Object,Object):number=} compareFunction optional
  * function used to compare two elements. Must return a negative integer,
  * zero, or a positive integer as the first argument is less than, equal to,
  * or greater than the second.
  */
class default[T] () extends Heap[T] {
  def this(compareFunction: ICompareFunction[T]) = this()
  /**
    * Function used to compare elements.
    * @type {function(Object,Object):number}
    * @private
    */
  /* CompleteClass */
  override var compare: js.Any = js.native
  /**
    * Array used to store the elements of the heap.
    * @type {Array.<Object>}
    * @private
    */
  /* CompleteClass */
  override var data: js.Any = js.native
  /**
    * Adds the given element into the heap.
    * @param {*} element the element.
    * @return true if the element was added or fals if it is undefined.
    */
  /* CompleteClass */
  override def add(element: T): Boolean = js.native
  /**
    * Removes all of the elements from this heap.
    */
  /* CompleteClass */
  override def clear(): Unit = js.native
  /**
    * Returns true if this heap contains the specified element.
    * @param {Object} element element to search for.
    * @return {boolean} true if this Heap contains the specified element, false
    * otherwise.
    */
  /* CompleteClass */
  override def contains(element: T): Boolean = js.native
  /**
    * Executes the provided function once for each element present in this heap in
    * no particular order.
    * @param {function(Object):*} callback function to execute, it is
    * invoked with one argument: the element value, to break the iteration you can
    * optionally return false.
    */
  /* CompleteClass */
  override def forEach(callback: ILoopFunction[T]): Unit = js.native
  /**
    * Checks if this heap is empty.
    * @return {boolean} true if and only if this heap contains no items; false
    * otherwise.
    */
  /* CompleteClass */
  override def isEmpty(): Boolean = js.native
  /**
    * Returns the index of the left child of the node at the given index.
    * @param {number} nodeIndex The index of the node to get the left child
    * for.
    * @return {number} The index of the left child.
    * @private
    */
  /* CompleteClass */
  /* private */ override def leftChildIndex(nodeIndex: js.Any): js.Any = js.native
  /**
    * Returns the index of the smaller child node (if it exists).
    * @param {number} leftChild left child index.
    * @param {number} rightChild right child index.
    * @return {number} the index with the minimum value or -1 if it doesn't
    * exists.
    * @private
    */
  /* CompleteClass */
  /* private */ override def minIndex(leftChild: js.Any, rightChild: js.Any): js.Any = js.native
  /**
    * Returns the index of the parent of the node at the given index.
    * @param {number} nodeIndex The index of the node to get the parent for.
    * @return {number} The index of the parent.
    * @private
    */
  /* CompleteClass */
  /* private */ override def parentIndex(nodeIndex: js.Any): js.Any = js.native
  /**
    * Retrieves but does not remove the root element of this heap.
    * @return {*} The value at the root of the heap. Returns undefined if the
    * heap is empty.
    */
  /* CompleteClass */
  override def peek(): js.UndefOr[T] = js.native
  /**
    * Retrieves and removes the root element of this heap.
    * @return {*} The value removed from the root of the heap. Returns
    * undefined if the heap is empty.
    */
  /* CompleteClass */
  override def removeRoot(): js.UndefOr[T] = js.native
  /**
    * Returns the index of the right child of the node at the given index.
    * @param {number} nodeIndex The index of the node to get the right child
    * for.
    * @return {number} The index of the right child.
    * @private
    */
  /* CompleteClass */
  /* private */ override def rightChildIndex(nodeIndex: js.Any): js.Any = js.native
  /**
    * Moves the node at the given index down to its proper place in the heap.
    * @param {number} nodeIndex The index of the node to move down.
    * @private
    */
  /* CompleteClass */
  /* private */ override def siftDown(nodeIndex: js.Any): js.Any = js.native
  /**
    * Moves the node at the given index up to its proper place in the heap.
    * @param {number} index The index of the node to move up.
    * @private
    */
  /* CompleteClass */
  /* private */ override def siftUp(index: js.Any): js.Any = js.native
  /**
    * Returns the number of elements in this heap.
    * @return {number} the number of elements in this heap.
    */
  /* CompleteClass */
  override def size(): Double = js.native
}


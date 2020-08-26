package typings.typescriptCollections.heapMod

import typings.typescriptCollections.utilMod.ICompareFunction
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
}


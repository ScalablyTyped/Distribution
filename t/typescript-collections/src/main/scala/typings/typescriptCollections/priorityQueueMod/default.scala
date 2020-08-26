package typings.typescriptCollections.priorityQueueMod

import typings.typescriptCollections.utilMod.ICompareFunction
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
}


package typings.webcola.distSrcPqueueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola/dist/src/pqueue", "PriorityQueue")
@js.native
class PriorityQueue[T] protected () extends js.Object {
  def this(lessThan: js.Function2[/* a */ T, /* b */ T, Boolean]) = this()
  var lessThan: js.Any = js.native
  var root: js.Any = js.native
  def count(): Double = js.native
  def empty(): Boolean = js.native
  def forEach(f: js.Any): Unit = js.native
  def isHeap(): Boolean = js.native
  def pop(): T = js.native
  def push(args: T*): PairingHeap[T] = js.native
  def reduceKey(heapNode: PairingHeap[T], newKey: T): Unit = js.native
  def reduceKey(
    heapNode: PairingHeap[T],
    newKey: T,
    setHeapNode: js.Function2[/* e */ T, /* h */ PairingHeap[T], Unit]
  ): Unit = js.native
  def toString(selector: js.Any): String = js.native
  def top(): T = js.native
}


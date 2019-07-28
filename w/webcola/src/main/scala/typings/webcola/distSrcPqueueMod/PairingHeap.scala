package typings.webcola.distSrcPqueueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola/dist/src/pqueue", "PairingHeap")
@js.native
class PairingHeap[T] protected () extends js.Object {
  def this(elem: T) = this()
  var elem: T = js.native
  var subheaps: js.Any = js.native
  def contains(h: PairingHeap[T]): Boolean = js.native
  def count(): Double = js.native
  def decreaseKey(
    subheap: PairingHeap[T],
    newValue: T,
    setHeapNode: js.Function2[/* e */ T, /* h */ PairingHeap[T], Unit],
    lessThan: js.Function2[/* a */ T, /* b */ T, Boolean]
  ): PairingHeap[T] = js.native
  def empty(): Boolean = js.native
  def forEach(f: js.Any): Unit = js.native
  def insert(obj: T, lessThan: js.Any): PairingHeap[T] = js.native
  def isHeap(lessThan: js.Function2[/* a */ T, /* b */ T, Boolean]): Boolean = js.native
  def merge(heap2: PairingHeap[T], lessThan: js.Any): PairingHeap[T] = js.native
  def mergePairs(lessThan: js.Function2[/* a */ T, /* b */ T, Boolean]): PairingHeap[T] = js.native
  def min(): T = js.native
  def removeMin(lessThan: js.Function2[/* a */ T, /* b */ T, Boolean]): PairingHeap[T] = js.native
  def toString(selector: js.Any): String = js.native
}


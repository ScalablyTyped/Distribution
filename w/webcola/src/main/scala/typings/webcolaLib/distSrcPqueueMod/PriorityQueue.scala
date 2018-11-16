package typings
package webcolaLib.distSrcPqueueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola/dist/src/pqueue", "PriorityQueue")
@js.native
class PriorityQueue[T] protected () extends js.Object {
  def this(lessThan: js.Function2[/* a */ T, /* b */ T, scala.Boolean]) = this()
  var lessThan: js.Any = js.native
  var root: js.Any = js.native
  def count(): scala.Double = js.native
  def empty(): scala.Boolean = js.native
  def forEach(f: js.Any): scala.Unit = js.native
  def isHeap(): scala.Boolean = js.native
  def pop(): T = js.native
  def push(args: T*): PairingHeap[T] = js.native
  def reduceKey(heapNode: PairingHeap[T], newKey: T): scala.Unit = js.native
  def reduceKey(
    heapNode: PairingHeap[T],
    newKey: T,
    setHeapNode: js.Function2[/* e */ T, /* h */ PairingHeap[T], scala.Unit]
  ): scala.Unit = js.native
  def toString(selector: js.Any): java.lang.String = js.native
  def top(): T = js.native
}


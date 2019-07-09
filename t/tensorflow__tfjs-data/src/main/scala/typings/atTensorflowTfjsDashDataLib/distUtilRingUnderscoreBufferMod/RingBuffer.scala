package typings
package atTensorflowTfjsDashDataLib.distUtilRingUnderscoreBufferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-data/dist/util/ring_buffer", "RingBuffer")
@js.native
class RingBuffer[T] protected () extends js.Object {
  /**
    * Constructs a `RingBuffer`.
    * @param capacity The number of items that the buffer can accomodate.
    */
  def this(capacity: scala.Double) = this()
  var begin: scala.Double = js.native
  var capacity: scala.Double = js.native
  var data: js.Array[T] = js.native
  var doubledCapacity: scala.Double = js.native
  var end: scala.Double = js.native
  /* protected */ def get(index: scala.Double): T = js.native
  /**
    * Reports whether the buffer is empty.
    * @returns true if the number of items in the buffer equals zero, and
    *   false otherwise.
    */
  def isEmpty(): scala.Boolean = js.native
  /**
    * Reports whether the buffer is full.
    * @returns true if the number of items in the buffer equals its capacity, and
    *   false otherwise.
    */
  def isFull(): scala.Boolean = js.native
  /**
    * Returns the current number of items in the buffer.
    */
  def length(): scala.Double = js.native
  /**
    * Removes and returns the last item in the buffer.
    */
  def pop(): T = js.native
  /**
    * Adds an item to the end of the buffer.
    */
  def push(value: T): scala.Unit = js.native
  /**
    * Adds many items to the end of the buffer, in order.
    */
  def pushAll(values: js.Array[T]): scala.Unit = js.native
  /* protected */ def set(index: scala.Double, value: T): scala.Unit = js.native
  /**
    * Removes and returns the first item in the buffer.
    */
  def shift(): T = js.native
  /**
    * Removes and returns a specific item in the buffer, and moves the last item
    * to the vacated slot.  This is useful for implementing a shuffling stream.
    * Note that this operation necessarily scrambles the original order.
    *
    * @param relativeIndex: the index of the item to remove, relative to the
    *   first item in the buffer (e.g., hiding the ring nature of the underlying
    *   storage).
    */
  def shuffleExcise(relativeIndex: scala.Double): T = js.native
  /**
    * Adds an item to the beginning of the buffer.
    */
  def unshift(value: T): scala.Unit = js.native
  /**
    * Map any index into the range 0 <= index < 2*capacity.
    */
  /* protected */ def wrap(index: scala.Double): scala.Double = js.native
}


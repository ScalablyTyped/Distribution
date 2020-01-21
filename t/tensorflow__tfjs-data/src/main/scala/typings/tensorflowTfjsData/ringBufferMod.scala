package typings.tensorflowTfjsData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-data/dist/util/ring_buffer", JSImport.Namespace)
@js.native
object ringBufferMod extends js.Object {
  @js.native
  class RingBuffer[T] protected () extends js.Object {
    /**
      * Constructs a `RingBuffer`.
      * @param capacity The number of items that the buffer can accomodate.
      */
    def this(capacity: Double) = this()
    var begin: Double = js.native
    var capacity: Double = js.native
    var data: js.Array[T] = js.native
    var doubledCapacity: Double = js.native
    var end: Double = js.native
    /* protected */ def get(index: Double): T = js.native
    /**
      * Reports whether the buffer is empty.
      * @returns true if the number of items in the buffer equals zero, and
      *   false otherwise.
      */
    def isEmpty(): Boolean = js.native
    /**
      * Reports whether the buffer is full.
      * @returns true if the number of items in the buffer equals its capacity, and
      *   false otherwise.
      */
    def isFull(): Boolean = js.native
    /**
      * Returns the current number of items in the buffer.
      */
    def length(): Double = js.native
    /**
      * Removes and returns the last item in the buffer.
      */
    def pop(): T = js.native
    /**
      * Adds an item to the end of the buffer.
      */
    def push(value: T): Unit = js.native
    /**
      * Adds many items to the end of the buffer, in order.
      */
    def pushAll(values: js.Array[T]): Unit = js.native
    /* protected */ def set(index: Double, value: T): Unit = js.native
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
    def shuffleExcise(relativeIndex: Double): T = js.native
    /**
      * Adds an item to the beginning of the buffer.
      */
    def unshift(value: T): Unit = js.native
    /**
      * Map any index into the range 0 <= index < 2*capacity.
      */
    /* protected */ def wrap(index: Double): Double = js.native
  }
  
}


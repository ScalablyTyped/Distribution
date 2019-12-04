package typings.atTensorflowTfjsDashData

import typings.atTensorflowTfjsDashData.distUtilRingUnderscoreBufferMod.RingBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-data/dist/util/growing_ring_buffer", JSImport.Namespace)
@js.native
object distUtilGrowingUnderscoreRingUnderscoreBufferMod extends js.Object {
  @js.native
  /**
    * Constructs a `GrowingRingBuffer`.
    */
  class GrowingRingBuffer[T] () extends RingBuffer[T] {
    /**
      * Doubles the capacity of the buffer.
      */
    var expand: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object GrowingRingBuffer extends js.Object {
    var INITIAL_CAPACITY: js.Any = js.native
  }
  
}


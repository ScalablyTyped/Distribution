package typings.tensorflowTfjsData

import typings.tensorflowTfjsData.ringBufferMod.RingBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object growingRingBufferMod {
  
  @JSImport("@tensorflow/tfjs-data/dist/util/growing_ring_buffer", "GrowingRingBuffer")
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
  object GrowingRingBuffer {
    
    @JSImport("@tensorflow/tfjs-data/dist/util/growing_ring_buffer", "GrowingRingBuffer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@tensorflow/tfjs-data/dist/util/growing_ring_buffer", "GrowingRingBuffer.INITIAL_CAPACITY")
    @js.native
    def INITIAL_CAPACITY: js.Any = js.native
    @scala.inline
    def INITIAL_CAPACITY_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INITIAL_CAPACITY")(x.asInstanceOf[js.Any])
  }
}

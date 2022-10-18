package typings.tensorflowTfjsData

import typings.tensorflowTfjsData.distUtilRingBufferMod.RingBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilGrowingRingBufferMod {
  
  @JSImport("@tensorflow/tfjs-data/dist/util/growing_ring_buffer", "GrowingRingBuffer")
  @js.native
  /**
    * Constructs a `GrowingRingBuffer`.
    */
  open class GrowingRingBuffer[T] () extends RingBuffer[T] {
    
    /**
      * Doubles the capacity of the buffer.
      */
    /* private */ var expand: Any = js.native
  }
  /* static members */
  object GrowingRingBuffer {
    
    @JSImport("@tensorflow/tfjs-data/dist/util/growing_ring_buffer", "GrowingRingBuffer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@tensorflow/tfjs-data/dist/util/growing_ring_buffer", "GrowingRingBuffer.INITIAL_CAPACITY")
    @js.native
    def INITIAL_CAPACITY: Any = js.native
    inline def INITIAL_CAPACITY_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INITIAL_CAPACITY")(x.asInstanceOf[js.Any])
  }
}

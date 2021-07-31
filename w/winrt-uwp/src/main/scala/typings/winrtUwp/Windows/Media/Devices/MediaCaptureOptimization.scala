package typings.winrtUwp.Windows.Media.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MediaCaptureOptimization extends StObject
/** Defines the optimizations that the media capture device can use. */
@JSGlobal("Windows.Media.Devices.MediaCaptureOptimization")
@js.native
object MediaCaptureOptimization extends StObject {
  
  /** The default driver settings are used. */
  @js.native
  sealed trait default
    extends StObject
       with MediaCaptureOptimization
  
  /** Low latency is prioritized. */
  @js.native
  sealed trait latency
    extends StObject
       with MediaCaptureOptimization
  
  /** Low latency is prioritized, with low power consumption prioritized second. */
  @js.native
  sealed trait latencyThenPower
    extends StObject
       with MediaCaptureOptimization
  
  /** Low latency is prioritized, with high picture quality prioritized second. */
  @js.native
  sealed trait latencyThenQuality
    extends StObject
       with MediaCaptureOptimization
  
  /** Low power consumption is prioritized. */
  @js.native
  sealed trait power
    extends StObject
       with MediaCaptureOptimization
  
  /** Low power consumption and high picture quality are prioritized. */
  @js.native
  sealed trait powerAndQuality
    extends StObject
       with MediaCaptureOptimization
  
  /** High picture quality is prioritized. */
  @js.native
  sealed trait quality
    extends StObject
       with MediaCaptureOptimization
}

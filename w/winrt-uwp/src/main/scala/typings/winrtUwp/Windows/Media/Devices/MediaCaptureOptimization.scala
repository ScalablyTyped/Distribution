package typings.winrtUwp.Windows.Media.Devices

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MediaCaptureOptimization extends js.Object

/** Defines the optimizations that the media capture device can use. */
@JSGlobal("Windows.Media.Devices.MediaCaptureOptimization")
@js.native
object MediaCaptureOptimization extends js.Object {
  /** The default driver settings are used. */
  @js.native
  sealed trait default extends MediaCaptureOptimization
  
  /** Low latency is prioritized. */
  @js.native
  sealed trait latency extends MediaCaptureOptimization
  
  /** Low latency is prioritized, with low power consumption prioritized second. */
  @js.native
  sealed trait latencyThenPower extends MediaCaptureOptimization
  
  /** Low latency is prioritized, with high picture quality prioritized second. */
  @js.native
  sealed trait latencyThenQuality extends MediaCaptureOptimization
  
  /** Low power consumption is prioritized. */
  @js.native
  sealed trait power extends MediaCaptureOptimization
  
  /** Low power consumption and high picture quality are prioritized. */
  @js.native
  sealed trait powerAndQuality extends MediaCaptureOptimization
  
  /** High picture quality is prioritized. */
  @js.native
  sealed trait quality extends MediaCaptureOptimization
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MediaCaptureOptimization with Double] = js.native
  /* 0 */ @js.native
  object default extends TopLevel[default with Double]
  
  /* 2 */ @js.native
  object latency extends TopLevel[latency with Double]
  
  /* 5 */ @js.native
  object latencyThenPower extends TopLevel[latencyThenPower with Double]
  
  /* 4 */ @js.native
  object latencyThenQuality extends TopLevel[latencyThenQuality with Double]
  
  /* 3 */ @js.native
  object power extends TopLevel[power with Double]
  
  /* 6 */ @js.native
  object powerAndQuality extends TopLevel[powerAndQuality with Double]
  
  /* 1 */ @js.native
  object quality extends TopLevel[quality with Double]
  
}


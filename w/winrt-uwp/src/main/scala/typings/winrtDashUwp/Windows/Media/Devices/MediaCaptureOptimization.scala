package typings.winrtDashUwp.Windows.Media.Devices

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
  
  /* 0 */ val default: typings.winrtDashUwp.Windows.Media.Devices.MediaCaptureOptimization.default with Double = js.native
  /* 2 */ val latency: typings.winrtDashUwp.Windows.Media.Devices.MediaCaptureOptimization.latency with Double = js.native
  /* 5 */ val latencyThenPower: typings.winrtDashUwp.Windows.Media.Devices.MediaCaptureOptimization.latencyThenPower with Double = js.native
  /* 4 */ val latencyThenQuality: typings.winrtDashUwp.Windows.Media.Devices.MediaCaptureOptimization.latencyThenQuality with Double = js.native
  /* 3 */ val power: typings.winrtDashUwp.Windows.Media.Devices.MediaCaptureOptimization.power with Double = js.native
  /* 6 */ val powerAndQuality: typings.winrtDashUwp.Windows.Media.Devices.MediaCaptureOptimization.powerAndQuality with Double = js.native
  /* 1 */ val quality: typings.winrtDashUwp.Windows.Media.Devices.MediaCaptureOptimization.quality with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MediaCaptureOptimization with Double] = js.native
}


package typings
package winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs

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
  sealed trait default
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.MediaCaptureOptimization
  
  /** Low latency is prioritized. */
  @js.native
  sealed trait latency
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.MediaCaptureOptimization
  
  /** Low latency is prioritized, with low power consumption prioritized second. */
  @js.native
  sealed trait latencyThenPower
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.MediaCaptureOptimization
  
  /** Low latency is prioritized, with high picture quality prioritized second. */
  @js.native
  sealed trait latencyThenQuality
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.MediaCaptureOptimization
  
  /** Low power consumption is prioritized. */
  @js.native
  sealed trait power
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.MediaCaptureOptimization
  
  /** Low power consumption and high picture quality are prioritized. */
  @js.native
  sealed trait powerAndQuality
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.MediaCaptureOptimization
  
  /** High picture quality is prioritized. */
  @js.native
  sealed trait quality
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.MediaCaptureOptimization
  
  /* 0 */ val default: default with scala.Double = js.native
  /* 2 */ val latency: latency with scala.Double = js.native
  /* 5 */ val latencyThenPower: latencyThenPower with scala.Double = js.native
  /* 4 */ val latencyThenQuality: latencyThenQuality with scala.Double = js.native
  /* 3 */ val power: power with scala.Double = js.native
  /* 6 */ val powerAndQuality: powerAndQuality with scala.Double = js.native
  /* 1 */ val quality: quality with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.MediaCaptureOptimization with scala.Double
  ] = js.native
}


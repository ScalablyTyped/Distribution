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
  
  val default: default with java.lang.String = js.native
  val latency: latency with java.lang.String = js.native
  val latencyThenPower: latencyThenPower with java.lang.String = js.native
  val latencyThenQuality: latencyThenQuality with java.lang.String = js.native
  val power: power with java.lang.String = js.native
  val powerAndQuality: powerAndQuality with java.lang.String = js.native
  val quality: quality with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.MediaCaptureOptimization with java.lang.String
  ] = js.native
}


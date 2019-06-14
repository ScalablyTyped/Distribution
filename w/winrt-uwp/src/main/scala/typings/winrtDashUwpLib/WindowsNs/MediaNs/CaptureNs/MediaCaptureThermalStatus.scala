package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MediaCaptureThermalStatus extends js.Object

/** Specifies the thermal status of a media capture device. */
@JSGlobal("Windows.Media.Capture.MediaCaptureThermalStatus")
@js.native
object MediaCaptureThermalStatus extends js.Object {
  /** The thermal state is normal. */
  @js.native
  sealed trait normal
    extends winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.MediaCaptureThermalStatus
  
  /** The capture device is overheated. You should stop the current capture session and save any captured media. */
  @js.native
  sealed trait overheated
    extends winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.MediaCaptureThermalStatus
  
  /* 0 */ val normal: normal with scala.Double = js.native
  /* 1 */ val overheated: overheated with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.MediaCaptureThermalStatus with scala.Double
  ] = js.native
}


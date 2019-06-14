package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CameraCaptureUIVideoFormat extends js.Object

/** Determines the format for saving captured videos. */
@JSGlobal("Windows.Media.Capture.CameraCaptureUIVideoFormat")
@js.native
object CameraCaptureUIVideoFormat extends js.Object {
  /** MP4/H.264/AAC format. */
  @js.native
  sealed trait mp4
    extends winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIVideoFormat
  
  /** WMV format. */
  @js.native
  sealed trait wmv
    extends winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIVideoFormat
  
  /* 0 */ val mp4: mp4 with scala.Double = js.native
  /* 1 */ val wmv: wmv with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIVideoFormat with scala.Double
  ] = js.native
}


package typings.winrtDashUwp.WindowsNs.MediaNs.CaptureNs

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
  sealed trait mp4 extends CameraCaptureUIVideoFormat
  
  /** WMV format. */
  @js.native
  sealed trait wmv extends CameraCaptureUIVideoFormat
  
  /* 0 */ val mp4: typings.winrtDashUwp.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIVideoFormat.mp4 with Double = js.native
  /* 1 */ val wmv: typings.winrtDashUwp.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIVideoFormat.wmv with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CameraCaptureUIVideoFormat with Double] = js.native
}


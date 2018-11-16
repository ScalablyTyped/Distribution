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
  
  val mp4: mp4 with java.lang.String = js.native
  val wmv: wmv with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIVideoFormat with java.lang.String
  ] = js.native
}


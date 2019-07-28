package typings.winrt.WindowsNs.MediaNs.CaptureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CameraCaptureUIVideoFormat extends js.Object

@JSGlobal("Windows.Media.Capture.CameraCaptureUIVideoFormat")
@js.native
object CameraCaptureUIVideoFormat extends js.Object {
  @js.native
  sealed trait mp4 extends CameraCaptureUIVideoFormat
  
  @js.native
  sealed trait wmv extends CameraCaptureUIVideoFormat
  
  /* 0 */ val mp4: typings.winrt.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIVideoFormat.mp4 with Double = js.native
  /* 1 */ val wmv: typings.winrt.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIVideoFormat.wmv with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CameraCaptureUIVideoFormat with Double] = js.native
}


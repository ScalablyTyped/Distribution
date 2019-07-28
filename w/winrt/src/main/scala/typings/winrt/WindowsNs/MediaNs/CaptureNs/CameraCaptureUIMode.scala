package typings.winrt.WindowsNs.MediaNs.CaptureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CameraCaptureUIMode extends js.Object

@JSGlobal("Windows.Media.Capture.CameraCaptureUIMode")
@js.native
object CameraCaptureUIMode extends js.Object {
  @js.native
  sealed trait photo extends CameraCaptureUIMode
  
  @js.native
  sealed trait photoOrVideo extends CameraCaptureUIMode
  
  @js.native
  sealed trait video extends CameraCaptureUIMode
  
  /* 1 */ val photo: typings.winrt.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIMode.photo with Double = js.native
  /* 0 */ val photoOrVideo: typings.winrt.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIMode.photoOrVideo with Double = js.native
  /* 2 */ val video: typings.winrt.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIMode.video with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CameraCaptureUIMode with Double] = js.native
}


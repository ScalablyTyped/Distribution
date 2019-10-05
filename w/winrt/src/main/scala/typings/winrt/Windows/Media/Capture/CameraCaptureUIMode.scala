package typings.winrt.Windows.Media.Capture

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
  
  /* 1 */ val photo: typings.winrt.Windows.Media.Capture.CameraCaptureUIMode.photo with Double = js.native
  /* 0 */ val photoOrVideo: typings.winrt.Windows.Media.Capture.CameraCaptureUIMode.photoOrVideo with Double = js.native
  /* 2 */ val video: typings.winrt.Windows.Media.Capture.CameraCaptureUIMode.video with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CameraCaptureUIMode with Double] = js.native
}


package typings.winrt.Windows.Media.Capture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CameraCaptureUIPhotoFormat extends js.Object

@JSGlobal("Windows.Media.Capture.CameraCaptureUIPhotoFormat")
@js.native
object CameraCaptureUIPhotoFormat extends js.Object {
  @js.native
  sealed trait jpeg extends CameraCaptureUIPhotoFormat
  
  @js.native
  sealed trait jpegXR extends CameraCaptureUIPhotoFormat
  
  @js.native
  sealed trait png extends CameraCaptureUIPhotoFormat
  
  /* 0 */ val jpeg: typings.winrt.Windows.Media.Capture.CameraCaptureUIPhotoFormat.jpeg with Double = js.native
  /* 2 */ val jpegXR: typings.winrt.Windows.Media.Capture.CameraCaptureUIPhotoFormat.jpegXR with Double = js.native
  /* 1 */ val png: typings.winrt.Windows.Media.Capture.CameraCaptureUIPhotoFormat.png with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CameraCaptureUIPhotoFormat with Double] = js.native
}


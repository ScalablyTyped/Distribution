package typings.winrt.WindowsNs.MediaNs.CaptureNs

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
  
  /* 0 */ val jpeg: typings.winrt.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIPhotoFormat.jpeg with Double = js.native
  /* 2 */ val jpegXR: typings.winrt.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIPhotoFormat.jpegXR with Double = js.native
  /* 1 */ val png: typings.winrt.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIPhotoFormat.png with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CameraCaptureUIPhotoFormat with Double] = js.native
}


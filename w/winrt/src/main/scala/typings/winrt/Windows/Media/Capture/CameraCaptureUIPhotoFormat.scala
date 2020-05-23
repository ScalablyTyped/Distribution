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
  
}


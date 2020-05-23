package typings.winrtUwp.Windows.Media.Capture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CameraCaptureUIPhotoFormat extends js.Object

/** Determines the format for storing captured photos. */
@JSGlobal("Windows.Media.Capture.CameraCaptureUIPhotoFormat")
@js.native
object CameraCaptureUIPhotoFormat extends js.Object {
  /** JPEG format. */
  @js.native
  sealed trait jpeg extends CameraCaptureUIPhotoFormat
  
  /** JPEG-XR format. */
  @js.native
  sealed trait jpegXR extends CameraCaptureUIPhotoFormat
  
  /** PNG format. */
  @js.native
  sealed trait png extends CameraCaptureUIPhotoFormat
  
}


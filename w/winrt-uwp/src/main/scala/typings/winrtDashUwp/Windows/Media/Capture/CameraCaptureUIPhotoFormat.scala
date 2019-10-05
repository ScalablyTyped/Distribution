package typings.winrtDashUwp.Windows.Media.Capture

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
  
  /* 0 */ val jpeg: typings.winrtDashUwp.Windows.Media.Capture.CameraCaptureUIPhotoFormat.jpeg with Double = js.native
  /* 2 */ val jpegXR: typings.winrtDashUwp.Windows.Media.Capture.CameraCaptureUIPhotoFormat.jpegXR with Double = js.native
  /* 1 */ val png: typings.winrtDashUwp.Windows.Media.Capture.CameraCaptureUIPhotoFormat.png with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CameraCaptureUIPhotoFormat with Double] = js.native
}


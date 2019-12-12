package typings.winrtDashUwp.Windows.Media.Capture

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Media.Capture.CameraCaptureUIPhotoFormat.jpeg
import typings.winrtDashUwp.Windows.Media.Capture.CameraCaptureUIPhotoFormat.jpegXR
import typings.winrtDashUwp.Windows.Media.Capture.CameraCaptureUIPhotoFormat.png
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CameraCaptureUIPhotoFormat with Double] = js.native
  /* 0 */ @js.native
  object jpeg extends TopLevel[jpeg with Double]
  
  /* 2 */ @js.native
  object jpegXR extends TopLevel[jpegXR with Double]
  
  /* 1 */ @js.native
  object png extends TopLevel[png with Double]
  
}


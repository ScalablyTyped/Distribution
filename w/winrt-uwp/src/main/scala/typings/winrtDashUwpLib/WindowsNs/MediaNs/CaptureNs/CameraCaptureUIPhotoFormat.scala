package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs

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
  sealed trait jpeg
    extends winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIPhotoFormat
  
  /** JPEG-XR format. */
  @js.native
  sealed trait jpegXR
    extends winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIPhotoFormat
  
  /** PNG format. */
  @js.native
  sealed trait png
    extends winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIPhotoFormat
  
  /* 0 */ val jpeg: jpeg with scala.Double = js.native
  /* 2 */ val jpegXR: jpegXR with scala.Double = js.native
  /* 1 */ val png: png with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIPhotoFormat with scala.Double
  ] = js.native
}


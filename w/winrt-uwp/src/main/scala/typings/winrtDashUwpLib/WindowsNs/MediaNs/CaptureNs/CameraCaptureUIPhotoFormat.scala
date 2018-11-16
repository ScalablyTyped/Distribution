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
  
  val jpeg: jpeg with java.lang.String = js.native
  val jpegXR: jpegXR with java.lang.String = js.native
  val png: png with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIPhotoFormat with java.lang.String
  ] = js.native
}


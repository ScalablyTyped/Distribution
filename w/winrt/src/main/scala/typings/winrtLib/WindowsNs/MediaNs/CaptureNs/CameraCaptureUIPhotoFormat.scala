package typings
package winrtLib.WindowsNs.MediaNs.CaptureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CameraCaptureUIPhotoFormat extends js.Object

@JSGlobal("Windows.Media.Capture.CameraCaptureUIPhotoFormat")
@js.native
object CameraCaptureUIPhotoFormat extends js.Object {
  @js.native
  sealed trait jpeg
    extends winrtLib.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIPhotoFormat
  
  @js.native
  sealed trait jpegXR
    extends winrtLib.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIPhotoFormat
  
  @js.native
  sealed trait png
    extends winrtLib.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIPhotoFormat
  
  /* 0 */ val jpeg: jpeg with scala.Double = js.native
  /* 2 */ val jpegXR: jpegXR with scala.Double = js.native
  /* 1 */ val png: png with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtLib.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIPhotoFormat with scala.Double
  ] = js.native
}


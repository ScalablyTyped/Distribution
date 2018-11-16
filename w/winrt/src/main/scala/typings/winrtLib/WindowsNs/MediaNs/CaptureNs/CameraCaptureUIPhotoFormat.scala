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
  
  val jpeg: jpeg with java.lang.String = js.native
  val jpegXR: jpegXR with java.lang.String = js.native
  val png: png with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIPhotoFormat with java.lang.String
  ] = js.native
}


package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VideoDeviceCharacteristic extends js.Object

/** Indicates which video streams are independent of each other. */
@JSGlobal("Windows.Media.Capture.VideoDeviceCharacteristic")
@js.native
object VideoDeviceCharacteristic extends js.Object {
  /** All streams are identical */
  @js.native
  sealed trait allStreamsIdentical
    extends winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.VideoDeviceCharacteristic
  
  /** All streams are independent. */
  @js.native
  sealed trait allStreamsIndependent
    extends winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.VideoDeviceCharacteristic
  
  /** Preview photo streams are identical */
  @js.native
  sealed trait previewPhotoStreamsIdentical
    extends winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.VideoDeviceCharacteristic
  
  /** Preview video streams are identical. */
  @js.native
  sealed trait previewRecordStreamsIdentical
    extends winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.VideoDeviceCharacteristic
  
  /** Video and photo streams are identical */
  @js.native
  sealed trait recordPhotoStreamsIdentical
    extends winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.VideoDeviceCharacteristic
  
  /* 4 */ val allStreamsIdentical: allStreamsIdentical with scala.Double = js.native
  /* 0 */ val allStreamsIndependent: allStreamsIndependent with scala.Double = js.native
  /* 2 */ val previewPhotoStreamsIdentical: previewPhotoStreamsIdentical with scala.Double = js.native
  /* 1 */ val previewRecordStreamsIdentical: previewRecordStreamsIdentical with scala.Double = js.native
  /* 3 */ val recordPhotoStreamsIdentical: recordPhotoStreamsIdentical with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.VideoDeviceCharacteristic with scala.Double
  ] = js.native
}


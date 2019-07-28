package typings.winrtDashUwp.WindowsNs.MediaNs.CaptureNs

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
  sealed trait allStreamsIdentical extends VideoDeviceCharacteristic
  
  /** All streams are independent. */
  @js.native
  sealed trait allStreamsIndependent extends VideoDeviceCharacteristic
  
  /** Preview photo streams are identical */
  @js.native
  sealed trait previewPhotoStreamsIdentical extends VideoDeviceCharacteristic
  
  /** Preview video streams are identical. */
  @js.native
  sealed trait previewRecordStreamsIdentical extends VideoDeviceCharacteristic
  
  /** Video and photo streams are identical */
  @js.native
  sealed trait recordPhotoStreamsIdentical extends VideoDeviceCharacteristic
  
  /* 4 */ val allStreamsIdentical: typings.winrtDashUwp.WindowsNs.MediaNs.CaptureNs.VideoDeviceCharacteristic.allStreamsIdentical with Double = js.native
  /* 0 */ val allStreamsIndependent: typings.winrtDashUwp.WindowsNs.MediaNs.CaptureNs.VideoDeviceCharacteristic.allStreamsIndependent with Double = js.native
  /* 2 */ val previewPhotoStreamsIdentical: typings.winrtDashUwp.WindowsNs.MediaNs.CaptureNs.VideoDeviceCharacteristic.previewPhotoStreamsIdentical with Double = js.native
  /* 1 */ val previewRecordStreamsIdentical: typings.winrtDashUwp.WindowsNs.MediaNs.CaptureNs.VideoDeviceCharacteristic.previewRecordStreamsIdentical with Double = js.native
  /* 3 */ val recordPhotoStreamsIdentical: typings.winrtDashUwp.WindowsNs.MediaNs.CaptureNs.VideoDeviceCharacteristic.recordPhotoStreamsIdentical with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VideoDeviceCharacteristic with Double] = js.native
}


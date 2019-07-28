package typings.winrt.WindowsNs.MediaNs.CaptureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VideoDeviceCharacteristic extends js.Object

@JSGlobal("Windows.Media.Capture.VideoDeviceCharacteristic")
@js.native
object VideoDeviceCharacteristic extends js.Object {
  @js.native
  sealed trait allStreamsIdentical extends VideoDeviceCharacteristic
  
  @js.native
  sealed trait allStreamsIndependent extends VideoDeviceCharacteristic
  
  @js.native
  sealed trait previewPhotoStreamsIdentical extends VideoDeviceCharacteristic
  
  @js.native
  sealed trait previewRecordStreamsIdentical extends VideoDeviceCharacteristic
  
  @js.native
  sealed trait recordPhotoStreamsIdentical extends VideoDeviceCharacteristic
  
  /* 4 */ val allStreamsIdentical: typings.winrt.WindowsNs.MediaNs.CaptureNs.VideoDeviceCharacteristic.allStreamsIdentical with Double = js.native
  /* 0 */ val allStreamsIndependent: typings.winrt.WindowsNs.MediaNs.CaptureNs.VideoDeviceCharacteristic.allStreamsIndependent with Double = js.native
  /* 2 */ val previewPhotoStreamsIdentical: typings.winrt.WindowsNs.MediaNs.CaptureNs.VideoDeviceCharacteristic.previewPhotoStreamsIdentical with Double = js.native
  /* 1 */ val previewRecordStreamsIdentical: typings.winrt.WindowsNs.MediaNs.CaptureNs.VideoDeviceCharacteristic.previewRecordStreamsIdentical with Double = js.native
  /* 3 */ val recordPhotoStreamsIdentical: typings.winrt.WindowsNs.MediaNs.CaptureNs.VideoDeviceCharacteristic.recordPhotoStreamsIdentical with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VideoDeviceCharacteristic with Double] = js.native
}


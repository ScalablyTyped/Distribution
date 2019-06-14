package typings
package winrtLib.WindowsNs.MediaNs.CaptureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VideoDeviceCharacteristic extends js.Object

@JSGlobal("Windows.Media.Capture.VideoDeviceCharacteristic")
@js.native
object VideoDeviceCharacteristic extends js.Object {
  @js.native
  sealed trait allStreamsIdentical
    extends winrtLib.WindowsNs.MediaNs.CaptureNs.VideoDeviceCharacteristic
  
  @js.native
  sealed trait allStreamsIndependent
    extends winrtLib.WindowsNs.MediaNs.CaptureNs.VideoDeviceCharacteristic
  
  @js.native
  sealed trait previewPhotoStreamsIdentical
    extends winrtLib.WindowsNs.MediaNs.CaptureNs.VideoDeviceCharacteristic
  
  @js.native
  sealed trait previewRecordStreamsIdentical
    extends winrtLib.WindowsNs.MediaNs.CaptureNs.VideoDeviceCharacteristic
  
  @js.native
  sealed trait recordPhotoStreamsIdentical
    extends winrtLib.WindowsNs.MediaNs.CaptureNs.VideoDeviceCharacteristic
  
  /* 4 */ val allStreamsIdentical: allStreamsIdentical with scala.Double = js.native
  /* 0 */ val allStreamsIndependent: allStreamsIndependent with scala.Double = js.native
  /* 2 */ val previewPhotoStreamsIdentical: previewPhotoStreamsIdentical with scala.Double = js.native
  /* 1 */ val previewRecordStreamsIdentical: previewRecordStreamsIdentical with scala.Double = js.native
  /* 3 */ val recordPhotoStreamsIdentical: recordPhotoStreamsIdentical with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.MediaNs.CaptureNs.VideoDeviceCharacteristic with scala.Double] = js.native
}


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
  
  val allStreamsIdentical: allStreamsIdentical with java.lang.String = js.native
  val allStreamsIndependent: allStreamsIndependent with java.lang.String = js.native
  val previewPhotoStreamsIdentical: previewPhotoStreamsIdentical with java.lang.String = js.native
  val previewRecordStreamsIdentical: previewRecordStreamsIdentical with java.lang.String = js.native
  val recordPhotoStreamsIdentical: recordPhotoStreamsIdentical with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.MediaNs.CaptureNs.VideoDeviceCharacteristic with java.lang.String
  ] = js.native
}


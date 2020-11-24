package typings.winrt.Windows.Media.Capture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}

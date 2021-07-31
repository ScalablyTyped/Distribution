package typings.winrt.Windows.Media.Capture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VideoDeviceCharacteristic extends StObject
@JSGlobal("Windows.Media.Capture.VideoDeviceCharacteristic")
@js.native
object VideoDeviceCharacteristic extends StObject {
  
  @js.native
  sealed trait allStreamsIdentical
    extends StObject
       with VideoDeviceCharacteristic
  
  @js.native
  sealed trait allStreamsIndependent
    extends StObject
       with VideoDeviceCharacteristic
  
  @js.native
  sealed trait previewPhotoStreamsIdentical
    extends StObject
       with VideoDeviceCharacteristic
  
  @js.native
  sealed trait previewRecordStreamsIdentical
    extends StObject
       with VideoDeviceCharacteristic
  
  @js.native
  sealed trait recordPhotoStreamsIdentical
    extends StObject
       with VideoDeviceCharacteristic
}

package typings.winrtUwp.Windows.Media.Capture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VideoDeviceCharacteristic extends StObject
/** Indicates which video streams are independent of each other. */
@JSGlobal("Windows.Media.Capture.VideoDeviceCharacteristic")
@js.native
object VideoDeviceCharacteristic extends StObject {
  
  /** All streams are identical */
  @js.native
  sealed trait allStreamsIdentical
    extends StObject
       with VideoDeviceCharacteristic
  
  /** All streams are independent. */
  @js.native
  sealed trait allStreamsIndependent
    extends StObject
       with VideoDeviceCharacteristic
  
  /** Preview photo streams are identical */
  @js.native
  sealed trait previewPhotoStreamsIdentical
    extends StObject
       with VideoDeviceCharacteristic
  
  /** Preview video streams are identical. */
  @js.native
  sealed trait previewRecordStreamsIdentical
    extends StObject
       with VideoDeviceCharacteristic
  
  /** Video and photo streams are identical */
  @js.native
  sealed trait recordPhotoStreamsIdentical
    extends StObject
       with VideoDeviceCharacteristic
}

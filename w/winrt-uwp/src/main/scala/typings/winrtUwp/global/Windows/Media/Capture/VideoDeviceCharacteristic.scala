package typings.winrtUwp.global.Windows.Media.Capture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Indicates which video streams are independent of each other. */
@JSGlobal("Windows.Media.Capture.VideoDeviceCharacteristic")
@js.native
object VideoDeviceCharacteristic extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.Capture.VideoDeviceCharacteristic & Double] = js.native
  
  /* 4 */ val allStreamsIdentical: typings.winrtUwp.Windows.Media.Capture.VideoDeviceCharacteristic.allStreamsIdentical & Double = js.native
  
  /* 0 */ val allStreamsIndependent: typings.winrtUwp.Windows.Media.Capture.VideoDeviceCharacteristic.allStreamsIndependent & Double = js.native
  
  /* 2 */ val previewPhotoStreamsIdentical: typings.winrtUwp.Windows.Media.Capture.VideoDeviceCharacteristic.previewPhotoStreamsIdentical & Double = js.native
  
  /* 1 */ val previewRecordStreamsIdentical: typings.winrtUwp.Windows.Media.Capture.VideoDeviceCharacteristic.previewRecordStreamsIdentical & Double = js.native
  
  /* 3 */ val recordPhotoStreamsIdentical: typings.winrtUwp.Windows.Media.Capture.VideoDeviceCharacteristic.recordPhotoStreamsIdentical & Double = js.native
}

package typings.winrt.Windows.Media.Capture

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VideoDeviceCharacteristic with Double] = js.native
  /* 4 */ @js.native
  object allStreamsIdentical extends TopLevel[allStreamsIdentical with Double]
  
  /* 0 */ @js.native
  object allStreamsIndependent extends TopLevel[allStreamsIndependent with Double]
  
  /* 2 */ @js.native
  object previewPhotoStreamsIdentical extends TopLevel[previewPhotoStreamsIdentical with Double]
  
  /* 1 */ @js.native
  object previewRecordStreamsIdentical extends TopLevel[previewRecordStreamsIdentical with Double]
  
  /* 3 */ @js.native
  object recordPhotoStreamsIdentical extends TopLevel[recordPhotoStreamsIdentical with Double]
  
}


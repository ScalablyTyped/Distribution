package typings.winrtUwp.Windows.Media.Capture

import org.scalablytyped.runtime.TopLevel
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


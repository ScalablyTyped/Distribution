package typings.winrt.Windows.Media.Capture

import typings.winrt.Windows.Foundation.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Media.Capture.CameraCaptureUIPhotoCaptureSettings")
@js.native
class CameraCaptureUIPhotoCaptureSettings () extends ICameraCaptureUIPhotoCaptureSettings {
  /* CompleteClass */
  override var allowCropping: Boolean = js.native
  /* CompleteClass */
  override var croppedAspectRatio: Size = js.native
  /* CompleteClass */
  override var croppedSizeInPixels: Size = js.native
  /* CompleteClass */
  override var format: CameraCaptureUIPhotoFormat = js.native
  /* CompleteClass */
  override var maxResolution: CameraCaptureUIMaxPhotoResolution = js.native
}


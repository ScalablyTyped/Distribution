package typings.winrt.Windows.Media.Capture

import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Media.Capture.CameraCaptureUI")
@js.native
class CameraCaptureUI () extends ICameraCaptureUI {
  /* CompleteClass */
  override var photoSettings: CameraCaptureUIPhotoCaptureSettings = js.native
  /* CompleteClass */
  override var videoSettings: CameraCaptureUIVideoCaptureSettings = js.native
  /* CompleteClass */
  override def captureFileAsync(mode: CameraCaptureUIMode): IAsyncOperation[StorageFile] = js.native
}


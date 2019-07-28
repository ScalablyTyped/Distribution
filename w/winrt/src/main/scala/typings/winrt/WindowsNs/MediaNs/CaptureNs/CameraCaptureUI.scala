package typings.winrt.WindowsNs.MediaNs.CaptureNs

import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import typings.winrt.WindowsNs.StorageNs.StorageFile
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


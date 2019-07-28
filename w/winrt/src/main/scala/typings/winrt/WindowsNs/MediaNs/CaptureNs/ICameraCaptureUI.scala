package typings.winrt.WindowsNs.MediaNs.CaptureNs

import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import typings.winrt.WindowsNs.StorageNs.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICameraCaptureUI extends js.Object {
  var photoSettings: CameraCaptureUIPhotoCaptureSettings
  var videoSettings: CameraCaptureUIVideoCaptureSettings
  def captureFileAsync(mode: CameraCaptureUIMode): IAsyncOperation[StorageFile]
}

object ICameraCaptureUI {
  @scala.inline
  def apply(
    captureFileAsync: CameraCaptureUIMode => IAsyncOperation[StorageFile],
    photoSettings: CameraCaptureUIPhotoCaptureSettings,
    videoSettings: CameraCaptureUIVideoCaptureSettings
  ): ICameraCaptureUI = {
    val __obj = js.Dynamic.literal(captureFileAsync = js.Any.fromFunction1(captureFileAsync), photoSettings = photoSettings, videoSettings = videoSettings)
  
    __obj.asInstanceOf[ICameraCaptureUI]
  }
}


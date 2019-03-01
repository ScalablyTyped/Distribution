package typings
package winrtLib.WindowsNs.MediaNs.CaptureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICameraCaptureUI extends js.Object {
  var photoSettings: CameraCaptureUIPhotoCaptureSettings
  var videoSettings: CameraCaptureUIVideoCaptureSettings
  def captureFileAsync(mode: CameraCaptureUIMode): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.StorageNs.StorageFile]
}

object ICameraCaptureUI {
  @scala.inline
  def apply(
    captureFileAsync: js.Function1[
      CameraCaptureUIMode, 
      winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.StorageNs.StorageFile]
    ],
    photoSettings: CameraCaptureUIPhotoCaptureSettings,
    videoSettings: CameraCaptureUIVideoCaptureSettings
  ): ICameraCaptureUI = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("captureFileAsync")(captureFileAsync)
    __obj.updateDynamic("photoSettings")(photoSettings)
    __obj.updateDynamic("videoSettings")(videoSettings)
    __obj.asInstanceOf[ICameraCaptureUI]
  }
}


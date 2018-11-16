package typings
package winrtLib.WindowsNs.MediaNs.CaptureNs

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
  override def captureFileAsync(mode: CameraCaptureUIMode): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.StorageNs.StorageFile] = js.native
}


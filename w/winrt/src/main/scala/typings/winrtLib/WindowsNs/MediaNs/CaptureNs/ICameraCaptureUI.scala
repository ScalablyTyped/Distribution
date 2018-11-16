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


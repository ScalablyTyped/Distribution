package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides a full window UI for capturing audio, video, and photos from a camera. As well as controls for trimming video, time delayed capture, and camera settings. */
@JSGlobal("Windows.Media.Capture.CameraCaptureUI")
@js.native
class CameraCaptureUI () extends js.Object {
  /** Provides settings for capturing photos. The settings include aspect ratio, image size, format, resolution, and whether or not cropping is allowed by the user interface (UI). */
  var photoSettings: CameraCaptureUIPhotoCaptureSettings = js.native
  /** Provides settings for capturing videos. The settings include format, maximum resolution, maximum duration, and whether or not to allow trimming. */
  var videoSettings: CameraCaptureUIVideoCaptureSettings = js.native
  /**
                   * Launches the CameraCaptureUI user interface.
                   * @param mode Specifies whether the user interface that will be shown allows the user to capture a photo, capture a video, or capture both photos and videos.
                   * @return When this operation completes, a StorageFile object is returned.
                   */
  def captureFileAsync(mode: CameraCaptureUIMode): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.StorageFile] = js.native
}


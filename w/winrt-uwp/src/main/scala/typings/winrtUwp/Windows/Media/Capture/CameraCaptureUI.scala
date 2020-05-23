package typings.winrtUwp.Windows.Media.Capture

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides a full window UI for capturing audio, video, and photos from a camera. As well as controls for trimming video, time delayed capture, and camera settings. */
trait CameraCaptureUI extends js.Object {
  /** Provides settings for capturing photos. The settings include aspect ratio, image size, format, resolution, and whether or not cropping is allowed by the user interface (UI). */
  var photoSettings: CameraCaptureUIPhotoCaptureSettings
  /** Provides settings for capturing videos. The settings include format, maximum resolution, maximum duration, and whether or not to allow trimming. */
  var videoSettings: CameraCaptureUIVideoCaptureSettings
  /**
    * Launches the CameraCaptureUI user interface.
    * @param mode Specifies whether the user interface that will be shown allows the user to capture a photo, capture a video, or capture both photos and videos.
    * @return When this operation completes, a StorageFile object is returned.
    */
  def captureFileAsync(mode: CameraCaptureUIMode): IPromiseWithIAsyncOperation[StorageFile]
}

object CameraCaptureUI {
  @scala.inline
  def apply(
    captureFileAsync: CameraCaptureUIMode => IPromiseWithIAsyncOperation[StorageFile],
    photoSettings: CameraCaptureUIPhotoCaptureSettings,
    videoSettings: CameraCaptureUIVideoCaptureSettings
  ): CameraCaptureUI = {
    val __obj = js.Dynamic.literal(captureFileAsync = js.Any.fromFunction1(captureFileAsync), photoSettings = photoSettings.asInstanceOf[js.Any], videoSettings = videoSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraCaptureUI]
  }
}


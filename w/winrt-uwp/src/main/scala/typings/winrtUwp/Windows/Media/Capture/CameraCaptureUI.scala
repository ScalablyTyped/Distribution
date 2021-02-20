package typings.winrtUwp.Windows.Media.Capture

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.StorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides a full window UI for capturing audio, video, and photos from a camera. As well as controls for trimming video, time delayed capture, and camera settings. */
@js.native
trait CameraCaptureUI extends StObject {
  
  /**
    * Launches the CameraCaptureUI user interface.
    * @param mode Specifies whether the user interface that will be shown allows the user to capture a photo, capture a video, or capture both photos and videos.
    * @return When this operation completes, a StorageFile object is returned.
    */
  def captureFileAsync(mode: CameraCaptureUIMode): IPromiseWithIAsyncOperation[StorageFile] = js.native
  
  /** Provides settings for capturing photos. The settings include aspect ratio, image size, format, resolution, and whether or not cropping is allowed by the user interface (UI). */
  var photoSettings: CameraCaptureUIPhotoCaptureSettings = js.native
  
  /** Provides settings for capturing videos. The settings include format, maximum resolution, maximum duration, and whether or not to allow trimming. */
  var videoSettings: CameraCaptureUIVideoCaptureSettings = js.native
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
  
  @scala.inline
  implicit class CameraCaptureUIMutableBuilder[Self <: CameraCaptureUI] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaptureFileAsync(value: CameraCaptureUIMode => IPromiseWithIAsyncOperation[StorageFile]): Self = StObject.set(x, "captureFileAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPhotoSettings(value: CameraCaptureUIPhotoCaptureSettings): Self = StObject.set(x, "photoSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoSettings(value: CameraCaptureUIVideoCaptureSettings): Self = StObject.set(x, "videoSettings", value.asInstanceOf[js.Any])
  }
}

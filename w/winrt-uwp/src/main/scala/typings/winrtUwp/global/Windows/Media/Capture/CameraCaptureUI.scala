package typings.winrtUwp.global.Windows.Media.Capture

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.StorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides a full window UI for capturing audio, video, and photos from a camera. As well as controls for trimming video, time delayed capture, and camera settings. */
@JSGlobal("Windows.Media.Capture.CameraCaptureUI")
@js.native
/** Create a new CameraCaptureUI object. */
class CameraCaptureUI ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Capture.CameraCaptureUI {
  
  /**
    * Launches the CameraCaptureUI user interface.
    * @param mode Specifies whether the user interface that will be shown allows the user to capture a photo, capture a video, or capture both photos and videos.
    * @return When this operation completes, a StorageFile object is returned.
    */
  /* CompleteClass */
  override def captureFileAsync(mode: typings.winrtUwp.Windows.Media.Capture.CameraCaptureUIMode): IPromiseWithIAsyncOperation[StorageFile] = js.native
  
  /** Provides settings for capturing photos. The settings include aspect ratio, image size, format, resolution, and whether or not cropping is allowed by the user interface (UI). */
  /* CompleteClass */
  var photoSettings: typings.winrtUwp.Windows.Media.Capture.CameraCaptureUIPhotoCaptureSettings = js.native
  
  /** Provides settings for capturing videos. The settings include format, maximum resolution, maximum duration, and whether or not to allow trimming. */
  /* CompleteClass */
  var videoSettings: typings.winrtUwp.Windows.Media.Capture.CameraCaptureUIVideoCaptureSettings = js.native
}

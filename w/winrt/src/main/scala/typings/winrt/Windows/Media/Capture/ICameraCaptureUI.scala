package typings.winrt.Windows.Media.Capture

import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Storage.StorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICameraCaptureUI extends StObject {
  
  def captureFileAsync(mode: CameraCaptureUIMode): IAsyncOperation[StorageFile]
  
  var photoSettings: CameraCaptureUIPhotoCaptureSettings
  
  var videoSettings: CameraCaptureUIVideoCaptureSettings
}
object ICameraCaptureUI {
  
  inline def apply(
    captureFileAsync: CameraCaptureUIMode => IAsyncOperation[StorageFile],
    photoSettings: CameraCaptureUIPhotoCaptureSettings,
    videoSettings: CameraCaptureUIVideoCaptureSettings
  ): ICameraCaptureUI = {
    val __obj = js.Dynamic.literal(captureFileAsync = js.Any.fromFunction1(captureFileAsync), photoSettings = photoSettings.asInstanceOf[js.Any], videoSettings = videoSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICameraCaptureUI]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ICameraCaptureUI] (val x: Self) extends AnyVal {
    
    inline def setCaptureFileAsync(value: CameraCaptureUIMode => IAsyncOperation[StorageFile]): Self = StObject.set(x, "captureFileAsync", js.Any.fromFunction1(value))
    
    inline def setPhotoSettings(value: CameraCaptureUIPhotoCaptureSettings): Self = StObject.set(x, "photoSettings", value.asInstanceOf[js.Any])
    
    inline def setVideoSettings(value: CameraCaptureUIVideoCaptureSettings): Self = StObject.set(x, "videoSettings", value.asInstanceOf[js.Any])
  }
}

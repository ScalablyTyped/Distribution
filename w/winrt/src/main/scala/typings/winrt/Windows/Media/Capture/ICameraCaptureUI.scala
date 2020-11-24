package typings.winrt.Windows.Media.Capture

import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICameraCaptureUI extends js.Object {
  
  def captureFileAsync(mode: CameraCaptureUIMode): IAsyncOperation[StorageFile] = js.native
  
  var photoSettings: CameraCaptureUIPhotoCaptureSettings = js.native
  
  var videoSettings: CameraCaptureUIVideoCaptureSettings = js.native
}
object ICameraCaptureUI {
  
  @scala.inline
  def apply(
    captureFileAsync: CameraCaptureUIMode => IAsyncOperation[StorageFile],
    photoSettings: CameraCaptureUIPhotoCaptureSettings,
    videoSettings: CameraCaptureUIVideoCaptureSettings
  ): ICameraCaptureUI = {
    val __obj = js.Dynamic.literal(captureFileAsync = js.Any.fromFunction1(captureFileAsync), photoSettings = photoSettings.asInstanceOf[js.Any], videoSettings = videoSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICameraCaptureUI]
  }
  
  @scala.inline
  implicit class ICameraCaptureUIOps[Self <: ICameraCaptureUI] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCaptureFileAsync(value: CameraCaptureUIMode => IAsyncOperation[StorageFile]): Self = this.set("captureFileAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPhotoSettings(value: CameraCaptureUIPhotoCaptureSettings): Self = this.set("photoSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoSettings(value: CameraCaptureUIVideoCaptureSettings): Self = this.set("videoSettings", value.asInstanceOf[js.Any])
  }
}

package typings.winrt.Windows.Media.Capture

import typings.winrt.Windows.Foundation.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICameraCaptureUIPhotoCaptureSettings extends StObject {
  
  var allowCropping: Boolean = js.native
  
  var croppedAspectRatio: Size = js.native
  
  var croppedSizeInPixels: Size = js.native
  
  var format: CameraCaptureUIPhotoFormat = js.native
  
  var maxResolution: CameraCaptureUIMaxPhotoResolution = js.native
}
object ICameraCaptureUIPhotoCaptureSettings {
  
  @scala.inline
  def apply(
    allowCropping: Boolean,
    croppedAspectRatio: Size,
    croppedSizeInPixels: Size,
    format: CameraCaptureUIPhotoFormat,
    maxResolution: CameraCaptureUIMaxPhotoResolution
  ): ICameraCaptureUIPhotoCaptureSettings = {
    val __obj = js.Dynamic.literal(allowCropping = allowCropping.asInstanceOf[js.Any], croppedAspectRatio = croppedAspectRatio.asInstanceOf[js.Any], croppedSizeInPixels = croppedSizeInPixels.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], maxResolution = maxResolution.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICameraCaptureUIPhotoCaptureSettings]
  }
  
  @scala.inline
  implicit class ICameraCaptureUIPhotoCaptureSettingsMutableBuilder[Self <: ICameraCaptureUIPhotoCaptureSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowCropping(value: Boolean): Self = StObject.set(x, "allowCropping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCroppedAspectRatio(value: Size): Self = StObject.set(x, "croppedAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCroppedSizeInPixels(value: Size): Self = StObject.set(x, "croppedSizeInPixels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: CameraCaptureUIPhotoFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResolution(value: CameraCaptureUIMaxPhotoResolution): Self = StObject.set(x, "maxResolution", value.asInstanceOf[js.Any])
  }
}

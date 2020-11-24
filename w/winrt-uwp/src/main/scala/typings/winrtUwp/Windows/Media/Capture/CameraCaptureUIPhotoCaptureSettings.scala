package typings.winrtUwp.Windows.Media.Capture

import typings.winrtUwp.Windows.Foundation.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides settings for capturing photos. The settings include aspect ratio, image size, format, resolution, and whether or not cropping is allowed by the user interface (UI). */
@js.native
trait CameraCaptureUIPhotoCaptureSettings extends js.Object {
  
  /** Determines whether photo cropping will be enabled in the user interface for capture a photo. */
  var allowCropping: Boolean = js.native
  
  /** The aspect ratio of the captured photo. */
  var croppedAspectRatio: Size = js.native
  
  /** The exact size in pixels of the captured photo. */
  var croppedSizeInPixels: Size = js.native
  
  /** Determines the format that captured photos will be stored in. */
  var format: CameraCaptureUIPhotoFormat = js.native
  
  /** Determines the maximum resolution the user will be able to select. */
  var maxResolution: CameraCaptureUIMaxPhotoResolution = js.native
}
object CameraCaptureUIPhotoCaptureSettings {
  
  @scala.inline
  def apply(
    allowCropping: Boolean,
    croppedAspectRatio: Size,
    croppedSizeInPixels: Size,
    format: CameraCaptureUIPhotoFormat,
    maxResolution: CameraCaptureUIMaxPhotoResolution
  ): CameraCaptureUIPhotoCaptureSettings = {
    val __obj = js.Dynamic.literal(allowCropping = allowCropping.asInstanceOf[js.Any], croppedAspectRatio = croppedAspectRatio.asInstanceOf[js.Any], croppedSizeInPixels = croppedSizeInPixels.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], maxResolution = maxResolution.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraCaptureUIPhotoCaptureSettings]
  }
  
  @scala.inline
  implicit class CameraCaptureUIPhotoCaptureSettingsOps[Self <: CameraCaptureUIPhotoCaptureSettings] (val x: Self) extends AnyVal {
    
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
    def setAllowCropping(value: Boolean): Self = this.set("allowCropping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCroppedAspectRatio(value: Size): Self = this.set("croppedAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCroppedSizeInPixels(value: Size): Self = this.set("croppedSizeInPixels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: CameraCaptureUIPhotoFormat): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResolution(value: CameraCaptureUIMaxPhotoResolution): Self = this.set("maxResolution", value.asInstanceOf[js.Any])
  }
}

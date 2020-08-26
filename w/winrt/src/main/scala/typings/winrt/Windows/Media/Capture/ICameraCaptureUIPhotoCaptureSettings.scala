package typings.winrt.Windows.Media.Capture

import typings.winrt.Windows.Foundation.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICameraCaptureUIPhotoCaptureSettings extends js.Object {
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
  implicit class ICameraCaptureUIPhotoCaptureSettingsOps[Self <: ICameraCaptureUIPhotoCaptureSettings] (val x: Self) extends AnyVal {
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


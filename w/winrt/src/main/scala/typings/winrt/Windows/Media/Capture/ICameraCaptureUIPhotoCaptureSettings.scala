package typings.winrt.Windows.Media.Capture

import typings.winrt.Windows.Foundation.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICameraCaptureUIPhotoCaptureSettings extends js.Object {
  var allowCropping: Boolean
  var croppedAspectRatio: Size
  var croppedSizeInPixels: Size
  var format: CameraCaptureUIPhotoFormat
  var maxResolution: CameraCaptureUIMaxPhotoResolution
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
}


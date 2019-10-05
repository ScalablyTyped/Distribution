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
    val __obj = js.Dynamic.literal(allowCropping = allowCropping, croppedAspectRatio = croppedAspectRatio, croppedSizeInPixels = croppedSizeInPixels, format = format, maxResolution = maxResolution)
  
    __obj.asInstanceOf[ICameraCaptureUIPhotoCaptureSettings]
  }
}


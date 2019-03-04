package typings
package winrtLib.WindowsNs.MediaNs.CaptureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICameraCaptureUIPhotoCaptureSettings extends js.Object {
  var allowCropping: scala.Boolean
  var croppedAspectRatio: winrtLib.WindowsNs.FoundationNs.Size
  var croppedSizeInPixels: winrtLib.WindowsNs.FoundationNs.Size
  var format: CameraCaptureUIPhotoFormat
  var maxResolution: CameraCaptureUIMaxPhotoResolution
}

object ICameraCaptureUIPhotoCaptureSettings {
  @scala.inline
  def apply(
    allowCropping: scala.Boolean,
    croppedAspectRatio: winrtLib.WindowsNs.FoundationNs.Size,
    croppedSizeInPixels: winrtLib.WindowsNs.FoundationNs.Size,
    format: CameraCaptureUIPhotoFormat,
    maxResolution: CameraCaptureUIMaxPhotoResolution
  ): ICameraCaptureUIPhotoCaptureSettings = {
    val __obj = js.Dynamic.literal(allowCropping = allowCropping, croppedAspectRatio = croppedAspectRatio, croppedSizeInPixels = croppedSizeInPixels, format = format, maxResolution = maxResolution)
  
    __obj.asInstanceOf[ICameraCaptureUIPhotoCaptureSettings]
  }
}


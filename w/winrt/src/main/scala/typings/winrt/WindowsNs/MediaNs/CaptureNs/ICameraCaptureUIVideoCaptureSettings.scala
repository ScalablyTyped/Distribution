package typings.winrt.WindowsNs.MediaNs.CaptureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICameraCaptureUIVideoCaptureSettings extends js.Object {
  var allowTrimming: Boolean
  var format: CameraCaptureUIVideoFormat
  var maxDurationInSeconds: Double
  var maxResolution: CameraCaptureUIMaxVideoResolution
}

object ICameraCaptureUIVideoCaptureSettings {
  @scala.inline
  def apply(
    allowTrimming: Boolean,
    format: CameraCaptureUIVideoFormat,
    maxDurationInSeconds: Double,
    maxResolution: CameraCaptureUIMaxVideoResolution
  ): ICameraCaptureUIVideoCaptureSettings = {
    val __obj = js.Dynamic.literal(allowTrimming = allowTrimming, format = format, maxDurationInSeconds = maxDurationInSeconds, maxResolution = maxResolution)
  
    __obj.asInstanceOf[ICameraCaptureUIVideoCaptureSettings]
  }
}


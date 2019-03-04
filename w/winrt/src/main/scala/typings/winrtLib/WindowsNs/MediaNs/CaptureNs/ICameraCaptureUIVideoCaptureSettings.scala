package typings
package winrtLib.WindowsNs.MediaNs.CaptureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICameraCaptureUIVideoCaptureSettings extends js.Object {
  var allowTrimming: scala.Boolean
  var format: CameraCaptureUIVideoFormat
  var maxDurationInSeconds: scala.Double
  var maxResolution: CameraCaptureUIMaxVideoResolution
}

object ICameraCaptureUIVideoCaptureSettings {
  @scala.inline
  def apply(
    allowTrimming: scala.Boolean,
    format: CameraCaptureUIVideoFormat,
    maxDurationInSeconds: scala.Double,
    maxResolution: CameraCaptureUIMaxVideoResolution
  ): ICameraCaptureUIVideoCaptureSettings = {
    val __obj = js.Dynamic.literal(allowTrimming = allowTrimming, format = format, maxDurationInSeconds = maxDurationInSeconds, maxResolution = maxResolution)
  
    __obj.asInstanceOf[ICameraCaptureUIVideoCaptureSettings]
  }
}


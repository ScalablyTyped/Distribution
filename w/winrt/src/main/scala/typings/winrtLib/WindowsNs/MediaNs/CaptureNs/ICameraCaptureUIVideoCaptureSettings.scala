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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("allowTrimming")(allowTrimming)
    __obj.updateDynamic("format")(format)
    __obj.updateDynamic("maxDurationInSeconds")(maxDurationInSeconds)
    __obj.updateDynamic("maxResolution")(maxResolution)
    __obj.asInstanceOf[ICameraCaptureUIVideoCaptureSettings]
  }
}


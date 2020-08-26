package typings.winrt.Windows.Media.Capture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICameraCaptureUIVideoCaptureSettings extends js.Object {
  var allowTrimming: Boolean = js.native
  var format: CameraCaptureUIVideoFormat = js.native
  var maxDurationInSeconds: Double = js.native
  var maxResolution: CameraCaptureUIMaxVideoResolution = js.native
}

object ICameraCaptureUIVideoCaptureSettings {
  @scala.inline
  def apply(
    allowTrimming: Boolean,
    format: CameraCaptureUIVideoFormat,
    maxDurationInSeconds: Double,
    maxResolution: CameraCaptureUIMaxVideoResolution
  ): ICameraCaptureUIVideoCaptureSettings = {
    val __obj = js.Dynamic.literal(allowTrimming = allowTrimming.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], maxDurationInSeconds = maxDurationInSeconds.asInstanceOf[js.Any], maxResolution = maxResolution.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICameraCaptureUIVideoCaptureSettings]
  }
  @scala.inline
  implicit class ICameraCaptureUIVideoCaptureSettingsOps[Self <: ICameraCaptureUIVideoCaptureSettings] (val x: Self) extends AnyVal {
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
    def setAllowTrimming(value: Boolean): Self = this.set("allowTrimming", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormat(value: CameraCaptureUIVideoFormat): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxDurationInSeconds(value: Double): Self = this.set("maxDurationInSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxResolution(value: CameraCaptureUIMaxVideoResolution): Self = this.set("maxResolution", value.asInstanceOf[js.Any])
  }
  
}


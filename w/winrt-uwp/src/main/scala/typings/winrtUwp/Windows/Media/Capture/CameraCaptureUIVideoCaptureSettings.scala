package typings.winrtUwp.Windows.Media.Capture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides settings for capturing videos. The settings include format, maximum resolution, maximum duration, and whether or not to allow trimming. */
@js.native
trait CameraCaptureUIVideoCaptureSettings extends js.Object {
  /** Determines whether or not the video trimming user interface will be enabled. */
  var allowTrimming: Boolean = js.native
  /** Determines the format for storing captured videos. */
  var format: CameraCaptureUIVideoFormat = js.native
  /** Determines the maximum duration of a video. */
  var maxDurationInSeconds: Double = js.native
  /** Determines the maximum resolution that the user can select. */
  var maxResolution: CameraCaptureUIMaxVideoResolution = js.native
}

object CameraCaptureUIVideoCaptureSettings {
  @scala.inline
  def apply(
    allowTrimming: Boolean,
    format: CameraCaptureUIVideoFormat,
    maxDurationInSeconds: Double,
    maxResolution: CameraCaptureUIMaxVideoResolution
  ): CameraCaptureUIVideoCaptureSettings = {
    val __obj = js.Dynamic.literal(allowTrimming = allowTrimming.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], maxDurationInSeconds = maxDurationInSeconds.asInstanceOf[js.Any], maxResolution = maxResolution.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraCaptureUIVideoCaptureSettings]
  }
  @scala.inline
  implicit class CameraCaptureUIVideoCaptureSettingsOps[Self <: CameraCaptureUIVideoCaptureSettings] (val x: Self) extends AnyVal {
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


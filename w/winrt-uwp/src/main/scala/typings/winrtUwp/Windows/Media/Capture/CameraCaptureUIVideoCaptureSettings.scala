package typings.winrtUwp.Windows.Media.Capture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides settings for capturing videos. The settings include format, maximum resolution, maximum duration, and whether or not to allow trimming. */
trait CameraCaptureUIVideoCaptureSettings extends js.Object {
  /** Determines whether or not the video trimming user interface will be enabled. */
  var allowTrimming: Boolean
  /** Determines the format for storing captured videos. */
  var format: CameraCaptureUIVideoFormat
  /** Determines the maximum duration of a video. */
  var maxDurationInSeconds: Double
  /** Determines the maximum resolution that the user can select. */
  var maxResolution: CameraCaptureUIMaxVideoResolution
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
}


package typings.winrtUwp.Windows.Media.Capture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides settings for capturing videos. The settings include format, maximum resolution, maximum duration, and whether or not to allow trimming. */
@JSGlobal("Windows.Media.Capture.CameraCaptureUIVideoCaptureSettings")
@js.native
abstract class CameraCaptureUIVideoCaptureSettings () extends js.Object {
  /** Determines whether or not the video trimming user interface will be enabled. */
  var allowTrimming: Boolean = js.native
  /** Determines the format for storing captured videos. */
  var format: CameraCaptureUIVideoFormat = js.native
  /** Determines the maximum duration of a video. */
  var maxDurationInSeconds: Double = js.native
  /** Determines the maximum resolution that the user can select. */
  var maxResolution: CameraCaptureUIMaxVideoResolution = js.native
}


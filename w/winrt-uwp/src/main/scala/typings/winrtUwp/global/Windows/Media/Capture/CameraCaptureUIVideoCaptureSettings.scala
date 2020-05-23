package typings.winrtUwp.global.Windows.Media.Capture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides settings for capturing videos. The settings include format, maximum resolution, maximum duration, and whether or not to allow trimming. */
@JSGlobal("Windows.Media.Capture.CameraCaptureUIVideoCaptureSettings")
@js.native
abstract class CameraCaptureUIVideoCaptureSettings ()
  extends typings.winrtUwp.Windows.Media.Capture.CameraCaptureUIVideoCaptureSettings {
  /** Determines whether or not the video trimming user interface will be enabled. */
  /* CompleteClass */
  override var allowTrimming: Boolean = js.native
  /** Determines the format for storing captured videos. */
  /* CompleteClass */
  override var format: typings.winrtUwp.Windows.Media.Capture.CameraCaptureUIVideoFormat = js.native
  /** Determines the maximum duration of a video. */
  /* CompleteClass */
  override var maxDurationInSeconds: Double = js.native
  /** Determines the maximum resolution that the user can select. */
  /* CompleteClass */
  override var maxResolution: typings.winrtUwp.Windows.Media.Capture.CameraCaptureUIMaxVideoResolution = js.native
}


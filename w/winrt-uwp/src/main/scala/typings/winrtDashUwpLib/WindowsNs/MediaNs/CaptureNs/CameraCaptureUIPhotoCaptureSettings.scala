package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides settings for capturing photos. The settings include aspect ratio, image size, format, resolution, and whether or not cropping is allowed by the user interface (UI). */
@JSGlobal("Windows.Media.Capture.CameraCaptureUIPhotoCaptureSettings")
@js.native
abstract class CameraCaptureUIPhotoCaptureSettings () extends js.Object {
  /** Determines whether photo cropping will be enabled in the user interface for capture a photo. */
  var allowCropping: scala.Boolean = js.native
  /** The aspect ratio of the captured photo. */
  var croppedAspectRatio: winrtDashUwpLib.WindowsNs.FoundationNs.Size = js.native
  /** The exact size in pixels of the captured photo. */
  var croppedSizeInPixels: winrtDashUwpLib.WindowsNs.FoundationNs.Size = js.native
  /** Determines the format that captured photos will be stored in. */
  var format: CameraCaptureUIPhotoFormat = js.native
  /** Determines the maximum resolution the user will be able to select. */
  var maxResolution: CameraCaptureUIMaxPhotoResolution = js.native
}


package typings.winrtDashUwp.WindowsNs.MediaNs.CaptureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a description of media that is supported by a video profile. */
@JSGlobal("Windows.Media.Capture.MediaCaptureVideoProfileMediaDescription")
@js.native
abstract class MediaCaptureVideoProfileMediaDescription () extends js.Object {
  /** Gets the frame rate of the media description. */
  var frameRate: Double = js.native
  /** Gets the height of the media description. */
  var height: Double = js.native
  /** Gets a value indicating if the media description includes HDR video support. */
  var isHdrVideoSupported: Boolean = js.native
  /** Gets a value indicating if the media description includes variable photo sequence support. */
  var isVariablePhotoSequenceSupported: Boolean = js.native
  /** Gets the height of the media description. */
  var width: Double = js.native
}


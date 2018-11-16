package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a description of media that is supported by a video profile. */
@JSGlobal("Windows.Media.Capture.MediaCaptureVideoProfileMediaDescription")
@js.native
abstract class MediaCaptureVideoProfileMediaDescription () extends js.Object {
  /** Gets the frame rate of the media description. */
  var frameRate: scala.Double = js.native
  /** Gets the height of the media description. */
  var height: scala.Double = js.native
  /** Gets a value indicating if the media description includes HDR video support. */
  var isHdrVideoSupported: scala.Boolean = js.native
  /** Gets a value indicating if the media description includes variable photo sequence support. */
  var isVariablePhotoSequenceSupported: scala.Boolean = js.native
  /** Gets the height of the media description. */
  var width: scala.Double = js.native
}


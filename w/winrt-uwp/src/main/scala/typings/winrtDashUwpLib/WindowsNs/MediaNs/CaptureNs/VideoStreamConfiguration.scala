package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a set of input and output VideoEncodingProperties for a video stream */
@JSGlobal("Windows.Media.Capture.VideoStreamConfiguration")
@js.native
abstract class VideoStreamConfiguration () extends js.Object {
  /** Gets a VideoEncodingProperties object representing an video stream input configuration. */
  var inputProperties: winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.VideoEncodingProperties = js.native
  /** Gets a VideoEncodingProperties object representing an video stream output configuration. */
  var outputProperties: winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.VideoEncodingProperties = js.native
}


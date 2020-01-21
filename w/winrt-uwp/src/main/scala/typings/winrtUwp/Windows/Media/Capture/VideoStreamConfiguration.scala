package typings.winrtUwp.Windows.Media.Capture

import typings.winrtUwp.Windows.Media.MediaProperties.VideoEncodingProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a set of input and output VideoEncodingProperties for a video stream */
@JSGlobal("Windows.Media.Capture.VideoStreamConfiguration")
@js.native
abstract class VideoStreamConfiguration () extends js.Object {
  /** Gets a VideoEncodingProperties object representing an video stream input configuration. */
  var inputProperties: VideoEncodingProperties = js.native
  /** Gets a VideoEncodingProperties object representing an video stream output configuration. */
  var outputProperties: VideoEncodingProperties = js.native
}


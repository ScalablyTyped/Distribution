package typings.winrtUwp.global.Windows.Media.Capture

import typings.winrtUwp.Windows.Media.MediaProperties.VideoEncodingProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a set of input and output VideoEncodingProperties for a video stream */
@JSGlobal("Windows.Media.Capture.VideoStreamConfiguration")
@js.native
abstract class VideoStreamConfiguration ()
  extends typings.winrtUwp.Windows.Media.Capture.VideoStreamConfiguration {
  /** Gets a VideoEncodingProperties object representing an video stream input configuration. */
  /* CompleteClass */
  override var inputProperties: VideoEncodingProperties = js.native
  /** Gets a VideoEncodingProperties object representing an video stream output configuration. */
  /* CompleteClass */
  override var outputProperties: VideoEncodingProperties = js.native
}


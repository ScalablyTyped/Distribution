package typings.winrtUwp.Windows.Media.Capture

import typings.winrtUwp.Windows.Media.MediaProperties.VideoEncodingProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a set of input and output VideoEncodingProperties for a video stream */
trait VideoStreamConfiguration extends js.Object {
  /** Gets a VideoEncodingProperties object representing an video stream input configuration. */
  var inputProperties: VideoEncodingProperties
  /** Gets a VideoEncodingProperties object representing an video stream output configuration. */
  var outputProperties: VideoEncodingProperties
}

object VideoStreamConfiguration {
  @scala.inline
  def apply(inputProperties: VideoEncodingProperties, outputProperties: VideoEncodingProperties): VideoStreamConfiguration = {
    val __obj = js.Dynamic.literal(inputProperties = inputProperties.asInstanceOf[js.Any], outputProperties = outputProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoStreamConfiguration]
  }
}


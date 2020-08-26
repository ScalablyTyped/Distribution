package typings.winrtUwp.Windows.Media.Capture

import typings.winrtUwp.Windows.Media.MediaProperties.VideoEncodingProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a set of input and output VideoEncodingProperties for a video stream */
@js.native
trait VideoStreamConfiguration extends js.Object {
  /** Gets a VideoEncodingProperties object representing an video stream input configuration. */
  var inputProperties: VideoEncodingProperties = js.native
  /** Gets a VideoEncodingProperties object representing an video stream output configuration. */
  var outputProperties: VideoEncodingProperties = js.native
}

object VideoStreamConfiguration {
  @scala.inline
  def apply(inputProperties: VideoEncodingProperties, outputProperties: VideoEncodingProperties): VideoStreamConfiguration = {
    val __obj = js.Dynamic.literal(inputProperties = inputProperties.asInstanceOf[js.Any], outputProperties = outputProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoStreamConfiguration]
  }
  @scala.inline
  implicit class VideoStreamConfigurationOps[Self <: VideoStreamConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInputProperties(value: VideoEncodingProperties): Self = this.set("inputProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutputProperties(value: VideoEncodingProperties): Self = this.set("outputProperties", value.asInstanceOf[js.Any])
  }
  
}


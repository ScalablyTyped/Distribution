package typings.winrtUwp.Windows.Media.Capture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a description of media that is supported by a video profile. */
@js.native
trait MediaCaptureVideoProfileMediaDescription extends js.Object {
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

object MediaCaptureVideoProfileMediaDescription {
  @scala.inline
  def apply(
    frameRate: Double,
    height: Double,
    isHdrVideoSupported: Boolean,
    isVariablePhotoSequenceSupported: Boolean,
    width: Double
  ): MediaCaptureVideoProfileMediaDescription = {
    val __obj = js.Dynamic.literal(frameRate = frameRate.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], isHdrVideoSupported = isHdrVideoSupported.asInstanceOf[js.Any], isVariablePhotoSequenceSupported = isVariablePhotoSequenceSupported.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaCaptureVideoProfileMediaDescription]
  }
  @scala.inline
  implicit class MediaCaptureVideoProfileMediaDescriptionOps[Self <: MediaCaptureVideoProfileMediaDescription] (val x: Self) extends AnyVal {
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
    def setFrameRate(value: Double): Self = this.set("frameRate", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsHdrVideoSupported(value: Boolean): Self = this.set("isHdrVideoSupported", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsVariablePhotoSequenceSupported(value: Boolean): Self = this.set("isVariablePhotoSequenceSupported", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}


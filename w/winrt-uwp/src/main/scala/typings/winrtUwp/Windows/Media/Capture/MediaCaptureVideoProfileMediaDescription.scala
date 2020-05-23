package typings.winrtUwp.Windows.Media.Capture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a description of media that is supported by a video profile. */
trait MediaCaptureVideoProfileMediaDescription extends js.Object {
  /** Gets the frame rate of the media description. */
  var frameRate: Double
  /** Gets the height of the media description. */
  var height: Double
  /** Gets a value indicating if the media description includes HDR video support. */
  var isHdrVideoSupported: Boolean
  /** Gets a value indicating if the media description includes variable photo sequence support. */
  var isVariablePhotoSequenceSupported: Boolean
  /** Gets the height of the media description. */
  var width: Double
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
}


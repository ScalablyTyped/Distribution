package typings.winrtUwp.Windows.Media.Capture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a photo taken from a capture device such as a webcam attached. */
trait CapturedPhoto extends js.Object {
  /** Gets the photo data, represented as CapturedFrame object, associated with the CapturedPhoto object. */
  var frame: CapturedFrame
  /** Represents a thumbnail image of the capture photo. */
  var thumbnail: CapturedFrame
}

object CapturedPhoto {
  @scala.inline
  def apply(frame: CapturedFrame, thumbnail: CapturedFrame): CapturedPhoto = {
    val __obj = js.Dynamic.literal(frame = frame.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapturedPhoto]
  }
}


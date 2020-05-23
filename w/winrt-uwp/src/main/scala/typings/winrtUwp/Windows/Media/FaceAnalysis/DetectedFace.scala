package typings.winrtUwp.Windows.Media.FaceAnalysis

import typings.winrtUwp.Windows.Graphics.Imaging.BitmapBounds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a face that was detected in a SoftwareBitmap or a VideoFrame . */
trait DetectedFace extends js.Object {
  /** Gets the bounds the detected face occupies in the SoftwareBitmap or VideoFrame . */
  var faceBox: BitmapBounds
}

object DetectedFace {
  @scala.inline
  def apply(faceBox: BitmapBounds): DetectedFace = {
    val __obj = js.Dynamic.literal(faceBox = faceBox.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectedFace]
  }
}


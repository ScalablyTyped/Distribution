package typings.winrtUwp.Windows.Media.FaceAnalysis

import typings.winrtUwp.Windows.Graphics.Imaging.BitmapBounds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a face that was detected in a SoftwareBitmap or a VideoFrame . */
@js.native
trait DetectedFace extends js.Object {
  /** Gets the bounds the detected face occupies in the SoftwareBitmap or VideoFrame . */
  var faceBox: BitmapBounds = js.native
}

object DetectedFace {
  @scala.inline
  def apply(faceBox: BitmapBounds): DetectedFace = {
    val __obj = js.Dynamic.literal(faceBox = faceBox.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectedFace]
  }
  @scala.inline
  implicit class DetectedFaceOps[Self <: DetectedFace] (val x: Self) extends AnyVal {
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
    def setFaceBox(value: BitmapBounds): Self = this.set("faceBox", value.asInstanceOf[js.Any])
  }
  
}


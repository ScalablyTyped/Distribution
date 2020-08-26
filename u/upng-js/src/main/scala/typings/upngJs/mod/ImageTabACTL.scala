package typings.upngJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageTabACTL extends js.Object {
  var num_frames: Double = js.native
  var num_plays: Double = js.native
}

object ImageTabACTL {
  @scala.inline
  def apply(num_frames: Double, num_plays: Double): ImageTabACTL = {
    val __obj = js.Dynamic.literal(num_frames = num_frames.asInstanceOf[js.Any], num_plays = num_plays.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageTabACTL]
  }
  @scala.inline
  implicit class ImageTabACTLOps[Self <: ImageTabACTL] (val x: Self) extends AnyVal {
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
    def setNum_frames(value: Double): Self = this.set("num_frames", value.asInstanceOf[js.Any])
    @scala.inline
    def setNum_plays(value: Double): Self = this.set("num_plays", value.asInstanceOf[js.Any])
  }
  
}


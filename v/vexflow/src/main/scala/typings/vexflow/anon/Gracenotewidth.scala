package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Gracenotewidth extends js.Object {
  var code: String = js.native
  var gracenote_width: Double = js.native
  var shift_down: Double = js.native
  var shift_right: Double = js.native
  var width: Double = js.native
}

object Gracenotewidth {
  @scala.inline
  def apply(code: String, gracenote_width: Double, shift_down: Double, shift_right: Double, width: Double): Gracenotewidth = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], gracenote_width = gracenote_width.asInstanceOf[js.Any], shift_down = shift_down.asInstanceOf[js.Any], shift_right = shift_right.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gracenotewidth]
  }
  @scala.inline
  implicit class GracenotewidthOps[Self <: Gracenotewidth] (val x: Self) extends AnyVal {
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setGracenote_width(value: Double): Self = this.set("gracenote_width", value.asInstanceOf[js.Any])
    @scala.inline
    def setShift_down(value: Double): Self = this.set("shift_down", value.asInstanceOf[js.Any])
    @scala.inline
    def setShift_right(value: Double): Self = this.set("shift_right", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}


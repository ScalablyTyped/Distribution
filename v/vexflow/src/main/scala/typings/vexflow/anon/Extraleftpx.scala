package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Extraleftpx extends js.Object {
  var extra_left_px: Double = js.native
  var extra_right_px: Double = js.native
  var spacing: Double = js.native
  var width: Double = js.native
}

object Extraleftpx {
  @scala.inline
  def apply(extra_left_px: Double, extra_right_px: Double, spacing: Double, width: Double): Extraleftpx = {
    val __obj = js.Dynamic.literal(extra_left_px = extra_left_px.asInstanceOf[js.Any], extra_right_px = extra_right_px.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extraleftpx]
  }
  @scala.inline
  implicit class ExtraleftpxOps[Self <: Extraleftpx] (val x: Self) extends AnyVal {
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
    def setExtra_left_px(value: Double): Self = this.set("extra_left_px", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtra_right_px(value: Double): Self = this.set("extra_right_px", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpacing(value: Double): Self = this.set("spacing", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}


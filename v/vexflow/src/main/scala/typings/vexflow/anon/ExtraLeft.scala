package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtraLeft extends js.Object {
  var extraLeft: Double = js.native
  var extraRight: Double = js.native
  var left: Double = js.native
  var right: Double = js.native
}

object ExtraLeft {
  @scala.inline
  def apply(extraLeft: Double, extraRight: Double, left: Double, right: Double): ExtraLeft = {
    val __obj = js.Dynamic.literal(extraLeft = extraLeft.asInstanceOf[js.Any], extraRight = extraRight.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtraLeft]
  }
  @scala.inline
  implicit class ExtraLeftOps[Self <: ExtraLeft] (val x: Self) extends AnyVal {
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
    def setExtraLeft(value: Double): Self = this.set("extraLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtraRight(value: Double): Self = this.set("extraRight", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def setRight(value: Double): Self = this.set("right", value.asInstanceOf[js.Any])
  }
  
}


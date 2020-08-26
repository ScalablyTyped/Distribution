package typings.tesseractJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Baseline extends js.Object {
  var has_baseline: Boolean = js.native
  var x0: Double = js.native
  var x1: Double = js.native
  var y0: Double = js.native
  var y1: Double = js.native
}

object Baseline {
  @scala.inline
  def apply(has_baseline: Boolean, x0: Double, x1: Double, y0: Double, y1: Double): Baseline = {
    val __obj = js.Dynamic.literal(has_baseline = has_baseline.asInstanceOf[js.Any], x0 = x0.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], y0 = y0.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any])
    __obj.asInstanceOf[Baseline]
  }
  @scala.inline
  implicit class BaselineOps[Self <: Baseline] (val x: Self) extends AnyVal {
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
    def setHas_baseline(value: Boolean): Self = this.set("has_baseline", value.asInstanceOf[js.Any])
    @scala.inline
    def setX0(value: Double): Self = this.set("x0", value.asInstanceOf[js.Any])
    @scala.inline
    def setX1(value: Double): Self = this.set("x1", value.asInstanceOf[js.Any])
    @scala.inline
    def setY0(value: Double): Self = this.set("y0", value.asInstanceOf[js.Any])
    @scala.inline
    def setY1(value: Double): Self = this.set("y1", value.asInstanceOf[js.Any])
  }
  
}


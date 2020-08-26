package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Xmax extends js.Object {
  var height: Double = js.native
  var width: Double = js.native
  var x_max: Double = js.native
  var x_min: Double = js.native
}

object Xmax {
  @scala.inline
  def apply(height: Double, width: Double, x_max: Double, x_min: Double): Xmax = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x_max = x_max.asInstanceOf[js.Any], x_min = x_min.asInstanceOf[js.Any])
    __obj.asInstanceOf[Xmax]
  }
  @scala.inline
  implicit class XmaxOps[Self <: Xmax] (val x: Self) extends AnyVal {
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setX_max(value: Double): Self = this.set("x_max", value.asInstanceOf[js.Any])
    @scala.inline
    def setX_min(value: Double): Self = this.set("x_min", value.asInstanceOf[js.Any])
  }
  
}


package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Direction extends js.Object {
  var direction: Double = js.native
  var first_x: Double = js.native
  var first_y: Double = js.native
  var last_x: Double = js.native
  var last_y: Double = js.native
}

object Direction {
  @scala.inline
  def apply(direction: Double, first_x: Double, first_y: Double, last_x: Double, last_y: Double): Direction = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], first_x = first_x.asInstanceOf[js.Any], first_y = first_y.asInstanceOf[js.Any], last_x = last_x.asInstanceOf[js.Any], last_y = last_y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Direction]
  }
  @scala.inline
  implicit class DirectionOps[Self <: Direction] (val x: Self) extends AnyVal {
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
    def setDirection(value: Double): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirst_x(value: Double): Self = this.set("first_x", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirst_y(value: Double): Self = this.set("first_y", value.asInstanceOf[js.Any])
    @scala.inline
    def setLast_x(value: Double): Self = this.set("last_x", value.asInstanceOf[js.Any])
    @scala.inline
    def setLast_y(value: Double): Self = this.set("last_y", value.asInstanceOf[js.Any])
  }
  
}


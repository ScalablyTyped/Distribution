package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Xshift extends js.Object {
  var code: String = js.native
  var x_shift: Double = js.native
  var y_shift: Double = js.native
}

object Xshift {
  @scala.inline
  def apply(code: String, x_shift: Double, y_shift: Double): Xshift = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], x_shift = x_shift.asInstanceOf[js.Any], y_shift = y_shift.asInstanceOf[js.Any])
    __obj.asInstanceOf[Xshift]
  }
  @scala.inline
  implicit class XshiftOps[Self <: Xshift] (val x: Self) extends AnyVal {
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
    def setX_shift(value: Double): Self = this.set("x_shift", value.asInstanceOf[js.Any])
    @scala.inline
    def setY_shift(value: Double): Self = this.set("y_shift", value.asInstanceOf[js.Any])
  }
  
}


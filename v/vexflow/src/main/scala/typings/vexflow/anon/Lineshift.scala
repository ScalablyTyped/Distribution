package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lineshift extends js.Object {
  var line_shift: Double = js.native
}

object Lineshift {
  @scala.inline
  def apply(line_shift: Double): Lineshift = {
    val __obj = js.Dynamic.literal(line_shift = line_shift.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lineshift]
  }
  @scala.inline
  implicit class LineshiftOps[Self <: Lineshift] (val x: Self) extends AnyVal {
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
    def setLine_shift(value: Double): Self = this.set("line_shift", value.asInstanceOf[js.Any])
  }
  
}


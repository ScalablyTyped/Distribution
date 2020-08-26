package typings.surveyKnockout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ControlOther extends js.Object {
  var control: String = js.native
  var other: String = js.native
  var root: String = js.native
}

object ControlOther {
  @scala.inline
  def apply(control: String, other: String, root: String): ControlOther = {
    val __obj = js.Dynamic.literal(control = control.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlOther]
  }
  @scala.inline
  implicit class ControlOtherOps[Self <: ControlOther] (val x: Self) extends AnyVal {
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
    def setControl(value: String): Self = this.set("control", value.asInstanceOf[js.Any])
    @scala.inline
    def setOther(value: String): Self = this.set("other", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
  }
  
}


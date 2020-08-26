package typings.vueDatetime.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VueDateTimeProps extends js.Object {
  var inputClass: js.Any = js.native
  var inputStyle: js.Any = js.native
}

object VueDateTimeProps {
  @scala.inline
  def apply(inputClass: js.Any, inputStyle: js.Any): VueDateTimeProps = {
    val __obj = js.Dynamic.literal(inputClass = inputClass.asInstanceOf[js.Any], inputStyle = inputStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[VueDateTimeProps]
  }
  @scala.inline
  implicit class VueDateTimePropsOps[Self <: VueDateTimeProps] (val x: Self) extends AnyVal {
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
    def setInputClass(value: js.Any): Self = this.set("inputClass", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputStyle(value: js.Any): Self = this.set("inputStyle", value.asInstanceOf[js.Any])
  }
  
}


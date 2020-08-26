package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeChange extends js.Object {
  var codeChange: scala.Double = js.native
  var system: scala.Double = js.native
  var text: scala.Double = js.native
  var unknown: scala.Double = js.native
}

object CodeChange {
  @scala.inline
  def apply(codeChange: scala.Double, system: scala.Double, text: scala.Double, unknown: scala.Double): CodeChange = {
    val __obj = js.Dynamic.literal(codeChange = codeChange.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], unknown = unknown.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeChange]
  }
  @scala.inline
  implicit class CodeChangeOps[Self <: CodeChange] (val x: Self) extends AnyVal {
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
    def setCodeChange(value: scala.Double): Self = this.set("codeChange", value.asInstanceOf[js.Any])
    @scala.inline
    def setSystem(value: scala.Double): Self = this.set("system", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: scala.Double): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnknown(value: scala.Double): Self = this.set("unknown", value.asInstanceOf[js.Any])
  }
  
}


package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiagnosticInfo extends js.Object {
  var category: DiagnosticCategory = js.native
  var code: Double = js.native
  var message: String = js.native
}

object DiagnosticInfo {
  @scala.inline
  def apply(category: DiagnosticCategory, code: Double, message: String): DiagnosticInfo = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagnosticInfo]
  }
  @scala.inline
  implicit class DiagnosticInfoOps[Self <: DiagnosticInfo] (val x: Self) extends AnyVal {
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
    def setCategory(value: DiagnosticCategory): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
  }
  
}


package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiagnosticMessage extends js.Object {
  var category: DiagnosticCategory = js.native
  var code: Double = js.native
  var key: java.lang.String = js.native
  var message: java.lang.String = js.native
  var reportsUnnecessary: js.UndefOr[js.Object] = js.native
}

object DiagnosticMessage {
  @scala.inline
  def apply(category: DiagnosticCategory, code: Double, key: java.lang.String, message: java.lang.String): DiagnosticMessage = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagnosticMessage]
  }
  @scala.inline
  implicit class DiagnosticMessageOps[Self <: DiagnosticMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCategory(value: DiagnosticCategory): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: java.lang.String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: java.lang.String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setReportsUnnecessary(value: js.Object): Self = this.set("reportsUnnecessary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportsUnnecessary: Self = this.set("reportsUnnecessary", js.undefined)
  }
  
}


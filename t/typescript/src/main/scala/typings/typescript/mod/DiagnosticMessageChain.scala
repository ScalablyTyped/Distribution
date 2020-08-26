package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiagnosticMessageChain extends js.Object {
  var category: DiagnosticCategory = js.native
  var code: Double = js.native
  var messageText: java.lang.String = js.native
  var next: js.UndefOr[js.Array[DiagnosticMessageChain]] = js.native
}

object DiagnosticMessageChain {
  @scala.inline
  def apply(category: DiagnosticCategory, code: Double, messageText: java.lang.String): DiagnosticMessageChain = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], messageText = messageText.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagnosticMessageChain]
  }
  @scala.inline
  implicit class DiagnosticMessageChainOps[Self <: DiagnosticMessageChain] (val x: Self) extends AnyVal {
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
    def setMessageText(value: java.lang.String): Self = this.set("messageText", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextVarargs(value: DiagnosticMessageChain*): Self = this.set("next", js.Array(value :_*))
    @scala.inline
    def setNext(value: js.Array[DiagnosticMessageChain]): Self = this.set("next", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNext: Self = this.set("next", js.undefined)
  }
  
}


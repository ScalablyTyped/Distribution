package typings.xsdSchemaValidator.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Messages extends js.Object {
  var messages: js.Array[String] = js.native
  var result: String = js.native
  var valid: Boolean = js.native
}

object Messages {
  @scala.inline
  def apply(messages: js.Array[String], result: String, valid: Boolean): Messages = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Messages]
  }
  @scala.inline
  implicit class MessagesOps[Self <: Messages] (val x: Self) extends AnyVal {
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
    def setMessagesVarargs(value: String*): Self = this.set("messages", js.Array(value :_*))
    @scala.inline
    def setMessages(value: js.Array[String]): Self = this.set("messages", value.asInstanceOf[js.Any])
    @scala.inline
    def setResult(value: String): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def setValid(value: Boolean): Self = this.set("valid", value.asInstanceOf[js.Any])
  }
  
}


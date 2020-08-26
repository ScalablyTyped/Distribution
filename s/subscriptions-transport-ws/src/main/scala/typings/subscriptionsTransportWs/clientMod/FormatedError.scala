package typings.subscriptionsTransportWs.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Error & {  originalError :any | undefined} */
@js.native
trait FormatedError extends js.Object {
  var message: String = js.native
  var name: String = js.native
  var originalError: js.UndefOr[js.Any] = js.native
  var stack: js.UndefOr[String] = js.native
}

object FormatedError {
  @scala.inline
  def apply(message: String, name: String): FormatedError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatedError]
  }
  @scala.inline
  implicit class FormatedErrorOps[Self <: FormatedError] (val x: Self) extends AnyVal {
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginalError(value: js.Any): Self = this.set("originalError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalError: Self = this.set("originalError", js.undefined)
    @scala.inline
    def setStack(value: String): Self = this.set("stack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStack: Self = this.set("stack", js.undefined)
  }
  
}


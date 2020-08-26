package typings.tinymce.mod.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONRequest extends js.Object {
  def send(args: js.Object): Unit = js.native
  def sendRPC(o: js.Object): Unit = js.native
}

object JSONRequest {
  @scala.inline
  def apply(send: js.Object => Unit, sendRPC: js.Object => Unit): JSONRequest = {
    val __obj = js.Dynamic.literal(send = js.Any.fromFunction1(send), sendRPC = js.Any.fromFunction1(sendRPC))
    __obj.asInstanceOf[JSONRequest]
  }
  @scala.inline
  implicit class JSONRequestOps[Self <: JSONRequest] (val x: Self) extends AnyVal {
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
    def setSend(value: js.Object => Unit): Self = this.set("send", js.Any.fromFunction1(value))
    @scala.inline
    def setSendRPC(value: js.Object => Unit): Self = this.set("sendRPC", js.Any.fromFunction1(value))
  }
  
}


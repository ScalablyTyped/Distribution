package typings.vscodeLanguageclient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Send[T /* <: js.Function */] extends js.Object {
  var send: T = js.native
}

object Send {
  @scala.inline
  def apply[/* <: js.Function */ T](send: T): Send[T] = {
    val __obj = js.Dynamic.literal(send = send.asInstanceOf[js.Any])
    __obj.asInstanceOf[Send[T]]
  }
  @scala.inline
  implicit class SendOps[Self <: Send[_], /* <: js.Function */ T] (val x: Self with Send[T]) extends AnyVal {
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
    def setSend(value: T): Self = this.set("send", value.asInstanceOf[js.Any])
  }
  
}


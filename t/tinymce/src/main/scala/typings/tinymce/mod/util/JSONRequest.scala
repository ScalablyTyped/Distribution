package typings.tinymce.mod.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONRequest extends js.Object {
  def send(args: js.Object): Unit
  def sendRPC(o: js.Object): Unit
}

object JSONRequest {
  @scala.inline
  def apply(send: js.Object => Unit, sendRPC: js.Object => Unit): JSONRequest = {
    val __obj = js.Dynamic.literal(send = js.Any.fromFunction1(send), sendRPC = js.Any.fromFunction1(sendRPC))
  
    __obj.asInstanceOf[JSONRequest]
  }
}


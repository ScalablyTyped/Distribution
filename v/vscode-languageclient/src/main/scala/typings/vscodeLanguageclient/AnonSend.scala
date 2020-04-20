package typings.vscodeLanguageclient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSend[T /* <: js.Function */] extends js.Object {
  var send: T
}

object AnonSend {
  @scala.inline
  def apply[T /* <: js.Function */](send: T): AnonSend[T] = {
    val __obj = js.Dynamic.literal(send = send.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSend[T]]
  }
}


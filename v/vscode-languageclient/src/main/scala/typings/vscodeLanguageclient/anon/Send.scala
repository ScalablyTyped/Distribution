package typings.vscodeLanguageclient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Send[T /* <: js.Function */] extends js.Object {
  var send: T
}

object Send {
  @scala.inline
  def apply[/* <: js.Function */ T](send: T): Send[T] = {
    val __obj = js.Dynamic.literal(send = send.asInstanceOf[js.Any])
    __obj.asInstanceOf[Send[T]]
  }
}


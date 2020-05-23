package typings.vueRx.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Msg extends js.Object {
  var msg: js.Any
  var name: String
}

object Msg {
  @scala.inline
  def apply(msg: js.Any, name: String): Msg = {
    val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Msg]
  }
}


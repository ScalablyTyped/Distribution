package typings.vueRx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMsg extends js.Object {
  var msg: js.Any
  var name: String
}

object AnonMsg {
  @scala.inline
  def apply(msg: js.Any, name: String): AnonMsg = {
    val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMsg]
  }
}


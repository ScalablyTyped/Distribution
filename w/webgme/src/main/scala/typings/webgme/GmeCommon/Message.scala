package typings.webgme.GmeCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var msg: String
}

object Message {
  @scala.inline
  def apply(msg: String): Message = {
    val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Message]
  }
}


package typings.vscodeJsonrpc.messagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var jsonrpc: String
}

object Message {
  @scala.inline
  def apply(jsonrpc: String): Message = {
    val __obj = js.Dynamic.literal(jsonrpc = jsonrpc.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Message]
  }
}


package typings
package vscodeDashJsonrpcLib.libMessagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var jsonrpc: java.lang.String
}

object Message {
  @scala.inline
  def apply(jsonrpc: java.lang.String): Message = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("jsonrpc")(jsonrpc)
    __obj.asInstanceOf[Message]
  }
}


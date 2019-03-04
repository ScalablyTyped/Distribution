package typings
package trezorDashConnectLib.trezorDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var message: java.lang.String
}

object Message {
  @scala.inline
  def apply(message: java.lang.String): Message = {
    val __obj = js.Dynamic.literal(message = message)
  
    __obj.asInstanceOf[Message]
  }
}


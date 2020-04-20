package typings.uws

import typings.uws.mod.WebSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCode extends js.Object {
  var code: Double
  var reason: String
  var target: WebSocket
  var wasClean: Boolean
}

object AnonCode {
  @scala.inline
  def apply(code: Double, reason: String, target: WebSocket, wasClean: Boolean): AnonCode = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], wasClean = wasClean.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCode]
  }
}


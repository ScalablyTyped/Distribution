package typings.ws

import typings.ws.wsMod.WebSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Code extends js.Object {
  var code: Double
  var reason: String
  var target: WebSocket
  var wasClean: Boolean
}

object Anon_Code {
  @scala.inline
  def apply(code: Double, reason: String, target: WebSocket, wasClean: Boolean): Anon_Code = {
    val __obj = js.Dynamic.literal(code = code, reason = reason, target = target, wasClean = wasClean)
  
    __obj.asInstanceOf[Anon_Code]
  }
}


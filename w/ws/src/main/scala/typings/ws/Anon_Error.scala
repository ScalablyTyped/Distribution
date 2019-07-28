package typings.ws

import typings.ws.wsMod.WebSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Error extends js.Object {
  var error: js.Any
  var message: String
  var target: WebSocket
  var `type`: String
}

object Anon_Error {
  @scala.inline
  def apply(error: js.Any, message: String, target: WebSocket, `type`: String): Anon_Error = {
    val __obj = js.Dynamic.literal(error = error, message = message, target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Error]
  }
}


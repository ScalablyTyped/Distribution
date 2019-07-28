package typings.ws

import typings.ws.wsMod.Data
import typings.ws.wsMod.WebSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: Data
  var target: WebSocket
  var `type`: String
}

object Anon_Data {
  @scala.inline
  def apply(data: Data, target: WebSocket, `type`: String): Anon_Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Data]
  }
}


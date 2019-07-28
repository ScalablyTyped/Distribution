package typings.uws

import typings.uws.uwsMod.WebSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: js.Any
  var target: WebSocket
  var `type`: String
}

object Anon_Data {
  @scala.inline
  def apply(data: js.Any, target: WebSocket, `type`: String): Anon_Data = {
    val __obj = js.Dynamic.literal(data = data, target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Data]
  }
}


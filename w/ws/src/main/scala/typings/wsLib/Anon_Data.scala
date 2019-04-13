package typings
package wsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: wsLib.wsMod.Data
  var target: wsLib.wsMod.WebSocket
  var `type`: java.lang.String
}

object Anon_Data {
  @scala.inline
  def apply(data: wsLib.wsMod.Data, target: wsLib.wsMod.WebSocket, `type`: java.lang.String): Anon_Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Data]
  }
}


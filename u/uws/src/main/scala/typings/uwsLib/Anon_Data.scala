package typings
package uwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: js.Any
  var target: uwsLib.uwsMod.WebSocket
  var `type`: java.lang.String
}

object Anon_Data {
  @scala.inline
  def apply(data: js.Any, target: uwsLib.uwsMod.WebSocket, `type`: java.lang.String): Anon_Data = {
    val __obj = js.Dynamic.literal(data = data, target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Data]
  }
}


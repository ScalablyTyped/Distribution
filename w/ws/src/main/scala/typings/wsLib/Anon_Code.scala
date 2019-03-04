package typings
package wsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Code extends js.Object {
  var code: scala.Double
  var reason: java.lang.String
  var target: wsLib.wsMod.WebSocket
  var wasClean: scala.Boolean
}

object Anon_Code {
  @scala.inline
  def apply(
    code: scala.Double,
    reason: java.lang.String,
    target: wsLib.wsMod.WebSocket,
    wasClean: scala.Boolean
  ): Anon_Code = {
    val __obj = js.Dynamic.literal(code = code, reason = reason, target = target, wasClean = wasClean)
  
    __obj.asInstanceOf[Anon_Code]
  }
}


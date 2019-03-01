package typings
package uwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Code extends js.Object {
  var code: scala.Double
  var reason: java.lang.String
  var target: uwsLib.uwsMod.WebSocket
  var wasClean: scala.Boolean
}

object Anon_Code {
  @scala.inline
  def apply(
    code: scala.Double,
    reason: java.lang.String,
    target: uwsLib.uwsMod.WebSocket,
    wasClean: scala.Boolean
  ): Anon_Code = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("reason")(reason)
    __obj.updateDynamic("target")(target)
    __obj.updateDynamic("wasClean")(wasClean)
    __obj.asInstanceOf[Anon_Code]
  }
}


package typings
package stropheLib.mucMod.stropheMod.StropheNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Connection extends js.Object {
  var muc: stropheLib.mucMod.stropheMod.StropheNs.MUCNs.Plugin
}

object Connection {
  @scala.inline
  def apply(muc: stropheLib.mucMod.stropheMod.StropheNs.MUCNs.Plugin): Connection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("muc")(muc)
    __obj.asInstanceOf[Connection]
  }
}


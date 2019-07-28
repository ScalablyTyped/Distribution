package typings.strophe.mucMod.stropheMod.StropheNs

import typings.strophe.mucMod.stropheMod.StropheNs.MUCNs.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Connection extends js.Object {
  var muc: Plugin
}

object Connection {
  @scala.inline
  def apply(muc: Plugin): Connection = {
    val __obj = js.Dynamic.literal(muc = muc)
  
    __obj.asInstanceOf[Connection]
  }
}


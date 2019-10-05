package typings.stropheDotJs.mucMod.stropheMod.Strophe

import typings.stropheDotJs.mucMod.stropheMod.Strophe.MUC.Plugin
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


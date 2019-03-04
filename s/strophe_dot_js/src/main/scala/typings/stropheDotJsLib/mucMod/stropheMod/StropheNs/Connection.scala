package typings
package stropheDotJsLib.mucMod.stropheMod.StropheNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Connection extends js.Object {
  var muc: stropheDotJsLib.mucMod.stropheMod.StropheNs.MUCNs.Plugin
}

object Connection {
  @scala.inline
  def apply(muc: stropheDotJsLib.mucMod.stropheMod.StropheNs.MUCNs.Plugin): Connection = {
    val __obj = js.Dynamic.literal(muc = muc)
  
    __obj.asInstanceOf[Connection]
  }
}


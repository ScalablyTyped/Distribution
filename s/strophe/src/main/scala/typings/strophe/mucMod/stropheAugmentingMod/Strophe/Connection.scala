package typings.strophe.mucMod.stropheAugmentingMod.Strophe

import typings.strophe.mucMod.stropheAugmentingMod.Strophe.MUC.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Connection extends js.Object {
  var muc: Plugin
}

object Connection {
  @scala.inline
  def apply(muc: Plugin): Connection = {
    val __obj = js.Dynamic.literal(muc = muc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Connection]
  }
}


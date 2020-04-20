package typings.vueLs.mod.vueTypesVueAugmentingMod

import typings.vueLs.mod.WebStorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VueConstructor extends js.Object {
  var ls: WebStorage
}

object VueConstructor {
  @scala.inline
  def apply(ls: WebStorage): VueConstructor = {
    val __obj = js.Dynamic.literal(ls = ls.asInstanceOf[js.Any])
    __obj.asInstanceOf[VueConstructor]
  }
}


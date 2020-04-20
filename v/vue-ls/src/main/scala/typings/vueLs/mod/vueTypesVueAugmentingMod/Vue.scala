package typings.vueLs.mod.vueTypesVueAugmentingMod

import typings.vueLs.mod.WebStorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Vue extends js.Object {
  @JSName("$ls")
  var $ls: WebStorage
}

object Vue {
  @scala.inline
  def apply($ls: WebStorage): Vue = {
    val __obj = js.Dynamic.literal($ls = $ls.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vue]
  }
}


package typings.vuex.vueMod

import typings.vuex.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Vue extends js.Object {
  @JSName("$store")
  var $store: Store[_]
}

object Vue {
  @scala.inline
  def apply($store: Store[_]): Vue = {
    val __obj = js.Dynamic.literal($store = $store.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vue]
  }
}


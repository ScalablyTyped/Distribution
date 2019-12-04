package typings.vuex.typesOptionsMod

import typings.vue.typesVueMod.Vue
import typings.vuex.vuexMod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentOptions[V /* <: Vue */] extends js.Object {
  var store: js.UndefOr[Store[_]] = js.undefined
}

object ComponentOptions {
  @scala.inline
  def apply[V /* <: Vue */](store: Store[_] = null): ComponentOptions[V] = {
    val __obj = js.Dynamic.literal()
    if (store != null) __obj.updateDynamic("store")(store.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentOptions[V]]
  }
}


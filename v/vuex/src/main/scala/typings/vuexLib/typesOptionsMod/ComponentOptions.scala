package typings
package vuexLib.typesOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentOptions[V /* <: vueLib.typesVueMod.Vue */] extends js.Object {
  var store: js.UndefOr[vuexLib.typesMod.Store[_]] = js.undefined
}

object ComponentOptions {
  @scala.inline
  def apply[V /* <: vueLib.typesVueMod.Vue */](store: vuexLib.typesMod.Store[_] = null): ComponentOptions[V] = {
    val __obj = js.Dynamic.literal()
    if (store != null) __obj.updateDynamic("store")(store)
    __obj.asInstanceOf[ComponentOptions[V]]
  }
}


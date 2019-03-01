package typings
package vuexLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Actions[S] extends js.Object {
  var actions: js.UndefOr[vuexLib.typesMod.ActionTree[S, S]] = js.undefined
  var getters: js.UndefOr[vuexLib.typesMod.GetterTree[S, S]] = js.undefined
  var modules: js.UndefOr[vuexLib.typesMod.ModuleTree[S]] = js.undefined
  var mutations: js.UndefOr[vuexLib.typesMod.MutationTree[S]] = js.undefined
}

object Anon_Actions {
  @scala.inline
  def apply[S](
    actions: vuexLib.typesMod.ActionTree[S, S] = null,
    getters: vuexLib.typesMod.GetterTree[S, S] = null,
    modules: vuexLib.typesMod.ModuleTree[S] = null,
    mutations: vuexLib.typesMod.MutationTree[S] = null
  ): Anon_Actions[S] = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions)
    if (getters != null) __obj.updateDynamic("getters")(getters)
    if (modules != null) __obj.updateDynamic("modules")(modules)
    if (mutations != null) __obj.updateDynamic("mutations")(mutations)
    __obj.asInstanceOf[Anon_Actions[S]]
  }
}


package typings.vuex.anon

import typings.vuex.mod.ActionTree
import typings.vuex.mod.GetterTree
import typings.vuex.mod.ModuleTree
import typings.vuex.mod.MutationTree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Actions[S] extends js.Object {
  var actions: js.UndefOr[ActionTree[S, S]] = js.undefined
  var getters: js.UndefOr[GetterTree[S, S]] = js.undefined
  var modules: js.UndefOr[ModuleTree[S]] = js.undefined
  var mutations: js.UndefOr[MutationTree[S]] = js.undefined
}

object Actions {
  @scala.inline
  def apply[S](
    actions: ActionTree[S, S] = null,
    getters: GetterTree[S, S] = null,
    modules: ModuleTree[S] = null,
    mutations: MutationTree[S] = null
  ): Actions[S] = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (getters != null) __obj.updateDynamic("getters")(getters.asInstanceOf[js.Any])
    if (modules != null) __obj.updateDynamic("modules")(modules.asInstanceOf[js.Any])
    if (mutations != null) __obj.updateDynamic("mutations")(mutations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Actions[S]]
  }
}


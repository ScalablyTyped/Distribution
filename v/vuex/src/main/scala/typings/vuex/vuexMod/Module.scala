package typings.vuex.vuexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Module[S, R] extends js.Object {
  var actions: js.UndefOr[ActionTree[S, R]] = js.undefined
  var getters: js.UndefOr[GetterTree[S, R]] = js.undefined
  var modules: js.UndefOr[ModuleTree[R]] = js.undefined
  var mutations: js.UndefOr[MutationTree[S]] = js.undefined
  var namespaced: js.UndefOr[Boolean] = js.undefined
  var state: js.UndefOr[S | js.Function0[S]] = js.undefined
}

object Module {
  @scala.inline
  def apply[S, R](
    actions: ActionTree[S, R] = null,
    getters: GetterTree[S, R] = null,
    modules: ModuleTree[R] = null,
    mutations: MutationTree[S] = null,
    namespaced: js.UndefOr[Boolean] = js.undefined,
    state: S | js.Function0[S] = null
  ): Module[S, R] = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (getters != null) __obj.updateDynamic("getters")(getters.asInstanceOf[js.Any])
    if (modules != null) __obj.updateDynamic("modules")(modules.asInstanceOf[js.Any])
    if (mutations != null) __obj.updateDynamic("mutations")(mutations.asInstanceOf[js.Any])
    if (!js.isUndefined(namespaced)) __obj.updateDynamic("namespaced")(namespaced.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Module[S, R]]
  }
}


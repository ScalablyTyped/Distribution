package typings.vuex.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoreOptions[S] extends js.Object {
  var actions: js.UndefOr[ActionTree[S, S]] = js.undefined
  var getters: js.UndefOr[GetterTree[S, S]] = js.undefined
  var modules: js.UndefOr[ModuleTree[S]] = js.undefined
  var mutations: js.UndefOr[MutationTree[S]] = js.undefined
  var plugins: js.UndefOr[js.Array[Plugin[S]]] = js.undefined
  var state: js.UndefOr[S | js.Function0[S]] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
}

object StoreOptions {
  @scala.inline
  def apply[S](
    actions: ActionTree[S, S] = null,
    getters: GetterTree[S, S] = null,
    modules: ModuleTree[S] = null,
    mutations: MutationTree[S] = null,
    plugins: js.Array[Plugin[S]] = null,
    state: S | js.Function0[S] = null,
    strict: js.UndefOr[Boolean] = js.undefined
  ): StoreOptions[S] = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions)
    if (getters != null) __obj.updateDynamic("getters")(getters)
    if (modules != null) __obj.updateDynamic("modules")(modules)
    if (mutations != null) __obj.updateDynamic("mutations")(mutations)
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    __obj.asInstanceOf[StoreOptions[S]]
  }
}


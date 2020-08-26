package typings.vuex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoreOptions[S] extends js.Object {
  var actions: js.UndefOr[ActionTree[S, S]] = js.native
  var devtools: js.UndefOr[Boolean] = js.native
  var getters: js.UndefOr[GetterTree[S, S]] = js.native
  var modules: js.UndefOr[ModuleTree[S]] = js.native
  var mutations: js.UndefOr[MutationTree[S]] = js.native
  var plugins: js.UndefOr[js.Array[Plugin[S]]] = js.native
  var state: js.UndefOr[S | js.Function0[S]] = js.native
  var strict: js.UndefOr[Boolean] = js.native
}

object StoreOptions {
  @scala.inline
  def apply[S](): StoreOptions[S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StoreOptions[S]]
  }
  @scala.inline
  implicit class StoreOptionsOps[Self <: StoreOptions[_], S] (val x: Self with StoreOptions[S]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActions(value: ActionTree[S, S]): Self = this.set("actions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    @scala.inline
    def setDevtools(value: Boolean): Self = this.set("devtools", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDevtools: Self = this.set("devtools", js.undefined)
    @scala.inline
    def setGetters(value: GetterTree[S, S]): Self = this.set("getters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGetters: Self = this.set("getters", js.undefined)
    @scala.inline
    def setModules(value: ModuleTree[S]): Self = this.set("modules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModules: Self = this.set("modules", js.undefined)
    @scala.inline
    def setMutations(value: MutationTree[S]): Self = this.set("mutations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMutations: Self = this.set("mutations", js.undefined)
    @scala.inline
    def setPluginsVarargs(value: Plugin[S]*): Self = this.set("plugins", js.Array(value :_*))
    @scala.inline
    def setPlugins(value: js.Array[Plugin[S]]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    @scala.inline
    def setStateFunction0(value: () => S): Self = this.set("state", js.Any.fromFunction0(value))
    @scala.inline
    def setState(value: S | js.Function0[S]): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
  }
  
}


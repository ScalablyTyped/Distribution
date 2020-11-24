package typings.vuex.anon

import typings.vuex.mod.ActionTree
import typings.vuex.mod.GetterTree
import typings.vuex.mod.ModuleTree
import typings.vuex.mod.MutationTree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Actions[S] extends js.Object {
  
  var actions: js.UndefOr[ActionTree[S, S]] = js.native
  
  var getters: js.UndefOr[GetterTree[S, S]] = js.native
  
  var modules: js.UndefOr[ModuleTree[S]] = js.native
  
  var mutations: js.UndefOr[MutationTree[S]] = js.native
}
object Actions {
  
  @scala.inline
  def apply[S](): Actions[S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Actions[S]]
  }
  
  @scala.inline
  implicit class ActionsOps[Self <: Actions[_], S] (val x: Self with Actions[S]) extends AnyVal {
    
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
  }
}

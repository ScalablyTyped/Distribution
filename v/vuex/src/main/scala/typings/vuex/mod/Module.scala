package typings.vuex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Module[S, R] extends js.Object {
  
  var actions: js.UndefOr[ActionTree[S, R]] = js.native
  
  var getters: js.UndefOr[GetterTree[S, R]] = js.native
  
  var modules: js.UndefOr[ModuleTree[R]] = js.native
  
  var mutations: js.UndefOr[MutationTree[S]] = js.native
  
  var namespaced: js.UndefOr[Boolean] = js.native
  
  var state: js.UndefOr[S | js.Function0[S]] = js.native
}
object Module {
  
  @scala.inline
  def apply[S, R](): Module[S, R] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Module[S, R]]
  }
  
  @scala.inline
  implicit class ModuleOps[Self <: Module[_, _], S, R] (val x: Self with (Module[S, R])) extends AnyVal {
    
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
    def setActions(value: ActionTree[S, R]): Self = this.set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    
    @scala.inline
    def setGetters(value: GetterTree[S, R]): Self = this.set("getters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetters: Self = this.set("getters", js.undefined)
    
    @scala.inline
    def setModules(value: ModuleTree[R]): Self = this.set("modules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModules: Self = this.set("modules", js.undefined)
    
    @scala.inline
    def setMutations(value: MutationTree[S]): Self = this.set("mutations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMutations: Self = this.set("mutations", js.undefined)
    
    @scala.inline
    def setNamespaced(value: Boolean): Self = this.set("namespaced", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamespaced: Self = this.set("namespaced", js.undefined)
    
    @scala.inline
    def setStateFunction0(value: () => S): Self = this.set("state", js.Any.fromFunction0(value))
    
    @scala.inline
    def setState(value: S | js.Function0[S]): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}

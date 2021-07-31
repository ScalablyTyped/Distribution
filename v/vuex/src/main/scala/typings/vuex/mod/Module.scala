package typings.vuex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Module[S, R] extends StObject {
  
  var actions: js.UndefOr[ActionTree[S, R]] = js.undefined
  
  var getters: js.UndefOr[GetterTree[S, R]] = js.undefined
  
  var modules: js.UndefOr[ModuleTree[R]] = js.undefined
  
  var mutations: js.UndefOr[MutationTree[S]] = js.undefined
  
  var namespaced: js.UndefOr[Boolean] = js.undefined
  
  var state: js.UndefOr[S | js.Function0[S]] = js.undefined
}
object Module {
  
  @scala.inline
  def apply[S, R](): Module[S, R] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Module[S, R]]
  }
  
  @scala.inline
  implicit class ModuleMutableBuilder[Self <: Module[?, ?], S, R] (val x: Self & (Module[S, R])) extends AnyVal {
    
    @scala.inline
    def setActions(value: ActionTree[S, R]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    @scala.inline
    def setGetters(value: GetterTree[S, R]): Self = StObject.set(x, "getters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGettersUndefined: Self = StObject.set(x, "getters", js.undefined)
    
    @scala.inline
    def setModules(value: ModuleTree[R]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
    
    @scala.inline
    def setMutations(value: MutationTree[S]): Self = StObject.set(x, "mutations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMutationsUndefined: Self = StObject.set(x, "mutations", js.undefined)
    
    @scala.inline
    def setNamespaced(value: Boolean): Self = StObject.set(x, "namespaced", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespacedUndefined: Self = StObject.set(x, "namespaced", js.undefined)
    
    @scala.inline
    def setState(value: S | js.Function0[S]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateFunction0(value: () => S): Self = StObject.set(x, "state", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}

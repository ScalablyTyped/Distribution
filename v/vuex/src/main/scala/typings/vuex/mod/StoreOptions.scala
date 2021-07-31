package typings.vuex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StoreOptions[S] extends StObject {
  
  var actions: js.UndefOr[ActionTree[S, S]] = js.undefined
  
  var devtools: js.UndefOr[Boolean] = js.undefined
  
  var getters: js.UndefOr[GetterTree[S, S]] = js.undefined
  
  var modules: js.UndefOr[ModuleTree[S]] = js.undefined
  
  var mutations: js.UndefOr[MutationTree[S]] = js.undefined
  
  var plugins: js.UndefOr[js.Array[Plugin[S]]] = js.undefined
  
  var state: js.UndefOr[S | js.Function0[S]] = js.undefined
  
  var strict: js.UndefOr[Boolean] = js.undefined
}
object StoreOptions {
  
  @scala.inline
  def apply[S](): StoreOptions[S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StoreOptions[S]]
  }
  
  @scala.inline
  implicit class StoreOptionsMutableBuilder[Self <: StoreOptions[?], S] (val x: Self & StoreOptions[S]) extends AnyVal {
    
    @scala.inline
    def setActions(value: ActionTree[S, S]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    @scala.inline
    def setDevtools(value: Boolean): Self = StObject.set(x, "devtools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevtoolsUndefined: Self = StObject.set(x, "devtools", js.undefined)
    
    @scala.inline
    def setGetters(value: GetterTree[S, S]): Self = StObject.set(x, "getters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGettersUndefined: Self = StObject.set(x, "getters", js.undefined)
    
    @scala.inline
    def setModules(value: ModuleTree[S]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
    
    @scala.inline
    def setMutations(value: MutationTree[S]): Self = StObject.set(x, "mutations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMutationsUndefined: Self = StObject.set(x, "mutations", js.undefined)
    
    @scala.inline
    def setPlugins(value: js.Array[Plugin[S]]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    @scala.inline
    def setPluginsVarargs(value: Plugin[S]*): Self = StObject.set(x, "plugins", js.Array(value :_*))
    
    @scala.inline
    def setState(value: S | js.Function0[S]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateFunction0(value: () => S): Self = StObject.set(x, "state", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
  }
}

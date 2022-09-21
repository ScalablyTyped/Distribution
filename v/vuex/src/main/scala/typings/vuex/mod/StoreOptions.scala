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
  
  inline def apply[S](): StoreOptions[S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StoreOptions[S]]
  }
  
  extension [Self <: StoreOptions[?], S](x: Self & StoreOptions[S]) {
    
    inline def setActions(value: ActionTree[S, S]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setDevtools(value: Boolean): Self = StObject.set(x, "devtools", value.asInstanceOf[js.Any])
    
    inline def setDevtoolsUndefined: Self = StObject.set(x, "devtools", js.undefined)
    
    inline def setGetters(value: GetterTree[S, S]): Self = StObject.set(x, "getters", value.asInstanceOf[js.Any])
    
    inline def setGettersUndefined: Self = StObject.set(x, "getters", js.undefined)
    
    inline def setModules(value: ModuleTree[S]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
    
    inline def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
    
    inline def setMutations(value: MutationTree[S]): Self = StObject.set(x, "mutations", value.asInstanceOf[js.Any])
    
    inline def setMutationsUndefined: Self = StObject.set(x, "mutations", js.undefined)
    
    inline def setPlugins(value: js.Array[Plugin[S]]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    inline def setPluginsVarargs(value: Plugin[S]*): Self = StObject.set(x, "plugins", js.Array(value*))
    
    inline def setState(value: S | js.Function0[S]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateFunction0(value: () => S): Self = StObject.set(x, "state", js.Any.fromFunction0(value))
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
  }
}

package typings.vuex

import typings.vuex.loggerMod.LoggerOption
import typings.vuex.mod.ActionTree
import typings.vuex.mod.GetterTree
import typings.vuex.mod.ModuleTree
import typings.vuex.mod.MutationTree
import typings.vuex.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Actions[S] extends StObject {
    
    var actions: js.UndefOr[ActionTree[S, S]] = js.undefined
    
    var getters: js.UndefOr[GetterTree[S, S]] = js.undefined
    
    var modules: js.UndefOr[ModuleTree[S]] = js.undefined
    
    var mutations: js.UndefOr[MutationTree[S]] = js.undefined
  }
  object Actions {
    
    inline def apply[S](): Actions[S] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Actions[S]]
    }
    
    extension [Self <: Actions[?], S](x: Self & Actions[S]) {
      
      inline def setActions(value: ActionTree[S, S]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setGetters(value: GetterTree[S, S]): Self = StObject.set(x, "getters", value.asInstanceOf[js.Any])
      
      inline def setGettersUndefined: Self = StObject.set(x, "getters", js.undefined)
      
      inline def setModules(value: ModuleTree[S]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      inline def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
      
      inline def setMutations(value: MutationTree[S]): Self = StObject.set(x, "mutations", value.asInstanceOf[js.Any])
      
      inline def setMutationsUndefined: Self = StObject.set(x, "mutations", js.undefined)
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply[S](): Plugin[S] = js.native
    def apply[S](option: LoggerOption[S]): Plugin[S] = js.native
  }
}

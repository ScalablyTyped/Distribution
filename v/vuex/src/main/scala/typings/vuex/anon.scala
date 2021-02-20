package typings.vuex

import typings.vuex.loggerMod.LoggerOption
import typings.vuex.mod.ActionTree
import typings.vuex.mod.GetterTree
import typings.vuex.mod.ModuleTree
import typings.vuex.mod.MutationTree
import typings.vuex.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Actions[S] extends StObject {
    
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
    implicit class ActionsMutableBuilder[Self <: Actions[_], S] (val x: Self with Actions[S]) extends AnyVal {
      
      @scala.inline
      def setActions(value: ActionTree[S, S]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
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
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply[S](): Plugin[S] = js.native
    def apply[S](option: LoggerOption[S]): Plugin[S] = js.native
  }
}

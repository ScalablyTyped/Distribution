package typings.wordpressHooks

import typings.wordpressHooks.mod.ActionCallback
import typings.wordpressHooks.mod.CurrentHook
import typings.wordpressHooks.mod.DidHook
import typings.wordpressHooks.mod.DoingHook
import typings.wordpressHooks.mod.FilterCallback
import typings.wordpressHooks.mod.HasHook
import typings.wordpressHooks.mod.HookMap
import typings.wordpressHooks.mod.RemoveHook
import typings.wordpressHooks.mod.RunHook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Actions extends StObject {
    
    var actions: HookMap[ActionCallback]
    
    def addAction(hookName: String, namespace: String, callback: js.Function1[/* repeated */ js.Any, Unit]): Unit
    def addAction(
      hookName: String,
      namespace: String,
      callback: js.Function1[/* repeated */ js.Any, Unit],
      priority: Double
    ): Unit
    @JSName("addAction")
    var addAction_Original: js.Function4[
        /* hookName */ String, 
        /* namespace */ String, 
        /* callback */ js.Function1[/* repeated */ js.Any, Unit], 
        /* priority */ js.UndefOr[Double], 
        Unit
      ]
    
    def addFilter[T](
      hookName: String,
      namespace: String,
      callback: js.Function2[/* firstArg */ T, /* repeated */ js.Any, T]
    ): Unit
    def addFilter[T](
      hookName: String,
      namespace: String,
      callback: js.Function2[/* firstArg */ T, /* repeated */ js.Any, T],
      priority: Double
    ): Unit
    @JSName("addFilter")
    var addFilter_Original: FnCall
    
    def applyFilters[T](hookName: String, firstArg: T, rest: js.Any*): T | Double | String
    def applyFilters[T](hookName: String, firstArg: Unit, rest: js.Any*): T | Double | String
    @JSName("applyFilters")
    var applyFilters_Original: RunHook
    
    def currentAction(): String | Null
    @JSName("currentAction")
    var currentAction_Original: CurrentHook
    
    def currentFilter(): String | Null
    @JSName("currentFilter")
    var currentFilter_Original: CurrentHook
    
    def didAction(hookName: String): Double
    @JSName("didAction")
    var didAction_Original: DidHook
    
    def didFilter(hookName: String): Double
    @JSName("didFilter")
    var didFilter_Original: DidHook
    
    def doAction[T](hookName: String, firstArg: T, rest: js.Any*): T | Double | String
    def doAction[T](hookName: String, firstArg: Unit, rest: js.Any*): T | Double | String
    @JSName("doAction")
    var doAction_Original: RunHook
    
    def doingAction(): Boolean
    def doingAction(hookName: String): Boolean
    @JSName("doingAction")
    var doingAction_Original: DoingHook
    
    def doingFilter(): Boolean
    def doingFilter(hookName: String): Boolean
    @JSName("doingFilter")
    var doingFilter_Original: DoingHook
    
    var filters: HookMap[FilterCallback]
    
    def hasAction(hookName: String): Boolean
    @JSName("hasAction")
    var hasAction_Original: HasHook
    
    def hasFilter(hookName: String): Boolean
    @JSName("hasFilter")
    var hasFilter_Original: HasHook
    
    def removeAction(hookName: String, namespace: String): Double
    @JSName("removeAction")
    var removeAction_Original: RemoveHook
    
    def removeAllActions(hookName: String, namespace: String): Double
    @JSName("removeAllActions")
    var removeAllActions_Original: RemoveHook
    
    def removeAllFilters(hookName: String, namespace: String): Double
    @JSName("removeAllFilters")
    var removeAllFilters_Original: RemoveHook
    
    def removeFilter(hookName: String, namespace: String): Double
    @JSName("removeFilter")
    var removeFilter_Original: RemoveHook
  }
  object Actions {
    
    inline def apply(
      actions: HookMap[ActionCallback],
      addAction: (/* hookName */ String, /* namespace */ String, /* callback */ js.Function1[/* repeated */ js.Any, Unit], /* priority */ js.UndefOr[Double]) => Unit,
      addFilter: FnCall,
      applyFilters: RunHook,
      currentAction: () => String | Null,
      currentFilter: () => String | Null,
      didAction: /* hookName */ String => Double,
      didFilter: /* hookName */ String => Double,
      doAction: RunHook,
      doingAction: /* hookName */ js.UndefOr[String] => Boolean,
      doingFilter: /* hookName */ js.UndefOr[String] => Boolean,
      filters: HookMap[FilterCallback],
      hasAction: /* hookName */ String => Boolean,
      hasFilter: /* hookName */ String => Boolean,
      removeAction: (/* hookName */ String, /* namespace */ String) => Double,
      removeAllActions: (/* hookName */ String, /* namespace */ String) => Double,
      removeAllFilters: (/* hookName */ String, /* namespace */ String) => Double,
      removeFilter: (/* hookName */ String, /* namespace */ String) => Double
    ): Actions = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], addAction = js.Any.fromFunction4(addAction), addFilter = addFilter.asInstanceOf[js.Any], applyFilters = applyFilters.asInstanceOf[js.Any], currentAction = js.Any.fromFunction0(currentAction), currentFilter = js.Any.fromFunction0(currentFilter), didAction = js.Any.fromFunction1(didAction), didFilter = js.Any.fromFunction1(didFilter), doAction = doAction.asInstanceOf[js.Any], doingAction = js.Any.fromFunction1(doingAction), doingFilter = js.Any.fromFunction1(doingFilter), filters = filters.asInstanceOf[js.Any], hasAction = js.Any.fromFunction1(hasAction), hasFilter = js.Any.fromFunction1(hasFilter), removeAction = js.Any.fromFunction2(removeAction), removeAllActions = js.Any.fromFunction2(removeAllActions), removeAllFilters = js.Any.fromFunction2(removeAllFilters), removeFilter = js.Any.fromFunction2(removeFilter))
      __obj.asInstanceOf[Actions]
    }
    
    extension [Self <: Actions](x: Self) {
      
      inline def setActions(value: HookMap[ActionCallback]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setAddAction(
        value: (/* hookName */ String, /* namespace */ String, /* callback */ js.Function1[/* repeated */ js.Any, Unit], /* priority */ js.UndefOr[Double]) => Unit
      ): Self = StObject.set(x, "addAction", js.Any.fromFunction4(value))
      
      inline def setAddFilter(value: FnCall): Self = StObject.set(x, "addFilter", value.asInstanceOf[js.Any])
      
      inline def setApplyFilters(value: RunHook): Self = StObject.set(x, "applyFilters", value.asInstanceOf[js.Any])
      
      inline def setCurrentAction(value: () => String | Null): Self = StObject.set(x, "currentAction", js.Any.fromFunction0(value))
      
      inline def setCurrentFilter(value: () => String | Null): Self = StObject.set(x, "currentFilter", js.Any.fromFunction0(value))
      
      inline def setDidAction(value: /* hookName */ String => Double): Self = StObject.set(x, "didAction", js.Any.fromFunction1(value))
      
      inline def setDidFilter(value: /* hookName */ String => Double): Self = StObject.set(x, "didFilter", js.Any.fromFunction1(value))
      
      inline def setDoAction(value: RunHook): Self = StObject.set(x, "doAction", value.asInstanceOf[js.Any])
      
      inline def setDoingAction(value: /* hookName */ js.UndefOr[String] => Boolean): Self = StObject.set(x, "doingAction", js.Any.fromFunction1(value))
      
      inline def setDoingFilter(value: /* hookName */ js.UndefOr[String] => Boolean): Self = StObject.set(x, "doingFilter", js.Any.fromFunction1(value))
      
      inline def setFilters(value: HookMap[FilterCallback]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setHasAction(value: /* hookName */ String => Boolean): Self = StObject.set(x, "hasAction", js.Any.fromFunction1(value))
      
      inline def setHasFilter(value: /* hookName */ String => Boolean): Self = StObject.set(x, "hasFilter", js.Any.fromFunction1(value))
      
      inline def setRemoveAction(value: (/* hookName */ String, /* namespace */ String) => Double): Self = StObject.set(x, "removeAction", js.Any.fromFunction2(value))
      
      inline def setRemoveAllActions(value: (/* hookName */ String, /* namespace */ String) => Double): Self = StObject.set(x, "removeAllActions", js.Any.fromFunction2(value))
      
      inline def setRemoveAllFilters(value: (/* hookName */ String, /* namespace */ String) => Double): Self = StObject.set(x, "removeAllFilters", js.Any.fromFunction2(value))
      
      inline def setRemoveFilter(value: (/* hookName */ String, /* namespace */ String) => Double): Self = StObject.set(x, "removeFilter", js.Any.fromFunction2(value))
    }
  }
  
  trait Current[T /* <: js.Function1[/* repeated */ js.Any, js.Any] */] extends StObject {
    
    var __current: js.Array[T]
  }
  object Current {
    
    inline def apply[T /* <: js.Function1[/* repeated */ js.Any, js.Any] */](__current: js.Array[T]): Current[T] = {
      val __obj = js.Dynamic.literal(__current = __current.asInstanceOf[js.Any])
      __obj.asInstanceOf[Current[T]]
    }
    
    extension [Self <: Current[?], T /* <: js.Function1[/* repeated */ js.Any, js.Any] */](x: Self & Current[T]) {
      
      inline def set__current(value: js.Array[T]): Self = StObject.set(x, "__current", value.asInstanceOf[js.Any])
      
      inline def set__currentVarargs(value: T*): Self = StObject.set(x, "__current", js.Array(value :_*))
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply[T](
      hookName: String,
      namespace: String,
      callback: js.Function2[/* firstArg */ T, /* repeated */ js.Any, T]
    ): Unit = js.native
    def apply[T](
      hookName: String,
      namespace: String,
      callback: js.Function2[/* firstArg */ T, /* repeated */ js.Any, T],
      priority: Double
    ): Unit = js.native
  }
}

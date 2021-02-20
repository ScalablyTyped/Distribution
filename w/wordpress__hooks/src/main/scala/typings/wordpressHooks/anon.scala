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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Actions extends StObject {
    
    var actions: HookMap[ActionCallback] = js.native
    
    def addAction(hookName: String, namespace: String, callback: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
    def addAction(
      hookName: String,
      namespace: String,
      callback: js.Function1[/* repeated */ js.Any, Unit],
      priority: Double
    ): Unit = js.native
    @JSName("addAction")
    var addAction_Original: js.Function4[
        /* hookName */ String, 
        /* namespace */ String, 
        /* callback */ js.Function1[/* repeated */ js.Any, Unit], 
        /* priority */ js.UndefOr[Double], 
        Unit
      ] = js.native
    
    def addFilter[T](
      hookName: String,
      namespace: String,
      callback: js.Function2[/* firstArg */ T, /* repeated */ js.Any, T]
    ): Unit = js.native
    def addFilter[T](
      hookName: String,
      namespace: String,
      callback: js.Function2[/* firstArg */ T, /* repeated */ js.Any, T],
      priority: Double
    ): Unit = js.native
    @JSName("addFilter")
    var addFilter_Original: FnCall = js.native
    
    def applyFilters[T](hookName: String, firstArg: T, rest: js.Any*): T | Double | String = js.native
    def applyFilters[T](hookName: String, firstArg: js.UndefOr[scala.Nothing], rest: js.Any*): T | Double | String = js.native
    @JSName("applyFilters")
    var applyFilters_Original: RunHook = js.native
    
    def currentAction(): String | Null = js.native
    @JSName("currentAction")
    var currentAction_Original: CurrentHook = js.native
    
    def currentFilter(): String | Null = js.native
    @JSName("currentFilter")
    var currentFilter_Original: CurrentHook = js.native
    
    def didAction(hookName: String): Double = js.native
    @JSName("didAction")
    var didAction_Original: DidHook = js.native
    
    def didFilter(hookName: String): Double = js.native
    @JSName("didFilter")
    var didFilter_Original: DidHook = js.native
    
    def doAction[T](hookName: String, firstArg: T, rest: js.Any*): T | Double | String = js.native
    def doAction[T](hookName: String, firstArg: js.UndefOr[scala.Nothing], rest: js.Any*): T | Double | String = js.native
    @JSName("doAction")
    var doAction_Original: RunHook = js.native
    
    def doingAction(): Boolean = js.native
    def doingAction(hookName: String): Boolean = js.native
    @JSName("doingAction")
    var doingAction_Original: DoingHook = js.native
    
    def doingFilter(): Boolean = js.native
    def doingFilter(hookName: String): Boolean = js.native
    @JSName("doingFilter")
    var doingFilter_Original: DoingHook = js.native
    
    var filters: HookMap[FilterCallback] = js.native
    
    def hasAction(hookName: String): Boolean = js.native
    @JSName("hasAction")
    var hasAction_Original: HasHook = js.native
    
    def hasFilter(hookName: String): Boolean = js.native
    @JSName("hasFilter")
    var hasFilter_Original: HasHook = js.native
    
    def removeAction(hookName: String, namespace: String): Double = js.native
    @JSName("removeAction")
    var removeAction_Original: RemoveHook = js.native
    
    def removeAllActions(hookName: String, namespace: String): Double = js.native
    @JSName("removeAllActions")
    var removeAllActions_Original: RemoveHook = js.native
    
    def removeAllFilters(hookName: String, namespace: String): Double = js.native
    @JSName("removeAllFilters")
    var removeAllFilters_Original: RemoveHook = js.native
    
    def removeFilter(hookName: String, namespace: String): Double = js.native
    @JSName("removeFilter")
    var removeFilter_Original: RemoveHook = js.native
  }
  
  @js.native
  trait Current[T /* <: js.Function1[/* repeated */ js.Any, _] */] extends StObject {
    
    var __current: js.Array[T] = js.native
  }
  object Current {
    
    @scala.inline
    def apply[T /* <: js.Function1[/* repeated */ js.Any, _] */](__current: js.Array[T]): Current[T] = {
      val __obj = js.Dynamic.literal(__current = __current.asInstanceOf[js.Any])
      __obj.asInstanceOf[Current[T]]
    }
    
    @scala.inline
    implicit class CurrentMutableBuilder[Self <: Current[_], T /* <: js.Function1[/* repeated */ js.Any, _] */] (val x: Self with Current[T]) extends AnyVal {
      
      @scala.inline
      def set__current(value: js.Array[T]): Self = StObject.set(x, "__current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set__currentVarargs(value: T*): Self = StObject.set(x, "__current", js.Array(value :_*))
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

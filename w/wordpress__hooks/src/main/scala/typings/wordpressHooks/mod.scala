package typings.wordpressHooks

import typings.std.Record
import typings.wordpressHooks.anon.Actions
import typings.wordpressHooks.anon.Current
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wordpress/hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@wordpress/hooks", "actions")
  @js.native
  val actions: HookMap[ActionCallback] = js.native
  
  inline def addAction(hookName: String, namespace: String, callback: js.Function1[/* repeated */ js.Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAction")(hookName.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addAction(
    hookName: String,
    namespace: String,
    callback: js.Function1[/* repeated */ js.Any, Unit],
    priority: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAction")(hookName.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addFilter[T](
    hookName: String,
    namespace: String,
    callback: js.Function2[/* firstArg */ T, /* repeated */ js.Any, T]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addFilter")(hookName.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addFilter[T](
    hookName: String,
    namespace: String,
    callback: js.Function2[/* firstArg */ T, /* repeated */ js.Any, T],
    priority: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addFilter")(hookName.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@wordpress/hooks", "applyFilters")
  @js.native
  val applyFilters: RunHook = js.native
  
  inline def createHooks(): Actions = ^.asInstanceOf[js.Dynamic].applyDynamic("createHooks")().asInstanceOf[Actions]
  
  @JSImport("@wordpress/hooks", "currentAction")
  @js.native
  val currentAction: CurrentHook = js.native
  
  @JSImport("@wordpress/hooks", "currentFilter")
  @js.native
  val currentFilter: CurrentHook = js.native
  
  @JSImport("@wordpress/hooks", "didAction")
  @js.native
  val didAction: DidHook = js.native
  
  @JSImport("@wordpress/hooks", "didFilter")
  @js.native
  val didFilter: DidHook = js.native
  
  @JSImport("@wordpress/hooks", "doAction")
  @js.native
  val doAction: RunHook = js.native
  
  @JSImport("@wordpress/hooks", "doingAction")
  @js.native
  val doingAction: DoingHook = js.native
  
  @JSImport("@wordpress/hooks", "doingFilter")
  @js.native
  val doingFilter: DoingHook = js.native
  
  @JSImport("@wordpress/hooks", "filters")
  @js.native
  val filters: HookMap[FilterCallback] = js.native
  
  @JSImport("@wordpress/hooks", "hasAction")
  @js.native
  val hasAction: HasHook = js.native
  
  @JSImport("@wordpress/hooks", "hasFilter")
  @js.native
  val hasFilter: HasHook = js.native
  
  @JSImport("@wordpress/hooks", "removeAction")
  @js.native
  val removeAction: RemoveHook = js.native
  
  @JSImport("@wordpress/hooks", "removeAllActions")
  @js.native
  val removeAllActions: RemoveHook = js.native
  
  @JSImport("@wordpress/hooks", "removeAllFilters")
  @js.native
  val removeAllFilters: RemoveHook = js.native
  
  @JSImport("@wordpress/hooks", "removeFilter")
  @js.native
  val removeFilter: RemoveHook = js.native
  
  @js.native
  trait ActionCallback extends StObject {
    
    def apply(args: js.Any*): Unit = js.native
  }
  
  type CurrentHook = js.Function0[String | Null]
  
  type DidHook = js.Function1[/* hookName */ String, Double]
  
  type DoingHook = js.Function1[/* hookName */ js.UndefOr[String], Boolean]
  
  @js.native
  trait FilterCallback extends StObject {
    
    def apply[T](firstArg: T, rest: js.Any*): T | Double | String = js.native
  }
  
  type HasHook = js.Function1[/* hookName */ String, Boolean]
  
  trait Hook[T /* <: js.Function1[/* repeated */ js.Any, js.Any] */] extends StObject {
    
    var handlers: js.Array[T]
    
    var runs: Double
  }
  object Hook {
    
    inline def apply[T /* <: js.Function1[/* repeated */ js.Any, js.Any] */](handlers: js.Array[T], runs: Double): Hook[T] = {
      val __obj = js.Dynamic.literal(handlers = handlers.asInstanceOf[js.Any], runs = runs.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hook[T]]
    }
    
    extension [Self <: Hook[?], T /* <: js.Function1[/* repeated */ js.Any, js.Any] */](x: Self & Hook[T]) {
      
      inline def setHandlers(value: js.Array[T]): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      inline def setHandlersVarargs(value: T*): Self = StObject.set(x, "handlers", js.Array(value :_*))
      
      inline def setRuns(value: Double): Self = StObject.set(x, "runs", value.asInstanceOf[js.Any])
    }
  }
  
  type HookMap[T /* <: js.Function1[/* repeated */ js.Any, js.Any] */] = Current[T] & (Record[String, js.UndefOr[js.Array[Hook[T]]]])
  
  type RemoveHook = js.Function2[/* hookName */ String, /* namespace */ String, Double]
  
  @js.native
  trait RunHook extends StObject {
    
    def apply[T](hookName: String, firstArg: T, rest: js.Any*): T | Double | String = js.native
    def apply[T](hookName: String, firstArg: Unit, rest: js.Any*): T | Double | String = js.native
  }
}

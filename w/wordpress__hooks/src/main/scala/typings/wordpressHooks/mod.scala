package typings.wordpressHooks

import typings.std.Record
import typings.wordpressHooks.anon.Actions
import typings.wordpressHooks.anon.Current
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wordpress/hooks", "actions")
  @js.native
  val actions: HookMap[ActionCallback] = js.native
  
  @JSImport("@wordpress/hooks", "addAction")
  @js.native
  def addAction(hookName: String, namespace: String, callback: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  @JSImport("@wordpress/hooks", "addAction")
  @js.native
  def addAction(
    hookName: String,
    namespace: String,
    callback: js.Function1[/* repeated */ js.Any, Unit],
    priority: Double
  ): Unit = js.native
  
  @JSImport("@wordpress/hooks", "addFilter")
  @js.native
  def addFilter[T](
    hookName: String,
    namespace: String,
    callback: js.Function2[/* firstArg */ T, /* repeated */ js.Any, T]
  ): Unit = js.native
  @JSImport("@wordpress/hooks", "addFilter")
  @js.native
  def addFilter[T](
    hookName: String,
    namespace: String,
    callback: js.Function2[/* firstArg */ T, /* repeated */ js.Any, T],
    priority: Double
  ): Unit = js.native
  
  @JSImport("@wordpress/hooks", "applyFilters")
  @js.native
  val applyFilters: RunHook = js.native
  
  @JSImport("@wordpress/hooks", "createHooks")
  @js.native
  def createHooks(): Actions = js.native
  
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
  
  type ActionCallback = js.Function1[/* repeated */ js.Any, Unit]
  
  type CurrentHook = js.Function0[String | Null]
  
  type DidHook = js.Function1[/* hookName */ String, Double]
  
  type DoingHook = js.Function1[/* hookName */ js.UndefOr[String], Boolean]
  
  type FilterCallback = js.Function2[/* firstArg */ js.Any, /* repeated */ js.Any, Double | String]
  
  type HasHook = js.Function1[/* hookName */ String, Boolean]
  
  @js.native
  trait Hook[T /* <: js.Function1[/* repeated */ js.Any, _] */] extends StObject {
    
    var handlers: js.Array[T] = js.native
    
    var runs: Double = js.native
  }
  object Hook {
    
    @scala.inline
    def apply[T /* <: js.Function1[/* repeated */ js.Any, _] */](handlers: js.Array[T], runs: Double): Hook[T] = {
      val __obj = js.Dynamic.literal(handlers = handlers.asInstanceOf[js.Any], runs = runs.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hook[T]]
    }
    
    @scala.inline
    implicit class HookMutableBuilder[Self <: Hook[_], T /* <: js.Function1[/* repeated */ js.Any, _] */] (val x: Self with Hook[T]) extends AnyVal {
      
      @scala.inline
      def setHandlers(value: js.Array[T]): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandlersVarargs(value: T*): Self = StObject.set(x, "handlers", js.Array(value :_*))
      
      @scala.inline
      def setRuns(value: Double): Self = StObject.set(x, "runs", value.asInstanceOf[js.Any])
    }
  }
  
  type HookMap[T /* <: js.Function1[/* repeated */ js.Any, _] */] = Current[T] with (Record[String, js.UndefOr[js.Array[Hook[T]]]])
  
  type RemoveHook = js.Function2[/* hookName */ String, /* namespace */ String, Double]
  
  type RunHook = js.Function3[
    /* hookName */ String, 
    /* firstArg */ js.UndefOr[js.Any], 
    /* repeated */ js.Any, 
    Double | String
  ]
}

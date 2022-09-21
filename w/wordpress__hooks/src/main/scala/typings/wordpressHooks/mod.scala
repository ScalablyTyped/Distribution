package typings.wordpressHooks

import typings.std.Record
import typings.wordpressHooks.createAddHookMod.AddHook
import typings.wordpressHooks.createDidHookMod.DidHook
import typings.wordpressHooks.createDoingHookMod.DoingHook
import typings.wordpressHooks.createHasHookMod.HasHook
import typings.wordpressHooks.createHooksMod._Hooks
import typings.wordpressHooks.createRemoveHookMod.RemoveHook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wordpress/hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@wordpress/hooks", "actions")
  @js.native
  val actions: Store = js.native
  
  @JSImport("@wordpress/hooks", "addAction")
  @js.native
  val addAction: AddHook = js.native
  
  @JSImport("@wordpress/hooks", "addFilter")
  @js.native
  val addFilter: AddHook = js.native
  
  inline def applyFilters(hookName: String, args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("applyFilters")(List(hookName.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
  
  /** @typedef {_Hooks} Hooks */
  /**
    * Returns an instance of the hooks object.
    *
    * @return {Hooks} A Hooks instance.
    */
  inline def createHooks(): typings.wordpressHooks.createHooksMod.Hooks = ^.asInstanceOf[js.Dynamic].applyDynamic("createHooks")().asInstanceOf[typings.wordpressHooks.createHooksMod.Hooks]
  
  inline def currentAction(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("currentAction")().asInstanceOf[String | Null]
  
  inline def currentFilter(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("currentFilter")().asInstanceOf[String | Null]
  
  @JSImport("@wordpress/hooks", "defaultHooks")
  @js.native
  val defaultHooks: _Hooks = js.native
  
  @JSImport("@wordpress/hooks", "didAction")
  @js.native
  val didAction: DidHook = js.native
  
  @JSImport("@wordpress/hooks", "didFilter")
  @js.native
  val didFilter: DidHook = js.native
  
  inline def doAction(hookName: String, args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("doAction")(List(hookName.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
  
  @JSImport("@wordpress/hooks", "doingAction")
  @js.native
  val doingAction: DoingHook = js.native
  
  @JSImport("@wordpress/hooks", "doingFilter")
  @js.native
  val doingFilter: DoingHook = js.native
  
  @JSImport("@wordpress/hooks", "filters")
  @js.native
  val filters: Store = js.native
  
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
  trait Callback extends StObject {
    
    def apply(args: Any*): Any = js.native
  }
  
  trait Current extends StObject {
    
    /**
      * The index
      */
    var currentIndex: Double
    
    /**
      * Hook name
      */
    var name: String
  }
  object Current {
    
    inline def apply(currentIndex: Double, name: String): Current = {
      val __obj = js.Dynamic.literal(currentIndex = currentIndex.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Current]
    }
    
    extension [Self <: Current](x: Self) {
      
      inline def setCurrentIndex(value: Double): Self = StObject.set(x, "currentIndex", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Handler extends StObject {
    
    /**
      * The callback
      */
    def callback(args: Any*): Any
    /**
      * The callback
      */
    @JSName("callback")
    var callback_Original: Callback
    
    /**
      * The namespace
      */
    var namespace: String
    
    /**
      * The namespace
      */
    var priority: Double
  }
  object Handler {
    
    inline def apply(callback: Callback, namespace: String, priority: Double): Handler = {
      val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
      __obj.asInstanceOf[Handler]
    }
    
    extension [Self <: Handler](x: Self) {
      
      inline def setCallback(value: Callback): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    }
  }
  
  trait Hook extends StObject {
    
    /**
      * Array of handlers
      */
    var handlers: js.Array[Handler]
    
    /**
      * Run counter
      */
    var runs: Double
  }
  object Hook {
    
    inline def apply(handlers: js.Array[Handler], runs: Double): Hook = {
      val __obj = js.Dynamic.literal(handlers = handlers.asInstanceOf[js.Any], runs = runs.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hook]
    }
    
    extension [Self <: Hook](x: Self) {
      
      inline def setHandlers(value: js.Array[Handler]): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      inline def setHandlersVarargs(value: Handler*): Self = StObject.set(x, "handlers", js.Array(value*))
      
      inline def setRuns(value: Double): Self = StObject.set(x, "runs", value.asInstanceOf[js.Any])
    }
  }
  
  type Hooks = typings.wordpressHooks.createHooksMod.Hooks
  
  type Store = (Record[String, Hook]) & typings.wordpressHooks.anon.Current
  
  /* Rewritten from type alias, can be one of: 
    - typings.wordpressHooks.wordpressHooksStrings.actions
    - typings.wordpressHooks.wordpressHooksStrings.filters
  */
  trait StoreKey extends StObject
  object StoreKey {
    
    inline def actions: typings.wordpressHooks.wordpressHooksStrings.actions = "actions".asInstanceOf[typings.wordpressHooks.wordpressHooksStrings.actions]
    
    inline def filters: typings.wordpressHooks.wordpressHooksStrings.filters = "filters".asInstanceOf[typings.wordpressHooks.wordpressHooksStrings.filters]
  }
}

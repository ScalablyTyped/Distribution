package typings.wordpressHooks

import typings.wordpressHooks.buildTypesCreateAddHookMod.AddHook
import typings.wordpressHooks.buildTypesCreateDidHookMod.DidHook
import typings.wordpressHooks.buildTypesCreateDoingHookMod.DoingHook
import typings.wordpressHooks.buildTypesCreateHasHookMod.HasHook
import typings.wordpressHooks.buildTypesCreateRemoveHookMod.RemoveHook
import typings.wordpressHooks.mod.Callback
import typings.wordpressHooks.mod.Store
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesCreateHooksMod {
  
  @JSImport("@wordpress/hooks/build-types/createHooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /** @typedef {_Hooks} Hooks */
  /**
    * Returns an instance of the hooks object.
    *
    * @return {Hooks} A Hooks instance.
    */
  inline def default(): Hooks = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Hooks]
  
  @JSImport("@wordpress/hooks/build-types/createHooks", "_Hooks")
  @js.native
  open class _Hooks () extends StObject {
    
    /** @type {import('.').Store} actions */
    var actions: Store = js.native
    
    def addAction(hookName: String, namespace: String, callback: Callback): Any = js.native
    def addAction(hookName: String, namespace: String, callback: Callback, priority: Double): Any = js.native
    @JSName("addAction")
    var addAction_Original: AddHook = js.native
    
    def addFilter(hookName: String, namespace: String, callback: Callback): Any = js.native
    def addFilter(hookName: String, namespace: String, callback: Callback, priority: Double): Any = js.native
    @JSName("addFilter")
    var addFilter_Original: AddHook = js.native
    
    def applyFilters(hookName: String, args: Any*): Any = js.native
    
    def currentAction(): String | Null = js.native
    
    def currentFilter(): String | Null = js.native
    
    def didAction(hookName: String): js.UndefOr[Double] = js.native
    @JSName("didAction")
    var didAction_Original: DidHook = js.native
    
    def didFilter(hookName: String): js.UndefOr[Double] = js.native
    @JSName("didFilter")
    var didFilter_Original: DidHook = js.native
    
    def doAction(hookName: String, args: Any*): Any = js.native
    
    def doingAction(): Boolean = js.native
    def doingAction(hookName: String): Boolean = js.native
    @JSName("doingAction")
    var doingAction_Original: DoingHook = js.native
    
    def doingFilter(): Boolean = js.native
    def doingFilter(hookName: String): Boolean = js.native
    @JSName("doingFilter")
    var doingFilter_Original: DoingHook = js.native
    
    /** @type {import('.').Store} filters */
    var filters: Store = js.native
    
    def hasAction(hookName: String): Boolean = js.native
    def hasAction(hookName: String, namespace: String): Boolean = js.native
    @JSName("hasAction")
    var hasAction_Original: HasHook = js.native
    
    def hasFilter(hookName: String): Boolean = js.native
    def hasFilter(hookName: String, namespace: String): Boolean = js.native
    @JSName("hasFilter")
    var hasFilter_Original: HasHook = js.native
    
    def removeAction(hookName: String, namespace: String): js.UndefOr[Double] = js.native
    @JSName("removeAction")
    var removeAction_Original: RemoveHook = js.native
    
    def removeAllActions(hookName: String, namespace: String): js.UndefOr[Double] = js.native
    @JSName("removeAllActions")
    var removeAllActions_Original: RemoveHook = js.native
    
    def removeAllFilters(hookName: String, namespace: String): js.UndefOr[Double] = js.native
    @JSName("removeAllFilters")
    var removeAllFilters_Original: RemoveHook = js.native
    
    def removeFilter(hookName: String, namespace: String): js.UndefOr[Double] = js.native
    @JSName("removeFilter")
    var removeFilter_Original: RemoveHook = js.native
  }
  
  type Hooks = _Hooks
}

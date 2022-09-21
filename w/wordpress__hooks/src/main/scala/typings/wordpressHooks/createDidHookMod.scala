package typings.wordpressHooks

import typings.wordpressHooks.mod.Hooks
import typings.wordpressHooks.mod.StoreKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createDidHookMod {
  
  @JSImport("@wordpress/hooks/build-types/createDidHook", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @callback DidHook
    *
    * Returns the number of times an action has been fired.
    *
    * @param {string} hookName The hook name to check.
    *
    * @return {number | undefined} The number of times the hook has run.
    */
  /**
    * Returns a function which, when invoked, will return the number of times a
    * hook has been called.
    *
    * @param {import('.').Hooks}    hooks    Hooks instance.
    * @param {import('.').StoreKey} storeKey
    *
    * @return {DidHook} Function that returns a hook's call count.
    */
  inline def default(hooks: Hooks, storeKey: StoreKey): DidHook = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(hooks.asInstanceOf[js.Any], storeKey.asInstanceOf[js.Any])).asInstanceOf[DidHook]
  
  type DidHook = js.Function1[/* hookName */ String, js.UndefOr[Double]]
}

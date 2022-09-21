package typings.wordpressHooks

import typings.wordpressHooks.mod.Callback
import typings.wordpressHooks.mod.Hooks
import typings.wordpressHooks.mod.StoreKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createAddHookMod {
  
  @JSImport("@wordpress/hooks/build-types/createAddHook", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @callback AddHook
    *
    * Adds the hook to the appropriate hooks container.
    *
    * @param {string}               hookName      Name of hook to add
    * @param {string}               namespace     The unique namespace identifying the callback in the form `vendor/plugin/function`.
    * @param {import('.').Callback} callback      Function to call when the hook is run
    * @param {number}               [priority=10] Priority of this hook
    */
  /**
    * Returns a function which, when invoked, will add a hook.
    *
    * @param {import('.').Hooks}    hooks    Hooks instance.
    * @param {import('.').StoreKey} storeKey
    *
    * @return {AddHook} Function that adds a new hook.
    */
  inline def default(hooks: Hooks, storeKey: StoreKey): AddHook = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(hooks.asInstanceOf[js.Any], storeKey.asInstanceOf[js.Any])).asInstanceOf[AddHook]
  
  type AddHook = js.Function4[
    /* hookName */ String, 
    /* namespace */ String, 
    /* callback */ Callback, 
    /* priority */ js.UndefOr[Double], 
    Any
  ]
}

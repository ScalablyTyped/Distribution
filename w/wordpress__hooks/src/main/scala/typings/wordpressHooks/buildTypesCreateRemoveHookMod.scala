package typings.wordpressHooks

import typings.wordpressHooks.mod.Hooks
import typings.wordpressHooks.mod.StoreKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesCreateRemoveHookMod {
  
  @JSImport("@wordpress/hooks/build-types/createRemoveHook", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @callback RemoveHook
    * Removes the specified callback (or all callbacks) from the hook with a given hookName
    * and namespace.
    *
    * @param {string} hookName  The name of the hook to modify.
    * @param {string} namespace The unique namespace identifying the callback in the
    *                           form `vendor/plugin/function`.
    *
    * @return {number | undefined} The number of callbacks removed.
    */
  /**
    * Returns a function which, when invoked, will remove a specified hook or all
    * hooks by the given name.
    *
    * @param {import('.').Hooks}    hooks             Hooks instance.
    * @param {import('.').StoreKey} storeKey
    * @param {boolean}              [removeAll=false] Whether to remove all callbacks for a hookName,
    *                                                 without regard to namespace. Used to create
    *                                                 `removeAll*` functions.
    *
    * @return {RemoveHook} Function that removes hooks.
    */
  inline def default(hooks: Hooks, storeKey: StoreKey): RemoveHook = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(hooks.asInstanceOf[js.Any], storeKey.asInstanceOf[js.Any])).asInstanceOf[RemoveHook]
  inline def default(hooks: Hooks, storeKey: StoreKey, removeAll: Boolean): RemoveHook = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(hooks.asInstanceOf[js.Any], storeKey.asInstanceOf[js.Any], removeAll.asInstanceOf[js.Any])).asInstanceOf[RemoveHook]
  
  type RemoveHook = js.Function2[/* hookName */ String, /* namespace */ String, js.UndefOr[Double]]
}

package typings.wordpressHooks

import typings.wordpressHooks.mod.Hooks
import typings.wordpressHooks.mod.StoreKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createHasHookMod {
  
  @JSImport("@wordpress/hooks/build-types/createHasHook", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @callback HasHook
    *
    * Returns whether any handlers are attached for the given hookName and optional namespace.
    *
    * @param {string} hookName    The name of the hook to check for.
    * @param {string} [namespace] Optional. The unique namespace identifying the callback
    *                             in the form `vendor/plugin/function`.
    *
    * @return {boolean} Whether there are handlers that are attached to the given hook.
    */
  /**
    * Returns a function which, when invoked, will return whether any handlers are
    * attached to a particular hook.
    *
    * @param {import('.').Hooks}    hooks    Hooks instance.
    * @param {import('.').StoreKey} storeKey
    *
    * @return {HasHook} Function that returns whether any handlers are
    *                   attached to a particular hook and optional namespace.
    */
  inline def default(hooks: Hooks, storeKey: StoreKey): HasHook = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(hooks.asInstanceOf[js.Any], storeKey.asInstanceOf[js.Any])).asInstanceOf[HasHook]
  
  type HasHook = js.Function2[/* hookName */ String, /* namespace */ js.UndefOr[String], Boolean]
}

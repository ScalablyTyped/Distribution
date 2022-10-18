package typings.wordpressHooks

import typings.wordpressHooks.mod.Hooks
import typings.wordpressHooks.mod.StoreKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesCreateDoingHookMod {
  
  @JSImport("@wordpress/hooks/build-types/createDoingHook", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @callback DoingHook
    * Returns whether a hook is currently being executed.
    *
    * @param {string} [hookName] The name of the hook to check for.  If
    *                            omitted, will check for any hook being executed.
    *
    * @return {boolean} Whether the hook is being executed.
    */
  /**
    * Returns a function which, when invoked, will return whether a hook is
    * currently being executed.
    *
    * @param {import('.').Hooks}    hooks    Hooks instance.
    * @param {import('.').StoreKey} storeKey
    *
    * @return {DoingHook} Function that returns whether a hook is currently
    *                     being executed.
    */
  inline def default(hooks: Hooks, storeKey: StoreKey): DoingHook = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(hooks.asInstanceOf[js.Any], storeKey.asInstanceOf[js.Any])).asInstanceOf[DoingHook]
  
  type DoingHook = js.Function1[/* hookName */ js.UndefOr[String], Boolean]
}

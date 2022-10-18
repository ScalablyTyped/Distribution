package typings.wordpressHooks

import typings.wordpressHooks.mod.Hooks
import typings.wordpressHooks.mod.StoreKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesCreateRunHookMod {
  
  @JSImport("@wordpress/hooks/build-types/createRunHook", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns a function which, when invoked, will execute all callbacks
    * registered to a hook of the specified type, optionally returning the final
    * value of the call chain.
    *
    * @param {import('.').Hooks}    hooks                  Hooks instance.
    * @param {import('.').StoreKey} storeKey
    * @param {boolean}              [returnFirstArg=false] Whether each hook callback is expected to
    *                                                      return its first argument.
    *
    * @return {(hookName:string, ...args: unknown[]) => unknown} Function that runs hook callbacks.
    */
  inline def default(hooks: Hooks, storeKey: StoreKey): js.Function2[/* hookName */ String, /* repeated */ Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(hooks.asInstanceOf[js.Any], storeKey.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* hookName */ String, /* repeated */ Any, Any]]
  inline def default(hooks: Hooks, storeKey: StoreKey, returnFirstArg: Boolean): js.Function2[/* hookName */ String, /* repeated */ Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(hooks.asInstanceOf[js.Any], storeKey.asInstanceOf[js.Any], returnFirstArg.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* hookName */ String, /* repeated */ Any, Any]]
}

package typings.wordpressHooks

import typings.wordpressHooks.mod.Hooks
import typings.wordpressHooks.mod.StoreKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesCreateCurrentHookMod {
  
  @JSImport("@wordpress/hooks/build-types/createCurrentHook", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns a function which, when invoked, will return the name of the
    * currently running hook, or `null` if no hook of the given type is currently
    * running.
    *
    * @param {import('.').Hooks}    hooks    Hooks instance.
    * @param {import('.').StoreKey} storeKey
    *
    * @return {() => string | null} Function that returns the current hook name or null.
    */
  inline def default(hooks: Hooks, storeKey: StoreKey): js.Function0[String | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(hooks.asInstanceOf[js.Any], storeKey.asInstanceOf[js.Any])).asInstanceOf[js.Function0[String | Null]]
}

package typings.wordpressHooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesValidateHookNameMod {
  
  @JSImport("@wordpress/hooks/build-types/validateHookName", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Validate a hookName string.
    *
    * @param {string} hookName The hook name to validate. Should be a non empty string containing
    *                          only numbers, letters, dashes, periods and underscores. Also,
    *                          the hook name cannot begin with `__`.
    *
    * @return {boolean} Whether the hook name is valid.
    */
  inline def default(hookName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hookName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}

package typings.wordpressHooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validateNamespaceMod {
  
  @JSImport("@wordpress/hooks/build-types/validateNamespace", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Validate a namespace string.
    *
    * @param {string} namespace The namespace to validate - should take the form
    *                           `vendor/plugin/function`.
    *
    * @return {boolean} Whether the namespace is valid.
    */
  inline def default(namespace: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(namespace.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}

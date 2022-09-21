package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvideSharedPluginOptions extends StObject {
  
  /**
  	 * Modules that should be provided as shared modules to the share scope. When provided, property name is used to match modules, otherwise this is automatically inferred from share key.
  	 */
  var provides: Provides
  
  /**
  	 * Share scope name used for all provided modules (defaults to 'default').
  	 */
  var shareScope: js.UndefOr[String] = js.undefined
}
object ProvideSharedPluginOptions {
  
  inline def apply(provides: Provides): ProvideSharedPluginOptions = {
    val __obj = js.Dynamic.literal(provides = provides.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvideSharedPluginOptions]
  }
  
  extension [Self <: ProvideSharedPluginOptions](x: Self) {
    
    inline def setProvides(value: Provides): Self = StObject.set(x, "provides", value.asInstanceOf[js.Any])
    
    inline def setProvidesVarargs(value: (String | ProvidesObject)*): Self = StObject.set(x, "provides", js.Array(value*))
    
    inline def setShareScope(value: String): Self = StObject.set(x, "shareScope", value.asInstanceOf[js.Any])
    
    inline def setShareScopeUndefined: Self = StObject.set(x, "shareScope", js.undefined)
  }
}

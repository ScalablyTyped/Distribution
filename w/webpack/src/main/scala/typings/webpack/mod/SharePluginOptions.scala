package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for shared modules.
  */
trait SharePluginOptions extends StObject {
  
  /**
  	 * Share scope name used for all shared modules (defaults to 'default').
  	 */
  var shareScope: js.UndefOr[String] = js.undefined
  
  /**
  	 * Modules that should be shared in the share scope. When provided, property names are used to match requested modules in this compilation.
  	 */
  var shared: Shared
}
object SharePluginOptions {
  
  inline def apply(shared: Shared): SharePluginOptions = {
    val __obj = js.Dynamic.literal(shared = shared.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharePluginOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SharePluginOptions] (val x: Self) extends AnyVal {
    
    inline def setShareScope(value: String): Self = StObject.set(x, "shareScope", value.asInstanceOf[js.Any])
    
    inline def setShareScopeUndefined: Self = StObject.set(x, "shareScope", js.undefined)
    
    inline def setShared(value: Shared): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
    
    inline def setSharedVarargs(value: (String | SharedObject)*): Self = StObject.set(x, "shared", js.Array(value*))
  }
}

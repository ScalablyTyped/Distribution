package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LibIdentOptions extends StObject {
  
  /**
  	 * object for caching
  	 */
  var associatedObjectForCache: js.UndefOr[js.Object] = js.undefined
  
  /**
  	 * absolute context path to which lib ident is relative to
  	 */
  var context: String
}
object LibIdentOptions {
  
  inline def apply(context: String): LibIdentOptions = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
    __obj.asInstanceOf[LibIdentOptions]
  }
  
  extension [Self <: LibIdentOptions](x: Self) {
    
    inline def setAssociatedObjectForCache(value: js.Object): Self = StObject.set(x, "associatedObjectForCache", value.asInstanceOf[js.Any])
    
    inline def setAssociatedObjectForCacheUndefined: Self = StObject.set(x, "associatedObjectForCache", js.undefined)
    
    inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
  }
}

package typings.webpack.anon

import typings.webpack.mod.IgnorePluginOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextRegExp
  extends StObject
     with IgnorePluginOptions {
  
  /**
  			 * A RegExp to test the context (directory) against.
  			 */
  var contextRegExp: js.UndefOr[js.RegExp] = js.undefined
  
  /**
  			 * A RegExp to test the request against.
  			 */
  var resourceRegExp: js.RegExp
}
object ContextRegExp {
  
  inline def apply(resourceRegExp: js.RegExp): ContextRegExp = {
    val __obj = js.Dynamic.literal(resourceRegExp = resourceRegExp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextRegExp]
  }
  
  extension [Self <: ContextRegExp](x: Self) {
    
    inline def setContextRegExp(value: js.RegExp): Self = StObject.set(x, "contextRegExp", value.asInstanceOf[js.Any])
    
    inline def setContextRegExpUndefined: Self = StObject.set(x, "contextRegExp", js.undefined)
    
    inline def setResourceRegExp(value: js.RegExp): Self = StObject.set(x, "resourceRegExp", value.asInstanceOf[js.Any])
  }
}

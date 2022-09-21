package typings.webpack.anon

import typings.webpack.mod.IgnorePluginOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckResource
  extends StObject
     with IgnorePluginOptions {
  
  /**
  			 * A filter function for resource and context.
  			 */
  def checkResource(resource: String, context: String): Boolean
}
object CheckResource {
  
  inline def apply(checkResource: (String, String) => Boolean): CheckResource = {
    val __obj = js.Dynamic.literal(checkResource = js.Any.fromFunction2(checkResource))
    __obj.asInstanceOf[CheckResource]
  }
  
  extension [Self <: CheckResource](x: Self) {
    
    inline def setCheckResource(value: (String, String) => Boolean): Self = StObject.set(x, "checkResource", js.Any.fromFunction2(value))
  }
}

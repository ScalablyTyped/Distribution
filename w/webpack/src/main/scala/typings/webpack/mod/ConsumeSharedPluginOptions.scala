package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for consuming shared modules.
  */
trait ConsumeSharedPluginOptions extends StObject {
  
  /**
  	 * Modules that should be consumed from share scope. When provided, property names are used to match requested modules in this compilation.
  	 */
  var consumes: Consumes
  
  /**
  	 * Share scope name used for all consumed modules (defaults to 'default').
  	 */
  var shareScope: js.UndefOr[String] = js.undefined
}
object ConsumeSharedPluginOptions {
  
  inline def apply(consumes: Consumes): ConsumeSharedPluginOptions = {
    val __obj = js.Dynamic.literal(consumes = consumes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsumeSharedPluginOptions]
  }
  
  extension [Self <: ConsumeSharedPluginOptions](x: Self) {
    
    inline def setConsumes(value: Consumes): Self = StObject.set(x, "consumes", value.asInstanceOf[js.Any])
    
    inline def setConsumesVarargs(value: (String | ConsumesObject)*): Self = StObject.set(x, "consumes", js.Array(value*))
    
    inline def setShareScope(value: String): Self = StObject.set(x, "shareScope", value.asInstanceOf[js.Any])
    
    inline def setShareScopeUndefined: Self = StObject.set(x, "shareScope", js.undefined)
  }
}

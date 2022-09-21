package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Advanced configuration for container locations from which modules should be resolved and loaded at runtime.
  */
trait RemotesConfig extends StObject {
  
  /**
  	 * Container locations from which modules should be resolved and loaded at runtime.
  	 */
  var external: String | js.Array[String]
  
  /**
  	 * The name of the share scope shared with this remote.
  	 */
  var shareScope: js.UndefOr[String] = js.undefined
}
object RemotesConfig {
  
  inline def apply(external: String | js.Array[String]): RemotesConfig = {
    val __obj = js.Dynamic.literal(external = external.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemotesConfig]
  }
  
  extension [Self <: RemotesConfig](x: Self) {
    
    inline def setExternal(value: String | js.Array[String]): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
    
    inline def setExternalVarargs(value: String*): Self = StObject.set(x, "external", js.Array(value*))
    
    inline def setShareScope(value: String): Self = StObject.set(x, "shareScope", value.asInstanceOf[js.Any])
    
    inline def setShareScopeUndefined: Self = StObject.set(x, "shareScope", js.undefined)
  }
}

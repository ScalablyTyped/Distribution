package typings.tedious.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionAuthentication extends StObject {
  
  /**
    * Authentication Options
    */
  var options: ConnectionAuthenticationOptions
  
  /**
    * Authentication Type. Default value is 'default'.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object ConnectionAuthentication {
  
  inline def apply(options: ConnectionAuthenticationOptions): ConnectionAuthentication = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionAuthentication]
  }
  
  extension [Self <: ConnectionAuthentication](x: Self) {
    
    inline def setOptions(value: ConnectionAuthenticationOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

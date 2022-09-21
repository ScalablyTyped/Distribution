package typings.websocket.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICookie extends StObject {
  
  var domain: js.UndefOr[String] = js.undefined
  
  var expires: js.UndefOr[js.Date] = js.undefined
  
  var httponly: js.UndefOr[Boolean] = js.undefined
  
  var maxage: js.UndefOr[Double] = js.undefined
  
  var name: String
  
  var path: js.UndefOr[String] = js.undefined
  
  var secure: js.UndefOr[Boolean] = js.undefined
  
  var value: String
}
object ICookie {
  
  inline def apply(name: String, value: String): ICookie = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICookie]
  }
  
  extension [Self <: ICookie](x: Self) {
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setExpires(value: js.Date): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
    
    inline def setHttponly(value: Boolean): Self = StObject.set(x, "httponly", value.asInstanceOf[js.Any])
    
    inline def setHttponlyUndefined: Self = StObject.set(x, "httponly", js.undefined)
    
    inline def setMaxage(value: Double): Self = StObject.set(x, "maxage", value.asInstanceOf[js.Any])
    
    inline def setMaxageUndefined: Self = StObject.set(x, "maxage", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    
    inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

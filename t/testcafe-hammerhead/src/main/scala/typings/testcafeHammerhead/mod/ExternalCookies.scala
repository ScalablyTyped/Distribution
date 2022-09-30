package typings.testcafeHammerhead.mod

import typings.testcafeHammerhead.testcafeHammerheadStrings.Infinity
import typings.testcafeHammerhead.testcafeHammerheadStrings.`-Infinity`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExternalCookies extends StObject {
  
  var domain: String
  
  var expires: js.Date
  
  var httpOnly: Boolean
  
  var maxAge: Double | Infinity | `-Infinity`
  
  var name: String
  
  var path: String
  
  var sameSite: String
  
  var secure: Boolean
  
  var value: String
}
object ExternalCookies {
  
  inline def apply(
    domain: String,
    expires: js.Date,
    httpOnly: Boolean,
    maxAge: Double | Infinity | `-Infinity`,
    name: String,
    path: String,
    sameSite: String,
    secure: Boolean,
    value: String
  ): ExternalCookies = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], httpOnly = httpOnly.asInstanceOf[js.Any], maxAge = maxAge.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], sameSite = sameSite.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalCookies]
  }
  
  extension [Self <: ExternalCookies](x: Self) {
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setExpires(value: js.Date): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    inline def setHttpOnly(value: Boolean): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
    
    inline def setMaxAge(value: Double | Infinity | `-Infinity`): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setSameSite(value: String): Self = StObject.set(x, "sameSite", value.asInstanceOf[js.Any])
    
    inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

package typings.winrtUwp.Windows.Web.Http

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides a set of properties and methods to manage an HTTP cookie. */
trait HttpCookie extends StObject {
  
  /** Get the domain for which the HttpCookie is valid. */
  var domain: String
  
  /** Get or set the expiration date and time for the HttpCookie . */
  var expires: Date
  
  /** Get or set a value that controls whether a script or other active content can access this HttpCookie . */
  var httpOnly: Boolean
  
  /** Get the token that represents the HttpCookie name. */
  var name: String
  
  /** Get the URI path component to which the HttpCookie applies. */
  var path: String
  
  /** Get or set the security level for the HttpCookie . */
  var secure: Boolean
  
  /** Get or set the value for the HttpCookie . */
  var value: String
}
object HttpCookie {
  
  inline def apply(
    domain: String,
    expires: Date,
    httpOnly: Boolean,
    name: String,
    path: String,
    secure: Boolean,
    value: String
  ): HttpCookie = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], httpOnly = httpOnly.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpCookie]
  }
  
  extension [Self <: HttpCookie](x: Self) {
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setExpires(value: Date): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    inline def setHttpOnly(value: Boolean): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

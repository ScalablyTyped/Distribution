package typings.testcafe.mod.global

import typings.testcafe.testcafeStrings.Infinity
import typings.testcafe.testcafeStrings.`-Infinity`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CookieOptions extends StObject {
  
  /**
    * The domain attribute of the cookie.
    */
  var domain: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time at which the cookie expires. The browser does not serve the cookie if the client clock is set to a point beyond the cookie expiration time.
    */
  var expires: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Prohibits client-side scripts from accessing the cookie. Helps prevent XSS attacks.
    */
  var httpOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Cookie expiration time in seconds, relative to the time the cookie is served.
    */
  var maxAge: js.UndefOr[Double | Infinity | `-Infinity`] = js.undefined
  
  /**
    * The name of the cookie.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The path attribute of the cookie. The path must exist on the server to send the Cookie header.
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * Prohibits the browser from serving the cookie in response to cross-site requests. Helps prevent XSRF attacks.
    */
  var sameSite: js.UndefOr[String] = js.undefined
  
  /**
    * If the "secure" attribute is "true", the browser only serves the cookie over HTTPS.
    */
  var secure: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The value of the cookie.
    */
  var value: js.UndefOr[String] = js.undefined
}
object CookieOptions {
  
  inline def apply(): CookieOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CookieOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CookieOptions] (val x: Self) extends AnyVal {
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setExpires(value: js.Date): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
    
    inline def setHttpOnly(value: Boolean): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
    
    inline def setHttpOnlyUndefined: Self = StObject.set(x, "httpOnly", js.undefined)
    
    inline def setMaxAge(value: Double | Infinity | `-Infinity`): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
    
    inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setSameSite(value: String): Self = StObject.set(x, "sameSite", value.asInstanceOf[js.Any])
    
    inline def setSameSiteUndefined: Self = StObject.set(x, "sameSite", js.undefined)
    
    inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    
    inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}

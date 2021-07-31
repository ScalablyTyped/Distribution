package typings.webdriver.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cookie extends StObject {
  
  var domain: js.UndefOr[String] = js.undefined
  
  var expiry: js.UndefOr[Double] = js.undefined
  
  var httpOnly: js.UndefOr[Boolean] = js.undefined
  
  var name: String
  
  var path: js.UndefOr[String] = js.undefined
  
  var sameSite: js.UndefOr[SameSiteOptions] = js.undefined
  
  var secure: js.UndefOr[Boolean] = js.undefined
  
  var value: String
}
object Cookie {
  
  @scala.inline
  def apply(name: String, value: String): Cookie = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cookie]
  }
  
  @scala.inline
  implicit class CookieMutableBuilder[Self <: Cookie] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    @scala.inline
    def setExpiry(value: Double): Self = StObject.set(x, "expiry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiryUndefined: Self = StObject.set(x, "expiry", js.undefined)
    
    @scala.inline
    def setHttpOnly(value: Boolean): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpOnlyUndefined: Self = StObject.set(x, "httpOnly", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setSameSite(value: SameSiteOptions): Self = StObject.set(x, "sameSite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSameSiteUndefined: Self = StObject.set(x, "sameSite", js.undefined)
    
    @scala.inline
    def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

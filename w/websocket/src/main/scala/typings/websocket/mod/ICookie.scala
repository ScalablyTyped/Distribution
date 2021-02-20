package typings.websocket.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICookie extends StObject {
  
  var domain: js.UndefOr[String] = js.native
  
  var expires: js.UndefOr[Date] = js.native
  
  var httponly: js.UndefOr[Boolean] = js.native
  
  var maxage: js.UndefOr[Double] = js.native
  
  var name: String = js.native
  
  var path: js.UndefOr[String] = js.native
  
  var secure: js.UndefOr[Boolean] = js.native
  
  var value: String = js.native
}
object ICookie {
  
  @scala.inline
  def apply(name: String, value: String): ICookie = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICookie]
  }
  
  @scala.inline
  implicit class ICookieMutableBuilder[Self <: ICookie] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    @scala.inline
    def setExpires(value: Date): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
    
    @scala.inline
    def setHttponly(value: Boolean): Self = StObject.set(x, "httponly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttponlyUndefined: Self = StObject.set(x, "httponly", js.undefined)
    
    @scala.inline
    def setMaxage(value: Double): Self = StObject.set(x, "maxage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxageUndefined: Self = StObject.set(x, "maxage", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

package typings.swaggerExpressMiddleware.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CookieParserOptionItem extends StObject {
  
  /**
    *  an object that is passed to cookie.parse as the second option
    */
  var options: js.UndefOr[js.Any] = js.undefined
  
  /**
    * A string or array used for signing cookies.
    * This is optional and if not specified, will not parse signed cookies.
    * If a string is provided, this is used as the secret.
    * If an array is provided, an attempt will be made to unsign the cookie with each secret in order.
    */
  var secret: js.UndefOr[String | js.Array[String]] = js.undefined
}
object CookieParserOptionItem {
  
  @scala.inline
  def apply(): CookieParserOptionItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CookieParserOptionItem]
  }
  
  @scala.inline
  implicit class CookieParserOptionItemMutableBuilder[Self <: CookieParserOptionItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setSecret(value: String | js.Array[String]): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
    
    @scala.inline
    def setSecretVarargs(value: String*): Self = StObject.set(x, "secret", js.Array(value :_*))
  }
}

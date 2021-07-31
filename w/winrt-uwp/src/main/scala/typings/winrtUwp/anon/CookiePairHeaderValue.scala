package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Web.Http.Headers.HttpCookiePairHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CookiePairHeaderValue extends StObject {
  
  /** The HttpCookiePairHeaderValue version of the string. */ var cookiePairHeaderValue: HttpCookiePairHeaderValue
  
  /** true if input is valid HttpCookiePairHeaderValue information; otherwise, false. */ var returnValue: Boolean
}
object CookiePairHeaderValue {
  
  @scala.inline
  def apply(cookiePairHeaderValue: HttpCookiePairHeaderValue, returnValue: Boolean): CookiePairHeaderValue = {
    val __obj = js.Dynamic.literal(cookiePairHeaderValue = cookiePairHeaderValue.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[CookiePairHeaderValue]
  }
  
  @scala.inline
  implicit class CookiePairHeaderValueMutableBuilder[Self <: CookiePairHeaderValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCookiePairHeaderValue(value: HttpCookiePairHeaderValue): Self = StObject.set(x, "cookiePairHeaderValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnValue(value: Boolean): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}

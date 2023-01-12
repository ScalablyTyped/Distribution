package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Web.Http.Headers.HttpCookiePairHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemsHttpCookiePairHeaderValue extends StObject {
  
  /** An array of HttpCookiePairHeaderValue items that start at startIndex in the HttpCookiePairHeaderValueCollection . */ var items: HttpCookiePairHeaderValue
  
  /** The number of HttpCookiePairHeaderValue items retrieved. */ var returnValue: Double
}
object ItemsHttpCookiePairHeaderValue {
  
  inline def apply(items: HttpCookiePairHeaderValue, returnValue: Double): ItemsHttpCookiePairHeaderValue = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsHttpCookiePairHeaderValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ItemsHttpCookiePairHeaderValue] (val x: Self) extends AnyVal {
    
    inline def setItems(value: HttpCookiePairHeaderValue): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setReturnValue(value: Double): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}

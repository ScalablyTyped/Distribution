package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Web.Http.HttpCookie
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemsHttpCookie extends StObject {
  
  /** The HttpCookie items that start at startIndex in the HttpCookieCollection . */ var items: HttpCookie
  
  /** The number of HttpCookie items retrieved. */ var returnValue: Double
}
object ItemsHttpCookie {
  
  inline def apply(items: HttpCookie, returnValue: Double): ItemsHttpCookie = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsHttpCookie]
  }
  
  extension [Self <: ItemsHttpCookie](x: Self) {
    
    inline def setItems(value: HttpCookie): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setReturnValue(value: Double): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}

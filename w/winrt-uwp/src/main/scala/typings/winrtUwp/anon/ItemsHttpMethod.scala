package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Web.Http.HttpMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemsHttpMethod extends StObject {
  
  /** An array of HttpMethod items that start at startIndex in the HttpMethodHeaderValueCollection . */ var items: HttpMethod
  
  /** The number of items retrieved. */ var returnValue: Double
}
object ItemsHttpMethod {
  
  inline def apply(items: HttpMethod, returnValue: Double): ItemsHttpMethod = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsHttpMethod]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ItemsHttpMethod] (val x: Self) extends AnyVal {
    
    inline def setItems(value: HttpMethod): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setReturnValue(value: Double): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}

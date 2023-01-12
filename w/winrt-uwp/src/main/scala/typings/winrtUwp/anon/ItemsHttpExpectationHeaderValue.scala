package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Web.Http.Headers.HttpExpectationHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemsHttpExpectationHeaderValue extends StObject {
  
  /** An array of HttpExpectationHeaderValue items that start at startIndex in the HttpExpectationHeaderValueCollection . */ var items: HttpExpectationHeaderValue
  
  /** The number of items retrieved. */ var returnValue: Double
}
object ItemsHttpExpectationHeaderValue {
  
  inline def apply(items: HttpExpectationHeaderValue, returnValue: Double): ItemsHttpExpectationHeaderValue = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsHttpExpectationHeaderValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ItemsHttpExpectationHeaderValue] (val x: Self) extends AnyVal {
    
    inline def setItems(value: HttpExpectationHeaderValue): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setReturnValue(value: Double): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}

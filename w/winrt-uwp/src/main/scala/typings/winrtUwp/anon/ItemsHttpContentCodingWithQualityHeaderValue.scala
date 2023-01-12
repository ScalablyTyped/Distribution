package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Web.Http.Headers.HttpContentCodingWithQualityHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemsHttpContentCodingWithQualityHeaderValue extends StObject {
  
  /** An array of HttpContentCodingWithQualityHeaderValue items that start at startIndex in the HttpContentCodingWithQualityHeaderValueCollection . */ var items: HttpContentCodingWithQualityHeaderValue
  
  /** The number of HttpContentCodingWithQualityHeaderValue items retrieved. */ var returnValue: Double
}
object ItemsHttpContentCodingWithQualityHeaderValue {
  
  inline def apply(items: HttpContentCodingWithQualityHeaderValue, returnValue: Double): ItemsHttpContentCodingWithQualityHeaderValue = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsHttpContentCodingWithQualityHeaderValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ItemsHttpContentCodingWithQualityHeaderValue] (val x: Self) extends AnyVal {
    
    inline def setItems(value: HttpContentCodingWithQualityHeaderValue): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setReturnValue(value: Double): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}

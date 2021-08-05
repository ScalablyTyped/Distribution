package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Web.Http.Headers.HttpMediaTypeWithQualityHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemsHttpMediaTypeWithQualityHeaderValue extends StObject {
  
  /** An array of HttpMediaTypeWithQualityHeaderValue items that start at startIndex in the HttpMediaTypeWithQualityHeaderValueCollection . */ var items: HttpMediaTypeWithQualityHeaderValue
  
  /** The number of items retrieved. */ var returnValue: Double
}
object ItemsHttpMediaTypeWithQualityHeaderValue {
  
  inline def apply(items: HttpMediaTypeWithQualityHeaderValue, returnValue: Double): ItemsHttpMediaTypeWithQualityHeaderValue = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsHttpMediaTypeWithQualityHeaderValue]
  }
  
  extension [Self <: ItemsHttpMediaTypeWithQualityHeaderValue](x: Self) {
    
    inline def setItems(value: HttpMediaTypeWithQualityHeaderValue): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setReturnValue(value: Double): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}

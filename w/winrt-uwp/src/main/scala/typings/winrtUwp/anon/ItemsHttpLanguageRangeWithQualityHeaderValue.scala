package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Web.Http.Headers.HttpLanguageRangeWithQualityHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemsHttpLanguageRangeWithQualityHeaderValue extends StObject {
  
  /** An array of HttpLanguageRangeWithQualityHeaderValue items that start at startIndex in the HttpLanguageRangeWithQualityHeaderValueCollection . */ var items: HttpLanguageRangeWithQualityHeaderValue
  
  /** The number of items retrieved. */ var returnValue: Double
}
object ItemsHttpLanguageRangeWithQualityHeaderValue {
  
  inline def apply(items: HttpLanguageRangeWithQualityHeaderValue, returnValue: Double): ItemsHttpLanguageRangeWithQualityHeaderValue = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsHttpLanguageRangeWithQualityHeaderValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ItemsHttpLanguageRangeWithQualityHeaderValue] (val x: Self) extends AnyVal {
    
    inline def setItems(value: HttpLanguageRangeWithQualityHeaderValue): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setReturnValue(value: Double): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}

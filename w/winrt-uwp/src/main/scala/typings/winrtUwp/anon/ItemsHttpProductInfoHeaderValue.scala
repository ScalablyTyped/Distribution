package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Web.Http.Headers.HttpProductInfoHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemsHttpProductInfoHeaderValue extends StObject {
  
  /** An array of HttpProductInfoHeaderValue items that start at startIndex in the HttpProductInfoHeaderValueCollection . */ var items: HttpProductInfoHeaderValue
  
  /** The number of items retrieved. */ var returnValue: Double
}
object ItemsHttpProductInfoHeaderValue {
  
  @scala.inline
  def apply(items: HttpProductInfoHeaderValue, returnValue: Double): ItemsHttpProductInfoHeaderValue = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsHttpProductInfoHeaderValue]
  }
  
  @scala.inline
  implicit class ItemsHttpProductInfoHeaderValueMutableBuilder[Self <: ItemsHttpProductInfoHeaderValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: HttpProductInfoHeaderValue): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnValue(value: Double): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}

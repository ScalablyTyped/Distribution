package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Web.Http.Headers.HttpTransferCodingHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemsHttpTransferCodingHeaderValue extends StObject {
  
  /** An array of HttpTransferCodingHeaderValue items that start at startIndex in the HttpTransferCodingHeaderValueCollection . */ var items: HttpTransferCodingHeaderValue
  
  /** The number of items retrieved. */ var returnValue: Double
}
object ItemsHttpTransferCodingHeaderValue {
  
  @scala.inline
  def apply(items: HttpTransferCodingHeaderValue, returnValue: Double): ItemsHttpTransferCodingHeaderValue = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsHttpTransferCodingHeaderValue]
  }
  
  @scala.inline
  implicit class ItemsHttpTransferCodingHeaderValueMutableBuilder[Self <: ItemsHttpTransferCodingHeaderValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: HttpTransferCodingHeaderValue): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnValue(value: Double): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}

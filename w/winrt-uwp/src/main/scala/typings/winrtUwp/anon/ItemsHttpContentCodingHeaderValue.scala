package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Web.Http.Headers.HttpContentCodingHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemsHttpContentCodingHeaderValue extends StObject {
  
  /** An array of HttpContentCodingHeaderValue items that start at startIndex in the HttpContentCodingHeaderValueCollection . */ var items: HttpContentCodingHeaderValue = js.native
  
  /** The number of HttpContentCodingHeaderValue items retrieved. */ var returnValue: Double = js.native
}
object ItemsHttpContentCodingHeaderValue {
  
  @scala.inline
  def apply(items: HttpContentCodingHeaderValue, returnValue: Double): ItemsHttpContentCodingHeaderValue = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsHttpContentCodingHeaderValue]
  }
  
  @scala.inline
  implicit class ItemsHttpContentCodingHeaderValueMutableBuilder[Self <: ItemsHttpContentCodingHeaderValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: HttpContentCodingHeaderValue): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnValue(value: Double): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}

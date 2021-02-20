package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Web.Http.Headers.HttpConnectionOptionHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemsHttpConnectionOptionHeaderValue extends StObject {
  
  /** An array of HttpConnectionOptionHeaderValue items that start at startIndex in the HttpConnectionOptionHeaderValueCollection . */ var items: HttpConnectionOptionHeaderValue = js.native
  
  /** The number of HttpConnectionOptionHeaderValue items retrieved. */ var returnValue: Double = js.native
}
object ItemsHttpConnectionOptionHeaderValue {
  
  @scala.inline
  def apply(items: HttpConnectionOptionHeaderValue, returnValue: Double): ItemsHttpConnectionOptionHeaderValue = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsHttpConnectionOptionHeaderValue]
  }
  
  @scala.inline
  implicit class ItemsHttpConnectionOptionHeaderValueMutableBuilder[Self <: ItemsHttpConnectionOptionHeaderValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: HttpConnectionOptionHeaderValue): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnValue(value: Double): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}

package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Web.Http.HttpMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemsHttpMethod extends StObject {
  
  /** An array of HttpMethod items that start at startIndex in the HttpMethodHeaderValueCollection . */ var items: HttpMethod = js.native
  
  /** The number of items retrieved. */ var returnValue: Double = js.native
}
object ItemsHttpMethod {
  
  @scala.inline
  def apply(items: HttpMethod, returnValue: Double): ItemsHttpMethod = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsHttpMethod]
  }
  
  @scala.inline
  implicit class ItemsHttpMethodMutableBuilder[Self <: ItemsHttpMethod] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: HttpMethod): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnValue(value: Double): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}

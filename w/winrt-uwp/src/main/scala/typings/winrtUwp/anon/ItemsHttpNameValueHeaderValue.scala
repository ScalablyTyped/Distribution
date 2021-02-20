package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Web.Http.Headers.HttpNameValueHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemsHttpNameValueHeaderValue extends StObject {
  
  /** An array of HttpNameValueHeaderValue items that start at startIndex in the HttpCacheDirectiveHeaderValueCollection . */ var items: HttpNameValueHeaderValue = js.native
  
  /** The number of HttpNameValueHeaderValue items retrieved. */ var returnValue: Double = js.native
}
object ItemsHttpNameValueHeaderValue {
  
  @scala.inline
  def apply(items: HttpNameValueHeaderValue, returnValue: Double): ItemsHttpNameValueHeaderValue = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsHttpNameValueHeaderValue]
  }
  
  @scala.inline
  implicit class ItemsHttpNameValueHeaderValueMutableBuilder[Self <: ItemsHttpNameValueHeaderValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: HttpNameValueHeaderValue): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnValue(value: Double): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}

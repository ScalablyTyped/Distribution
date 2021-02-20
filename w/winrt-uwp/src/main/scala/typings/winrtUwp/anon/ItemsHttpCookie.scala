package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Web.Http.HttpCookie
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemsHttpCookie extends StObject {
  
  /** The HttpCookie items that start at startIndex in the HttpCookieCollection . */ var items: HttpCookie = js.native
  
  /** The number of HttpCookie items retrieved. */ var returnValue: Double = js.native
}
object ItemsHttpCookie {
  
  @scala.inline
  def apply(items: HttpCookie, returnValue: Double): ItemsHttpCookie = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsHttpCookie]
  }
  
  @scala.inline
  implicit class ItemsHttpCookieMutableBuilder[Self <: ItemsHttpCookie] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: HttpCookie): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnValue(value: Double): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}

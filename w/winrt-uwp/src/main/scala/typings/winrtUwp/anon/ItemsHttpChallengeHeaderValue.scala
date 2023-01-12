package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Web.Http.Headers.HttpChallengeHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemsHttpChallengeHeaderValue extends StObject {
  
  /** An array of HttpChallengeHeaderValue items that start at startIndex in the HttpChallengeHeaderValueCollection . */ var items: HttpChallengeHeaderValue
  
  /** The number of HttpChallengeHeaderValue items retrieved. */ var returnValue: Double
}
object ItemsHttpChallengeHeaderValue {
  
  inline def apply(items: HttpChallengeHeaderValue, returnValue: Double): ItemsHttpChallengeHeaderValue = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsHttpChallengeHeaderValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ItemsHttpChallengeHeaderValue] (val x: Self) extends AnyVal {
    
    inline def setItems(value: HttpChallengeHeaderValue): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setReturnValue(value: Double): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}

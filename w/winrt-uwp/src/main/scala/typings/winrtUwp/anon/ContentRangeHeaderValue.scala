package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Web.Http.Headers.HttpContentRangeHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentRangeHeaderValue extends StObject {
  
  /** The HttpContentRangeHeaderValue version of the string. */ var contentRangeHeaderValue: HttpContentRangeHeaderValue
  
  /** true if input is valid HttpContentRangeHeaderValue information; otherwise, false. */ var returnValue: Boolean
}
object ContentRangeHeaderValue {
  
  inline def apply(contentRangeHeaderValue: HttpContentRangeHeaderValue, returnValue: Boolean): ContentRangeHeaderValue = {
    val __obj = js.Dynamic.literal(contentRangeHeaderValue = contentRangeHeaderValue.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentRangeHeaderValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentRangeHeaderValue] (val x: Self) extends AnyVal {
    
    inline def setContentRangeHeaderValue(value: HttpContentRangeHeaderValue): Self = StObject.set(x, "contentRangeHeaderValue", value.asInstanceOf[js.Any])
    
    inline def setReturnValue(value: Boolean): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}

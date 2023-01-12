package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Web.Http.Headers.HttpContentDispositionHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentDispositionHeaderValue extends StObject {
  
  /** The HttpContentDispositionHeaderValue version of the string. */ var contentDispositionHeaderValue: HttpContentDispositionHeaderValue
  
  /** true if input is valid HttpContentDispositionHeaderValue information; otherwise, false. */ var returnValue: Boolean
}
object ContentDispositionHeaderValue {
  
  inline def apply(contentDispositionHeaderValue: HttpContentDispositionHeaderValue, returnValue: Boolean): ContentDispositionHeaderValue = {
    val __obj = js.Dynamic.literal(contentDispositionHeaderValue = contentDispositionHeaderValue.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentDispositionHeaderValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentDispositionHeaderValue] (val x: Self) extends AnyVal {
    
    inline def setContentDispositionHeaderValue(value: HttpContentDispositionHeaderValue): Self = StObject.set(x, "contentDispositionHeaderValue", value.asInstanceOf[js.Any])
    
    inline def setReturnValue(value: Boolean): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}

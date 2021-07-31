package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Web.Http.Headers.HttpContentCodingHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentCodingHeaderValue extends StObject {
  
  /** The HttpContentCodingHeaderValue version of the string. */ var contentCodingHeaderValue: HttpContentCodingHeaderValue
  
  /** true if input is valid HttpContentCodingHeaderValue information; otherwise, false. */ var returnValue: Boolean
}
object ContentCodingHeaderValue {
  
  @scala.inline
  def apply(contentCodingHeaderValue: HttpContentCodingHeaderValue, returnValue: Boolean): ContentCodingHeaderValue = {
    val __obj = js.Dynamic.literal(contentCodingHeaderValue = contentCodingHeaderValue.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentCodingHeaderValue]
  }
  
  @scala.inline
  implicit class ContentCodingHeaderValueMutableBuilder[Self <: ContentCodingHeaderValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentCodingHeaderValue(value: HttpContentCodingHeaderValue): Self = StObject.set(x, "contentCodingHeaderValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnValue(value: Boolean): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}

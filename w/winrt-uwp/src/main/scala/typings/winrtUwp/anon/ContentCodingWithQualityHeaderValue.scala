package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Web.Http.Headers.HttpContentCodingWithQualityHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentCodingWithQualityHeaderValue extends StObject {
  
  /** The HttpContentCodingWithQualityHeaderValue version of the string. */ var contentCodingWithQualityHeaderValue: HttpContentCodingWithQualityHeaderValue
  
  /** true if input is valid HttpContentCodingWithQualityHeaderValue information; otherwise, false. */ var returnValue: Boolean
}
object ContentCodingWithQualityHeaderValue {
  
  @scala.inline
  def apply(contentCodingWithQualityHeaderValue: HttpContentCodingWithQualityHeaderValue, returnValue: Boolean): ContentCodingWithQualityHeaderValue = {
    val __obj = js.Dynamic.literal(contentCodingWithQualityHeaderValue = contentCodingWithQualityHeaderValue.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentCodingWithQualityHeaderValue]
  }
  
  @scala.inline
  implicit class ContentCodingWithQualityHeaderValueMutableBuilder[Self <: ContentCodingWithQualityHeaderValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentCodingWithQualityHeaderValue(value: HttpContentCodingWithQualityHeaderValue): Self = StObject.set(x, "contentCodingWithQualityHeaderValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnValue(value: Boolean): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}

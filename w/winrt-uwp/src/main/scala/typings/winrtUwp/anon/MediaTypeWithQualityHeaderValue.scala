package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Web.Http.Headers.HttpMediaTypeWithQualityHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaTypeWithQualityHeaderValue extends StObject {
  
  /** The HttpMediaTypeWithQualityHeaderValue version of the string. */ var mediaTypeWithQualityHeaderValue: HttpMediaTypeWithQualityHeaderValue
  
  /** true if input is valid HttpMediaTypeWithQualityHeaderValue information; otherwise, false. */ var returnValue: Boolean
}
object MediaTypeWithQualityHeaderValue {
  
  inline def apply(mediaTypeWithQualityHeaderValue: HttpMediaTypeWithQualityHeaderValue, returnValue: Boolean): MediaTypeWithQualityHeaderValue = {
    val __obj = js.Dynamic.literal(mediaTypeWithQualityHeaderValue = mediaTypeWithQualityHeaderValue.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaTypeWithQualityHeaderValue]
  }
  
  extension [Self <: MediaTypeWithQualityHeaderValue](x: Self) {
    
    inline def setMediaTypeWithQualityHeaderValue(value: HttpMediaTypeWithQualityHeaderValue): Self = StObject.set(x, "mediaTypeWithQualityHeaderValue", value.asInstanceOf[js.Any])
    
    inline def setReturnValue(value: Boolean): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}

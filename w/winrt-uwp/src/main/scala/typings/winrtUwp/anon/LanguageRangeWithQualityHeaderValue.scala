package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Web.Http.Headers.HttpLanguageRangeWithQualityHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LanguageRangeWithQualityHeaderValue extends StObject {
  
  /** The HttpLanguageRangeWithQualityHeaderValue version of the string. */ var languageRangeWithQualityHeaderValue: HttpLanguageRangeWithQualityHeaderValue
  
  /** true if input is valid HttpLanguageRangeWithQualityHeaderValue information; otherwise, false. */ var returnValue: Boolean
}
object LanguageRangeWithQualityHeaderValue {
  
  inline def apply(languageRangeWithQualityHeaderValue: HttpLanguageRangeWithQualityHeaderValue, returnValue: Boolean): LanguageRangeWithQualityHeaderValue = {
    val __obj = js.Dynamic.literal(languageRangeWithQualityHeaderValue = languageRangeWithQualityHeaderValue.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageRangeWithQualityHeaderValue]
  }
  
  extension [Self <: LanguageRangeWithQualityHeaderValue](x: Self) {
    
    inline def setLanguageRangeWithQualityHeaderValue(value: HttpLanguageRangeWithQualityHeaderValue): Self = StObject.set(x, "languageRangeWithQualityHeaderValue", value.asInstanceOf[js.Any])
    
    inline def setReturnValue(value: Boolean): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}

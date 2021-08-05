package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Web.Http.Headers.HttpDateOrDeltaHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateOrDeltaHeaderValue extends StObject {
  
  /** The HttpDateOrDeltaHeaderValue version of the string. */ var dateOrDeltaHeaderValue: HttpDateOrDeltaHeaderValue
  
  /** true if input is valid HttpDateOrDeltaHeaderValue information; otherwise, false. */ var returnValue: Boolean
}
object DateOrDeltaHeaderValue {
  
  inline def apply(dateOrDeltaHeaderValue: HttpDateOrDeltaHeaderValue, returnValue: Boolean): DateOrDeltaHeaderValue = {
    val __obj = js.Dynamic.literal(dateOrDeltaHeaderValue = dateOrDeltaHeaderValue.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateOrDeltaHeaderValue]
  }
  
  extension [Self <: DateOrDeltaHeaderValue](x: Self) {
    
    inline def setDateOrDeltaHeaderValue(value: HttpDateOrDeltaHeaderValue): Self = StObject.set(x, "dateOrDeltaHeaderValue", value.asInstanceOf[js.Any])
    
    inline def setReturnValue(value: Boolean): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}

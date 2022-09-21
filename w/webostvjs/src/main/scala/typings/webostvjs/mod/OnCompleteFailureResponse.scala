package typings.webostvjs.mod

import typings.webostvjs.webostvjsBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnCompleteFailureResponse extends StObject {
  
  var errorCode: String
  
  var errorText: String
  
  var returnValue: `false`
}
object OnCompleteFailureResponse {
  
  inline def apply(errorCode: String, errorText: String): OnCompleteFailureResponse = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], errorText = errorText.asInstanceOf[js.Any], returnValue = false)
    __obj.asInstanceOf[OnCompleteFailureResponse]
  }
  
  extension [Self <: OnCompleteFailureResponse](x: Self) {
    
    inline def setErrorCode(value: String): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorText(value: String): Self = StObject.set(x, "errorText", value.asInstanceOf[js.Any])
    
    inline def setReturnValue(value: `false`): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}

package typings.webostvjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailureResponse extends StObject {
  
  /**
    * The error code returned when the method fails.
    */
  var errorCode: String | Double
  
  /**
    * The error text returned when the method fails.
    */
  var errorText: String
}
object FailureResponse {
  
  inline def apply(errorCode: String | Double, errorText: String): FailureResponse = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], errorText = errorText.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailureResponse]
  }
  
  extension [Self <: FailureResponse](x: Self) {
    
    inline def setErrorCode(value: String | Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorText(value: String): Self = StObject.set(x, "errorText", value.asInstanceOf[js.Any])
  }
}

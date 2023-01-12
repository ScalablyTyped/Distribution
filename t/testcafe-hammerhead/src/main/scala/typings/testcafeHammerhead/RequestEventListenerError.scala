package typings.testcafeHammerhead

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestEventListenerError extends StObject {
  
  var error: js.Error
  
  var methodName: String
}
object RequestEventListenerError {
  
  inline def apply(error: js.Error, methodName: String): RequestEventListenerError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestEventListenerError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestEventListenerError] (val x: Self) extends AnyVal {
    
    inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setMethodName(value: String): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
  }
}

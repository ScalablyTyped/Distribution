package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceEndpointRequestResult extends StObject {
  
  var errorMessage: String
  
  var result: js.Any
  
  var statusCode: String
}
object ServiceEndpointRequestResult {
  
  @scala.inline
  def apply(errorMessage: String, result: js.Any, statusCode: String): ServiceEndpointRequestResult = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceEndpointRequestResult]
  }
  
  @scala.inline
  implicit class ServiceEndpointRequestResultMutableBuilder[Self <: ServiceEndpointRequestResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: js.Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCode(value: String): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}

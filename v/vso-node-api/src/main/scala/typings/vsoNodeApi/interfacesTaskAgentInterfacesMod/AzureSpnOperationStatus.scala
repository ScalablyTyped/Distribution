package typings.vsoNodeApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AzureSpnOperationStatus extends StObject {
  
  var state: String
  
  var statusMessage: String
}
object AzureSpnOperationStatus {
  
  inline def apply(state: String, statusMessage: String): AzureSpnOperationStatus = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AzureSpnOperationStatus]
  }
  
  extension [Self <: AzureSpnOperationStatus](x: Self) {
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
  }
}

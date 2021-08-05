package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkItemNextStateOnTransition extends StObject {
  
  /**
    * Error code if there is no next state transition possible.
    */
  var errorCode: String
  
  /**
    * Work item ID.
    */
  var id: Double
  
  /**
    * Error message if there is no next state transition possible.
    */
  var message: String
  
  /**
    * Name of the next state on transition.
    */
  var stateOnTransition: String
}
object WorkItemNextStateOnTransition {
  
  inline def apply(errorCode: String, id: Double, message: String, stateOnTransition: String): WorkItemNextStateOnTransition = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], stateOnTransition = stateOnTransition.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemNextStateOnTransition]
  }
  
  extension [Self <: WorkItemNextStateOnTransition](x: Self) {
    
    inline def setErrorCode(value: String): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setStateOnTransition(value: String): Self = StObject.set(x, "stateOnTransition", value.asInstanceOf[js.Any])
  }
}

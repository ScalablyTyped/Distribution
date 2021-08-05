package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkItemStateTransition extends StObject {
  
  /**
    * Gets a list of actions needed to transition to that state.
    */
  var actions: js.Array[String]
  
  /**
    * Name of the next state.
    */
  var to: String
}
object WorkItemStateTransition {
  
  inline def apply(actions: js.Array[String], to: String): WorkItemStateTransition = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemStateTransition]
  }
  
  extension [Self <: WorkItemStateTransition](x: Self) {
    
    inline def setActions(value: js.Array[String]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsVarargs(value: String*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}

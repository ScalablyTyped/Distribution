package typings.xstate.libTypesMod

import typings.xstate.libTypesMod.ActionTypes.Assign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnyAssignAction[TContext, TEvent /* <: EventObject */]
  extends StObject
     with ActionObject[TContext, TEvent] {
  
  var assignment: Any
  
  @JSName("type")
  var type_AnyAssignAction: Assign
}
object AnyAssignAction {
  
  inline def apply[TContext, TEvent /* <: EventObject */](assignment: Any, `type`: Assign): AnyAssignAction[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(assignment = assignment.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyAssignAction[TContext, TEvent]]
  }
  
  extension [Self <: AnyAssignAction[?, ?], TContext, TEvent /* <: EventObject */](x: Self & (AnyAssignAction[TContext, TEvent])) {
    
    inline def setAssignment(value: Any): Self = StObject.set(x, "assignment", value.asInstanceOf[js.Any])
    
    inline def setType(value: Assign): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

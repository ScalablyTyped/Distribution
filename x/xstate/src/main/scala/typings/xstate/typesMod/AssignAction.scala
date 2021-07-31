package typings.xstate.typesMod

import typings.std.Partial
import typings.xstate.typesMod.ActionTypes.Assign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssignAction[TContext, TEvent /* <: EventObject */]
  extends StObject
     with ActionObject[TContext, TEvent] {
  
  var assignment: (Assigner[TContext, TEvent]) | (PropertyAssigner[TContext, TEvent])
  
  @JSName("type")
  var type_AssignAction: Assign
}
object AssignAction {
  
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](assignment: (Assigner[TContext, TEvent]) | (PropertyAssigner[TContext, TEvent]), `type`: Assign): AssignAction[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(assignment = assignment.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignAction[TContext, TEvent]]
  }
  
  @scala.inline
  implicit class AssignActionMutableBuilder[Self <: AssignAction[?, ?], TContext, TEvent /* <: EventObject */] (val x: Self & (AssignAction[TContext, TEvent])) extends AnyVal {
    
    @scala.inline
    def setAssignment(value: (Assigner[TContext, TEvent]) | (PropertyAssigner[TContext, TEvent])): Self = StObject.set(x, "assignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignmentFunction3(value: (TContext, TEvent, /* meta */ AssignMeta[TContext, TEvent]) => Partial[TContext]): Self = StObject.set(x, "assignment", js.Any.fromFunction3(value))
    
    @scala.inline
    def setType(value: Assign): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

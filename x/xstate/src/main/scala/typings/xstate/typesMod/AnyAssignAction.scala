package typings.xstate.typesMod

import typings.xstate.typesMod.ActionTypes.Assign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnyAssignAction[TContext, TEvent /* <: EventObject */] extends ActionObject[TContext, TEvent] {
  
  var assignment: js.Any = js.native
  
  @JSName("type")
  var type_AnyAssignAction: Assign = js.native
}
object AnyAssignAction {
  
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](assignment: js.Any, `type`: Assign): AnyAssignAction[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(assignment = assignment.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyAssignAction[TContext, TEvent]]
  }
  
  @scala.inline
  implicit class AnyAssignActionMutableBuilder[Self <: AnyAssignAction[_, _], TContext, TEvent /* <: EventObject */] (val x: Self with (AnyAssignAction[TContext, TEvent])) extends AnyVal {
    
    @scala.inline
    def setAssignment(value: js.Any): Self = StObject.set(x, "assignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Assign): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

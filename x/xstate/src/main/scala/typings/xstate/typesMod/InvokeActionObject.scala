package typings.xstate.typesMod

import typings.xstate.typesMod.ActionTypes.Start
import typings.xstate.typesMod.ActionTypes.Stop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InvokeActionObject[TContext, TEvent /* <: EventObject */] extends ActivityActionObject[TContext, TEvent] {
  
  @JSName("activity")
  var activity_InvokeActionObject: InvokeDefinition[TContext, TEvent] = js.native
}
object InvokeActionObject {
  
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](activity: InvokeDefinition[TContext, TEvent], `type`: Start | Stop): InvokeActionObject[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(activity = activity.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvokeActionObject[TContext, TEvent]]
  }
  
  @scala.inline
  implicit class InvokeActionObjectMutableBuilder[Self <: InvokeActionObject[_, _], TContext, TEvent /* <: EventObject */] (val x: Self with (InvokeActionObject[TContext, TEvent])) extends AnyVal {
    
    @scala.inline
    def setActivity(value: InvokeDefinition[TContext, TEvent]): Self = StObject.set(x, "activity", value.asInstanceOf[js.Any])
  }
}

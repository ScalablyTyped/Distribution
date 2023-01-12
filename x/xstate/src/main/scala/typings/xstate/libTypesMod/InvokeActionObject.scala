package typings.xstate.libTypesMod

import typings.xstate.libTypesMod.ActionTypes.Start
import typings.xstate.libTypesMod.ActionTypes.Stop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvokeActionObject[TContext, TEvent /* <: EventObject */]
  extends StObject
     with ActivityActionObject[TContext, TEvent] {
  
  @JSName("activity")
  var activity_InvokeActionObject: InvokeDefinition[TContext, TEvent]
}
object InvokeActionObject {
  
  inline def apply[TContext, TEvent /* <: EventObject */](activity: InvokeDefinition[TContext, TEvent], `type`: Start | Stop): InvokeActionObject[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(activity = activity.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvokeActionObject[TContext, TEvent]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InvokeActionObject[?, ?], TContext, TEvent /* <: EventObject */] (val x: Self & (InvokeActionObject[TContext, TEvent])) extends AnyVal {
    
    inline def setActivity(value: InvokeDefinition[TContext, TEvent]): Self = StObject.set(x, "activity", value.asInstanceOf[js.Any])
  }
}

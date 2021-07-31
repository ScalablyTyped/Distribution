package typings.xstate.typesMod

import typings.xstate.anon.Id
import typings.xstate.typesMod.ActionTypes.Stop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopAction[TContext, TEvent /* <: EventObject */]
  extends StObject
     with ActionObject[TContext, TEvent] {
  
  var activity: String | Id | (Expr[TContext, TEvent, String | Id])
  
  @JSName("type")
  var type_StopAction: Stop
}
object StopAction {
  
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](activity: String | Id | (Expr[TContext, TEvent, String | Id]), `type`: Stop): StopAction[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(activity = activity.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopAction[TContext, TEvent]]
  }
  
  @scala.inline
  implicit class StopActionMutableBuilder[Self <: StopAction[?, ?], TContext, TEvent /* <: EventObject */] (val x: Self & (StopAction[TContext, TEvent])) extends AnyVal {
    
    @scala.inline
    def setActivity(value: String | Id | (Expr[TContext, TEvent, String | Id])): Self = StObject.set(x, "activity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivityFunction2(value: (TContext, TEvent) => String | Id): Self = StObject.set(x, "activity", js.Any.fromFunction2(value))
    
    @scala.inline
    def setType(value: Stop): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

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
  
  inline def apply[TContext, TEvent /* <: EventObject */](activity: String | Id | (Expr[TContext, TEvent, String | Id]), `type`: Stop): StopAction[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(activity = activity.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopAction[TContext, TEvent]]
  }
  
  extension [Self <: StopAction[?, ?], TContext, TEvent /* <: EventObject */](x: Self & (StopAction[TContext, TEvent])) {
    
    inline def setActivity(value: String | Id | (Expr[TContext, TEvent, String | Id])): Self = StObject.set(x, "activity", value.asInstanceOf[js.Any])
    
    inline def setActivityFunction2(value: (TContext, TEvent) => String | Id): Self = StObject.set(x, "activity", js.Any.fromFunction2(value))
    
    inline def setType(value: Stop): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

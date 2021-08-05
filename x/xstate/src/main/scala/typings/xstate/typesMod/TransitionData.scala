package typings.xstate.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitionData[TContext, TEvent /* <: EventObject */] extends StObject {
  
  var actions: ActionMap[TContext, TEvent]
  
  var activities: js.UndefOr[ActivityMap] = js.undefined
  
  var value: js.UndefOr[StateValue] = js.undefined
}
object TransitionData {
  
  inline def apply[TContext, TEvent /* <: EventObject */](actions: ActionMap[TContext, TEvent]): TransitionData[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionData[TContext, TEvent]]
  }
  
  extension [Self <: TransitionData[?, ?], TContext, TEvent /* <: EventObject */](x: Self & (TransitionData[TContext, TEvent])) {
    
    inline def setActions(value: ActionMap[TContext, TEvent]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActivities(value: ActivityMap): Self = StObject.set(x, "activities", value.asInstanceOf[js.Any])
    
    inline def setActivitiesUndefined: Self = StObject.set(x, "activities", js.undefined)
    
    inline def setValue(value: StateValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}

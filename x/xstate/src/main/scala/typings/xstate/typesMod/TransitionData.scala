package typings.xstate.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransitionData[TContext, TEvent /* <: EventObject */] extends StObject {
  
  var actions: ActionMap[TContext, TEvent] = js.native
  
  var activities: js.UndefOr[ActivityMap] = js.native
  
  var value: js.UndefOr[StateValue] = js.native
}
object TransitionData {
  
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](actions: ActionMap[TContext, TEvent]): TransitionData[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionData[TContext, TEvent]]
  }
  
  @scala.inline
  implicit class TransitionDataMutableBuilder[Self <: TransitionData[_, _], TContext, TEvent /* <: EventObject */] (val x: Self with (TransitionData[TContext, TEvent])) extends AnyVal {
    
    @scala.inline
    def setActions(value: ActionMap[TContext, TEvent]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivities(value: ActivityMap): Self = StObject.set(x, "activities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivitiesUndefined: Self = StObject.set(x, "activities", js.undefined)
    
    @scala.inline
    def setValue(value: StateValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}

package typings.xstate.typesMod

import typings.xstate.typesMod.ActionTypes.Start
import typings.xstate.typesMod.ActionTypes.Stop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivityActionObject[TContext, TEvent /* <: EventObject */] extends ActionObject[TContext, TEvent] {
  
  var activity: js.UndefOr[ActivityDefinition[TContext, TEvent]] = js.native
  
  @JSName("type")
  var type_ActivityActionObject: Start | Stop = js.native
}
object ActivityActionObject {
  
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](`type`: Start | Stop): ActivityActionObject[TContext, TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityActionObject[TContext, TEvent]]
  }
  
  @scala.inline
  implicit class ActivityActionObjectMutableBuilder[Self <: ActivityActionObject[_, _], TContext, TEvent /* <: EventObject */] (val x: Self with (ActivityActionObject[TContext, TEvent])) extends AnyVal {
    
    @scala.inline
    def setActivity(value: ActivityDefinition[TContext, TEvent]): Self = StObject.set(x, "activity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivityUndefined: Self = StObject.set(x, "activity", js.undefined)
    
    @scala.inline
    def setType(value: Start | Stop): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

package typings.xstate.typesMod

import typings.xstate.typesMod.ActionTypes.Start
import typings.xstate.typesMod.ActionTypes.Stop
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
  implicit class ActivityActionObjectOps[Self <: ActivityActionObject[_, _], TContext, TEvent /* <: EventObject */] (val x: Self with (ActivityActionObject[TContext, TEvent])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: Start | Stop): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivity(value: ActivityDefinition[TContext, TEvent]): Self = this.set("activity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivity: Self = this.set("activity", js.undefined)
  }
}

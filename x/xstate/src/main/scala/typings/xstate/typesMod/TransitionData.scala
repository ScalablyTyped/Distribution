package typings.xstate.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransitionData[TContext, TEvent /* <: EventObject */] extends js.Object {
  
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
  implicit class TransitionDataOps[Self <: TransitionData[_, _], TContext, TEvent /* <: EventObject */] (val x: Self with (TransitionData[TContext, TEvent])) extends AnyVal {
    
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
    def setActions(value: ActionMap[TContext, TEvent]): Self = this.set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivities(value: ActivityMap): Self = this.set("activities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivities: Self = this.set("activities", js.undefined)
    
    @scala.inline
    def setValue(value: StateValue): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}

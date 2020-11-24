package typings.xstate.typesMod

import typings.xstate.anon.Id
import typings.xstate.typesMod.ActionTypes.Stop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopAction[TContext, TEvent /* <: EventObject */] extends ActionObject[TContext, TEvent] {
  
  var activity: String | Id | (Expr[TContext, TEvent, String | Id]) = js.native
  
  @JSName("type")
  var type_StopAction: Stop = js.native
}
object StopAction {
  
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](activity: String | Id | (Expr[TContext, TEvent, String | Id]), `type`: Stop): StopAction[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(activity = activity.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopAction[TContext, TEvent]]
  }
  
  @scala.inline
  implicit class StopActionOps[Self <: StopAction[_, _], TContext, TEvent /* <: EventObject */] (val x: Self with (StopAction[TContext, TEvent])) extends AnyVal {
    
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
    def setActivityFunction2(value: (TContext, TEvent) => String | Id): Self = this.set("activity", js.Any.fromFunction2(value))
    
    @scala.inline
    def setActivity(value: String | Id | (Expr[TContext, TEvent, String | Id])): Self = this.set("activity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Stop): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}

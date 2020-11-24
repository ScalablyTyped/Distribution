package typings.xstate.typesMod

import typings.xstate.typesMod.ActionTypes.Raise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RaiseActionObject[TEvent /* <: EventObject */] extends js.Object {
  
  var _event: typings.xstate.typesMod.SCXML.Event[TEvent] = js.native
  
  var `type`: Raise = js.native
}
object RaiseActionObject {
  
  @scala.inline
  def apply[TEvent /* <: EventObject */](_event: typings.xstate.typesMod.SCXML.Event[TEvent], `type`: Raise): RaiseActionObject[TEvent] = {
    val __obj = js.Dynamic.literal(_event = _event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaiseActionObject[TEvent]]
  }
  
  @scala.inline
  implicit class RaiseActionObjectOps[Self <: RaiseActionObject[_], TEvent /* <: EventObject */] (val x: Self with RaiseActionObject[TEvent]) extends AnyVal {
    
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
    def set_event(value: typings.xstate.typesMod.SCXML.Event[TEvent]): Self = this.set("_event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Raise): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}

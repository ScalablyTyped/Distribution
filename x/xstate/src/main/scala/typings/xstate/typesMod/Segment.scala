package typings.xstate.typesMod

import typings.xstate.anon.ContextTContext
import typings.xstate.stateMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Segment[TContext, TEvent /* <: EventObject */] extends js.Object {
  
  /**
    * Event from state.
    */
  var event: TEvent = js.native
  
  /**
    * From state.
    */
  var state: State[TContext, TEvent, _, ContextTContext[TContext]] = js.native
}
object Segment {
  
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](event: TEvent, state: State[TContext, TEvent, _, ContextTContext[TContext]]): Segment[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Segment[TContext, TEvent]]
  }
  
  @scala.inline
  implicit class SegmentOps[Self <: Segment[_, _], TContext, TEvent /* <: EventObject */] (val x: Self with (Segment[TContext, TEvent])) extends AnyVal {
    
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
    def setEvent(value: TEvent): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: State[TContext, TEvent, _, ContextTContext[TContext]]): Self = this.set("state", value.asInstanceOf[js.Any])
  }
}

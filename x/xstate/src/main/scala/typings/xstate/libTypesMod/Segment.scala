package typings.xstate.libTypesMod

import typings.xstate.libStateMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Segment[TContext, TEvent /* <: EventObject */] extends js.Object {
  /**
    * Event from state.
    */
  var event: TEvent
  /**
    * From state.
    */
  var state: State[TContext, TEvent, _, _]
}

object Segment {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](event: TEvent, state: State[TContext, TEvent, _, _]): Segment[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Segment[TContext, TEvent]]
  }
}


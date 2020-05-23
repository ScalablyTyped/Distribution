package typings.xstate.typesMod

import typings.xstate.anon.Context
import typings.xstate.stateMod.State
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
  var state: State[TContext, TEvent, _, Context[TContext]]
}

object Segment {
  @scala.inline
  def apply[TContext, TEvent](event: TEvent, state: State[TContext, TEvent, _, Context[TContext]]): Segment[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Segment[TContext, TEvent]]
  }
}


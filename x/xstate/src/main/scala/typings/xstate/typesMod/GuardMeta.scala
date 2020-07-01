package typings.xstate.typesMod

import typings.xstate.anon.Context
import typings.xstate.stateMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GuardMeta[TContext, TEvent /* <: EventObject */] extends StateMeta[TContext, TEvent] {
  var cond: Guard[TContext, TEvent]
}

object GuardMeta {
  @scala.inline
  def apply[TContext, /* <: typings.xstate.typesMod.EventObject */ TEvent](
    _event: typings.xstate.typesMod.SCXML.Event[TEvent],
    cond: Guard[TContext, TEvent],
    state: State[TContext, TEvent, _, Context[TContext]]
  ): GuardMeta[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(_event = _event.asInstanceOf[js.Any], cond = cond.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[GuardMeta[TContext, TEvent]]
  }
}


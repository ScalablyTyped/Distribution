package typings.xstate.typesMod

import typings.xstate.anon.Context
import typings.xstate.stateMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssignMeta[TContext, TEvent /* <: EventObject */] extends js.Object {
  var _event: typings.xstate.typesMod.SCXML.Event[TEvent] = js.native
  var action: AssignAction[TContext, TEvent] = js.native
  var state: js.UndefOr[State[TContext, TEvent, _, Context[TContext]]] = js.native
}

object AssignMeta {
  @scala.inline
  def apply[TContext, /* <: typings.xstate.typesMod.EventObject */ TEvent](_event: typings.xstate.typesMod.SCXML.Event[TEvent], action: AssignAction[TContext, TEvent]): AssignMeta[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(_event = _event.asInstanceOf[js.Any], action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignMeta[TContext, TEvent]]
  }
  @scala.inline
  implicit class AssignMetaOps[Self <: AssignMeta[_, _], TContext, /* <: typings.xstate.typesMod.EventObject */ TEvent] (val x: Self with (AssignMeta[TContext, TEvent])) extends AnyVal {
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
    def setAction(value: AssignAction[TContext, TEvent]): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: State[TContext, TEvent, _, Context[TContext]]): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
  
}


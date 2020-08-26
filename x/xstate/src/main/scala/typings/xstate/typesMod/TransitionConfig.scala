package typings.xstate.typesMod

import typings.std.Record
import typings.xstate.stateNodeMod.StateNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitionConfig[TContext, TEvent /* <: EventObject */] extends js.Object {
  var actions: js.UndefOr[Actions[TContext, TEvent]] = js.native
  var cond: js.UndefOr[Condition[TContext, TEvent]] = js.native
  var in: js.UndefOr[StateValue] = js.native
  var internal: js.UndefOr[Boolean] = js.native
  var meta: js.UndefOr[Record[String, _]] = js.native
  var target: js.UndefOr[TransitionTarget[TContext, TEvent]] = js.native
}

object TransitionConfig {
  @scala.inline
  def apply[TContext, /* <: typings.xstate.typesMod.EventObject */ TEvent](): TransitionConfig[TContext, TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitionConfig[TContext, TEvent]]
  }
  @scala.inline
  implicit class TransitionConfigOps[Self <: TransitionConfig[_, _], TContext, /* <: typings.xstate.typesMod.EventObject */ TEvent] (val x: Self with (TransitionConfig[TContext, TEvent])) extends AnyVal {
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
    def setActionsVarargs(value: (Action[TContext, TEvent])*): Self = this.set("actions", js.Array(value :_*))
    @scala.inline
    def setActionsFunction3(value: (TContext, TEvent, /* meta */ ActionMeta[TContext, TEvent]) => Unit): Self = this.set("actions", js.Any.fromFunction3(value))
    @scala.inline
    def setActions(value: Actions[TContext, TEvent]): Self = this.set("actions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    @scala.inline
    def setCondFunction3(value: (TContext, TEvent, /* meta */ GuardMeta[TContext, TEvent]) => Boolean): Self = this.set("cond", js.Any.fromFunction3(value))
    @scala.inline
    def setCond(value: Condition[TContext, TEvent]): Self = this.set("cond", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCond: Self = this.set("cond", js.undefined)
    @scala.inline
    def setIn(value: StateValue): Self = this.set("in", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIn: Self = this.set("in", js.undefined)
    @scala.inline
    def setInternal(value: Boolean): Self = this.set("internal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInternal: Self = this.set("internal", js.undefined)
    @scala.inline
    def setMeta(value: Record[String, _]): Self = this.set("meta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeta: Self = this.set("meta", js.undefined)
    @scala.inline
    def setTargetVarargs(value: (String | (StateNode[TContext, js.Any, TEvent, js.Any]))*): Self = this.set("target", js.Array(value :_*))
    @scala.inline
    def setTarget(value: TransitionTarget[TContext, TEvent]): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
  
}


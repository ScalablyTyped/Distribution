package typings.xstate.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChooseConditon[TContext, TEvent /* <: EventObject */] extends js.Object {
  var actions: Actions[TContext, TEvent] = js.native
  var cond: js.UndefOr[Condition[TContext, TEvent]] = js.native
}

object ChooseConditon {
  @scala.inline
  def apply[TContext, /* <: typings.xstate.typesMod.EventObject */ TEvent](actions: Actions[TContext, TEvent]): ChooseConditon[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseConditon[TContext, TEvent]]
  }
  @scala.inline
  implicit class ChooseConditonOps[Self <: ChooseConditon[_, _], TContext, /* <: typings.xstate.typesMod.EventObject */ TEvent] (val x: Self with (ChooseConditon[TContext, TEvent])) extends AnyVal {
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
    def setCondFunction3(value: (TContext, TEvent, /* meta */ GuardMeta[TContext, TEvent]) => Boolean): Self = this.set("cond", js.Any.fromFunction3(value))
    @scala.inline
    def setCond(value: Condition[TContext, TEvent]): Self = this.set("cond", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCond: Self = this.set("cond", js.undefined)
  }
  
}


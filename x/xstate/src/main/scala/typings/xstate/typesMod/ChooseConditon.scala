package typings.xstate.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChooseConditon[TContext, TEvent /* <: EventObject */] extends js.Object {
  var actions: Actions[TContext, TEvent]
  var cond: js.UndefOr[Condition[TContext, TEvent]] = js.undefined
}

object ChooseConditon {
  @scala.inline
  def apply[TContext, TEvent](actions: Actions[TContext, TEvent], cond: Condition[TContext, TEvent] = null): ChooseConditon[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    if (cond != null) __obj.updateDynamic("cond")(cond.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseConditon[TContext, TEvent]]
  }
}


package typings.xstate.libTypesMod

import typings.xstate.libStateMod.State
import typings.xstate.libStateTreeMod.StateTree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateConfig[TContext, TEvent /* <: EventObject */] extends js.Object {
  var actions: js.UndefOr[js.Array[ActionObject[TContext, TEvent]]] = js.undefined
  var activities: js.UndefOr[ActivityMap] = js.undefined
  var context: TContext
  var event: OmniEventObject[TEvent]
  var events: js.UndefOr[js.Array[TEvent]] = js.undefined
  var history: js.UndefOr[State[TContext, EventObject]] = js.undefined
  var historyValue: js.UndefOr[HistoryValue] = js.undefined
  var meta: js.UndefOr[js.Any] = js.undefined
  var tree: js.UndefOr[StateTree] = js.undefined
  var value: StateValue
}

object StateConfig {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    context: TContext,
    event: OmniEventObject[TEvent],
    value: StateValue,
    actions: js.Array[ActionObject[TContext, TEvent]] = null,
    activities: ActivityMap = null,
    events: js.Array[TEvent] = null,
    history: State[TContext, EventObject] = null,
    historyValue: HistoryValue = null,
    meta: js.Any = null,
    tree: StateTree = null
  ): StateConfig[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (activities != null) __obj.updateDynamic("activities")(activities.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (history != null) __obj.updateDynamic("history")(history.asInstanceOf[js.Any])
    if (historyValue != null) __obj.updateDynamic("historyValue")(historyValue.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (tree != null) __obj.updateDynamic("tree")(tree.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateConfig[TContext, TEvent]]
  }
}


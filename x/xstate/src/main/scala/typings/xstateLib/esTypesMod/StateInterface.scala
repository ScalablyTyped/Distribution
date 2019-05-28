package typings
package xstateLib.esTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateInterface[TContext, TEvent /* <: EventObject */] extends js.Object {
  var actions: js.Array[ActionObject[TContext, TEvent]]
  var activities: ActivityMap
  var changed: js.UndefOr[scala.Boolean] = js.undefined
  var context: TContext
  var event: OmniEventObject[TEvent]
  var events: js.Array[TEvent]
  var history: js.UndefOr[xstateLib.esStateMod.State[TContext, EventObject]] = js.undefined
  var historyValue: js.UndefOr[HistoryValue] = js.undefined
  var inert: js.Any
  var meta: js.Any
  var nextEvents: js.Array[EventType]
  var tree: js.UndefOr[xstateLib.esStateTreeMod.StateTree] = js.undefined
  var value: StateValue
  def matches(parentStateValue: StateValue): scala.Boolean
  def toStrings(): js.Array[java.lang.String]
}

object StateInterface {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    actions: js.Array[ActionObject[TContext, TEvent]],
    activities: ActivityMap,
    context: TContext,
    event: OmniEventObject[TEvent],
    events: js.Array[TEvent],
    inert: js.Any,
    matches: StateValue => scala.Boolean,
    meta: js.Any,
    nextEvents: js.Array[EventType],
    toStrings: () => js.Array[java.lang.String],
    value: StateValue,
    changed: js.UndefOr[scala.Boolean] = js.undefined,
    history: xstateLib.esStateMod.State[TContext, EventObject] = null,
    historyValue: HistoryValue = null,
    tree: xstateLib.esStateTreeMod.StateTree = null
  ): StateInterface[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(actions = actions, activities = activities, context = context.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], events = events, inert = inert, matches = js.Any.fromFunction1(matches), meta = meta, nextEvents = nextEvents, toStrings = js.Any.fromFunction0(toStrings), value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(changed)) __obj.updateDynamic("changed")(changed)
    if (history != null) __obj.updateDynamic("history")(history)
    if (historyValue != null) __obj.updateDynamic("historyValue")(historyValue)
    if (tree != null) __obj.updateDynamic("tree")(tree)
    __obj.asInstanceOf[StateInterface[TContext, TEvent]]
  }
}


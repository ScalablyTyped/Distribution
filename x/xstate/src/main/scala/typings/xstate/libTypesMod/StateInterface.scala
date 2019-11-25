package typings.xstate.libTypesMod

import typings.xstate.libStateMod.State
import typings.xstate.libStateTreeMod.StateTree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateInterface[TContext, TEvent /* <: EventObject */] extends js.Object {
  var actions: js.Array[ActionObject[TContext, TEvent]]
  var activities: ActivityMap
  var changed: js.UndefOr[Boolean] = js.undefined
  var context: TContext
  var event: OmniEventObject[TEvent]
  var events: js.Array[TEvent]
  var history: js.UndefOr[State[TContext, EventObject]] = js.undefined
  var historyValue: js.UndefOr[HistoryValue] = js.undefined
  var inert: js.Any
  var meta: js.Any
  var nextEvents: js.Array[EventType]
  var tree: js.UndefOr[StateTree] = js.undefined
  var value: StateValue
  def matches(parentStateValue: StateValue): Boolean
  def toStrings(): js.Array[String]
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
    matches: StateValue => Boolean,
    meta: js.Any,
    nextEvents: js.Array[EventType],
    toStrings: () => js.Array[String],
    value: StateValue,
    changed: js.UndefOr[Boolean] = js.undefined,
    history: State[TContext, EventObject] = null,
    historyValue: HistoryValue = null,
    tree: StateTree = null
  ): StateInterface[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], activities = activities.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], inert = inert.asInstanceOf[js.Any], matches = js.Any.fromFunction1(matches), meta = meta.asInstanceOf[js.Any], nextEvents = nextEvents.asInstanceOf[js.Any], toStrings = js.Any.fromFunction0(toStrings), value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(changed)) __obj.updateDynamic("changed")(changed.asInstanceOf[js.Any])
    if (history != null) __obj.updateDynamic("history")(history.asInstanceOf[js.Any])
    if (historyValue != null) __obj.updateDynamic("historyValue")(historyValue.asInstanceOf[js.Any])
    if (tree != null) __obj.updateDynamic("tree")(tree.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateInterface[TContext, TEvent]]
  }
}


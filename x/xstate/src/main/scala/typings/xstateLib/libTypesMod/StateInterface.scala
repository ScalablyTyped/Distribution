package typings
package xstateLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateInterface[TContext, TEvent /* <: EventObject */] extends js.Object {
  var actions: js.Array[ActionObject[TContext, TEvent]]
  var activities: ActivityMap
  var context: TContext
  var events: js.Array[TEvent]
  var history: js.UndefOr[xstateLib.libStateMod.State[TContext, EventObject]] = js.undefined
  var historyValue: js.UndefOr[HistoryValue] = js.undefined
  var meta: js.Any
  var tree: js.UndefOr[xstateLib.libStateTreeMod.StateTree] = js.undefined
  var value: StateValue
  def toStrings(): js.Array[java.lang.String]
}

object StateInterface {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    actions: js.Array[ActionObject[TContext, TEvent]],
    activities: ActivityMap,
    context: TContext,
    events: js.Array[TEvent],
    meta: js.Any,
    toStrings: () => js.Array[java.lang.String],
    value: StateValue,
    history: xstateLib.libStateMod.State[TContext, EventObject] = null,
    historyValue: HistoryValue = null,
    tree: xstateLib.libStateTreeMod.StateTree = null
  ): StateInterface[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(actions = actions, activities = activities, context = context.asInstanceOf[js.Any], events = events, meta = meta, toStrings = js.Any.fromFunction0(toStrings), value = value.asInstanceOf[js.Any])
    if (history != null) __obj.updateDynamic("history")(history)
    if (historyValue != null) __obj.updateDynamic("historyValue")(historyValue)
    if (tree != null) __obj.updateDynamic("tree")(tree)
    __obj.asInstanceOf[StateInterface[TContext, TEvent]]
  }
}


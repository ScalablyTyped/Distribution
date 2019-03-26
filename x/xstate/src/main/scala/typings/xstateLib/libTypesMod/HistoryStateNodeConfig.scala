package typings
package xstateLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoryStateNodeConfig[TContext, TEvent /* <: EventObject */] extends AtomicStateNodeConfig[TContext, TEvent] {
  @JSName("history")
  var history_HistoryStateNodeConfig: xstateLib.xstateLibStrings.shallow | xstateLib.xstateLibStrings.deep | xstateLib.xstateLibNumbers.`true`
  var target: js.UndefOr[StateValue]
}

object HistoryStateNodeConfig {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    history: xstateLib.xstateLibStrings.shallow | xstateLib.xstateLibStrings.deep | xstateLib.xstateLibNumbers.`true`,
    activities: SingleOrArray[Activity[TContext, TEvent]] = null,
    after: DelayedTransitions[TContext, TEvent] = null,
    context: TContext = null,
    data: (Mapper[TContext, TEvent]) | (PropertyMapper[TContext, TEvent]) = null,
    delimiter: java.lang.String = null,
    id: java.lang.String = null,
    initial: js.UndefOr[scala.Nothing] = js.undefined,
    invoke: InvokesConfig[TContext, TEvent] = null,
    key: java.lang.String = null,
    meta: js.Any = null,
    on: TransitionsConfig[TContext, TEvent] = null,
    onDone: js.UndefOr[scala.Nothing] = js.undefined,
    onEntry: SingleOrArray[Action[TContext, TEvent]] = null,
    onExit: SingleOrArray[Action[TContext, TEvent]] = null,
    order: scala.Int | scala.Double = null,
    parallel: xstateLib.xstateLibNumbers.`false` = null,
    parent: xstateLib.libStateNodeMod.StateNode[TContext, _, OmniEventObject[EventObject]] = null,
    states: js.UndefOr[scala.Nothing] = js.undefined,
    strict: js.UndefOr[scala.Boolean] = js.undefined,
    target: StateValue = null,
    `type`: StateTypes = null
  ): HistoryStateNodeConfig[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any])
    if (activities != null) __obj.updateDynamic("activities")(activities.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(initial)) __obj.updateDynamic("initial")(initial)
    if (invoke != null) __obj.updateDynamic("invoke")(invoke.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (on != null) __obj.updateDynamic("on")(on)
    if (!js.isUndefined(onDone)) __obj.updateDynamic("onDone")(onDone)
    if (onEntry != null) __obj.updateDynamic("onEntry")(onEntry.asInstanceOf[js.Any])
    if (onExit != null) __obj.updateDynamic("onExit")(onExit.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (parallel != null) __obj.updateDynamic("parallel")(parallel)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (!js.isUndefined(states)) __obj.updateDynamic("states")(states)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryStateNodeConfig[TContext, TEvent]]
  }
}


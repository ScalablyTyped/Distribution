package typings
package xstateLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MachineConfig[TContext, TStateSchema /* <: StateSchema */, TEvent /* <: EventObject */] extends CompoundStateNodeConfig[TContext, TStateSchema, TEvent]

object MachineConfig {
  @scala.inline
  def apply[TContext, TStateSchema /* <: StateSchema */, TEvent /* <: EventObject */](
    activities: SingleOrArray[Activity[TContext, TEvent]] = null,
    after: DelayedTransitions[TContext, TEvent] = null,
    context: TContext = null,
    data: (Mapper[TContext, TEvent]) | (PropertyMapper[TContext, TEvent]) = null,
    delimiter: java.lang.String = null,
    history: xstateLib.xstateLibStrings.shallow | xstateLib.xstateLibStrings.deep | scala.Boolean = null,
    id: java.lang.String = null,
    initial: java.lang.String = null,
    invoke: InvokesConfig[TContext, TEvent] = null,
    key: java.lang.String = null,
    meta: js.Any = null,
    on: TransitionsConfig[TContext, TEvent] = null,
    onDone: java.lang.String | (SingleOrArray[TransitionConfig[TContext, DoneEventObject]]) = null,
    onEntry: SingleOrArray[Action[TContext, TEvent]] = null,
    onExit: SingleOrArray[Action[TContext, TEvent]] = null,
    order: scala.Int | scala.Double = null,
    parallel: js.UndefOr[scala.Boolean] = js.undefined,
    parent: xstateLib.libStateNodeMod.StateNode[TContext, _, OmniEventObject[EventObject]] = null,
    states: StatesConfig[TContext, TStateSchema, TEvent] = null,
    strict: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: StateTypes = null
  ): MachineConfig[TContext, TStateSchema, TEvent] = {
    val __obj = js.Dynamic.literal()
    if (activities != null) __obj.updateDynamic("activities")(activities.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter)
    if (history != null) __obj.updateDynamic("history")(history.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (initial != null) __obj.updateDynamic("initial")(initial)
    if (invoke != null) __obj.updateDynamic("invoke")(invoke.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (on != null) __obj.updateDynamic("on")(on)
    if (onDone != null) __obj.updateDynamic("onDone")(onDone.asInstanceOf[js.Any])
    if (onEntry != null) __obj.updateDynamic("onEntry")(onEntry.asInstanceOf[js.Any])
    if (onExit != null) __obj.updateDynamic("onExit")(onExit.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (!js.isUndefined(parallel)) __obj.updateDynamic("parallel")(parallel)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (states != null) __obj.updateDynamic("states")(states)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MachineConfig[TContext, TStateSchema, TEvent]]
  }
}


package typings.xstate.libTypesMod

import typings.xstate.libStateNodeMod.StateNode
import typings.xstate.xstateStrings.deep
import typings.xstate.xstateStrings.parallel
import typings.xstate.xstateStrings.shallow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParallelMachineConfig[TContext, TStateSchema /* <: StateSchema */, TEvent /* <: EventObject */] extends CompoundStateNodeConfig[TContext, TStateSchema, TEvent] {
  @JSName("initial")
  var initial_ParallelMachineConfig: js.UndefOr[scala.Nothing] = js.undefined
  @JSName("type")
  var type_ParallelMachineConfig: js.UndefOr[parallel] = js.undefined
}

object ParallelMachineConfig {
  @scala.inline
  def apply[TContext, TStateSchema /* <: StateSchema */, TEvent /* <: EventObject */](
    activities: SingleOrArray[Activity[TContext, TEvent]] = null,
    after: DelayedTransitions[TContext, TEvent] = null,
    context: TContext = null,
    data: (Mapper[TContext, TEvent]) | (PropertyMapper[TContext, TEvent]) = null,
    delimiter: String = null,
    entry: SingleOrArray[Action[TContext, TEvent]] = null,
    exit: SingleOrArray[Action[TContext, TEvent]] = null,
    history: shallow | deep | Boolean = null,
    id: String = null,
    initial: js.UndefOr[scala.Nothing] = js.undefined,
    invoke: InvokesConfig[TContext, TEvent] = null,
    key: String = null,
    meta: js.Any = null,
    on: TransitionsConfig[TContext, TEvent] = null,
    onDone: String | (SingleOrArray[TransitionConfig[TContext, DoneEventObject]]) = null,
    onEntry: SingleOrArray[Action[TContext, TEvent]] = null,
    onExit: SingleOrArray[Action[TContext, TEvent]] = null,
    order: Int | Double = null,
    parallel: js.UndefOr[Boolean] = js.undefined,
    parent: StateNode[TContext, _, TEvent] = null,
    states: StatesConfig[TContext, TStateSchema, TEvent] = null,
    strict: js.UndefOr[Boolean] = js.undefined,
    `type`: parallel = null
  ): ParallelMachineConfig[TContext, TStateSchema, TEvent] = {
    val __obj = js.Dynamic.literal()
    if (activities != null) __obj.updateDynamic("activities")(activities.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter)
    if (entry != null) __obj.updateDynamic("entry")(entry.asInstanceOf[js.Any])
    if (exit != null) __obj.updateDynamic("exit")(exit.asInstanceOf[js.Any])
    if (history != null) __obj.updateDynamic("history")(history.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(initial)) __obj.updateDynamic("initial")(initial)
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
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ParallelMachineConfig[TContext, TStateSchema, TEvent]]
  }
}


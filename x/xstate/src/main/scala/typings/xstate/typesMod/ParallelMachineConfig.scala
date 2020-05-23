package typings.xstate.typesMod

import typings.xstate.stateNodeMod.StateNode
import typings.xstate.xstateStrings.deep
import typings.xstate.xstateStrings.parallel
import typings.xstate.xstateStrings.shallow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParallelMachineConfig[TContext, TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */] extends StateNodeConfig[TContext, TStateSchema, TEvent] {
  @JSName("initial")
  var initial_ParallelMachineConfig: js.UndefOr[scala.Nothing] = js.undefined
  @JSName("type")
  var type_ParallelMachineConfig: js.UndefOr[parallel] = js.undefined
}

object ParallelMachineConfig {
  @scala.inline
  def apply[TContext, TStateSchema, TEvent](
    activities: SingleOrArray[Activity[TContext, TEvent]] = null,
    after: DelayedTransitions[TContext, TEvent] = null,
    context: TContext | js.Function0[TContext] = null,
    data: (Mapper[TContext, TEvent]) | (PropertyMapper[TContext, TEvent]) = null,
    delimiter: String = null,
    entry: Actions[TContext, TEvent] = null,
    exit: Actions[TContext, TEvent] = null,
    history: shallow | deep | Boolean = null,
    id: String = null,
    initial: /* import warning: importer.ImportType#apply Failed type conversion: keyof TStateSchema['states'] */ js.Any = null,
    invoke: SingleOrArray[InvokeConfig[TContext, TEvent]] = null,
    key: String = null,
    meta: js.Any = null,
    on: TransitionsConfig[TContext, TEvent] = null,
    onDone: String | (SingleOrArray[TransitionConfig[TContext, DoneEventObject]]) = null,
    onEntry: Actions[TContext, TEvent] = null,
    onExit: Actions[TContext, TEvent] = null,
    order: js.UndefOr[Double] = js.undefined,
    parallel: js.UndefOr[Boolean] = js.undefined,
    parent: StateNode[TContext, _, TEvent, _] = null,
    states: StatesConfig[TContext, TStateSchema, TEvent] = null,
    strict: js.UndefOr[Boolean] = js.undefined,
    `type`: parallel = null
  ): ParallelMachineConfig[TContext, TStateSchema, TEvent] = {
    val __obj = js.Dynamic.literal()
    if (activities != null) __obj.updateDynamic("activities")(activities.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (entry != null) __obj.updateDynamic("entry")(entry.asInstanceOf[js.Any])
    if (exit != null) __obj.updateDynamic("exit")(exit.asInstanceOf[js.Any])
    if (history != null) __obj.updateDynamic("history")(history.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (initial != null) __obj.updateDynamic("initial")(initial.asInstanceOf[js.Any])
    if (invoke != null) __obj.updateDynamic("invoke")(invoke.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on.asInstanceOf[js.Any])
    if (onDone != null) __obj.updateDynamic("onDone")(onDone.asInstanceOf[js.Any])
    if (onEntry != null) __obj.updateDynamic("onEntry")(onEntry.asInstanceOf[js.Any])
    if (onExit != null) __obj.updateDynamic("onExit")(onExit.asInstanceOf[js.Any])
    if (!js.isUndefined(order)) __obj.updateDynamic("order")(order.get.asInstanceOf[js.Any])
    if (!js.isUndefined(parallel)) __obj.updateDynamic("parallel")(parallel.get.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (states != null) __obj.updateDynamic("states")(states.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParallelMachineConfig[TContext, TStateSchema, TEvent]]
  }
}


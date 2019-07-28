package typings.xstate.libTypesMod

import typings.xstate.libStateNodeMod.StateNode
import typings.xstate.xstateNumbers.`false`
import typings.xstate.xstateStrings.`final`
import typings.xstate.xstateStrings.deep
import typings.xstate.xstateStrings.shallow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FinalStateNodeConfig[TContext, TEvent /* <: EventObject */] extends AtomicStateNodeConfig[TContext, TEvent] {
  /**
    * The data to be sent with the "done.state.<id>" event. The data can be
    * static or dynamic (based on assigners).
    */
  @JSName("data")
  var data_FinalStateNodeConfig: js.UndefOr[(Assigner[TContext, TEvent]) | (PropertyAssigner[TContext, TEvent]) | js.Any] = js.undefined
  @JSName("type")
  var type_FinalStateNodeConfig: `final`
}

object FinalStateNodeConfig {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    `type`: `final`,
    activities: SingleOrArray[Activity[TContext, TEvent]] = null,
    after: DelayedTransitions[TContext, TEvent] = null,
    context: TContext = null,
    data: (Assigner[TContext, TEvent]) | (PropertyAssigner[TContext, TEvent]) | js.Any = null,
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
    onDone: js.UndefOr[scala.Nothing] = js.undefined,
    onEntry: SingleOrArray[Action[TContext, TEvent]] = null,
    onExit: SingleOrArray[Action[TContext, TEvent]] = null,
    order: Int | Double = null,
    parallel: `false` = null,
    parent: StateNode[TContext, _, TEvent] = null,
    states: js.UndefOr[scala.Nothing] = js.undefined,
    strict: js.UndefOr[Boolean] = js.undefined
  ): FinalStateNodeConfig[TContext, TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
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
    if (!js.isUndefined(onDone)) __obj.updateDynamic("onDone")(onDone)
    if (onEntry != null) __obj.updateDynamic("onEntry")(onEntry.asInstanceOf[js.Any])
    if (onExit != null) __obj.updateDynamic("onExit")(onExit.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (parallel != null) __obj.updateDynamic("parallel")(parallel)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (!js.isUndefined(states)) __obj.updateDynamic("states")(states)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    __obj.asInstanceOf[FinalStateNodeConfig[TContext, TEvent]]
  }
}


package typings.xstate.libTypesMod

import typings.xstate.libStateNodeMod.StateNode
import typings.xstate.xstateStrings.deep
import typings.xstate.xstateStrings.shallow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateNodeDefinition[TContext, TStateSchema /* <: StateSchema */, TEvent /* <: EventObject */] extends StateNodeConfig[TContext, TStateSchema, TEvent] {
  @JSName("activities")
  var activities_StateNodeDefinition: js.Array[ActivityDefinition[TContext, TEvent]]
  @JSName("data")
  var data_StateNodeDefinition: js.UndefOr[(Assigner[TContext, TEvent]) | (PropertyAssigner[TContext, TEvent]) | js.Any] = js.undefined
  @JSName("history")
  var history_StateNodeDefinition: js.UndefOr[Boolean | shallow | deep] = js.undefined
  @JSName("id")
  var id_StateNodeDefinition: String
  @JSName("initial")
  var initial_StateNodeDefinition: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: keyof TStateSchema['states'] */ js.Any
  ] = js.undefined
  @JSName("invoke")
  var invoke_StateNodeDefinition: js.Array[InvokeDefinition[TContext, TEvent]]
  @JSName("key")
  var key_StateNodeDefinition: String
  @JSName("onEntry")
  var onEntry_StateNodeDefinition: js.Array[ActionObject[TContext, TEvent]]
  @JSName("onExit")
  var onExit_StateNodeDefinition: js.Array[ActionObject[TContext, TEvent]]
  @JSName("on")
  var on_StateNodeDefinition: TransitionsDefinition[TContext, TEvent]
  @JSName("order")
  var order_StateNodeDefinition: Double
  @JSName("states")
  var states_StateNodeDefinition: StatesDefinition[TContext, TStateSchema, TEvent]
  @JSName("type")
  var type_StateNodeDefinition: StateTypes
  var version: js.UndefOr[String] = js.undefined
}

object StateNodeDefinition {
  @scala.inline
  def apply[TContext, TStateSchema /* <: StateSchema */, TEvent /* <: EventObject */](
    activities: js.Array[ActivityDefinition[TContext, TEvent]],
    id: String,
    invoke: js.Array[InvokeDefinition[TContext, TEvent]],
    key: String,
    on: TransitionsDefinition[TContext, TEvent],
    onEntry: js.Array[ActionObject[TContext, TEvent]],
    onExit: js.Array[ActionObject[TContext, TEvent]],
    order: Double,
    states: StatesDefinition[TContext, TStateSchema, TEvent],
    `type`: StateTypes,
    after: DelayedTransitions[TContext, TEvent] = null,
    context: TContext = null,
    data: (Assigner[TContext, TEvent]) | (PropertyAssigner[TContext, TEvent]) | js.Any = null,
    delimiter: String = null,
    entry: SingleOrArray[Action[TContext, TEvent]] = null,
    exit: SingleOrArray[Action[TContext, TEvent]] = null,
    history: Boolean | shallow | deep = null,
    initial: /* import warning: importer.ImportType#apply Failed type conversion: keyof TStateSchema['states'] */ js.Any = null,
    meta: js.Any = null,
    onDone: String | (SingleOrArray[TransitionConfig[TContext, DoneEventObject]]) = null,
    parallel: js.UndefOr[Boolean] = js.undefined,
    parent: StateNode[TContext, _, TEvent] = null,
    strict: js.UndefOr[Boolean] = js.undefined,
    version: String = null
  ): StateNodeDefinition[TContext, TStateSchema, TEvent] = {
    val __obj = js.Dynamic.literal(activities = activities.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], invoke = invoke.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any], onEntry = onEntry.asInstanceOf[js.Any], onExit = onExit.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (entry != null) __obj.updateDynamic("entry")(entry.asInstanceOf[js.Any])
    if (exit != null) __obj.updateDynamic("exit")(exit.asInstanceOf[js.Any])
    if (history != null) __obj.updateDynamic("history")(history.asInstanceOf[js.Any])
    if (initial != null) __obj.updateDynamic("initial")(initial.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (onDone != null) __obj.updateDynamic("onDone")(onDone.asInstanceOf[js.Any])
    if (!js.isUndefined(parallel)) __obj.updateDynamic("parallel")(parallel.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateNodeDefinition[TContext, TStateSchema, TEvent]]
  }
}


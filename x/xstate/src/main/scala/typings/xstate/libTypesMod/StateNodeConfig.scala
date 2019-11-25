package typings.xstate.libTypesMod

import typings.xstate.libStateNodeMod.StateNode
import typings.xstate.xstateStrings.deep
import typings.xstate.xstateStrings.shallow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateNodeConfig[TContext, TStateSchema /* <: StateSchema */, TEvent /* <: EventObject */] extends js.Object {
  /**
    * The activities to be started upon entering the state node,
    * and stopped upon exiting the state node.
    */
  var activities: js.UndefOr[SingleOrArray[Activity[TContext, TEvent]]] = js.undefined
  /**
    * The mapping (or array) of delays (in milliseconds) to their potential transition(s).
    * The delayed transitions are taken after the specified delay in an interpreter.
    */
  var after: js.UndefOr[DelayedTransitions[TContext, TEvent]] = js.undefined
  /**
    * The initial context (extended state) of the machine.
    */
  var context: js.UndefOr[TContext] = js.undefined
  /**
    * The data sent with the "done.state._id_" event if this is a final state node.
    *
    * The data will be evaluated with the current `context` and placed on the `.data` property
    * of the event.
    */
  var data: js.UndefOr[(Mapper[TContext, TEvent]) | (PropertyMapper[TContext, TEvent])] = js.undefined
  /**
    * The string delimiter for serializing the path to a string. The default is "."
    */
  var delimiter: js.UndefOr[String] = js.undefined
  /**
    * The action(s) to be executed upon entering the state node.
    */
  var entry: js.UndefOr[SingleOrArray[Action[TContext, TEvent]]] = js.undefined
  /**
    * The action(s) to be executed upon exiting the state node.
    */
  var exit: js.UndefOr[SingleOrArray[Action[TContext, TEvent]]] = js.undefined
  /**
    * Indicates whether the state node is a history state node, and what
    * type of history:
    * shallow, deep, true (shallow), false (none), undefined (none)
    */
  var history: js.UndefOr[shallow | deep | Boolean] = js.undefined
  /**
    * The unique ID of the state node, which can be referenced as a transition target via the
    * `#id` syntax.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * The initial state node key.
    */
  var initial: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: keyof TStateSchema['states'] */ js.Any
  ] = js.undefined
  /**
    * The services to invoke upon entering this state node. These services will be stopped upon exiting this state node.
    */
  var invoke: js.UndefOr[InvokesConfig[TContext, TEvent]] = js.undefined
  /**
    * The relative key of the state node, which represents its location in the overall state value.
    * This is automatically determined by the configuration shape via the key where it was defined.
    */
  var key: js.UndefOr[String] = js.undefined
  /**
    * The meta data associated with this state node, which will be returned in State instances.
    */
  var meta: js.UndefOr[js.Any] = js.undefined
  /**
    * The mapping of event types to their potential transition(s).
    */
  var on: js.UndefOr[TransitionsConfig[TContext, TEvent]] = js.undefined
  /**
    * The potential transition(s) to be taken upon reaching a final child state node.
    *
    * This is equivalent to defining a `[done(id)]` transition on this state node's `on` property.
    */
  var onDone: js.UndefOr[String | (SingleOrArray[TransitionConfig[TContext, DoneEventObject]])] = js.undefined
  /**
    * The action(s) to be executed upon entering the state node.
    *
    * @deprecated Use `entry` instead.
    */
  var onEntry: js.UndefOr[SingleOrArray[Action[TContext, TEvent]]] = js.undefined
  /**
    * The action(s) to be executed upon exiting the state node.
    *
    * @deprecated Use `exit` instead.
    */
  var onExit: js.UndefOr[SingleOrArray[Action[TContext, TEvent]]] = js.undefined
  /**
    * The order this state node appears. Corresponds to the implicit SCXML document order.
    */
  var order: js.UndefOr[Double] = js.undefined
  /**
    * @deprecated
    */
  var parallel: js.UndefOr[Boolean] = js.undefined
  /**
    * @private
    */
  var parent: js.UndefOr[StateNode[TContext, _, TEvent]] = js.undefined
  /**
    * The mapping of state node keys to their state node configurations (recursive).
    */
  var states: js.UndefOr[StatesConfig[TContext, TStateSchema, TEvent]] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
  /**
    * The type of this state node:
    *
    *  - `'atomic'` - no child state nodes
    *  - `'compound'` - nested child state nodes (XOR)
    *  - `'parallel'` - orthogonal nested child state nodes (AND)
    *  - `'history'` - history state node
    *  - `'final'` - final state node
    */
  var `type`: js.UndefOr[StateTypes] = js.undefined
}

object StateNodeConfig {
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
    initial: /* import warning: importer.ImportType#apply Failed type conversion: keyof TStateSchema['states'] */ js.Any = null,
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
    `type`: StateTypes = null
  ): StateNodeConfig[TContext, TStateSchema, TEvent] = {
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
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (!js.isUndefined(parallel)) __obj.updateDynamic("parallel")(parallel.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (states != null) __obj.updateDynamic("states")(states.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateNodeConfig[TContext, TStateSchema, TEvent]]
  }
}


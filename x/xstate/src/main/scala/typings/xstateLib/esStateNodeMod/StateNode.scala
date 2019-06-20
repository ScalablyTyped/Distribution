package typings
package xstateLib.esStateNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/es/StateNode", "StateNode")
@js.native
class StateNode[TContext, TStateSchema /* <: xstateLib.esTypesMod.StateSchema */, TEvent /* <: xstateLib.esTypesMod.OmniEventObject[xstateLib.esTypesMod.EventObject] */] protected () extends js.Object {
  def this(_config: xstateLib.esTypesMod.StateNodeConfig[TContext, TStateSchema, TEvent]) = this()
  def this(_config: xstateLib.esTypesMod.StateNodeConfig[TContext, TStateSchema, TEvent], options: stdLib.Partial[xstateLib.esTypesMod.MachineOptions[TContext, TEvent]]) = this()
  def this(_config: xstateLib.esTypesMod.StateNodeConfig[TContext, TStateSchema, TEvent], options: stdLib.Partial[xstateLib.esTypesMod.MachineOptions[TContext, TEvent]], /**
    * The initial extended state
    */
  context: TContext) = this()
  var __cache: js.Any = js.native
  var __xstatenode: xstateLib.xstateLibNumbers.`true` = js.native
  /**
    * Whether the state node is "transient". A state node is considered transient if it has
    * an immediate transition from a "null event" (empty string), taken upon entering the state node.
    */
  var _transient: js.Any = js.native
  var _transition: js.Any = js.native
  /**
    * The activities to be started upon entering the state node,
    * and stopped upon exiting the state node.
    */
  var activities: js.Array[xstateLib.esTypesMod.ActivityDefinition[TContext, TEvent]] = js.native
  /**
    * The delayed transitions.
    */
  var after: js.Array[xstateLib.esTypesMod.DelayedTransitionDefinition[TContext, TEvent]] = js.native
  /**
    * The raw config used to create the machine.
    */
  var config: xstateLib.esTypesMod.StateNodeConfig[TContext, TStateSchema, TEvent] = js.native
  /**
    * The initial extended state
    */
  var context: js.UndefOr[TContext] = js.native
  /**
    * The data sent with the "done.state._id_" event if this is a final state node.
    */
  var data: js.UndefOr[
    (xstateLib.esTypesMod.Mapper[TContext, TEvent]) | (xstateLib.esTypesMod.PropertyMapper[TContext, TEvent])
  ] = js.native
  /**
    * The well-structured state node definition.
    */
  val definition: xstateLib.esTypesMod.StateNodeDefinition[TContext, TStateSchema, TEvent] = js.native
  /**
    * The string delimiter for serializing the path to a string. The default is "."
    */
  var delimiter: java.lang.String = js.native
  var ensureValidPaths: js.Any = js.native
  /**
    * Whether the given state node "escapes" this state node. If the `stateNode` is equal to or the parent of
    * this state node, it does not escape.
    */
  var escapes: js.Any = js.native
  var evaluateGuard: js.Any = js.native
  /**
    * All the event types accepted by this state node and its descendants.
    */
  val events: js.Array[
    /* import warning: ImportType.apply Failed type conversion: TEvent['type'] */ js.Any
  ] = js.native
  var formatTransition: js.Any = js.native
  var formatTransitions: js.Any = js.native
  var getActions: js.Any = js.native
  /**
    * All delayed transitions from the config.
    */
  var getDelayedTransitions: js.Any = js.native
  var getResolvedPath: js.Any = js.native
  var getStateTree: js.Any = js.native
  /**
    * The type of history exhibited. Can be:
    *
    *  - `'shallow'` - recalls only top-level historical state value
    *  - `'deep'` - recalls historical state value at all levels
    */
  var history: xstateLib.xstateLibNumbers.`false` | xstateLib.xstateLibStrings.shallow | xstateLib.xstateLibStrings.deep = js.native
  var historyValue: js.Any = js.native
  /**
    * The unique ID of the state node.
    */
  var id: java.lang.String = js.native
  var idMap: js.Any = js.native
  /**
    * The initial state node key.
    */
  var initial: js.UndefOr[
    /* import warning: ImportType.apply Failed type conversion: keyof TStateSchema['states'] */ js.Any
  ] = js.native
  /**
    * The initial State instance, which includes all actions to be executed from
    * entering the initial state.
    */
  val initialState: xstateLib.esStateMod.State[TContext, TEvent] = js.native
  val initialStateNodes: js.Array[StateNode[TContext, _, TEvent]] = js.native
  val initialStateValue: js.Any = js.native
  /**
    * The services invoked by this state node.
    */
  var invoke: js.Array[xstateLib.esTypesMod.InvokeDefinition[TContext, TEvent]] = js.native
  /**
    * The relative key of the state node, which represents its location in the overall state value.
    */
  var key: java.lang.String = js.native
  /**
    * The root machine node.
    */
  var machine: StateNode[TContext, _, TEvent] = js.native
  /**
    * The meta data associated with this state node, which will be returned in State instances.
    */
  var meta: js.UndefOr[js.Any] = js.native
  var next: js.Any = js.native
  var nodesFromChild: js.Any = js.native
  /**
    * The mapping of events to transitions.
    */
  val on: xstateLib.esTypesMod.TransitionsDefinition[TContext, TEvent] = js.native
  /**
    * The action(s) to be executed upon entering the state node.
    */
  var onEntry: js.Array[xstateLib.esTypesMod.ActionObject[TContext, TEvent]] = js.native
  /**
    * The action(s) to be executed upon exiting the state node.
    */
  var onExit: js.Array[xstateLib.esTypesMod.ActionObject[TContext, TEvent]] = js.native
  var options: xstateLib.esTypesMod.MachineOptions[TContext, TEvent] = js.native
  /**
    * The order this state node appears. Corresponds to the implicit SCXML document order.
    */
  var order: scala.Double = js.native
  /**
    * All the events that have transitions directly from this state node.
    *
    * Excludes any inert events.
    */
  val ownEvents: js.Array[
    /* import warning: ImportType.apply Failed type conversion: TEvent['type'] */ js.Any
  ] = js.native
  /**
    * (DEPRECATED) Whether the state node is a parallel state node.
    *
    * Use `type: 'parallel'` instead.
    */
  var parallel: js.UndefOr[scala.Boolean] = js.native
  /**
    * The parent state node.
    */
  var parent: js.UndefOr[StateNode[TContext, _, TEvent]] = js.native
  /**
    * The string path from the root machine node to this node.
    */
  var path: js.Array[java.lang.String] = js.native
  /**
    * Resolves to the historical value(s) of the parent state node,
    * represented by state nodes.
    *
    * @param historyValue
    */
  var resolveHistory: js.Any = js.native
  var resolveTransition: js.Any = js.native
  val resolvedStateValue: js.Any = js.native
  /**
    * All the state node IDs of this state node and its descendant state nodes.
    */
  val stateIds: js.Array[java.lang.String] = js.native
  /**
    * The child state nodes.
    */
  var states: xstateLib.esTypesMod.StateNodesConfig[TContext, TStateSchema, TEvent] = js.native
  var strict: scala.Boolean = js.native
  /**
    * The target state value of the history state node, if it exists. This represents the
    * default state value to transition to if no history value exists yet.
    */
  val target: js.UndefOr[xstateLib.esTypesMod.StateValue] = js.native
  var transitionCompoundNode: js.Any = js.native
  var transitionLeafNode: js.Any = js.native
  var transitionParallelNode: js.Any = js.native
  /**
    * All the transitions that can be taken from this state node.
    */
  val transitions: js.Array[xstateLib.esTypesMod.TransitionDefinition[TContext, TEvent]] = js.native
  /**
    * The state tree represented by this state node.
    */
  val tree: js.Any = js.native
  /**
    * The type of this state node:
    *
    *  - `'atomic'` - no child state nodes
    *  - `'compound'` - nested child state nodes (XOR)
    *  - `'parallel'` - orthogonal nested child state nodes (AND)
    *  - `'history'` - history state node
    *  - `'final'` - final state node
    */
  var `type`: xstateLib.esTypesMod.StateTypes = js.native
  /**
    * The machine's own version.
    */
  var version: js.UndefOr[java.lang.String] = js.native
  /**
    * Retrieves state nodes from a relative path to this state node.
    *
    * @param relativePath The relative path from this state node
    * @param historyValue
    */
  def getFromRelativePath(relativePath: js.Array[java.lang.String]): js.Array[StateNode[TContext, _, TEvent]] = js.native
  def getFromRelativePath(relativePath: js.Array[java.lang.String], historyValue: xstateLib.esTypesMod.HistoryValue): js.Array[StateNode[TContext, _, TEvent]] = js.native
  def getInitialState(stateValue: xstateLib.esTypesMod.StateValue): xstateLib.esStateMod.State[TContext, TEvent] = js.native
  def getInitialState(stateValue: xstateLib.esTypesMod.StateValue, context: TContext): xstateLib.esStateMod.State[TContext, TEvent] = js.native
  /**
    * Returns the leaf nodes from a state path relative to this state node.
    *
    * @param relativeStateId The relative state path to retrieve the state nodes
    * @param history The previous state to retrieve history
    * @param resolve Whether state nodes should resolve to initial child state nodes
    */
  def getRelativeStateNodes(relativeStateId: java.lang.String): js.Array[StateNode[TContext, _, TEvent]] = js.native
  def getRelativeStateNodes(relativeStateId: java.lang.String, historyValue: xstateLib.esTypesMod.HistoryValue): js.Array[StateNode[TContext, _, TEvent]] = js.native
  def getRelativeStateNodes(
    relativeStateId: java.lang.String,
    historyValue: xstateLib.esTypesMod.HistoryValue,
    resolve: scala.Boolean
  ): js.Array[StateNode[TContext, _, TEvent]] = js.native
  def getRelativeStateNodes(relativeStateId: js.Array[java.lang.String]): js.Array[StateNode[TContext, _, TEvent]] = js.native
  def getRelativeStateNodes(relativeStateId: js.Array[java.lang.String], historyValue: xstateLib.esTypesMod.HistoryValue): js.Array[StateNode[TContext, _, TEvent]] = js.native
  def getRelativeStateNodes(
    relativeStateId: js.Array[java.lang.String],
    historyValue: xstateLib.esTypesMod.HistoryValue,
    resolve: scala.Boolean
  ): js.Array[StateNode[TContext, _, TEvent]] = js.native
  /**
    * Returns the child state node from its relative `stateKey`, or throws.
    */
  def getStateNode(stateKey: java.lang.String): StateNode[TContext, _, TEvent] = js.native
  /**
    * Returns the state node with the given `stateId`, or throws.
    *
    * @param stateId The state ID. The prefix "#" is removed.
    */
  def getStateNodeById(stateId: java.lang.String): StateNode[TContext, _, TEvent] = js.native
  /**
    * Returns the relative state node from the given `statePath`, or throws.
    *
    * @param statePath The string or string array relative path to the state node.
    */
  def getStateNodeByPath(statePath: java.lang.String): StateNode[TContext, _, TEvent] = js.native
  def getStateNodeByPath(statePath: js.Array[java.lang.String]): StateNode[TContext, _, TEvent] = js.native
  def getStateNodes(state: xstateLib.esStateMod.State[TContext, TEvent]): js.Array[StateNode[TContext, _, TEvent]] = js.native
  /**
    * Returns the state nodes represented by the current state value.
    *
    * @param state The state value or State instance
    */
  def getStateNodes(state: xstateLib.esTypesMod.StateValue): js.Array[StateNode[TContext, _, TEvent]] = js.native
  def getStates(stateValue: xstateLib.esTypesMod.StateValue): js.Array[
    StateNode[TContext, _, xstateLib.esTypesMod.OmniEventObject[xstateLib.esTypesMod.EventObject]]
  ] = js.native
  /**
    * Returns `true` if this state node explicitly handles the given event.
    *
    * @param event The event in question
    */
  def handles(event: xstateLib.esTypesMod.Event[TEvent]): scala.Boolean = js.native
  /**
    * Resolves a partial state value with its full representation in this machine.
    *
    * @param stateValue The partial state value to resolve.
    */
  def resolve(stateValue: xstateLib.esTypesMod.StateValue): xstateLib.esTypesMod.StateValue = js.native
  /**
    * Resolves the given `state` to a new `State` instance relative to this machine.
    *
    * This ensures that `.events` and `.nextEvents` represent the correct values.
    *
    * @param state The state to resolve
    */
  def resolveState(state: xstateLib.esStateMod.State[TContext, TEvent]): xstateLib.esStateMod.State[TContext, TEvent] = js.native
  def toJSON(): xstateLib.esTypesMod.StateNodeDefinition[TContext, TStateSchema, TEvent] = js.native
  def transition(state: xstateLib.esStateMod.State[TContext, TEvent], event: xstateLib.esTypesMod.OmniEvent[TEvent]): xstateLib.esStateMod.State[TContext, TEvent] = js.native
  def transition(
    state: xstateLib.esStateMod.State[TContext, TEvent],
    event: xstateLib.esTypesMod.OmniEvent[TEvent],
    context: TContext
  ): xstateLib.esStateMod.State[TContext, TEvent] = js.native
  /**
    * Determines the next state given the current `state` and sent `event`.
    *
    * @param state The current State instance or state value
    * @param event The event that was sent at the current state
    * @param context The current context (extended state) of the current state
    */
  def transition(state: xstateLib.esTypesMod.StateValue, event: xstateLib.esTypesMod.OmniEvent[TEvent]): xstateLib.esStateMod.State[TContext, TEvent] = js.native
  def transition(
    state: xstateLib.esTypesMod.StateValue,
    event: xstateLib.esTypesMod.OmniEvent[TEvent],
    context: TContext
  ): xstateLib.esStateMod.State[TContext, TEvent] = js.native
  /**
    * Clones this state machine with custom options and context.
    *
    * @param options Options (actions, guards, activities, services) to recursively merge with the existing options.
    * @param context Custom context (will override predefined context)
    */
  def withConfig(options: stdLib.Partial[xstateLib.esTypesMod.MachineOptions[TContext, TEvent]]): StateNode[TContext, TStateSchema, TEvent] = js.native
  def withConfig(options: stdLib.Partial[xstateLib.esTypesMod.MachineOptions[TContext, TEvent]], context: TContext): StateNode[TContext, TStateSchema, TEvent] = js.native
  /**
    * Clones this state machine with custom context.
    *
    * @param context Custom context (will override predefined context, not recursive)
    */
  def withContext(context: TContext): StateNode[TContext, TStateSchema, TEvent] = js.native
}


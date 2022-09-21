package typings.xstate

import typings.xstate.anon.ContextTContext
import typings.xstate.anon.Key
import typings.xstate.stateMod.State
import typings.xstate.typegenTypesMod.TypegenDisabled
import typings.xstate.typesMod.ActionObject
import typings.xstate.typesMod.ActivityDefinition
import typings.xstate.typesMod.BaseActionObject
import typings.xstate.typesMod.DelayedTransitionDefinition
import typings.xstate.typesMod.Event
import typings.xstate.typesMod.EventObject
import typings.xstate.typesMod.HistoryValue
import typings.xstate.typesMod.InternalMachineOptions
import typings.xstate.typesMod.InvokeDefinition
import typings.xstate.typesMod.MachineOptions
import typings.xstate.typesMod.MachineSchema
import typings.xstate.typesMod.Mapper
import typings.xstate.typesMod.PredictableActionArgumentsExec
import typings.xstate.typesMod.Prop
import typings.xstate.typesMod.PropertyMapper
import typings.xstate.typesMod.ServiceMap
import typings.xstate.typesMod.StateConfig
import typings.xstate.typesMod.StateNodeConfig
import typings.xstate.typesMod.StateNodeDefinition
import typings.xstate.typesMod.StateNodesConfig
import typings.xstate.typesMod.StateSchema
import typings.xstate.typesMod.StateTransition
import typings.xstate.typesMod.StateValue
import typings.xstate.typesMod.TransitionDefinition
import typings.xstate.typesMod.TransitionDefinitionMap
import typings.xstate.typesMod.Typestate
import typings.xstate.xstateBooleans.`false`
import typings.xstate.xstateBooleans.`true`
import typings.xstate.xstateStrings.`final`
import typings.xstate.xstateStrings.atomic
import typings.xstate.xstateStrings.compound
import typings.xstate.xstateStrings.deep
import typings.xstate.xstateStrings.history
import typings.xstate.xstateStrings.missingImplementations
import typings.xstate.xstateStrings.parallel
import typings.xstate.xstateStrings.resolved
import typings.xstate.xstateStrings.shallow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stateNodeMod {
  
  @JSImport("xstate/lib/StateNode", "StateNode")
  @js.native
  open class StateNode[TContext, TStateSchema /* <: StateSchema[Any] */, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */, TServiceMap /* <: ServiceMap */, TResolvedTypesMeta] protected () extends StObject {
    def this(/**
      * The raw config used to create the machine.
      */
    config: StateNodeConfig[TContext, TStateSchema, TEvent, BaseActionObject]) = this()
    def this(
      /**
      * The raw config used to create the machine.
      */
    config: StateNodeConfig[TContext, TStateSchema, TEvent, BaseActionObject],
      options: MachineOptions[TContext, TEvent, BaseActionObject, ServiceMap, TypegenDisabled]
    ) = this()
    def this(
      /**
      * The raw config used to create the machine.
      */
    config: StateNodeConfig[TContext, TStateSchema, TEvent, BaseActionObject],
      options: Unit,
      /**
      * The initial extended state
      */
    _context: TContext
    ) = this()
    def this(
      /**
      * The raw config used to create the machine.
      */
    config: StateNodeConfig[TContext, TStateSchema, TEvent, BaseActionObject],
      options: Unit,
      /**
      * The initial extended state
      */
    _context: js.Function0[TContext]
    ) = this()
    def this(
      /**
      * The raw config used to create the machine.
      */
    config: StateNodeConfig[TContext, TStateSchema, TEvent, BaseActionObject],
      options: MachineOptions[TContext, TEvent, BaseActionObject, ServiceMap, TypegenDisabled],
      /**
      * The initial extended state
      */
    _context: TContext
    ) = this()
    def this(
      /**
      * The raw config used to create the machine.
      */
    config: StateNodeConfig[TContext, TStateSchema, TEvent, BaseActionObject],
      options: MachineOptions[TContext, TEvent, BaseActionObject, ServiceMap, TypegenDisabled],
      /**
      * The initial extended state
      */
    _context: js.Function0[TContext]
    ) = this()
    def this(
      /**
      * The raw config used to create the machine.
      */
    config: StateNodeConfig[TContext, TStateSchema, TEvent, BaseActionObject],
      options: Unit,
      /**
      * The initial extended state
      */
    _context: TContext,
      // TODO: this is unsafe, but we're removing it in v5 anyway
    _stateInfo: Key
    ) = this()
    def this(
      /**
      * The raw config used to create the machine.
      */
    config: StateNodeConfig[TContext, TStateSchema, TEvent, BaseActionObject],
      options: Unit,
      /**
      * The initial extended state
      */
    _context: js.Function0[TContext],
      // TODO: this is unsafe, but we're removing it in v5 anyway
    _stateInfo: Key
    ) = this()
    def this(
      /**
      * The raw config used to create the machine.
      */
    config: StateNodeConfig[TContext, TStateSchema, TEvent, BaseActionObject],
      options: Unit,
      /**
      * The initial extended state
      */
    _context: Unit,
      // TODO: this is unsafe, but we're removing it in v5 anyway
    _stateInfo: Key
    ) = this()
    def this(
      /**
      * The raw config used to create the machine.
      */
    config: StateNodeConfig[TContext, TStateSchema, TEvent, BaseActionObject],
      options: MachineOptions[TContext, TEvent, BaseActionObject, ServiceMap, TypegenDisabled],
      /**
      * The initial extended state
      */
    _context: TContext,
      // TODO: this is unsafe, but we're removing it in v5 anyway
    _stateInfo: Key
    ) = this()
    def this(
      /**
      * The raw config used to create the machine.
      */
    config: StateNodeConfig[TContext, TStateSchema, TEvent, BaseActionObject],
      options: MachineOptions[TContext, TEvent, BaseActionObject, ServiceMap, TypegenDisabled],
      /**
      * The initial extended state
      */
    _context: js.Function0[TContext],
      // TODO: this is unsafe, but we're removing it in v5 anyway
    _stateInfo: Key
    ) = this()
    def this(
      /**
      * The raw config used to create the machine.
      */
    config: StateNodeConfig[TContext, TStateSchema, TEvent, BaseActionObject],
      options: MachineOptions[TContext, TEvent, BaseActionObject, ServiceMap, TypegenDisabled],
      /**
      * The initial extended state
      */
    _context: Unit,
      // TODO: this is unsafe, but we're removing it in v5 anyway
    _stateInfo: Key
    ) = this()
    
    /* private */ var __cache: Any = js.native
    
    var __xstatenode: `true` = js.native
    
    /**
      * The initial extended state
      */
    /* private */ var _context: Any = js.native
    
    /* private */ var _init: Any = js.native
    
    /**
      * Whether the state node is "transient". A state node is considered transient if it has
      * an immediate transition from a "null event" (empty string), taken upon entering the state node.
      */
    /* private */ var _transient: Any = js.native
    
    /* private */ var _transition: Any = js.native
    
    /**
      * The activities to be started upon entering the state node,
      * and stopped upon exiting the state node.
      */
    var activities: js.Array[ActivityDefinition[TContext, TEvent]] = js.native
    
    def after: js.Array[DelayedTransitionDefinition[TContext, TEvent]] = js.native
    
    /**
      * The raw config used to create the machine.
      */
    var config: StateNodeConfig[TContext, TStateSchema, TEvent, BaseActionObject] = js.native
    
    def context: TContext = js.native
    
    /**
      * The well-structured state node definition.
      */
    def definition: StateNodeDefinition[TContext, TStateSchema, TEvent] = js.native
    
    /**
      * The string delimiter for serializing the path to a string. The default is "."
      */
    var delimiter: String = js.native
    
    var description: js.UndefOr[String] = js.native
    
    /**
      * The data sent with the "done.state._id_" event if this is a final state node.
      */
    var doneData: js.UndefOr[(Mapper[TContext, TEvent, Any]) | (PropertyMapper[TContext, TEvent, Any])] = js.native
    
    /**
      * All the event types accepted by this state node and its descendants.
      */
    def events: js.Array[
        /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any
      ] = js.native
    
    /* private */ var formatTransition: Any = js.native
    
    /* private */ var formatTransitions: Any = js.native
    
    /* private */ var getActions: Any = js.native
    
    /* private */ var getCandidates: Any = js.native
    
    /**
      * All delayed transitions from the config.
      */
    /* private */ var getDelayedTransitions: Any = js.native
    
    /* private */ var getExternalReentryNodes: Any = js.native
    
    /**
      * Retrieves state nodes from a relative path to this state node.
      *
      * @param relativePath The relative path from this state node
      * @param historyValue
      */
    def getFromRelativePath(relativePath: js.Array[String]): js.Array[StateNode[TContext, Any, TEvent, Any, Any, Any]] = js.native
    
    def getInitialState(stateValue: StateValue): State[TContext, TEvent, TStateSchema, TTypestate, TResolvedTypesMeta] = js.native
    def getInitialState(stateValue: StateValue, context: TContext): State[TContext, TEvent, TStateSchema, TTypestate, TResolvedTypesMeta] = js.native
    
    /**
      * Returns the leaf nodes from a state path relative to this state node.
      *
      * @param relativeStateId The relative state path to retrieve the state nodes
      * @param history The previous state to retrieve history
      * @param resolve Whether state nodes should resolve to initial child state nodes
      */
    def getRelativeStateNodes(
      relativeStateId: StateNode[TContext, Any, TEvent, ContextTContext[TContext], ServiceMap, TypegenDisabled]
    ): js.Array[
        StateNode[TContext, Any, TEvent, ContextTContext[TContext], ServiceMap, TypegenDisabled]
      ] = js.native
    def getRelativeStateNodes(
      relativeStateId: StateNode[TContext, Any, TEvent, ContextTContext[TContext], ServiceMap, TypegenDisabled],
      historyValue: Unit,
      resolve: Boolean
    ): js.Array[
        StateNode[TContext, Any, TEvent, ContextTContext[TContext], ServiceMap, TypegenDisabled]
      ] = js.native
    def getRelativeStateNodes(
      relativeStateId: StateNode[TContext, Any, TEvent, ContextTContext[TContext], ServiceMap, TypegenDisabled],
      historyValue: HistoryValue
    ): js.Array[
        StateNode[TContext, Any, TEvent, ContextTContext[TContext], ServiceMap, TypegenDisabled]
      ] = js.native
    def getRelativeStateNodes(
      relativeStateId: StateNode[TContext, Any, TEvent, ContextTContext[TContext], ServiceMap, TypegenDisabled],
      historyValue: HistoryValue,
      resolve: Boolean
    ): js.Array[
        StateNode[TContext, Any, TEvent, ContextTContext[TContext], ServiceMap, TypegenDisabled]
      ] = js.native
    
    /* private */ var getResolvedPath: Any = js.native
    
    /**
      * Returns the child state node from its relative `stateKey`, or throws.
      */
    def getStateNode(stateKey: String): StateNode[TContext, Any, TEvent, TTypestate, TServiceMap, TResolvedTypesMeta] = js.native
    
    /**
      * Returns the state node with the given `stateId`, or throws.
      *
      * @param stateId The state ID. The prefix "#" is removed.
      */
    def getStateNodeById(stateId: String): StateNode[TContext, Any, TEvent, Any, TServiceMap, TResolvedTypesMeta] = js.native
    
    /**
      * Returns the relative state node from the given `statePath`, or throws.
      *
      * @param statePath The string or string array relative path to the state node.
      */
    def getStateNodeByPath(statePath: String): StateNode[TContext, Any, TEvent, Any, Any, Any] = js.native
    def getStateNodeByPath(statePath: js.Array[String]): StateNode[TContext, Any, TEvent, Any, Any, Any] = js.native
    
    def getStateNodes(state: State[TContext, TEvent, Any, TTypestate, TResolvedTypesMeta]): js.Array[StateNode[TContext, Any, TEvent, TTypestate, TServiceMap, TResolvedTypesMeta]] = js.native
    /**
      * Returns the state nodes represented by the current state value.
      *
      * @param state The state value or State instance
      */
    def getStateNodes(state: StateValue): js.Array[StateNode[TContext, Any, TEvent, TTypestate, TServiceMap, TResolvedTypesMeta]] = js.native
    
    def getTransitionData(state: State[TContext, TEvent, Any, Any, Any], event: Event[TEvent]): js.UndefOr[StateTransition[TContext, TEvent]] = js.native
    def getTransitionData(state: State[TContext, TEvent, Any, Any, Any], event: typings.xstate.typesMod.SCXML.Event[TEvent]): js.UndefOr[StateTransition[TContext, TEvent]] = js.native
    
    /**
      * Returns `true` if this state node explicitly handles the given event.
      *
      * @param event The event in question
      */
    def handles(event: Event[TEvent]): Boolean = js.native
    
    /**
      * The type of history on this state node. Can be:
      *
      *  - `'shallow'` - recalls only top-level historical state value
      *  - `'deep'` - recalls historical state value at all levels
      */
    var history: `false` | shallow | deep = js.native
    
    /* private */ var historyValue: Any = js.native
    
    /**
      * The unique ID of the state node.
      */
    var id: String = js.native
    
    /* private */ var idMap: Any = js.native
    
    /**
      * The initial state node key.
      */
    var initial: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: keyof TStateSchema['states'] */ js.Any
      ] = js.native
    
    /**
      * The initial State instance, which includes all actions to be executed from
      * entering the initial state.
      */
    def initialState: State[TContext, TEvent, TStateSchema, TTypestate, TResolvedTypesMeta] = js.native
    
    def initialStateNodes: js.Array[StateNode[TContext, Any, TEvent, Any, Any, Any]] = js.native
    
    /* private */ def initialStateValue: Any = js.native
    
    /**
      * The services invoked by this state node.
      */
    var invoke: js.Array[InvokeDefinition[TContext, TEvent]] = js.native
    
    /**
      * The relative key of the state node, which represents its location in the overall state value.
      */
    var key: String = js.native
    
    /**
      * The root machine node.
      */
    var machine: StateNode[TContext, Any, TEvent, TTypestate, ServiceMap, TypegenDisabled] = js.native
    
    /**
      * The meta data associated with this state node, which will be returned in State instances.
      */
    var meta: js.UndefOr[Any] = js.native
    
    /* private */ var next: Any = js.native
    
    /**
      * The mapping of events to transitions.
      */
    def on: TransitionDefinitionMap[TContext, TEvent] = js.native
    
    /**
      * The action(s) to be executed upon entering the state node.
      */
    var onEntry: js.Array[ActionObject[TContext, TEvent]] = js.native
    
    /**
      * The action(s) to be executed upon exiting the state node.
      */
    var onExit: js.Array[ActionObject[TContext, TEvent]] = js.native
    
    var options: MachineOptions[TContext, TEvent, BaseActionObject, ServiceMap, TypegenDisabled] = js.native
    
    /**
      * The order this state node appears. Corresponds to the implicit SCXML document order.
      */
    var order: Double = js.native
    
    /**
      * All the events that have transitions directly from this state node.
      *
      * Excludes any inert events.
      */
    def ownEvents: js.Array[
        /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any
      ] = js.native
    
    /**
      * (DEPRECATED) Whether the state node is a parallel state node.
      *
      * Use `type: 'parallel'` instead.
      */
    var parallel: js.UndefOr[Boolean] = js.native
    
    /**
      * The parent state node.
      */
    var parent: js.UndefOr[StateNode[TContext, Any, TEvent, Any, Any, Any]] = js.native
    
    /**
      * The string path from the root machine node to this node.
      */
    var path: js.Array[String] = js.native
    
    /**
      * Resolves a partial state value with its full representation in this machine.
      *
      * @param stateValue The partial state value to resolve.
      */
    def resolve(stateValue: StateValue): StateValue = js.native
    
    /**
      * Resolves to the historical value(s) of the parent state node,
      * represented by state nodes.
      *
      * @param historyValue
      */
    /* private */ var resolveHistory: Any = js.native
    
    /* private */ var resolveRaisedTransition: Any = js.native
    
    /**
      * Resolves the given `state` to a new `State` instance relative to this machine.
      *
      * This ensures that `.events` and `.nextEvents` represent the correct values.
      *
      * @param state The state to resolve
      */
    def resolveState(state: State[TContext, TEvent, Any, Any, TypegenDisabled]): State[TContext, TEvent, TStateSchema, TTypestate, TResolvedTypesMeta] = js.native
    def resolveState(state: StateConfig[TContext, TEvent]): State[TContext, TEvent, TStateSchema, TTypestate, TResolvedTypesMeta] = js.native
    
    /* private */ var resolveTarget: Any = js.native
    
    /* private */ var resolveTransition: Any = js.native
    
    var schema: MachineSchema[TContext, TEvent, ServiceMap] = js.native
    
    /**
      * All the state node IDs of this state node and its descendant state nodes.
      */
    def stateIds: js.Array[String] = js.native
    
    /**
      * The child state nodes.
      */
    var states: StateNodesConfig[TContext, TStateSchema, TEvent] = js.native
    
    var strict: Boolean = js.native
    
    var tags: js.Array[String] = js.native
    
    /**
      * The target state value of the history state node, if it exists. This represents the
      * default state value to transition to if no history value exists yet.
      */
    def target: js.UndefOr[StateValue] = js.native
    
    def toJSON(): StateNodeDefinition[TContext, TStateSchema, TEvent] = js.native
    
    def transition(state: Unit, event: Event[TEvent]): State[TContext, TEvent, TStateSchema, TTypestate, TResolvedTypesMeta] = js.native
    def transition(state: Unit, event: Event[TEvent], context: TContext): State[TContext, TEvent, TStateSchema, TTypestate, TResolvedTypesMeta] = js.native
    def transition(state: Unit, event: Event[TEvent], context: TContext, exec: PredictableActionArgumentsExec): State[TContext, TEvent, TStateSchema, TTypestate, TResolvedTypesMeta] = js.native
    def transition(state: Unit, event: Event[TEvent], context: Unit, exec: PredictableActionArgumentsExec): State[TContext, TEvent, TStateSchema, TTypestate, TResolvedTypesMeta] = js.native
    def transition(state: Unit, event: typings.xstate.typesMod.SCXML.Event[TEvent]): State[TContext, TEvent, TStateSchema, TTypestate, TResolvedTypesMeta] = js.native
    def transition(state: Unit, event: typings.xstate.typesMod.SCXML.Event[TEvent], context: TContext): State[TContext, TEvent, TStateSchema, TTypestate, TResolvedTypesMeta] = js.native
    def transition(
      state: Unit,
      event: typings.xstate.typesMod.SCXML.Event[TEvent],
      context: TContext,
      exec: PredictableActionArgumentsExec
    ): State[TContext, TEvent, TStateSchema, TTypestate, TResolvedTypesMeta] = js.native
    def transition(
      state: Unit,
      event: typings.xstate.typesMod.SCXML.Event[TEvent],
      context: Unit,
      exec: PredictableActionArgumentsExec
    ): State[TContext, TEvent, TStateSchema, TTypestate, TResolvedTypesMeta] = js.native
    def transition(state: State[TContext, TEvent, Any, TTypestate, TResolvedTypesMeta], event: Event[TEvent]): State[TContext, TEvent, TStateSchema, TTypestate, TResolvedTypesMeta] = js.native
    def transition(
      state: State[TContext, TEvent, Any, TTypestate, TResolvedTypesMeta],
      event: Event[TEvent],
      context: TContext
    ): State[TContext, TEvent, TStateSchema, TTypestate, TResolvedTypesMeta] = js.native
    def transition(
      state: State[TContext, TEvent, Any, TTypestate, TResolvedTypesMeta],
      event: Event[TEvent],
      context: TContext,
      exec: PredictableActionArgumentsExec
    ): State[TContext, TEvent, TStateSchema, TTypestate, TResolvedTypesMeta] = js.native
    def transition(
      state: State[TContext, TEvent, Any, TTypestate, TResolvedTypesMeta],
      event: Event[TEvent],
      context: Unit,
      exec: PredictableActionArgumentsExec
    ): State[TContext, TEvent, TStateSchema, TTypestate, TResolvedTypesMeta] = js.native
    def transition(
      state: State[TContext, TEvent, Any, TTypestate, TResolvedTypesMeta],
      event: typings.xstate.typesMod.SCXML.Event[TEvent]
    ): State[TContext, TEvent, TStateSchema, TTypestate, TResolvedTypesMeta] = js.native
    def transition(
      state: State[TContext, TEvent, Any, TTypestate, TResolvedTypesMeta],
      event: typings.xstate.typesMod.SCXML.Event[TEvent],
      context: TContext
    ): State[TContext, TEvent, TStateSchema, TTypestate, TResolvedTypesMeta] = js.native
    def transition(
      state: State[TContext, TEvent, Any, TTypestate, TResolvedTypesMeta],
      event: typings.xstate.typesMod.SCXML.Event[TEvent],
      context: TContext,
      exec: PredictableActionArgumentsExec
    ): State[TContext, TEvent, TStateSchema, TTypestate, TResolvedTypesMeta] = js.native
    def transition(
      state: State[TContext, TEvent, Any, TTypestate, TResolvedTypesMeta],
      event: typings.xstate.typesMod.SCXML.Event[TEvent],
      context: Unit,
      exec: PredictableActionArgumentsExec
    ): State[TContext, TEvent, TStateSchema, TTypestate, TResolvedTypesMeta] = js.native
    /**
      * Determines the next state given the current `state` and sent `event`.
      *
      * @param state The current State instance or state value
      * @param event The event that was sent at the current state
      * @param context The current context (extended state) of the current state
      */
    def transition(state: StateValue, event: Event[TEvent]): State[TContext, TEvent, TStateSchema, TTypestate, TResolvedTypesMeta] = js.native
    def transition(state: StateValue, event: Event[TEvent], context: TContext): State[TContext, TEvent, TStateSchema, TTypestate, TResolvedTypesMeta] = js.native
    def transition(state: StateValue, event: Event[TEvent], context: TContext, exec: PredictableActionArgumentsExec): State[TContext, TEvent, TStateSchema, TTypestate, TResolvedTypesMeta] = js.native
    def transition(state: StateValue, event: Event[TEvent], context: Unit, exec: PredictableActionArgumentsExec): State[TContext, TEvent, TStateSchema, TTypestate, TResolvedTypesMeta] = js.native
    def transition(state: StateValue, event: typings.xstate.typesMod.SCXML.Event[TEvent]): State[TContext, TEvent, TStateSchema, TTypestate, TResolvedTypesMeta] = js.native
    def transition(state: StateValue, event: typings.xstate.typesMod.SCXML.Event[TEvent], context: TContext): State[TContext, TEvent, TStateSchema, TTypestate, TResolvedTypesMeta] = js.native
    def transition(
      state: StateValue,
      event: typings.xstate.typesMod.SCXML.Event[TEvent],
      context: TContext,
      exec: PredictableActionArgumentsExec
    ): State[TContext, TEvent, TStateSchema, TTypestate, TResolvedTypesMeta] = js.native
    def transition(
      state: StateValue,
      event: typings.xstate.typesMod.SCXML.Event[TEvent],
      context: Unit,
      exec: PredictableActionArgumentsExec
    ): State[TContext, TEvent, TStateSchema, TTypestate, TResolvedTypesMeta] = js.native
    
    /* private */ var transitionCompoundNode: Any = js.native
    
    /* private */ var transitionLeafNode: Any = js.native
    
    /* private */ var transitionParallelNode: Any = js.native
    
    /**
      * All the transitions that can be taken from this state node.
      */
    def transitions: js.Array[TransitionDefinition[TContext, TEvent]] = js.native
    
    /**
      * The type of this state node:
      *
      *  - `'atomic'` - no child state nodes
      *  - `'compound'` - nested child state nodes (XOR)
      *  - `'parallel'` - orthogonal nested child state nodes (AND)
      *  - `'history'` - history state node
      *  - `'final'` - final state node
      */
    var `type`: atomic | compound | parallel | `final` | history = js.native
    
    /**
      * The machine's own version.
      */
    var version: js.UndefOr[String] = js.native
    
    /**
      * Clones this state machine with custom options and context.
      *
      * @param options Options (actions, guards, activities, services) to recursively merge with the existing options.
      * @param context Custom context (will override predefined context)
      */
    def withConfig(
      options: InternalMachineOptions[
          TContext, 
          TEvent, 
          TResolvedTypesMeta, 
          `true`, 
          Prop[Prop[TResolvedTypesMeta, resolved], missingImplementations]
        ]
    ): StateNode[TContext, TStateSchema, TEvent, TTypestate, TServiceMap, TResolvedTypesMeta] = js.native
    def withConfig(
      options: InternalMachineOptions[
          TContext, 
          TEvent, 
          TResolvedTypesMeta, 
          `true`, 
          Prop[Prop[TResolvedTypesMeta, resolved], missingImplementations]
        ],
      context: TContext
    ): StateNode[TContext, TStateSchema, TEvent, TTypestate, TServiceMap, TResolvedTypesMeta] = js.native
    def withConfig(
      options: InternalMachineOptions[
          TContext, 
          TEvent, 
          TResolvedTypesMeta, 
          `true`, 
          Prop[Prop[TResolvedTypesMeta, resolved], missingImplementations]
        ],
      context: js.Function0[TContext]
    ): StateNode[TContext, TStateSchema, TEvent, TTypestate, TServiceMap, TResolvedTypesMeta] = js.native
    
    /**
      * Clones this state machine with custom context.
      *
      * @param context Custom context (will override predefined context, not recursive)
      */
    def withContext(context: TContext): StateNode[TContext, TStateSchema, TEvent, TTypestate, ServiceMap, TypegenDisabled] = js.native
    def withContext(context: js.Function0[TContext]): StateNode[TContext, TStateSchema, TEvent, TTypestate, ServiceMap, TypegenDisabled] = js.native
  }
}

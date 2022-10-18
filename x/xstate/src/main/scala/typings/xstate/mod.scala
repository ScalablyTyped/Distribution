package typings.xstate

import org.scalablytyped.runtime.StringDictionary
import typings.std.Omit
import typings.std.Partial
import typings.xstate.anon.Clock
import typings.xstate.anon.Context
import typings.xstate.anon.FnCall
import typings.xstate.anon.Id
import typings.xstate.anon.Key
import typings.xstate.anon.Type
import typings.xstate.anon.TypeUpdate
import typings.xstate.anon.Value
import typings.xstate.libActionsMod.InferEvent
import typings.xstate.libBehaviorsMod.SpawnBehaviorOptions
import typings.xstate.libInterpreterMod.SpawnOptions
import typings.xstate.libMatchMod.StatePatternTuple
import typings.xstate.libMatchMod.ValueFromStateGetter
import typings.xstate.libTypegenTypesMod.ResolveTypegenMeta
import typings.xstate.libTypegenTypesMod.TypegenConstraint
import typings.xstate.libTypegenTypesMod.TypegenDisabled
import typings.xstate.libTypesMod.Action
import typings.xstate.libTypesMod.ActionFunction
import typings.xstate.libTypesMod.ActionFunctionMap
import typings.xstate.libTypesMod.ActionObject
import typings.xstate.libTypesMod.ActionType
import typings.xstate.libTypesMod.ActivityActionObject
import typings.xstate.libTypesMod.ActivityDefinition
import typings.xstate.libTypesMod.ActorRef
import typings.xstate.libTypesMod.ActorRefFrom
import typings.xstate.libTypesMod.AnyActorRef
import typings.xstate.libTypesMod.AnyEventObject
import typings.xstate.libTypesMod.AssignAction
import typings.xstate.libTypesMod.Assigner
import typings.xstate.libTypesMod.BaseActionObject
import typings.xstate.libTypesMod.BaseActorRef
import typings.xstate.libTypesMod.Behavior
import typings.xstate.libTypesMod.CancelAction
import typings.xstate.libTypesMod.Cast
import typings.xstate.libTypesMod.ChooseAction
import typings.xstate.libTypesMod.ChooseCondition
import typings.xstate.libTypesMod.DelayFunctionMap
import typings.xstate.libTypesMod.DoneEvent
import typings.xstate.libTypesMod.DoneEventObject
import typings.xstate.libTypesMod.ErrorPlatformEvent
import typings.xstate.libTypesMod.EventData
import typings.xstate.libTypesMod.EventFrom
import typings.xstate.libTypesMod.EventObject
import typings.xstate.libTypesMod.Expr
import typings.xstate.libTypesMod.ExprWithMeta
import typings.xstate.libTypesMod.InternalMachineOptions
import typings.xstate.libTypesMod.InterpreterOptions
import typings.xstate.libTypesMod.LogAction
import typings.xstate.libTypesMod.LogActionObject
import typings.xstate.libTypesMod.LogExpr
import typings.xstate.libTypesMod.MachineConfig
import typings.xstate.libTypesMod.MachineOptions
import typings.xstate.libTypesMod.Observer
import typings.xstate.libTypesMod.PredictableActionArgumentsExec
import typings.xstate.libTypesMod.Prop
import typings.xstate.libTypesMod.PropertyAssigner
import typings.xstate.libTypesMod.PureAction
import typings.xstate.libTypesMod.RaiseAction
import typings.xstate.libTypesMod.RaiseActionObject
import typings.xstate.libTypesMod.ResolveEventType
import typings.xstate.libTypesMod.SCXML.Event
import typings.xstate.libTypesMod.SendAction
import typings.xstate.libTypesMod.SendActionObject
import typings.xstate.libTypesMod.SendActionOptions
import typings.xstate.libTypesMod.SendExpr
import typings.xstate.libTypesMod.ServiceMap
import typings.xstate.libTypesMod.SingleOrArray
import typings.xstate.libTypesMod.Spawnable
import typings.xstate.libTypesMod.StateConfig
import typings.xstate.libTypesMod.StateMachine
import typings.xstate.libTypesMod.StateNodeConfig
import typings.xstate.libTypesMod.StateSchema
import typings.xstate.libTypesMod.StateValue
import typings.xstate.libTypesMod.StopAction
import typings.xstate.libTypesMod.StopActionObject
import typings.xstate.libTypesMod.Typestate
import typings.xstate.xstateBooleans.`false`
import typings.xstate.xstateStrings.getSnapshot
import typings.xstate.xstateStrings.id
import typings.xstate.xstateStrings.missingImplementations
import typings.xstate.xstateStrings.resolved
import typings.xstate.xstateStrings.send
import typings.xstate.xstateStrings.stop
import typings.xstate.xstateStrings.subscribe
import typings.xstate.xstateStrings.toJSON
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("xstate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("xstate", "ActionTypes")
  @js.native
  object ActionTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.xstate.libTypesMod.ActionTypes & String] = js.native
    
    /* "xstate.after" */ val After: typings.xstate.libTypesMod.ActionTypes.After & String = js.native
    
    /* "xstate.assign" */ val Assign: typings.xstate.libTypesMod.ActionTypes.Assign & String = js.native
    
    /* "xstate.cancel" */ val Cancel: typings.xstate.libTypesMod.ActionTypes.Cancel & String = js.native
    
    /* "xstate.choose" */ val Choose: typings.xstate.libTypesMod.ActionTypes.Choose & String = js.native
    
    /* "done.invoke" */ val DoneInvoke: typings.xstate.libTypesMod.ActionTypes.DoneInvoke & String = js.native
    
    /* "done.state" */ val DoneState: typings.xstate.libTypesMod.ActionTypes.DoneState & String = js.native
    
    /* "error.communication" */ val ErrorCommunication: typings.xstate.libTypesMod.ActionTypes.ErrorCommunication & String = js.native
    
    /* "xstate.error" */ val ErrorCustom: typings.xstate.libTypesMod.ActionTypes.ErrorCustom & String = js.native
    
    /* "error.execution" */ val ErrorExecution: typings.xstate.libTypesMod.ActionTypes.ErrorExecution & String = js.native
    
    /* "error.platform" */ val ErrorPlatform: typings.xstate.libTypesMod.ActionTypes.ErrorPlatform & String = js.native
    
    /* "xstate.init" */ val Init: typings.xstate.libTypesMod.ActionTypes.Init & String = js.native
    
    /* "xstate.invoke" */ val Invoke: typings.xstate.libTypesMod.ActionTypes.Invoke & String = js.native
    
    /* "xstate.log" */ val Log: typings.xstate.libTypesMod.ActionTypes.Log & String = js.native
    
    /* "" */ val NullEvent: typings.xstate.libTypesMod.ActionTypes.NullEvent & String = js.native
    
    /* "xstate.pure" */ val Pure: typings.xstate.libTypesMod.ActionTypes.Pure & String = js.native
    
    /* "xstate.raise" */ val Raise: typings.xstate.libTypesMod.ActionTypes.Raise & String = js.native
    
    /* "xstate.send" */ val Send: typings.xstate.libTypesMod.ActionTypes.Send & String = js.native
    
    /* "xstate.start" */ val Start: typings.xstate.libTypesMod.ActionTypes.Start & String = js.native
    
    /* "xstate.stop" */ val Stop: typings.xstate.libTypesMod.ActionTypes.Stop & String = js.native
    
    /* "xstate.update" */ val Update: typings.xstate.libTypesMod.ActionTypes.Update & String = js.native
  }
  
  @JSImport("xstate", "Interpreter")
  @js.native
  open class Interpreter[TContext, TStateSchema /* <: StateSchema[Any] */, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */, TResolvedTypesMeta] protected ()
    extends typings.xstate.libInterpreterMod.Interpreter[TContext, TStateSchema, TEvent, TTypestate, TResolvedTypesMeta] {
    /**
      * Creates a new Interpreter instance (i.e., service) for the given machine with the provided options, if any.
      *
      * @param machine The machine to be interpreted
      * @param options Interpreter options
      */
    def this(machine: StateMachine[TContext, TStateSchema, TEvent, TTypestate, Any, Any, TResolvedTypesMeta]) = this()
    def this(
      machine: StateMachine[TContext, TStateSchema, TEvent, TTypestate, Any, Any, TResolvedTypesMeta],
      options: InterpreterOptions
    ) = this()
  }
  /* static members */
  object Interpreter {
    
    @JSImport("xstate", "Interpreter")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The default interpreter options:
      *
      * - `clock` uses the global `setTimeout` and `clearTimeout` functions
      * - `logger` uses the global `console.log()` method
      */
    @JSImport("xstate", "Interpreter.defaultOptions")
    @js.native
    def defaultOptions: Clock = js.native
    inline def defaultOptions_=(x: Clock): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(x.asInstanceOf[js.Any])
    
    @JSImport("xstate", "Interpreter.interpret")
    @js.native
    def interpret: FnCall = js.native
    inline def interpret[TContext, TStateSchema /* <: StateSchema[Any] */, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */, TResolvedTypesMeta](
      machine: /* import warning: importer.ImportType#apply Failed type conversion: xstate.xstate/lib/typegenTypes.AreAllImplementationsAssumedToBeProvided<TResolvedTypesMeta, xstate.xstate/lib/types.Prop<xstate.xstate/lib/types.Prop<TResolvedTypesMeta, 'resolved'>, 'missingImplementations'>> extends true ? xstate.xstate/lib/types.StateMachine<TContext, TStateSchema, TEvent, TTypestate, any, any, TResolvedTypesMeta> : 'Some implementations missing' */ js.Any
    ): typings.xstate.libInterpreterMod.Interpreter[TContext, TStateSchema, TEvent, TTypestate, TResolvedTypesMeta] = ^.asInstanceOf[js.Dynamic].applyDynamic("interpret")(machine.asInstanceOf[js.Any]).asInstanceOf[typings.xstate.libInterpreterMod.Interpreter[TContext, TStateSchema, TEvent, TTypestate, TResolvedTypesMeta]]
    inline def interpret[TContext, TStateSchema /* <: StateSchema[Any] */, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */, TResolvedTypesMeta](
      machine: /* import warning: importer.ImportType#apply Failed type conversion: xstate.xstate/lib/typegenTypes.AreAllImplementationsAssumedToBeProvided<TResolvedTypesMeta, xstate.xstate/lib/types.Prop<xstate.xstate/lib/types.Prop<TResolvedTypesMeta, 'resolved'>, 'missingImplementations'>> extends true ? xstate.xstate/lib/types.StateMachine<TContext, TStateSchema, TEvent, TTypestate, any, any, TResolvedTypesMeta> : 'Some implementations missing' */ js.Any,
      options: InterpreterOptions
    ): typings.xstate.libInterpreterMod.Interpreter[TContext, TStateSchema, TEvent, TTypestate, TResolvedTypesMeta] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpret")(machine.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.xstate.libInterpreterMod.Interpreter[TContext, TStateSchema, TEvent, TTypestate, TResolvedTypesMeta]]
    inline def interpret_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("interpret")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("xstate", "InterpreterStatus")
  @js.native
  object InterpreterStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.xstate.libInterpreterMod.InterpreterStatus & Double] = js.native
    
    /* 0 */ val NotStarted: typings.xstate.libInterpreterMod.InterpreterStatus.NotStarted & Double = js.native
    
    /* 1 */ val Running: typings.xstate.libInterpreterMod.InterpreterStatus.Running & Double = js.native
    
    /* 2 */ val Stopped: typings.xstate.libInterpreterMod.InterpreterStatus.Stopped & Double = js.native
  }
  
  inline def Machine[TContext, TEvent /* <: EventObject */](config: MachineConfig[TContext, Any, TEvent, BaseActionObject, ServiceMap, TypegenDisabled]): StateMachine[
    TContext, 
    Any, 
    TEvent, 
    Any, 
    BaseActionObject, 
    ServiceMap, 
    ResolveTypegenMeta[TypegenDisabled, TEvent, BaseActionObject, ServiceMap]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("Machine")(config.asInstanceOf[js.Any]).asInstanceOf[StateMachine[
    TContext, 
    Any, 
    TEvent, 
    Any, 
    BaseActionObject, 
    ServiceMap, 
    ResolveTypegenMeta[TypegenDisabled, TEvent, BaseActionObject, ServiceMap]
  ]]
  inline def Machine[TContext, TEvent /* <: EventObject */](
    config: MachineConfig[TContext, Any, TEvent, BaseActionObject, ServiceMap, TypegenDisabled],
    options: Unit,
    initialContext: TContext
  ): StateMachine[
    TContext, 
    Any, 
    TEvent, 
    Any, 
    BaseActionObject, 
    ServiceMap, 
    ResolveTypegenMeta[TypegenDisabled, TEvent, BaseActionObject, ServiceMap]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("Machine")(config.asInstanceOf[js.Any], options.asInstanceOf[js.Any], initialContext.asInstanceOf[js.Any])).asInstanceOf[StateMachine[
    TContext, 
    Any, 
    TEvent, 
    Any, 
    BaseActionObject, 
    ServiceMap, 
    ResolveTypegenMeta[TypegenDisabled, TEvent, BaseActionObject, ServiceMap]
  ]]
  inline def Machine[TContext, TEvent /* <: EventObject */](
    config: MachineConfig[TContext, Any, TEvent, BaseActionObject, ServiceMap, TypegenDisabled],
    options: InternalMachineOptions[
      TContext, 
      TEvent, 
      ResolveTypegenMeta[TypegenDisabled, TEvent, BaseActionObject, ServiceMap], 
      `false`, 
      Prop[
        Prop[
          ResolveTypegenMeta[TypegenDisabled, TEvent, BaseActionObject, ServiceMap], 
          resolved
        ], 
        missingImplementations
      ]
    ]
  ): StateMachine[
    TContext, 
    Any, 
    TEvent, 
    Any, 
    BaseActionObject, 
    ServiceMap, 
    ResolveTypegenMeta[TypegenDisabled, TEvent, BaseActionObject, ServiceMap]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("Machine")(config.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StateMachine[
    TContext, 
    Any, 
    TEvent, 
    Any, 
    BaseActionObject, 
    ServiceMap, 
    ResolveTypegenMeta[TypegenDisabled, TEvent, BaseActionObject, ServiceMap]
  ]]
  inline def Machine[TContext, TEvent /* <: EventObject */](
    config: MachineConfig[TContext, Any, TEvent, BaseActionObject, ServiceMap, TypegenDisabled],
    options: InternalMachineOptions[
      TContext, 
      TEvent, 
      ResolveTypegenMeta[TypegenDisabled, TEvent, BaseActionObject, ServiceMap], 
      `false`, 
      Prop[
        Prop[
          ResolveTypegenMeta[TypegenDisabled, TEvent, BaseActionObject, ServiceMap], 
          resolved
        ], 
        missingImplementations
      ]
    ],
    initialContext: TContext
  ): StateMachine[
    TContext, 
    Any, 
    TEvent, 
    Any, 
    BaseActionObject, 
    ServiceMap, 
    ResolveTypegenMeta[TypegenDisabled, TEvent, BaseActionObject, ServiceMap]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("Machine")(config.asInstanceOf[js.Any], options.asInstanceOf[js.Any], initialContext.asInstanceOf[js.Any])).asInstanceOf[StateMachine[
    TContext, 
    Any, 
    TEvent, 
    Any, 
    BaseActionObject, 
    ServiceMap, 
    ResolveTypegenMeta[TypegenDisabled, TEvent, BaseActionObject, ServiceMap]
  ]]
  
  inline def Machine_TContextTStateSchemaTEvent[TContext, TStateSchema /* <: StateSchema[Any] */, TEvent /* <: EventObject */](
    config: MachineConfig[TContext, TStateSchema, TEvent, BaseActionObject, ServiceMap, TypegenDisabled]
  ): StateMachine[
    TContext, 
    TStateSchema, 
    TEvent, 
    Any, 
    BaseActionObject, 
    ServiceMap, 
    ResolveTypegenMeta[TypegenDisabled, TEvent, BaseActionObject, ServiceMap]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("Machine")(config.asInstanceOf[js.Any]).asInstanceOf[StateMachine[
    TContext, 
    TStateSchema, 
    TEvent, 
    Any, 
    BaseActionObject, 
    ServiceMap, 
    ResolveTypegenMeta[TypegenDisabled, TEvent, BaseActionObject, ServiceMap]
  ]]
  inline def Machine_TContextTStateSchemaTEvent[TContext, TStateSchema /* <: StateSchema[Any] */, TEvent /* <: EventObject */](
    config: MachineConfig[TContext, TStateSchema, TEvent, BaseActionObject, ServiceMap, TypegenDisabled],
    options: Unit,
    initialContext: TContext
  ): StateMachine[
    TContext, 
    TStateSchema, 
    TEvent, 
    Any, 
    BaseActionObject, 
    ServiceMap, 
    ResolveTypegenMeta[TypegenDisabled, TEvent, BaseActionObject, ServiceMap]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("Machine")(config.asInstanceOf[js.Any], options.asInstanceOf[js.Any], initialContext.asInstanceOf[js.Any])).asInstanceOf[StateMachine[
    TContext, 
    TStateSchema, 
    TEvent, 
    Any, 
    BaseActionObject, 
    ServiceMap, 
    ResolveTypegenMeta[TypegenDisabled, TEvent, BaseActionObject, ServiceMap]
  ]]
  inline def Machine_TContextTStateSchemaTEvent[TContext, TStateSchema /* <: StateSchema[Any] */, TEvent /* <: EventObject */](
    config: MachineConfig[TContext, TStateSchema, TEvent, BaseActionObject, ServiceMap, TypegenDisabled],
    options: InternalMachineOptions[
      TContext, 
      TEvent, 
      ResolveTypegenMeta[TypegenDisabled, TEvent, BaseActionObject, ServiceMap], 
      `false`, 
      Prop[
        Prop[
          ResolveTypegenMeta[TypegenDisabled, TEvent, BaseActionObject, ServiceMap], 
          resolved
        ], 
        missingImplementations
      ]
    ]
  ): StateMachine[
    TContext, 
    TStateSchema, 
    TEvent, 
    Any, 
    BaseActionObject, 
    ServiceMap, 
    ResolveTypegenMeta[TypegenDisabled, TEvent, BaseActionObject, ServiceMap]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("Machine")(config.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StateMachine[
    TContext, 
    TStateSchema, 
    TEvent, 
    Any, 
    BaseActionObject, 
    ServiceMap, 
    ResolveTypegenMeta[TypegenDisabled, TEvent, BaseActionObject, ServiceMap]
  ]]
  inline def Machine_TContextTStateSchemaTEvent[TContext, TStateSchema /* <: StateSchema[Any] */, TEvent /* <: EventObject */](
    config: MachineConfig[TContext, TStateSchema, TEvent, BaseActionObject, ServiceMap, TypegenDisabled],
    options: InternalMachineOptions[
      TContext, 
      TEvent, 
      ResolveTypegenMeta[TypegenDisabled, TEvent, BaseActionObject, ServiceMap], 
      `false`, 
      Prop[
        Prop[
          ResolveTypegenMeta[TypegenDisabled, TEvent, BaseActionObject, ServiceMap], 
          resolved
        ], 
        missingImplementations
      ]
    ],
    initialContext: TContext
  ): StateMachine[
    TContext, 
    TStateSchema, 
    TEvent, 
    Any, 
    BaseActionObject, 
    ServiceMap, 
    ResolveTypegenMeta[TypegenDisabled, TEvent, BaseActionObject, ServiceMap]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("Machine")(config.asInstanceOf[js.Any], options.asInstanceOf[js.Any], initialContext.asInstanceOf[js.Any])).asInstanceOf[StateMachine[
    TContext, 
    TStateSchema, 
    TEvent, 
    Any, 
    BaseActionObject, 
    ServiceMap, 
    ResolveTypegenMeta[TypegenDisabled, TEvent, BaseActionObject, ServiceMap]
  ]]
  
  @JSImport("xstate", "SpecialTargets")
  @js.native
  object SpecialTargets extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.xstate.libTypesMod.SpecialTargets & String] = js.native
    
    /* "#_internal" */ val Internal: typings.xstate.libTypesMod.SpecialTargets.Internal & String = js.native
    
    /* "#_parent" */ val Parent: typings.xstate.libTypesMod.SpecialTargets.Parent & String = js.native
  }
  
  @JSImport("xstate", "State")
  @js.native
  open class State[TContext, TEvent /* <: EventObject */, TStateSchema /* <: StateSchema[TContext] */, TTypestate /* <: Typestate[TContext] */, TResolvedTypesMeta] protected ()
    extends typings.xstate.libStateMod.State[TContext, TEvent, TStateSchema, TTypestate, TResolvedTypesMeta] {
    /**
      * Creates a new State instance.
      * @param value The state value
      * @param context The extended state
      * @param historyValue The tree representing historical values of the state nodes
      * @param history The previous state
      * @param actions An array of action objects to execute as side-effects
      * @param activities A mapping of activities and whether they are started (`true`) or stopped (`false`).
      * @param meta
      * @param events Internal event queue. Should be empty with run-to-completion semantics.
      * @param configuration
      */
    def this(config: StateConfig[TContext, TEvent]) = this()
  }
  /* static members */
  object State {
    
    @JSImport("xstate", "State")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new State instance for the given `config`.
      * @param config The state config
      */
    inline def create[TC, TE /* <: EventObject */](config: StateConfig[TC, TE]): typings.xstate.libStateMod.State[TC, TE, Any, Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any]).asInstanceOf[typings.xstate.libStateMod.State[TC, TE, Any, Any, Any]]
    
    /**
      * Creates a new State instance for the given `stateValue` and `context`.
      * @param stateValue
      * @param context
      */
    inline def from[TC, TE /* <: EventObject */](stateValue: typings.xstate.libStateMod.State[TC, TE, Any, Any, Any]): typings.xstate.libStateMod.State[TC, TE, Any, Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(stateValue.asInstanceOf[js.Any]).asInstanceOf[typings.xstate.libStateMod.State[TC, TE, Any, Any, Any]]
    inline def from[TC, TE /* <: EventObject */](stateValue: typings.xstate.libStateMod.State[TC, TE, Any, Any, Any], context: TC): typings.xstate.libStateMod.State[TC, TE, Any, Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(stateValue.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typings.xstate.libStateMod.State[TC, TE, Any, Any, Any]]
    inline def from[TC, TE /* <: EventObject */](stateValue: StateValue): typings.xstate.libStateMod.State[TC, TE, Any, Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(stateValue.asInstanceOf[js.Any]).asInstanceOf[typings.xstate.libStateMod.State[TC, TE, Any, Any, Any]]
    inline def from[TC, TE /* <: EventObject */](stateValue: StateValue, context: TC): typings.xstate.libStateMod.State[TC, TE, Any, Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(stateValue.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typings.xstate.libStateMod.State[TC, TE, Any, Any, Any]]
    
    /**
      * Creates a new `State` instance for the given `stateValue` and `context` with no actions (side-effects).
      * @param stateValue
      * @param context
      */
    inline def inert[TC, TE /* <: EventObject */](stateValue: typings.xstate.libStateMod.State[TC, TE, Any, Any, Any], context: TC): typings.xstate.libStateMod.State[TC, TE, Any, Value[TC], TypegenDisabled] = (^.asInstanceOf[js.Dynamic].applyDynamic("inert")(stateValue.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typings.xstate.libStateMod.State[TC, TE, Any, Value[TC], TypegenDisabled]]
    inline def inert[TC, TE /* <: EventObject */](stateValue: StateValue, context: TC): typings.xstate.libStateMod.State[TC, TE, Any, Value[TC], TypegenDisabled] = (^.asInstanceOf[js.Dynamic].applyDynamic("inert")(stateValue.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typings.xstate.libStateMod.State[TC, TE, Any, Value[TC], TypegenDisabled]]
  }
  
  @JSImport("xstate", "StateNode")
  @js.native
  open class StateNode[TContext, TStateSchema /* <: StateSchema[Any] */, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */, TServiceMap /* <: ServiceMap */, TResolvedTypesMeta] protected ()
    extends typings.xstate.libStateNodeMod.StateNode[TContext, TStateSchema, TEvent, TTypestate, TServiceMap, TResolvedTypesMeta] {
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
  }
  
  object actions {
    
    @JSImport("xstate", "actions")
    @js.native
    val ^ : js.Any = js.native
    
    object actionTypes {
      
      @JSImport("xstate", "actions.actionTypes.after")
      @js.native
      val after: String | Double = js.native
      
      @JSImport("xstate", "actions.actionTypes.assign")
      @js.native
      val assign: String | Double = js.native
      
      @JSImport("xstate", "actions.actionTypes.cancel")
      @js.native
      val cancel: String | Double = js.native
      
      @JSImport("xstate", "actions.actionTypes.choose")
      @js.native
      val choose: String | Double = js.native
      
      @JSImport("xstate", "actions.actionTypes.doneState")
      @js.native
      val doneState: String | Double = js.native
      
      @JSImport("xstate", "actions.actionTypes.error")
      @js.native
      val error: String | Double = js.native
      
      @JSImport("xstate", "actions.actionTypes.errorExecution")
      @js.native
      val errorExecution: String | Double = js.native
      
      @JSImport("xstate", "actions.actionTypes.errorPlatform")
      @js.native
      val errorPlatform: String | Double = js.native
      
      @JSImport("xstate", "actions.actionTypes.init")
      @js.native
      val init: String | Double = js.native
      
      @JSImport("xstate", "actions.actionTypes.invoke")
      @js.native
      val invoke: String | Double = js.native
      
      @JSImport("xstate", "actions.actionTypes.log")
      @js.native
      val log: String | Double = js.native
      
      @JSImport("xstate", "actions.actionTypes.nullEvent")
      @js.native
      val nullEvent: String | Double = js.native
      
      @JSImport("xstate", "actions.actionTypes.pure")
      @js.native
      val pure: String | Double = js.native
      
      @JSImport("xstate", "actions.actionTypes.raise")
      @js.native
      val raise: String | Double = js.native
      
      @JSImport("xstate", "actions.actionTypes.send")
      @js.native
      val send: String | Double = js.native
      
      @JSImport("xstate", "actions.actionTypes.start")
      @js.native
      val start: String | Double = js.native
      
      @JSImport("xstate", "actions.actionTypes.stop")
      @js.native
      val stop: String | Double = js.native
      
      @JSImport("xstate", "actions.actionTypes.update")
      @js.native
      val update: String | Double = js.native
    }
    
    inline def after(delayRef: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("after")(delayRef.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def after(delayRef: String, id: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("after")(delayRef.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def after(delayRef: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("after")(delayRef.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def after(delayRef: Double, id: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("after")(delayRef.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def assign[TContext, TEvent /* <: EventObject */](assignment: Assigner[TContext, TEvent]): AssignAction[TContext, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("assign")(assignment.asInstanceOf[js.Any]).asInstanceOf[AssignAction[TContext, TEvent]]
    inline def assign[TContext, TEvent /* <: EventObject */](assignment: PropertyAssigner[TContext, TEvent]): AssignAction[TContext, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("assign")(assignment.asInstanceOf[js.Any]).asInstanceOf[AssignAction[TContext, TEvent]]
    
    inline def cancel(sendId: String): CancelAction = ^.asInstanceOf[js.Dynamic].applyDynamic("cancel")(sendId.asInstanceOf[js.Any]).asInstanceOf[CancelAction]
    inline def cancel(sendId: Double): CancelAction = ^.asInstanceOf[js.Dynamic].applyDynamic("cancel")(sendId.asInstanceOf[js.Any]).asInstanceOf[CancelAction]
    
    inline def choose[TContext, TEvent /* <: EventObject */](conds: js.Array[ChooseCondition[TContext, TEvent]]): ChooseAction[TContext, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("choose")(conds.asInstanceOf[js.Any]).asInstanceOf[ChooseAction[TContext, TEvent]]
    
    inline def done(id: String): DoneEventObject = ^.asInstanceOf[js.Dynamic].applyDynamic("done")(id.asInstanceOf[js.Any]).asInstanceOf[DoneEventObject]
    inline def done(id: String, data: Any): DoneEventObject = (^.asInstanceOf[js.Dynamic].applyDynamic("done")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[DoneEventObject]
    
    inline def doneInvoke(id: String): DoneEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("doneInvoke")(id.asInstanceOf[js.Any]).asInstanceOf[DoneEvent]
    inline def doneInvoke(id: String, data: Any): DoneEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("doneInvoke")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[DoneEvent]
    
    inline def error(id: String): ErrorPlatformEvent & String = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(id.asInstanceOf[js.Any]).asInstanceOf[ErrorPlatformEvent & String]
    inline def error(id: String, data: Any): ErrorPlatformEvent & String = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[ErrorPlatformEvent & String]
    
    inline def escalate[TContext, TEvent /* <: EventObject */, TErrorData](errorData: TErrorData): SendAction[TContext, TEvent, AnyEventObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("escalate")(errorData.asInstanceOf[js.Any]).asInstanceOf[SendAction[TContext, TEvent, AnyEventObject]]
    inline def escalate[TContext, TEvent /* <: EventObject */, TErrorData](errorData: TErrorData, options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent, AnyEventObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("escalate")(errorData.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, AnyEventObject]]
    inline def escalate[TContext, TEvent /* <: EventObject */, TErrorData](errorData: ExprWithMeta[TContext, TEvent, TErrorData]): SendAction[TContext, TEvent, AnyEventObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("escalate")(errorData.asInstanceOf[js.Any]).asInstanceOf[SendAction[TContext, TEvent, AnyEventObject]]
    inline def escalate[TContext, TEvent /* <: EventObject */, TErrorData](
      errorData: ExprWithMeta[TContext, TEvent, TErrorData],
      options: SendActionOptions[TContext, TEvent]
    ): SendAction[TContext, TEvent, AnyEventObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("escalate")(errorData.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, AnyEventObject]]
    
    inline def forwardTo_to[TContext, TEvent /* <: EventObject */](
      target: /* import warning: importer.ImportType#apply Failed type conversion: std.Required<xstate.xstate/lib/types.SendActionOptions<TContext, TEvent>>['to'] */ js.Any
    ): SendAction[TContext, TEvent, AnyEventObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("forwardTo")(target.asInstanceOf[js.Any]).asInstanceOf[SendAction[TContext, TEvent, AnyEventObject]]
    inline def forwardTo_to[TContext, TEvent /* <: EventObject */](
      target: /* import warning: importer.ImportType#apply Failed type conversion: std.Required<xstate.xstate/lib/types.SendActionOptions<TContext, TEvent>>['to'] */ js.Any,
      options: SendActionOptions[TContext, TEvent]
    ): SendAction[TContext, TEvent, AnyEventObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("forwardTo")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, AnyEventObject]]
    
    inline def getActionFunction[TContext, TEvent /* <: EventObject */](actionType: ActionType): js.UndefOr[
        (ActionObject[TContext, TEvent]) | (ActionFunction[TContext, TEvent, BaseActionObject])
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getActionFunction")(actionType.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[
        (ActionObject[TContext, TEvent]) | (ActionFunction[TContext, TEvent, BaseActionObject])
      ]]
    inline def getActionFunction[TContext, TEvent /* <: EventObject */](actionType: ActionType, actionFunctionMap: ActionFunctionMap[TContext, TEvent, BaseActionObject]): js.UndefOr[
        (ActionObject[TContext, TEvent]) | (ActionFunction[TContext, TEvent, BaseActionObject])
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("getActionFunction")(actionType.asInstanceOf[js.Any], actionFunctionMap.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
        (ActionObject[TContext, TEvent]) | (ActionFunction[TContext, TEvent, BaseActionObject])
      ]]
    
    @JSImport("xstate", "actions.initEvent")
    @js.native
    val initEvent: Event[Type] = js.native
    
    inline def isActionObject[TContext, TEvent /* <: EventObject */](action: Action[TContext, TEvent]): /* is xstate.xstate/lib/types.ActionObject<TContext, TEvent> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isActionObject")(action.asInstanceOf[js.Any]).asInstanceOf[/* is xstate.xstate/lib/types.ActionObject<TContext, TEvent> */ Boolean]
    
    inline def log[TContext, TEvent /* <: EventObject */](): LogAction[TContext, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("log")().asInstanceOf[LogAction[TContext, TEvent]]
    inline def log[TContext, TEvent /* <: EventObject */](expr: String): LogAction[TContext, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(expr.asInstanceOf[js.Any]).asInstanceOf[LogAction[TContext, TEvent]]
    inline def log[TContext, TEvent /* <: EventObject */](expr: String, label: String): LogAction[TContext, TEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("log")(expr.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[LogAction[TContext, TEvent]]
    inline def log[TContext, TEvent /* <: EventObject */](expr: Unit, label: String): LogAction[TContext, TEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("log")(expr.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[LogAction[TContext, TEvent]]
    inline def log[TContext, TEvent /* <: EventObject */](expr: LogExpr[TContext, TEvent]): LogAction[TContext, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(expr.asInstanceOf[js.Any]).asInstanceOf[LogAction[TContext, TEvent]]
    inline def log[TContext, TEvent /* <: EventObject */](expr: LogExpr[TContext, TEvent], label: String): LogAction[TContext, TEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("log")(expr.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[LogAction[TContext, TEvent]]
    
    inline def pure[TContext, TEvent /* <: EventObject */](
      getActions: js.Function2[
          /* context */ TContext, 
          /* event */ TEvent, 
          js.UndefOr[SingleOrArray[ActionObject[TContext, TEvent]]]
        ]
    ): PureAction[TContext, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("pure")(getActions.asInstanceOf[js.Any]).asInstanceOf[PureAction[TContext, TEvent]]
    
    inline def raise[TContext, TEvent /* <: EventObject */](event: typings.xstate.libTypesMod.Event[TEvent]): RaiseAction[TEvent] | (SendAction[TContext, AnyEventObject, TEvent]) = ^.asInstanceOf[js.Dynamic].applyDynamic("raise")(event.asInstanceOf[js.Any]).asInstanceOf[RaiseAction[TEvent] | (SendAction[TContext, AnyEventObject, TEvent])]
    
    inline def resolveActions[TContext, TEvent /* <: EventObject */](
      machine: typings.xstate.libStateNodeMod.StateNode[TContext, Any, TEvent, Any, Any, Any],
      currentState: Unit,
      currentContext: TContext,
      _event: Event[TEvent],
      actionBlocks: js.Array[js.Array[ActionObject[TContext, TEvent]]]
    ): js.Tuple2[js.Array[ActionObject[TContext, TEvent]], TContext] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveActions")(machine.asInstanceOf[js.Any], currentState.asInstanceOf[js.Any], currentContext.asInstanceOf[js.Any], _event.asInstanceOf[js.Any], actionBlocks.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Array[ActionObject[TContext, TEvent]], TContext]]
    inline def resolveActions[TContext, TEvent /* <: EventObject */](
      machine: typings.xstate.libStateNodeMod.StateNode[TContext, Any, TEvent, Any, Any, Any],
      currentState: Unit,
      currentContext: TContext,
      _event: Event[TEvent],
      actionBlocks: js.Array[js.Array[ActionObject[TContext, TEvent]]],
      predictableExec: Unit,
      preserveActionOrder: Boolean
    ): js.Tuple2[js.Array[ActionObject[TContext, TEvent]], TContext] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveActions")(machine.asInstanceOf[js.Any], currentState.asInstanceOf[js.Any], currentContext.asInstanceOf[js.Any], _event.asInstanceOf[js.Any], actionBlocks.asInstanceOf[js.Any], predictableExec.asInstanceOf[js.Any], preserveActionOrder.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Array[ActionObject[TContext, TEvent]], TContext]]
    inline def resolveActions[TContext, TEvent /* <: EventObject */](
      machine: typings.xstate.libStateNodeMod.StateNode[TContext, Any, TEvent, Any, Any, Any],
      currentState: Unit,
      currentContext: TContext,
      _event: Event[TEvent],
      actionBlocks: js.Array[js.Array[ActionObject[TContext, TEvent]]],
      predictableExec: PredictableActionArgumentsExec
    ): js.Tuple2[js.Array[ActionObject[TContext, TEvent]], TContext] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveActions")(machine.asInstanceOf[js.Any], currentState.asInstanceOf[js.Any], currentContext.asInstanceOf[js.Any], _event.asInstanceOf[js.Any], actionBlocks.asInstanceOf[js.Any], predictableExec.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Array[ActionObject[TContext, TEvent]], TContext]]
    inline def resolveActions[TContext, TEvent /* <: EventObject */](
      machine: typings.xstate.libStateNodeMod.StateNode[TContext, Any, TEvent, Any, Any, Any],
      currentState: Unit,
      currentContext: TContext,
      _event: Event[TEvent],
      actionBlocks: js.Array[js.Array[ActionObject[TContext, TEvent]]],
      predictableExec: PredictableActionArgumentsExec,
      preserveActionOrder: Boolean
    ): js.Tuple2[js.Array[ActionObject[TContext, TEvent]], TContext] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveActions")(machine.asInstanceOf[js.Any], currentState.asInstanceOf[js.Any], currentContext.asInstanceOf[js.Any], _event.asInstanceOf[js.Any], actionBlocks.asInstanceOf[js.Any], predictableExec.asInstanceOf[js.Any], preserveActionOrder.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Array[ActionObject[TContext, TEvent]], TContext]]
    inline def resolveActions[TContext, TEvent /* <: EventObject */](
      machine: typings.xstate.libStateNodeMod.StateNode[TContext, Any, TEvent, Any, Any, Any],
      currentState: typings.xstate.libStateMod.State[TContext, TEvent, Any, Any, Any],
      currentContext: TContext,
      _event: Event[TEvent],
      actionBlocks: js.Array[js.Array[ActionObject[TContext, TEvent]]]
    ): js.Tuple2[js.Array[ActionObject[TContext, TEvent]], TContext] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveActions")(machine.asInstanceOf[js.Any], currentState.asInstanceOf[js.Any], currentContext.asInstanceOf[js.Any], _event.asInstanceOf[js.Any], actionBlocks.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Array[ActionObject[TContext, TEvent]], TContext]]
    inline def resolveActions[TContext, TEvent /* <: EventObject */](
      machine: typings.xstate.libStateNodeMod.StateNode[TContext, Any, TEvent, Any, Any, Any],
      currentState: typings.xstate.libStateMod.State[TContext, TEvent, Any, Any, Any],
      currentContext: TContext,
      _event: Event[TEvent],
      actionBlocks: js.Array[js.Array[ActionObject[TContext, TEvent]]],
      predictableExec: Unit,
      preserveActionOrder: Boolean
    ): js.Tuple2[js.Array[ActionObject[TContext, TEvent]], TContext] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveActions")(machine.asInstanceOf[js.Any], currentState.asInstanceOf[js.Any], currentContext.asInstanceOf[js.Any], _event.asInstanceOf[js.Any], actionBlocks.asInstanceOf[js.Any], predictableExec.asInstanceOf[js.Any], preserveActionOrder.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Array[ActionObject[TContext, TEvent]], TContext]]
    inline def resolveActions[TContext, TEvent /* <: EventObject */](
      machine: typings.xstate.libStateNodeMod.StateNode[TContext, Any, TEvent, Any, Any, Any],
      currentState: typings.xstate.libStateMod.State[TContext, TEvent, Any, Any, Any],
      currentContext: TContext,
      _event: Event[TEvent],
      actionBlocks: js.Array[js.Array[ActionObject[TContext, TEvent]]],
      predictableExec: PredictableActionArgumentsExec
    ): js.Tuple2[js.Array[ActionObject[TContext, TEvent]], TContext] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveActions")(machine.asInstanceOf[js.Any], currentState.asInstanceOf[js.Any], currentContext.asInstanceOf[js.Any], _event.asInstanceOf[js.Any], actionBlocks.asInstanceOf[js.Any], predictableExec.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Array[ActionObject[TContext, TEvent]], TContext]]
    inline def resolveActions[TContext, TEvent /* <: EventObject */](
      machine: typings.xstate.libStateNodeMod.StateNode[TContext, Any, TEvent, Any, Any, Any],
      currentState: typings.xstate.libStateMod.State[TContext, TEvent, Any, Any, Any],
      currentContext: TContext,
      _event: Event[TEvent],
      actionBlocks: js.Array[js.Array[ActionObject[TContext, TEvent]]],
      predictableExec: PredictableActionArgumentsExec,
      preserveActionOrder: Boolean
    ): js.Tuple2[js.Array[ActionObject[TContext, TEvent]], TContext] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveActions")(machine.asInstanceOf[js.Any], currentState.asInstanceOf[js.Any], currentContext.asInstanceOf[js.Any], _event.asInstanceOf[js.Any], actionBlocks.asInstanceOf[js.Any], predictableExec.asInstanceOf[js.Any], preserveActionOrder.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Array[ActionObject[TContext, TEvent]], TContext]]
    
    inline def resolveLog[TContext, TEvent /* <: EventObject */](action: LogAction[TContext, TEvent], ctx: TContext, _event: Event[TEvent]): LogActionObject[TContext, TEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveLog")(action.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], _event.asInstanceOf[js.Any])).asInstanceOf[LogActionObject[TContext, TEvent]]
    
    inline def resolveRaise[TEvent /* <: EventObject */](action: RaiseAction[TEvent]): RaiseActionObject[TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveRaise")(action.asInstanceOf[js.Any]).asInstanceOf[RaiseActionObject[TEvent]]
    
    inline def resolveSend[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](action: SendAction[TContext, TEvent, TSentEvent], ctx: TContext, _event: Event[TEvent]): SendActionObject[TContext, TEvent, TSentEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveSend")(action.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], _event.asInstanceOf[js.Any])).asInstanceOf[SendActionObject[TContext, TEvent, TSentEvent]]
    inline def resolveSend[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](
      action: SendAction[TContext, TEvent, TSentEvent],
      ctx: TContext,
      _event: Event[TEvent],
      delaysMap: DelayFunctionMap[TContext, TEvent]
    ): SendActionObject[TContext, TEvent, TSentEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveSend")(action.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], _event.asInstanceOf[js.Any], delaysMap.asInstanceOf[js.Any])).asInstanceOf[SendActionObject[TContext, TEvent, TSentEvent]]
    
    inline def resolveStop[TContext, TEvent /* <: EventObject */](action: StopAction[TContext, TEvent], context: TContext, _event: Event[TEvent]): StopActionObject = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveStop")(action.asInstanceOf[js.Any], context.asInstanceOf[js.Any], _event.asInstanceOf[js.Any])).asInstanceOf[StopActionObject]
    
    inline def respond[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: typings.xstate.libTypesMod.Event[TEvent]): SendAction[TContext, TEvent, AnyEventObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("respond")(event.asInstanceOf[js.Any]).asInstanceOf[SendAction[TContext, TEvent, AnyEventObject]]
    inline def respond[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: typings.xstate.libTypesMod.Event[TEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent, AnyEventObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("respond")(event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, AnyEventObject]]
    inline def respond[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: SendExpr[TContext, TEvent, TSentEvent]): SendAction[TContext, TEvent, AnyEventObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("respond")(event.asInstanceOf[js.Any]).asInstanceOf[SendAction[TContext, TEvent, AnyEventObject]]
    inline def respond[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: SendExpr[TContext, TEvent, TSentEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent, AnyEventObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("respond")(event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, AnyEventObject]]
    
    inline def send[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: typings.xstate.libTypesMod.Event[TSentEvent]): SendAction[TContext, TEvent, TSentEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("send")(event.asInstanceOf[js.Any]).asInstanceOf[SendAction[TContext, TEvent, TSentEvent]]
    inline def send[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: typings.xstate.libTypesMod.Event[TSentEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent, TSentEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("send")(event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, TSentEvent]]
    inline def send[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: SendExpr[TContext, TEvent, TSentEvent]): SendAction[TContext, TEvent, TSentEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("send")(event.asInstanceOf[js.Any]).asInstanceOf[SendAction[TContext, TEvent, TSentEvent]]
    inline def send[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: SendExpr[TContext, TEvent, TSentEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent, TSentEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("send")(event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, TSentEvent]]
    
    inline def sendParent[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: typings.xstate.libTypesMod.Event[TSentEvent]): SendAction[TContext, TEvent, TSentEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("sendParent")(event.asInstanceOf[js.Any]).asInstanceOf[SendAction[TContext, TEvent, TSentEvent]]
    inline def sendParent[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: typings.xstate.libTypesMod.Event[TSentEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent, TSentEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendParent")(event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, TSentEvent]]
    inline def sendParent[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: SendExpr[TContext, TEvent, TSentEvent]): SendAction[TContext, TEvent, TSentEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("sendParent")(event.asInstanceOf[js.Any]).asInstanceOf[SendAction[TContext, TEvent, TSentEvent]]
    inline def sendParent[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: SendExpr[TContext, TEvent, TSentEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent, TSentEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendParent")(event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, TSentEvent]]
    
    inline def sendTo[TContext, TEvent /* <: EventObject */, TActor /* <: AnyActorRef */](actor: TActor, event: EventFrom[TActor, scala.Nothing, ResolveEventType[TActor]]): SendAction[TContext, TEvent, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendTo")(actor.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, Any]]
    inline def sendTo[TContext, TEvent /* <: EventObject */, TActor /* <: AnyActorRef */](
      actor: TActor,
      event: EventFrom[TActor, scala.Nothing, ResolveEventType[TActor]],
      options: SendActionOptions[TContext, TEvent]
    ): SendAction[TContext, TEvent, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendTo")(actor.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, Any]]
    inline def sendTo[TContext, TEvent /* <: EventObject */, TActor /* <: AnyActorRef */](
      actor: TActor,
      event: SendExpr[
          TContext, 
          TEvent, 
          InferEvent[Cast[EventFrom[TActor, scala.Nothing, ResolveEventType[TActor]], EventObject]]
        ]
    ): SendAction[TContext, TEvent, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendTo")(actor.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, Any]]
    inline def sendTo[TContext, TEvent /* <: EventObject */, TActor /* <: AnyActorRef */](
      actor: TActor,
      event: SendExpr[
          TContext, 
          TEvent, 
          InferEvent[Cast[EventFrom[TActor, scala.Nothing, ResolveEventType[TActor]], EventObject]]
        ],
      options: SendActionOptions[TContext, TEvent]
    ): SendAction[TContext, TEvent, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendTo")(actor.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, Any]]
    inline def sendTo[TContext, TEvent /* <: EventObject */, TActor /* <: AnyActorRef */](actor: String, event: EventFrom[TActor, scala.Nothing, ResolveEventType[TActor]]): SendAction[TContext, TEvent, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendTo")(actor.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, Any]]
    inline def sendTo[TContext, TEvent /* <: EventObject */, TActor /* <: AnyActorRef */](
      actor: String,
      event: EventFrom[TActor, scala.Nothing, ResolveEventType[TActor]],
      options: SendActionOptions[TContext, TEvent]
    ): SendAction[TContext, TEvent, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendTo")(actor.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, Any]]
    inline def sendTo[TContext, TEvent /* <: EventObject */, TActor /* <: AnyActorRef */](
      actor: String,
      event: SendExpr[
          TContext, 
          TEvent, 
          InferEvent[Cast[EventFrom[TActor, scala.Nothing, ResolveEventType[TActor]], EventObject]]
        ]
    ): SendAction[TContext, TEvent, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendTo")(actor.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, Any]]
    inline def sendTo[TContext, TEvent /* <: EventObject */, TActor /* <: AnyActorRef */](
      actor: String,
      event: SendExpr[
          TContext, 
          TEvent, 
          InferEvent[Cast[EventFrom[TActor, scala.Nothing, ResolveEventType[TActor]], EventObject]]
        ],
      options: SendActionOptions[TContext, TEvent]
    ): SendAction[TContext, TEvent, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendTo")(actor.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, Any]]
    inline def sendTo[TContext, TEvent /* <: EventObject */, TActor /* <: AnyActorRef */](
      actor: js.Function1[/* ctx */ TContext, TActor],
      event: EventFrom[TActor, scala.Nothing, ResolveEventType[TActor]]
    ): SendAction[TContext, TEvent, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendTo")(actor.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, Any]]
    inline def sendTo[TContext, TEvent /* <: EventObject */, TActor /* <: AnyActorRef */](
      actor: js.Function1[/* ctx */ TContext, TActor],
      event: EventFrom[TActor, scala.Nothing, ResolveEventType[TActor]],
      options: SendActionOptions[TContext, TEvent]
    ): SendAction[TContext, TEvent, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendTo")(actor.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, Any]]
    inline def sendTo[TContext, TEvent /* <: EventObject */, TActor /* <: AnyActorRef */](
      actor: js.Function1[/* ctx */ TContext, TActor],
      event: SendExpr[
          TContext, 
          TEvent, 
          InferEvent[Cast[EventFrom[TActor, scala.Nothing, ResolveEventType[TActor]], EventObject]]
        ]
    ): SendAction[TContext, TEvent, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendTo")(actor.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, Any]]
    inline def sendTo[TContext, TEvent /* <: EventObject */, TActor /* <: AnyActorRef */](
      actor: js.Function1[/* ctx */ TContext, TActor],
      event: SendExpr[
          TContext, 
          TEvent, 
          InferEvent[Cast[EventFrom[TActor, scala.Nothing, ResolveEventType[TActor]], EventObject]]
        ],
      options: SendActionOptions[TContext, TEvent]
    ): SendAction[TContext, TEvent, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendTo")(actor.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, Any]]
    
    inline def sendUpdate[TContext, TEvent /* <: EventObject */](): SendAction[TContext, TEvent, TypeUpdate] = ^.asInstanceOf[js.Dynamic].applyDynamic("sendUpdate")().asInstanceOf[SendAction[TContext, TEvent, TypeUpdate]]
    
    inline def start[TContext, TEvent /* <: EventObject */](activity: String): ActivityActionObject[TContext, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(activity.asInstanceOf[js.Any]).asInstanceOf[ActivityActionObject[TContext, TEvent]]
    inline def start[TContext, TEvent /* <: EventObject */](activity: ActivityDefinition[TContext, TEvent]): ActivityActionObject[TContext, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(activity.asInstanceOf[js.Any]).asInstanceOf[ActivityActionObject[TContext, TEvent]]
    
    inline def stop[TContext, TEvent /* <: EventObject */](actorRef: String): StopAction[TContext, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")(actorRef.asInstanceOf[js.Any]).asInstanceOf[StopAction[TContext, TEvent]]
    inline def stop[TContext, TEvent /* <: EventObject */](actorRef: ActivityDefinition[TContext, TEvent]): StopAction[TContext, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")(actorRef.asInstanceOf[js.Any]).asInstanceOf[StopAction[TContext, TEvent]]
    inline def stop[TContext, TEvent /* <: EventObject */](actorRef: Expr[TContext, TEvent, String | Id]): StopAction[TContext, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")(actorRef.asInstanceOf[js.Any]).asInstanceOf[StopAction[TContext, TEvent]]
    
    inline def toActionObject[TContext, TEvent /* <: EventObject */](action: Action[TContext, TEvent]): ActionObject[TContext, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("toActionObject")(action.asInstanceOf[js.Any]).asInstanceOf[ActionObject[TContext, TEvent]]
    inline def toActionObject[TContext, TEvent /* <: EventObject */](
      action: Action[TContext, TEvent],
      actionFunctionMap: ActionFunctionMap[TContext, TEvent, BaseActionObject]
    ): ActionObject[TContext, TEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("toActionObject")(action.asInstanceOf[js.Any], actionFunctionMap.asInstanceOf[js.Any])).asInstanceOf[ActionObject[TContext, TEvent]]
    
    inline def toActionObjects[TContext, TEvent /* <: EventObject */](): js.Array[ActionObject[TContext, TEvent]] = ^.asInstanceOf[js.Dynamic].applyDynamic("toActionObjects")().asInstanceOf[js.Array[ActionObject[TContext, TEvent]]]
    inline def toActionObjects[TContext, TEvent /* <: EventObject */](action: Unit, actionFunctionMap: ActionFunctionMap[TContext, TEvent, BaseActionObject]): js.Array[ActionObject[TContext, TEvent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("toActionObjects")(action.asInstanceOf[js.Any], actionFunctionMap.asInstanceOf[js.Any])).asInstanceOf[js.Array[ActionObject[TContext, TEvent]]]
    inline def toActionObjects[TContext, TEvent /* <: EventObject */](action: SingleOrArray[Action[TContext, TEvent]]): js.Array[ActionObject[TContext, TEvent]] = ^.asInstanceOf[js.Dynamic].applyDynamic("toActionObjects")(action.asInstanceOf[js.Any]).asInstanceOf[js.Array[ActionObject[TContext, TEvent]]]
    inline def toActionObjects[TContext, TEvent /* <: EventObject */](
      action: SingleOrArray[Action[TContext, TEvent]],
      actionFunctionMap: ActionFunctionMap[TContext, TEvent, BaseActionObject]
    ): js.Array[ActionObject[TContext, TEvent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("toActionObjects")(action.asInstanceOf[js.Any], actionFunctionMap.asInstanceOf[js.Any])).asInstanceOf[js.Array[ActionObject[TContext, TEvent]]]
    
    inline def toActivityDefinition[TContext, TEvent /* <: EventObject */](action: String): ActivityDefinition[TContext, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("toActivityDefinition")(action.asInstanceOf[js.Any]).asInstanceOf[ActivityDefinition[TContext, TEvent]]
    inline def toActivityDefinition[TContext, TEvent /* <: EventObject */](action: ActivityDefinition[TContext, TEvent]): ActivityDefinition[TContext, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("toActivityDefinition")(action.asInstanceOf[js.Any]).asInstanceOf[ActivityDefinition[TContext, TEvent]]
  }
  
  /* import warning: parser.TsParser#tsDeclVar Dropped IArray(send, sendParent, sendUpdate, forwardTo, doneInvoke) */ inline def assign[TContext, TEvent /* <: EventObject */](assignment: Assigner[TContext, TEvent]): AssignAction[TContext, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("assign")(assignment.asInstanceOf[js.Any]).asInstanceOf[AssignAction[TContext, TEvent]]
  inline def assign[TContext, TEvent /* <: EventObject */](assignment: PropertyAssigner[TContext, TEvent]): AssignAction[TContext, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("assign")(assignment.asInstanceOf[js.Any]).asInstanceOf[AssignAction[TContext, TEvent]]
  
  inline def createMachine[TContext, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */, TServiceMap /* <: ServiceMap */, TTypesMeta /* <: TypegenConstraint */](config: MachineConfig[TContext, Any, TEvent, BaseActionObject, TServiceMap, TTypesMeta]): StateMachine[
    TContext, 
    Any, 
    TEvent, 
    TTypestate, 
    BaseActionObject, 
    TServiceMap, 
    ResolveTypegenMeta[TTypesMeta, TEvent, BaseActionObject, TServiceMap]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createMachine")(config.asInstanceOf[js.Any]).asInstanceOf[StateMachine[
    TContext, 
    Any, 
    TEvent, 
    TTypestate, 
    BaseActionObject, 
    TServiceMap, 
    ResolveTypegenMeta[TTypesMeta, TEvent, BaseActionObject, TServiceMap]
  ]]
  inline def createMachine[TContext, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */, TServiceMap /* <: ServiceMap */, TTypesMeta /* <: TypegenConstraint */](
    config: MachineConfig[TContext, Any, TEvent, BaseActionObject, TServiceMap, TTypesMeta],
    options: InternalMachineOptions[
      TContext, 
      TEvent, 
      ResolveTypegenMeta[TTypesMeta, TEvent, BaseActionObject, TServiceMap], 
      `false`, 
      Prop[
        Prop[ResolveTypegenMeta[TTypesMeta, TEvent, BaseActionObject, TServiceMap], resolved], 
        missingImplementations
      ]
    ]
  ): StateMachine[
    TContext, 
    Any, 
    TEvent, 
    TTypestate, 
    BaseActionObject, 
    TServiceMap, 
    ResolveTypegenMeta[TTypesMeta, TEvent, BaseActionObject, TServiceMap]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createMachine")(config.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StateMachine[
    TContext, 
    Any, 
    TEvent, 
    TTypestate, 
    BaseActionObject, 
    TServiceMap, 
    ResolveTypegenMeta[TTypesMeta, TEvent, BaseActionObject, TServiceMap]
  ]]
  
  inline def createSchema[T](): T = ^.asInstanceOf[js.Dynamic].applyDynamic("createSchema")().asInstanceOf[T]
  inline def createSchema[T](schema: Any): T = ^.asInstanceOf[js.Dynamic].applyDynamic("createSchema")(schema.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def interpret[TContext, TStateSchema /* <: StateSchema[Any] */, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */, TResolvedTypesMeta](
    machine: /* import warning: importer.ImportType#apply Failed type conversion: xstate.xstate/lib/typegenTypes.AreAllImplementationsAssumedToBeProvided<TResolvedTypesMeta, xstate.xstate/lib/types.Prop<xstate.xstate/lib/types.Prop<TResolvedTypesMeta, 'resolved'>, 'missingImplementations'>> extends true ? xstate.xstate/lib/types.StateMachine<TContext, TStateSchema, TEvent, TTypestate, any, any, TResolvedTypesMeta> : 'Some implementations missing' */ js.Any
  ): typings.xstate.libInterpreterMod.Interpreter[TContext, TStateSchema, TEvent, TTypestate, TResolvedTypesMeta] = ^.asInstanceOf[js.Dynamic].applyDynamic("interpret")(machine.asInstanceOf[js.Any]).asInstanceOf[typings.xstate.libInterpreterMod.Interpreter[TContext, TStateSchema, TEvent, TTypestate, TResolvedTypesMeta]]
  inline def interpret[TContext, TStateSchema /* <: StateSchema[Any] */, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */, TResolvedTypesMeta](
    machine: /* import warning: importer.ImportType#apply Failed type conversion: xstate.xstate/lib/typegenTypes.AreAllImplementationsAssumedToBeProvided<TResolvedTypesMeta, xstate.xstate/lib/types.Prop<xstate.xstate/lib/types.Prop<TResolvedTypesMeta, 'resolved'>, 'missingImplementations'>> extends true ? xstate.xstate/lib/types.StateMachine<TContext, TStateSchema, TEvent, TTypestate, any, any, TResolvedTypesMeta> : 'Some implementations missing' */ js.Any,
    options: InterpreterOptions
  ): typings.xstate.libInterpreterMod.Interpreter[TContext, TStateSchema, TEvent, TTypestate, TResolvedTypesMeta] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpret")(machine.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.xstate.libInterpreterMod.Interpreter[TContext, TStateSchema, TEvent, TTypestate, TResolvedTypesMeta]]
  
  inline def mapState(stateMap: StringDictionary[Any], stateId: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mapState")(stateMap.asInstanceOf[js.Any], stateId.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def matchState[T, TContext, TEvent /* <: EventObject */](
    state: typings.xstate.libStateMod.State[TContext, TEvent, Any, Context[TContext], TypegenDisabled],
    patterns: js.Array[StatePatternTuple[T, TContext, TEvent]],
    defaultValue: ValueFromStateGetter[T, TContext, TEvent]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("matchState")(state.asInstanceOf[js.Any], patterns.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def matchState[T, TContext, TEvent /* <: EventObject */](
    state: StateValue,
    patterns: js.Array[StatePatternTuple[T, TContext, TEvent]],
    defaultValue: ValueFromStateGetter[T, TContext, TEvent]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("matchState")(state.asInstanceOf[js.Any], patterns.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def matchesState(parentStateId: StateValue, childStateId: StateValue): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchesState")(parentStateId.asInstanceOf[js.Any], childStateId.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def matchesState(parentStateId: StateValue, childStateId: StateValue, delimiter: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchesState")(parentStateId.asInstanceOf[js.Any], childStateId.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def spawn(entity: Spawnable): ActorRef[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(entity.asInstanceOf[js.Any]).asInstanceOf[ActorRef[Any, Any]]
  inline def spawn(entity: Spawnable, nameOrOptions: String): ActorRef[Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(entity.asInstanceOf[js.Any], nameOrOptions.asInstanceOf[js.Any])).asInstanceOf[ActorRef[Any, Any]]
  inline def spawn(entity: Spawnable, nameOrOptions: SpawnOptions): ActorRef[Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(entity.asInstanceOf[js.Any], nameOrOptions.asInstanceOf[js.Any])).asInstanceOf[ActorRef[Any, Any]]
  inline def spawn[T /* <: Behavior[Any, Any] */](entity: T): ActorRefFrom[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(entity.asInstanceOf[js.Any]).asInstanceOf[ActorRefFrom[T]]
  inline def spawn[T /* <: Behavior[Any, Any] */](entity: T, nameOrOptions: String): ActorRefFrom[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(entity.asInstanceOf[js.Any], nameOrOptions.asInstanceOf[js.Any])).asInstanceOf[ActorRefFrom[T]]
  inline def spawn[T /* <: Behavior[Any, Any] */](entity: T, nameOrOptions: SpawnOptions): ActorRefFrom[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(entity.asInstanceOf[js.Any], nameOrOptions.asInstanceOf[js.Any])).asInstanceOf[ActorRefFrom[T]]
  inline def spawn[TC, TE /* <: EventObject */](entity: StateMachine[TC, Any, TE, Any, Any, Any, Any]): ActorRefFrom[StateMachine[TC, Any, TE, Any, Any, Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(entity.asInstanceOf[js.Any]).asInstanceOf[ActorRefFrom[StateMachine[TC, Any, TE, Any, Any, Any, Any]]]
  inline def spawn[TC, TE /* <: EventObject */](entity: StateMachine[TC, Any, TE, Any, Any, Any, Any], nameOrOptions: String): ActorRefFrom[StateMachine[TC, Any, TE, Any, Any, Any, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(entity.asInstanceOf[js.Any], nameOrOptions.asInstanceOf[js.Any])).asInstanceOf[ActorRefFrom[StateMachine[TC, Any, TE, Any, Any, Any, Any]]]
  inline def spawn[TC, TE /* <: EventObject */](entity: StateMachine[TC, Any, TE, Any, Any, Any, Any], nameOrOptions: SpawnOptions): ActorRefFrom[StateMachine[TC, Any, TE, Any, Any, Any, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(entity.asInstanceOf[js.Any], nameOrOptions.asInstanceOf[js.Any])).asInstanceOf[ActorRefFrom[StateMachine[TC, Any, TE, Any, Any, Any, Any]]]
  
  inline def spawnBehavior[TEvent /* <: EventObject */, TEmitted](behavior: Behavior[TEvent, TEmitted]): ActorRef[TEvent, TEmitted] = ^.asInstanceOf[js.Dynamic].applyDynamic("spawnBehavior")(behavior.asInstanceOf[js.Any]).asInstanceOf[ActorRef[TEvent, TEmitted]]
  inline def spawnBehavior[TEvent /* <: EventObject */, TEmitted](behavior: Behavior[TEvent, TEmitted], options: SpawnBehaviorOptions): ActorRef[TEvent, TEmitted] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawnBehavior")(behavior.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ActorRef[TEvent, TEmitted]]
  
  inline def t[T](): T = ^.asInstanceOf[js.Dynamic].applyDynamic("t")().asInstanceOf[T]
  inline def t[T](schema: Any): T = ^.asInstanceOf[js.Dynamic].applyDynamic("t")(schema.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def toActorRef[TEvent /* <: EventObject */, TEmitted, TActorRefLike /* <: BaseActorRef[TEvent] */](actorRefLike: TActorRefLike): (ActorRef[TEvent, TEmitted]) & (Omit[
    TActorRefLike, 
    /* keyof xstate.xstate/lib/types.ActorRef<any, any> */ send | id | getSnapshot | stop | toJSON | subscribe
  ]) = ^.asInstanceOf[js.Dynamic].applyDynamic("toActorRef")(actorRefLike.asInstanceOf[js.Any]).asInstanceOf[(ActorRef[TEvent, TEmitted]) & (Omit[
    TActorRefLike, 
    /* keyof xstate.xstate/lib/types.ActorRef<any, any> */ send | id | getSnapshot | stop | toJSON | subscribe
  ])]
  
  inline def toEventObject[TEvent /* <: EventObject */](event: typings.xstate.libTypesMod.Event[TEvent]): TEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("toEventObject")(event.asInstanceOf[js.Any]).asInstanceOf[TEvent]
  inline def toEventObject[TEvent /* <: EventObject */](event: typings.xstate.libTypesMod.Event[TEvent], payload: EventData): TEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("toEventObject")(event.asInstanceOf[js.Any], payload.asInstanceOf[js.Any])).asInstanceOf[TEvent]
  
  inline def toObserver[T](): Observer[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObserver")().asInstanceOf[Observer[T]]
  inline def toObserver[T](nextHandler: js.Function1[/* value */ T, Unit]): Observer[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObserver")(nextHandler.asInstanceOf[js.Any]).asInstanceOf[Observer[T]]
  inline def toObserver[T](nextHandler: js.Function1[/* value */ T, Unit], errorHandler: js.Function1[/* error */ Any, Unit]): Observer[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObserver")(nextHandler.asInstanceOf[js.Any], errorHandler.asInstanceOf[js.Any])).asInstanceOf[Observer[T]]
  inline def toObserver[T](
    nextHandler: js.Function1[/* value */ T, Unit],
    errorHandler: js.Function1[/* error */ Any, Unit],
    completionHandler: js.Function0[Unit]
  ): Observer[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObserver")(nextHandler.asInstanceOf[js.Any], errorHandler.asInstanceOf[js.Any], completionHandler.asInstanceOf[js.Any])).asInstanceOf[Observer[T]]
  inline def toObserver[T](
    nextHandler: js.Function1[/* value */ T, Unit],
    errorHandler: Unit,
    completionHandler: js.Function0[Unit]
  ): Observer[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObserver")(nextHandler.asInstanceOf[js.Any], errorHandler.asInstanceOf[js.Any], completionHandler.asInstanceOf[js.Any])).asInstanceOf[Observer[T]]
  inline def toObserver[T](nextHandler: Unit, errorHandler: js.Function1[/* error */ Any, Unit]): Observer[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObserver")(nextHandler.asInstanceOf[js.Any], errorHandler.asInstanceOf[js.Any])).asInstanceOf[Observer[T]]
  inline def toObserver[T](
    nextHandler: Unit,
    errorHandler: js.Function1[/* error */ Any, Unit],
    completionHandler: js.Function0[Unit]
  ): Observer[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObserver")(nextHandler.asInstanceOf[js.Any], errorHandler.asInstanceOf[js.Any], completionHandler.asInstanceOf[js.Any])).asInstanceOf[Observer[T]]
  inline def toObserver[T](nextHandler: Unit, errorHandler: Unit, completionHandler: js.Function0[Unit]): Observer[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObserver")(nextHandler.asInstanceOf[js.Any], errorHandler.asInstanceOf[js.Any], completionHandler.asInstanceOf[js.Any])).asInstanceOf[Observer[T]]
  inline def toObserver[T](nextHandler: Partial[Observer[T]]): Observer[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObserver")(nextHandler.asInstanceOf[js.Any]).asInstanceOf[Observer[T]]
  inline def toObserver[T](nextHandler: Partial[Observer[T]], errorHandler: js.Function1[/* error */ Any, Unit]): Observer[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObserver")(nextHandler.asInstanceOf[js.Any], errorHandler.asInstanceOf[js.Any])).asInstanceOf[Observer[T]]
  inline def toObserver[T](
    nextHandler: Partial[Observer[T]],
    errorHandler: js.Function1[/* error */ Any, Unit],
    completionHandler: js.Function0[Unit]
  ): Observer[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObserver")(nextHandler.asInstanceOf[js.Any], errorHandler.asInstanceOf[js.Any], completionHandler.asInstanceOf[js.Any])).asInstanceOf[Observer[T]]
  inline def toObserver[T](nextHandler: Partial[Observer[T]], errorHandler: Unit, completionHandler: js.Function0[Unit]): Observer[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObserver")(nextHandler.asInstanceOf[js.Any], errorHandler.asInstanceOf[js.Any], completionHandler.asInstanceOf[js.Any])).asInstanceOf[Observer[T]]
  
  inline def toSCXMLEvent[TEvent /* <: EventObject */](event: typings.xstate.libTypesMod.Event[TEvent]): Event[TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("toSCXMLEvent")(event.asInstanceOf[js.Any]).asInstanceOf[Event[TEvent]]
  inline def toSCXMLEvent[TEvent /* <: EventObject */](event: typings.xstate.libTypesMod.Event[TEvent], scxmlEvent: Partial[Event[TEvent]]): Event[TEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("toSCXMLEvent")(event.asInstanceOf[js.Any], scxmlEvent.asInstanceOf[js.Any])).asInstanceOf[Event[TEvent]]
  inline def toSCXMLEvent[TEvent /* <: EventObject */](event: Event[TEvent]): Event[TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("toSCXMLEvent")(event.asInstanceOf[js.Any]).asInstanceOf[Event[TEvent]]
  inline def toSCXMLEvent[TEvent /* <: EventObject */](event: Event[TEvent], scxmlEvent: Partial[Event[TEvent]]): Event[TEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("toSCXMLEvent")(event.asInstanceOf[js.Any], scxmlEvent.asInstanceOf[js.Any])).asInstanceOf[Event[TEvent]]
  
  object global {
    
    trait SymbolConstructor extends StObject {
      
      val observable: js.Symbol
    }
    object SymbolConstructor {
      
      inline def apply(observable: js.Symbol): SymbolConstructor = {
        val __obj = js.Dynamic.literal(observable = observable.asInstanceOf[js.Any])
        __obj.asInstanceOf[SymbolConstructor]
      }
      
      extension [Self <: SymbolConstructor](x: Self) {
        
        inline def setObservable(value: js.Symbol): Self = StObject.set(x, "observable", value.asInstanceOf[js.Any])
      }
    }
  }
}

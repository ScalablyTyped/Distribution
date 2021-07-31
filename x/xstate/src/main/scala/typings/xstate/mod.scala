package typings.xstate

import org.scalablytyped.runtime.StringDictionary
import typings.std.Partial
import typings.xstate.actorMod.Actor
import typings.xstate.anon.Context
import typings.xstate.anon.ContextTContext
import typings.xstate.anon.ContextValue
import typings.xstate.anon.Fn0
import typings.xstate.anon.Fn1
import typings.xstate.anon.FnCall
import typings.xstate.anon.FnCallActivity
import typings.xstate.anon.FnCallActorRef
import typings.xstate.anon.FnCallConds
import typings.xstate.anon.FnCallErrorDataOptions
import typings.xstate.anon.FnCallEventOptions
import typings.xstate.anon.FnCallExprLabel
import typings.xstate.anon.FnCallGetActions
import typings.xstate.anon.FnCallMachineOptions
import typings.xstate.anon.FnCallTargetOptions
import typings.xstate.anon.Id
import typings.xstate.anon.PartialInterpreterOptions
import typings.xstate.anon.TypeUpdate
import typings.xstate.anon.Value
import typings.xstate.interpreterMod.SpawnOptions
import typings.xstate.matchMod.StatePatternTuple
import typings.xstate.matchMod.ValueFromStateGetter
import typings.xstate.typesMod.ActionObject
import typings.xstate.typesMod.ActivityActionObject
import typings.xstate.typesMod.ActivityDefinition
import typings.xstate.typesMod.AnyEventObject
import typings.xstate.typesMod.AssignAction
import typings.xstate.typesMod.Assigner
import typings.xstate.typesMod.CancelAction
import typings.xstate.typesMod.ChooseAction
import typings.xstate.typesMod.ChooseConditon
import typings.xstate.typesMod.DoneEvent
import typings.xstate.typesMod.DoneEventObject
import typings.xstate.typesMod.Event
import typings.xstate.typesMod.EventObject
import typings.xstate.typesMod.Expr
import typings.xstate.typesMod.ExprWithMeta
import typings.xstate.typesMod.InterpreterOptions
import typings.xstate.typesMod.LogAction
import typings.xstate.typesMod.LogExpr
import typings.xstate.typesMod.MachineConfig
import typings.xstate.typesMod.MachineOptions
import typings.xstate.typesMod.PropertyAssigner
import typings.xstate.typesMod.PureAction
import typings.xstate.typesMod.RaiseAction
import typings.xstate.typesMod.SendAction
import typings.xstate.typesMod.SendActionOptions
import typings.xstate.typesMod.SendExpr
import typings.xstate.typesMod.SingleOrArray
import typings.xstate.typesMod.Spawnable
import typings.xstate.typesMod.StateConfig
import typings.xstate.typesMod.StateMachine
import typings.xstate.typesMod.StateNodeConfig
import typings.xstate.typesMod.StateSchema
import typings.xstate.typesMod.StateValue
import typings.xstate.typesMod.StopAction
import typings.xstate.typesMod.Typestate
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
    def apply(value: String): js.UndefOr[typings.xstate.typesMod.ActionTypes & String] = js.native
    
    /* "xstate.after" */ val After: typings.xstate.typesMod.ActionTypes.After & String = js.native
    
    /* "xstate.assign" */ val Assign: typings.xstate.typesMod.ActionTypes.Assign & String = js.native
    
    /* "xstate.cancel" */ val Cancel: typings.xstate.typesMod.ActionTypes.Cancel & String = js.native
    
    /* "xstate.choose" */ val Choose: typings.xstate.typesMod.ActionTypes.Choose & String = js.native
    
    /* "done.invoke" */ val DoneInvoke: typings.xstate.typesMod.ActionTypes.DoneInvoke & String = js.native
    
    /* "done.state" */ val DoneState: typings.xstate.typesMod.ActionTypes.DoneState & String = js.native
    
    /* "error.communication" */ val ErrorCommunication: typings.xstate.typesMod.ActionTypes.ErrorCommunication & String = js.native
    
    /* "xstate.error" */ val ErrorCustom: typings.xstate.typesMod.ActionTypes.ErrorCustom & String = js.native
    
    /* "error.execution" */ val ErrorExecution: typings.xstate.typesMod.ActionTypes.ErrorExecution & String = js.native
    
    /* "error.platform" */ val ErrorPlatform: typings.xstate.typesMod.ActionTypes.ErrorPlatform & String = js.native
    
    /* "xstate.init" */ val Init: typings.xstate.typesMod.ActionTypes.Init & String = js.native
    
    /* "xstate.invoke" */ val Invoke: typings.xstate.typesMod.ActionTypes.Invoke & String = js.native
    
    /* "xstate.log" */ val Log: typings.xstate.typesMod.ActionTypes.Log & String = js.native
    
    /* "" */ val NullEvent: typings.xstate.typesMod.ActionTypes.NullEvent & String = js.native
    
    /* "xstate.pure" */ val Pure: typings.xstate.typesMod.ActionTypes.Pure & String = js.native
    
    /* "xstate.raise" */ val Raise: typings.xstate.typesMod.ActionTypes.Raise & String = js.native
    
    /* "xstate.send" */ val Send: typings.xstate.typesMod.ActionTypes.Send & String = js.native
    
    /* "xstate.start" */ val Start: typings.xstate.typesMod.ActionTypes.Start & String = js.native
    
    /* "xstate.stop" */ val Stop: typings.xstate.typesMod.ActionTypes.Stop & String = js.native
    
    /* "xstate.update" */ val Update: typings.xstate.typesMod.ActionTypes.Update & String = js.native
  }
  
  @JSImport("xstate", "Interpreter")
  @js.native
  class Interpreter[TContext, TStateSchema /* <: StateSchema[js.Any] */, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */] protected ()
    extends typings.xstate.interpreterMod.Interpreter[TContext, TStateSchema, TEvent, TTypestate] {
    /**
      * Creates a new Interpreter instance (i.e., service) for the given machine with the provided options, if any.
      *
      * @param machine The machine to be interpreted
      * @param options Interpreter options
      */
    def this(machine: StateMachine[TContext, TStateSchema, TEvent, TTypestate]) = this()
    def this(
      machine: StateMachine[TContext, TStateSchema, TEvent, TTypestate],
      options: PartialInterpreterOptions
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
    def defaultOptions: InterpreterOptions = js.native
    @scala.inline
    def defaultOptions_=(x: InterpreterOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(x.asInstanceOf[js.Any])
    
    @JSImport("xstate", "Interpreter.interpret")
    @js.native
    def interpret: FnCallMachineOptions = js.native
    @scala.inline
    def interpret[TContext, TStateSchema /* <: StateSchema[js.Any] */, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */](machine: StateMachine[TContext, TStateSchema, TEvent, TTypestate]): typings.xstate.interpreterMod.Interpreter[TContext, TStateSchema, TEvent, TTypestate] = ^.asInstanceOf[js.Dynamic].applyDynamic("interpret")(machine.asInstanceOf[js.Any]).asInstanceOf[typings.xstate.interpreterMod.Interpreter[TContext, TStateSchema, TEvent, TTypestate]]
    @scala.inline
    def interpret[TContext, TStateSchema /* <: StateSchema[js.Any] */, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */](
      machine: StateMachine[TContext, TStateSchema, TEvent, TTypestate],
      options: PartialInterpreterOptions
    ): typings.xstate.interpreterMod.Interpreter[TContext, TStateSchema, TEvent, TTypestate] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpret")(machine.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.xstate.interpreterMod.Interpreter[TContext, TStateSchema, TEvent, TTypestate]]
    @scala.inline
    def interpret_=(x: FnCallMachineOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("interpret")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("xstate", "InterpreterStatus")
  @js.native
  object InterpreterStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.xstate.interpreterMod.InterpreterStatus & Double] = js.native
    
    /* 0 */ val NotStarted: typings.xstate.interpreterMod.InterpreterStatus.NotStarted & Double = js.native
    
    /* 1 */ val Running: typings.xstate.interpreterMod.InterpreterStatus.Running & Double = js.native
    
    /* 2 */ val Stopped: typings.xstate.interpreterMod.InterpreterStatus.Stopped & Double = js.native
  }
  
  @scala.inline
  def Machine[TContext, TEvent /* <: EventObject */](config: MachineConfig[TContext, js.Any, TEvent]): StateMachine[TContext, js.Any, TEvent, Value[TContext]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Machine")(config.asInstanceOf[js.Any]).asInstanceOf[StateMachine[TContext, js.Any, TEvent, Value[TContext]]]
  @scala.inline
  def Machine[TContext, TEvent /* <: EventObject */](config: MachineConfig[TContext, js.Any, TEvent], options: Unit, initialContext: TContext): StateMachine[TContext, js.Any, TEvent, Value[TContext]] = (^.asInstanceOf[js.Dynamic].applyDynamic("Machine")(config.asInstanceOf[js.Any], options.asInstanceOf[js.Any], initialContext.asInstanceOf[js.Any])).asInstanceOf[StateMachine[TContext, js.Any, TEvent, Value[TContext]]]
  @scala.inline
  def Machine[TContext, TEvent /* <: EventObject */](
    config: MachineConfig[TContext, js.Any, TEvent],
    options: Partial[MachineOptions[TContext, TEvent]]
  ): StateMachine[TContext, js.Any, TEvent, Value[TContext]] = (^.asInstanceOf[js.Dynamic].applyDynamic("Machine")(config.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StateMachine[TContext, js.Any, TEvent, Value[TContext]]]
  @scala.inline
  def Machine[TContext, TEvent /* <: EventObject */](
    config: MachineConfig[TContext, js.Any, TEvent],
    options: Partial[MachineOptions[TContext, TEvent]],
    initialContext: TContext
  ): StateMachine[TContext, js.Any, TEvent, Value[TContext]] = (^.asInstanceOf[js.Dynamic].applyDynamic("Machine")(config.asInstanceOf[js.Any], options.asInstanceOf[js.Any], initialContext.asInstanceOf[js.Any])).asInstanceOf[StateMachine[TContext, js.Any, TEvent, Value[TContext]]]
  
  @scala.inline
  def Machine_TContextTStateSchema_StateSchemaAnyTEvent_EventObject[TContext, TStateSchema /* <: StateSchema[js.Any] */, TEvent /* <: EventObject */](config: MachineConfig[TContext, TStateSchema, TEvent]): StateMachine[TContext, TStateSchema, TEvent, ContextValue[TContext]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Machine")(config.asInstanceOf[js.Any]).asInstanceOf[StateMachine[TContext, TStateSchema, TEvent, ContextValue[TContext]]]
  @scala.inline
  def Machine_TContextTStateSchema_StateSchemaAnyTEvent_EventObject[TContext, TStateSchema /* <: StateSchema[js.Any] */, TEvent /* <: EventObject */](config: MachineConfig[TContext, TStateSchema, TEvent], options: Unit, initialContext: TContext): StateMachine[TContext, TStateSchema, TEvent, ContextValue[TContext]] = (^.asInstanceOf[js.Dynamic].applyDynamic("Machine")(config.asInstanceOf[js.Any], options.asInstanceOf[js.Any], initialContext.asInstanceOf[js.Any])).asInstanceOf[StateMachine[TContext, TStateSchema, TEvent, ContextValue[TContext]]]
  @scala.inline
  def Machine_TContextTStateSchema_StateSchemaAnyTEvent_EventObject[TContext, TStateSchema /* <: StateSchema[js.Any] */, TEvent /* <: EventObject */](
    config: MachineConfig[TContext, TStateSchema, TEvent],
    options: Partial[MachineOptions[TContext, TEvent]]
  ): StateMachine[TContext, TStateSchema, TEvent, ContextValue[TContext]] = (^.asInstanceOf[js.Dynamic].applyDynamic("Machine")(config.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StateMachine[TContext, TStateSchema, TEvent, ContextValue[TContext]]]
  @scala.inline
  def Machine_TContextTStateSchema_StateSchemaAnyTEvent_EventObject[TContext, TStateSchema /* <: StateSchema[js.Any] */, TEvent /* <: EventObject */](
    config: MachineConfig[TContext, TStateSchema, TEvent],
    options: Partial[MachineOptions[TContext, TEvent]],
    initialContext: TContext
  ): StateMachine[TContext, TStateSchema, TEvent, ContextValue[TContext]] = (^.asInstanceOf[js.Dynamic].applyDynamic("Machine")(config.asInstanceOf[js.Any], options.asInstanceOf[js.Any], initialContext.asInstanceOf[js.Any])).asInstanceOf[StateMachine[TContext, TStateSchema, TEvent, ContextValue[TContext]]]
  
  @JSImport("xstate", "SpecialTargets")
  @js.native
  object SpecialTargets extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.xstate.typesMod.SpecialTargets & String] = js.native
    
    /* "#_internal" */ val Internal: typings.xstate.typesMod.SpecialTargets.Internal & String = js.native
    
    /* "#_parent" */ val Parent: typings.xstate.typesMod.SpecialTargets.Parent & String = js.native
  }
  
  @JSImport("xstate", "State")
  @js.native
  class State[TContext, TEvent /* <: EventObject */, TStateSchema /* <: StateSchema[TContext] */, TTypestate /* <: Typestate[TContext] */] protected ()
    extends typings.xstate.stateMod.State[TContext, TEvent, TStateSchema, TTypestate] {
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
    @scala.inline
    def create[TC, TE /* <: EventObject */](config: StateConfig[TC, TE]): typings.xstate.stateMod.State[TC, TE, js.Any, Context[TC]] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any]).asInstanceOf[typings.xstate.stateMod.State[TC, TE, js.Any, Context[TC]]]
    
    /**
      * Creates a new State instance for the given `stateValue` and `context`.
      * @param stateValue
      * @param context
      */
    @scala.inline
    def from[TC, TE /* <: EventObject */](stateValue: typings.xstate.stateMod.State[TC, TE, js.Any, Context[TC]]): typings.xstate.stateMod.State[TC, TE, js.Any, Context[TC]] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(stateValue.asInstanceOf[js.Any]).asInstanceOf[typings.xstate.stateMod.State[TC, TE, js.Any, Context[TC]]]
    @scala.inline
    def from[TC, TE /* <: EventObject */](stateValue: typings.xstate.stateMod.State[TC, TE, js.Any, Context[TC]], context: TC): typings.xstate.stateMod.State[TC, TE, js.Any, Context[TC]] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(stateValue.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typings.xstate.stateMod.State[TC, TE, js.Any, Context[TC]]]
    @scala.inline
    def from[TC, TE /* <: EventObject */](stateValue: StateValue): typings.xstate.stateMod.State[TC, TE, js.Any, Context[TC]] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(stateValue.asInstanceOf[js.Any]).asInstanceOf[typings.xstate.stateMod.State[TC, TE, js.Any, Context[TC]]]
    @scala.inline
    def from[TC, TE /* <: EventObject */](stateValue: StateValue, context: TC): typings.xstate.stateMod.State[TC, TE, js.Any, Context[TC]] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(stateValue.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typings.xstate.stateMod.State[TC, TE, js.Any, Context[TC]]]
    
    /**
      * Creates a new `State` instance for the given `stateValue` and `context` with no actions (side-effects).
      * @param stateValue
      * @param context
      */
    @scala.inline
    def inert[TC, TE /* <: EventObject */](stateValue: typings.xstate.stateMod.State[TC, TE, js.Any, Context[TC]], context: TC): typings.xstate.stateMod.State[TC, TE, js.Any, Context[TC]] = (^.asInstanceOf[js.Dynamic].applyDynamic("inert")(stateValue.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typings.xstate.stateMod.State[TC, TE, js.Any, Context[TC]]]
    @scala.inline
    def inert[TC, TE /* <: EventObject */](stateValue: StateValue, context: TC): typings.xstate.stateMod.State[TC, TE, js.Any, Context[TC]] = (^.asInstanceOf[js.Dynamic].applyDynamic("inert")(stateValue.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typings.xstate.stateMod.State[TC, TE, js.Any, Context[TC]]]
  }
  
  @JSImport("xstate", "StateNode")
  @js.native
  class StateNode[TContext, TStateSchema /* <: StateSchema[js.Any] */, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */] protected ()
    extends typings.xstate.stateNodeMod.StateNode[TContext, TStateSchema, TEvent, TTypestate] {
    def this(/**
      * The raw config used to create the machine.
      */
    config: StateNodeConfig[TContext, TStateSchema, TEvent]) = this()
    def this(
      /**
      * The raw config used to create the machine.
      */
    config: StateNodeConfig[TContext, TStateSchema, TEvent],
      options: Partial[MachineOptions[TContext, TEvent]]
    ) = this()
    def this(
      /**
      * The raw config used to create the machine.
      */
    config: StateNodeConfig[TContext, TStateSchema, TEvent],
      options: Unit,
      /**
      * The initial extended state
      */
    context: TContext
    ) = this()
    def this(
      /**
      * The raw config used to create the machine.
      */
    config: StateNodeConfig[TContext, TStateSchema, TEvent],
      options: Partial[MachineOptions[TContext, TEvent]],
      /**
      * The initial extended state
      */
    context: TContext
    ) = this()
  }
  
  object actions {
    
    @JSImport("xstate", "actions")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("xstate", "actions.after")
    @js.native
    def after: js.Function2[/* delayRef */ Double | String, /* id */ js.UndefOr[String], String] = js.native
    @scala.inline
    def after(delayRef: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("after")(delayRef.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def after(delayRef: String, id: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("after")(delayRef.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def after(delayRef: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("after")(delayRef.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def after(delayRef: Double, id: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("after")(delayRef.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def after_=(x: js.Function2[/* delayRef */ Double | String, /* id */ js.UndefOr[String], String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("after")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def assign[TContext, TEvent /* <: EventObject */](assignment: Assigner[TContext, TEvent]): AssignAction[TContext, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("assign")(assignment.asInstanceOf[js.Any]).asInstanceOf[AssignAction[TContext, TEvent]]
    @scala.inline
    def assign[TContext, TEvent /* <: EventObject */](assignment: PropertyAssigner[TContext, TEvent]): AssignAction[TContext, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("assign")(assignment.asInstanceOf[js.Any]).asInstanceOf[AssignAction[TContext, TEvent]]
    
    @scala.inline
    def cancel(sendId: String): CancelAction = ^.asInstanceOf[js.Dynamic].applyDynamic("cancel")(sendId.asInstanceOf[js.Any]).asInstanceOf[CancelAction]
    @scala.inline
    def cancel(sendId: Double): CancelAction = ^.asInstanceOf[js.Dynamic].applyDynamic("cancel")(sendId.asInstanceOf[js.Any]).asInstanceOf[CancelAction]
    
    @JSImport("xstate", "actions.choose")
    @js.native
    def choose: FnCallConds = js.native
    @scala.inline
    def choose[TContext, TEvent /* <: EventObject */](conds: js.Array[ChooseConditon[TContext, TEvent]]): ChooseAction[TContext, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("choose")(conds.asInstanceOf[js.Any]).asInstanceOf[ChooseAction[TContext, TEvent]]
    @scala.inline
    def choose_=(x: FnCallConds): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("choose")(x.asInstanceOf[js.Any])
    
    @JSImport("xstate", "actions.done")
    @js.native
    def done: js.Function2[/* id */ String, /* data */ js.UndefOr[js.Any], DoneEventObject] = js.native
    @scala.inline
    def done(id: String): DoneEventObject = ^.asInstanceOf[js.Dynamic].applyDynamic("done")(id.asInstanceOf[js.Any]).asInstanceOf[DoneEventObject]
    @scala.inline
    def done(id: String, data: js.Any): DoneEventObject = (^.asInstanceOf[js.Dynamic].applyDynamic("done")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[DoneEventObject]
    @scala.inline
    def done_=(x: js.Function2[/* id */ String, /* data */ js.UndefOr[js.Any], DoneEventObject]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("done")(x.asInstanceOf[js.Any])
    
    @JSImport("xstate", "actions.escalate")
    @js.native
    def escalate: FnCallErrorDataOptions = js.native
    @scala.inline
    def escalate[TContext, TEvent /* <: EventObject */, TErrorData](errorData: TErrorData): SendAction[TContext, TEvent, AnyEventObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("escalate")(errorData.asInstanceOf[js.Any]).asInstanceOf[SendAction[TContext, TEvent, AnyEventObject]]
    @scala.inline
    def escalate[TContext, TEvent /* <: EventObject */, TErrorData](errorData: TErrorData, options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent, AnyEventObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("escalate")(errorData.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, AnyEventObject]]
    @scala.inline
    def escalate[TContext, TEvent /* <: EventObject */, TErrorData](errorData: ExprWithMeta[TContext, TEvent, TErrorData]): SendAction[TContext, TEvent, AnyEventObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("escalate")(errorData.asInstanceOf[js.Any]).asInstanceOf[SendAction[TContext, TEvent, AnyEventObject]]
    @scala.inline
    def escalate[TContext, TEvent /* <: EventObject */, TErrorData](
      errorData: ExprWithMeta[TContext, TEvent, TErrorData],
      options: SendActionOptions[TContext, TEvent]
    ): SendAction[TContext, TEvent, AnyEventObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("escalate")(errorData.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, AnyEventObject]]
    @scala.inline
    def escalate_=(x: FnCallErrorDataOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("escalate")(x.asInstanceOf[js.Any])
    
    @JSImport("xstate", "actions.forwardTo")
    @js.native
    def forwardTo: FnCallTargetOptions = js.native
    @scala.inline
    def forwardTo_=(x: FnCallTargetOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("forwardTo")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def forwardTo_to[TContext, TEvent /* <: EventObject */](
      target: /* import warning: importer.ImportType#apply Failed type conversion: std.Required<xstate.xstate/lib/types.SendActionOptions<TContext, TEvent>>['to'] */ js.Any
    ): SendAction[TContext, TEvent, AnyEventObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("forwardTo")(target.asInstanceOf[js.Any]).asInstanceOf[SendAction[TContext, TEvent, AnyEventObject]]
    @scala.inline
    def forwardTo_to[TContext, TEvent /* <: EventObject */](
      target: /* import warning: importer.ImportType#apply Failed type conversion: std.Required<xstate.xstate/lib/types.SendActionOptions<TContext, TEvent>>['to'] */ js.Any,
      options: SendActionOptions[TContext, TEvent]
    ): SendAction[TContext, TEvent, AnyEventObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("forwardTo")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, AnyEventObject]]
    
    @scala.inline
    def log[TContext, TEvent /* <: EventObject */](): LogAction[TContext, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("log")().asInstanceOf[LogAction[TContext, TEvent]]
    @scala.inline
    def log[TContext, TEvent /* <: EventObject */](expr: String): LogAction[TContext, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(expr.asInstanceOf[js.Any]).asInstanceOf[LogAction[TContext, TEvent]]
    @scala.inline
    def log[TContext, TEvent /* <: EventObject */](expr: String, label: String): LogAction[TContext, TEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("log")(expr.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[LogAction[TContext, TEvent]]
    @scala.inline
    def log[TContext, TEvent /* <: EventObject */](expr: Unit, label: String): LogAction[TContext, TEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("log")(expr.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[LogAction[TContext, TEvent]]
    @scala.inline
    def log[TContext, TEvent /* <: EventObject */](expr: LogExpr[TContext, TEvent]): LogAction[TContext, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(expr.asInstanceOf[js.Any]).asInstanceOf[LogAction[TContext, TEvent]]
    @scala.inline
    def log[TContext, TEvent /* <: EventObject */](expr: LogExpr[TContext, TEvent], label: String): LogAction[TContext, TEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("log")(expr.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[LogAction[TContext, TEvent]]
    @JSImport("xstate", "actions.log")
    @js.native
    def log_Factions: FnCallExprLabel = js.native
    
    @scala.inline
    def log_Factions_=(x: FnCallExprLabel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("log")(x.asInstanceOf[js.Any])
    
    @JSImport("xstate", "actions.pure")
    @js.native
    def pure: FnCallGetActions = js.native
    @scala.inline
    def pure[TContext, TEvent /* <: EventObject */](
      getActions: js.Function2[
          /* context */ TContext, 
          /* event */ TEvent, 
          js.UndefOr[SingleOrArray[ActionObject[TContext, TEvent]]]
        ]
    ): PureAction[TContext, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("pure")(getActions.asInstanceOf[js.Any]).asInstanceOf[PureAction[TContext, TEvent]]
    @scala.inline
    def pure_=(x: FnCallGetActions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pure")(x.asInstanceOf[js.Any])
    
    @JSImport("xstate", "actions.raise")
    @js.native
    def raise: FnCall = js.native
    @scala.inline
    def raise[TContext, TEvent /* <: EventObject */](event: Event[TEvent]): RaiseAction[TEvent] | (SendAction[TContext, AnyEventObject, TEvent]) = ^.asInstanceOf[js.Dynamic].applyDynamic("raise")(event.asInstanceOf[js.Any]).asInstanceOf[RaiseAction[TEvent] | (SendAction[TContext, AnyEventObject, TEvent])]
    @scala.inline
    def raise_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("raise")(x.asInstanceOf[js.Any])
    
    @JSImport("xstate", "actions.respond")
    @js.native
    def respond: Fn1 = js.native
    @scala.inline
    def respond[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: Event[TEvent]): SendAction[TContext, TEvent, AnyEventObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("respond")(event.asInstanceOf[js.Any]).asInstanceOf[SendAction[TContext, TEvent, AnyEventObject]]
    @scala.inline
    def respond[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: Event[TEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent, AnyEventObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("respond")(event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, AnyEventObject]]
    @scala.inline
    def respond[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: SendExpr[TContext, TEvent, TSentEvent]): SendAction[TContext, TEvent, AnyEventObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("respond")(event.asInstanceOf[js.Any]).asInstanceOf[SendAction[TContext, TEvent, AnyEventObject]]
    @scala.inline
    def respond[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: SendExpr[TContext, TEvent, TSentEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent, AnyEventObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("respond")(event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, AnyEventObject]]
    @scala.inline
    def respond_=(x: Fn1): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("respond")(x.asInstanceOf[js.Any])
    
    @JSImport("xstate", "actions.send")
    @js.native
    def send: FnCallEventOptions = js.native
    @scala.inline
    def send[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: Event[TSentEvent]): SendAction[TContext, TEvent, TSentEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("send")(event.asInstanceOf[js.Any]).asInstanceOf[SendAction[TContext, TEvent, TSentEvent]]
    @scala.inline
    def send[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: Event[TSentEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent, TSentEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("send")(event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, TSentEvent]]
    @scala.inline
    def send[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: SendExpr[TContext, TEvent, TSentEvent]): SendAction[TContext, TEvent, TSentEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("send")(event.asInstanceOf[js.Any]).asInstanceOf[SendAction[TContext, TEvent, TSentEvent]]
    @scala.inline
    def send[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: SendExpr[TContext, TEvent, TSentEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent, TSentEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("send")(event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, TSentEvent]]
    
    @JSImport("xstate", "actions.sendParent")
    @js.native
    def sendParent: FnCallEventOptions = js.native
    @scala.inline
    def sendParent[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: Event[TSentEvent]): SendAction[TContext, TEvent, TSentEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("sendParent")(event.asInstanceOf[js.Any]).asInstanceOf[SendAction[TContext, TEvent, TSentEvent]]
    @scala.inline
    def sendParent[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: Event[TSentEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent, TSentEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendParent")(event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, TSentEvent]]
    @scala.inline
    def sendParent[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: SendExpr[TContext, TEvent, TSentEvent]): SendAction[TContext, TEvent, TSentEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("sendParent")(event.asInstanceOf[js.Any]).asInstanceOf[SendAction[TContext, TEvent, TSentEvent]]
    @scala.inline
    def sendParent[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: SendExpr[TContext, TEvent, TSentEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent, TSentEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendParent")(event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, TSentEvent]]
    @scala.inline
    def sendParent_=(x: FnCallEventOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sendParent")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def sendUpdate[TContext, TEvent /* <: EventObject */](): SendAction[TContext, TEvent, TypeUpdate] = ^.asInstanceOf[js.Dynamic].applyDynamic("sendUpdate")().asInstanceOf[SendAction[TContext, TEvent, TypeUpdate]]
    @JSImport("xstate", "actions.sendUpdate")
    @js.native
    def sendUpdate_Factions: Fn0 = js.native
    
    @scala.inline
    def sendUpdate_Factions_=(x: Fn0): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sendUpdate")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def send_=(x: FnCallEventOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("send")(x.asInstanceOf[js.Any])
    
    @JSImport("xstate", "actions.start")
    @js.native
    def start: FnCallActivity = js.native
    @scala.inline
    def start[TContext, TEvent /* <: EventObject */](activity: String): ActivityActionObject[TContext, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(activity.asInstanceOf[js.Any]).asInstanceOf[ActivityActionObject[TContext, TEvent]]
    @scala.inline
    def start[TContext, TEvent /* <: EventObject */](activity: ActivityDefinition[TContext, TEvent]): ActivityActionObject[TContext, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(activity.asInstanceOf[js.Any]).asInstanceOf[ActivityActionObject[TContext, TEvent]]
    @scala.inline
    def start_=(x: FnCallActivity): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("start")(x.asInstanceOf[js.Any])
    
    @JSImport("xstate", "actions.stop")
    @js.native
    def stop: FnCallActorRef = js.native
    @scala.inline
    def stop[TContext, TEvent /* <: EventObject */](actorRef: String): StopAction[TContext, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")(actorRef.asInstanceOf[js.Any]).asInstanceOf[StopAction[TContext, TEvent]]
    @scala.inline
    def stop[TContext, TEvent /* <: EventObject */](actorRef: ActivityDefinition[TContext, TEvent]): StopAction[TContext, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")(actorRef.asInstanceOf[js.Any]).asInstanceOf[StopAction[TContext, TEvent]]
    @scala.inline
    def stop[TContext, TEvent /* <: EventObject */](actorRef: Expr[TContext, TEvent, String | Id]): StopAction[TContext, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")(actorRef.asInstanceOf[js.Any]).asInstanceOf[StopAction[TContext, TEvent]]
    @scala.inline
    def stop_=(x: FnCallActorRef): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stop")(x.asInstanceOf[js.Any])
  }
  
  @scala.inline
  def assign[TContext, TEvent /* <: EventObject */](assignment: Assigner[TContext, TEvent]): AssignAction[TContext, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("assign")(assignment.asInstanceOf[js.Any]).asInstanceOf[AssignAction[TContext, TEvent]]
  @scala.inline
  def assign[TContext, TEvent /* <: EventObject */](assignment: PropertyAssigner[TContext, TEvent]): AssignAction[TContext, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("assign")(assignment.asInstanceOf[js.Any]).asInstanceOf[AssignAction[TContext, TEvent]]
  
  @scala.inline
  def createMachine[TContext, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */](config: MachineConfig[TContext, js.Any, TEvent]): StateMachine[TContext, js.Any, TEvent, TTypestate] = ^.asInstanceOf[js.Dynamic].applyDynamic("createMachine")(config.asInstanceOf[js.Any]).asInstanceOf[StateMachine[TContext, js.Any, TEvent, TTypestate]]
  @scala.inline
  def createMachine[TContext, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */](
    config: MachineConfig[TContext, js.Any, TEvent],
    options: Partial[MachineOptions[TContext, TEvent]]
  ): StateMachine[TContext, js.Any, TEvent, TTypestate] = (^.asInstanceOf[js.Dynamic].applyDynamic("createMachine")(config.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StateMachine[TContext, js.Any, TEvent, TTypestate]]
  
  @scala.inline
  def doneInvoke(id: String): DoneEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("doneInvoke")(id.asInstanceOf[js.Any]).asInstanceOf[DoneEvent]
  @scala.inline
  def doneInvoke(id: String, data: js.Any): DoneEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("doneInvoke")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[DoneEvent]
  
  @scala.inline
  def forwardTo_to[TContext, TEvent /* <: EventObject */](
    target: /* import warning: importer.ImportType#apply Failed type conversion: std.Required<xstate.xstate/lib/types.SendActionOptions<TContext, TEvent>>['to'] */ js.Any
  ): SendAction[TContext, TEvent, AnyEventObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("forwardTo")(target.asInstanceOf[js.Any]).asInstanceOf[SendAction[TContext, TEvent, AnyEventObject]]
  @scala.inline
  def forwardTo_to[TContext, TEvent /* <: EventObject */](
    target: /* import warning: importer.ImportType#apply Failed type conversion: std.Required<xstate.xstate/lib/types.SendActionOptions<TContext, TEvent>>['to'] */ js.Any,
    options: SendActionOptions[TContext, TEvent]
  ): SendAction[TContext, TEvent, AnyEventObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("forwardTo")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, AnyEventObject]]
  
  @scala.inline
  def interpret[TContext, TStateSchema /* <: StateSchema[js.Any] */, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */](machine: StateMachine[TContext, TStateSchema, TEvent, TTypestate]): typings.xstate.interpreterMod.Interpreter[TContext, TStateSchema, TEvent, TTypestate] = ^.asInstanceOf[js.Dynamic].applyDynamic("interpret")(machine.asInstanceOf[js.Any]).asInstanceOf[typings.xstate.interpreterMod.Interpreter[TContext, TStateSchema, TEvent, TTypestate]]
  @scala.inline
  def interpret[TContext, TStateSchema /* <: StateSchema[js.Any] */, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */](
    machine: StateMachine[TContext, TStateSchema, TEvent, TTypestate],
    options: PartialInterpreterOptions
  ): typings.xstate.interpreterMod.Interpreter[TContext, TStateSchema, TEvent, TTypestate] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpret")(machine.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.xstate.interpreterMod.Interpreter[TContext, TStateSchema, TEvent, TTypestate]]
  
  @scala.inline
  def mapState(stateMap: StringDictionary[js.Any], stateId: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mapState")(stateMap.asInstanceOf[js.Any], stateId.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def matchState[T, TContext, TEvent /* <: EventObject */](
    state: typings.xstate.stateMod.State[TContext, TEvent, js.Any, ContextTContext[TContext]],
    patterns: js.Array[StatePatternTuple[T, TContext, TEvent]],
    defaultValue: ValueFromStateGetter[T, TContext, TEvent]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("matchState")(state.asInstanceOf[js.Any], patterns.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def matchState[T, TContext, TEvent /* <: EventObject */](
    state: StateValue,
    patterns: js.Array[StatePatternTuple[T, TContext, TEvent]],
    defaultValue: ValueFromStateGetter[T, TContext, TEvent]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("matchState")(state.asInstanceOf[js.Any], patterns.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def matchesState(parentStateId: StateValue, childStateId: StateValue): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchesState")(parentStateId.asInstanceOf[js.Any], childStateId.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def matchesState(parentStateId: StateValue, childStateId: StateValue, delimiter: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchesState")(parentStateId.asInstanceOf[js.Any], childStateId.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def send[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: Event[TSentEvent]): SendAction[TContext, TEvent, TSentEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("send")(event.asInstanceOf[js.Any]).asInstanceOf[SendAction[TContext, TEvent, TSentEvent]]
  @scala.inline
  def send[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: Event[TSentEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent, TSentEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("send")(event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, TSentEvent]]
  @scala.inline
  def send[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: SendExpr[TContext, TEvent, TSentEvent]): SendAction[TContext, TEvent, TSentEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("send")(event.asInstanceOf[js.Any]).asInstanceOf[SendAction[TContext, TEvent, TSentEvent]]
  @scala.inline
  def send[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: SendExpr[TContext, TEvent, TSentEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent, TSentEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("send")(event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, TSentEvent]]
  
  @scala.inline
  def sendParent[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: Event[TSentEvent]): SendAction[TContext, TEvent, TSentEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("sendParent")(event.asInstanceOf[js.Any]).asInstanceOf[SendAction[TContext, TEvent, TSentEvent]]
  @scala.inline
  def sendParent[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: Event[TSentEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent, TSentEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendParent")(event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, TSentEvent]]
  @scala.inline
  def sendParent[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: SendExpr[TContext, TEvent, TSentEvent]): SendAction[TContext, TEvent, TSentEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("sendParent")(event.asInstanceOf[js.Any]).asInstanceOf[SendAction[TContext, TEvent, TSentEvent]]
  @scala.inline
  def sendParent[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: SendExpr[TContext, TEvent, TSentEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent, TSentEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendParent")(event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, TSentEvent]]
  
  @scala.inline
  def sendUpdate[TContext, TEvent /* <: EventObject */](): SendAction[TContext, TEvent, TypeUpdate] = ^.asInstanceOf[js.Dynamic].applyDynamic("sendUpdate")().asInstanceOf[SendAction[TContext, TEvent, TypeUpdate]]
  
  @scala.inline
  def spawn(entity: Spawnable): Actor[js.Any, AnyEventObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(entity.asInstanceOf[js.Any]).asInstanceOf[Actor[js.Any, AnyEventObject]]
  @scala.inline
  def spawn(entity: Spawnable, nameOrOptions: String): Actor[js.Any, AnyEventObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(entity.asInstanceOf[js.Any], nameOrOptions.asInstanceOf[js.Any])).asInstanceOf[Actor[js.Any, AnyEventObject]]
  @scala.inline
  def spawn(entity: Spawnable, nameOrOptions: SpawnOptions): Actor[js.Any, AnyEventObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(entity.asInstanceOf[js.Any], nameOrOptions.asInstanceOf[js.Any])).asInstanceOf[Actor[js.Any, AnyEventObject]]
  @scala.inline
  def spawn[TC, TE /* <: EventObject */](entity: StateMachine[TC, js.Any, TE, Context[TC]]): Actor[typings.xstate.stateMod.State[TC, TE, js.Any, Context[TC]], TE] = ^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(entity.asInstanceOf[js.Any]).asInstanceOf[Actor[typings.xstate.stateMod.State[TC, TE, js.Any, Context[TC]], TE]]
  @scala.inline
  def spawn[TC, TE /* <: EventObject */](entity: StateMachine[TC, js.Any, TE, Context[TC]], nameOrOptions: String): Actor[typings.xstate.stateMod.State[TC, TE, js.Any, Context[TC]], TE] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(entity.asInstanceOf[js.Any], nameOrOptions.asInstanceOf[js.Any])).asInstanceOf[Actor[typings.xstate.stateMod.State[TC, TE, js.Any, Context[TC]], TE]]
  @scala.inline
  def spawn[TC, TE /* <: EventObject */](entity: StateMachine[TC, js.Any, TE, Context[TC]], nameOrOptions: SpawnOptions): Actor[typings.xstate.stateMod.State[TC, TE, js.Any, Context[TC]], TE] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(entity.asInstanceOf[js.Any], nameOrOptions.asInstanceOf[js.Any])).asInstanceOf[Actor[typings.xstate.stateMod.State[TC, TE, js.Any, Context[TC]], TE]]
}

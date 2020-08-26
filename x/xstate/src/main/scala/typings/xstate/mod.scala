package typings.xstate

import org.scalablytyped.runtime.StringDictionary
import typings.std.Partial
import typings.xstate.actorMod.Actor
import typings.xstate.anon.Context
import typings.xstate.anon.Fn0
import typings.xstate.anon.Fn1
import typings.xstate.anon.FnCall
import typings.xstate.anon.FnCallActivity
import typings.xstate.anon.FnCallConds
import typings.xstate.anon.FnCallErrorDataOptions
import typings.xstate.anon.FnCallEventOptions
import typings.xstate.anon.FnCallExprLabel
import typings.xstate.anon.FnCallGetActions
import typings.xstate.anon.FnCallMachineOptions
import typings.xstate.anon.FnCallTargetOptions
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
import typings.xstate.typesMod.Typestate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Interpreter[TContext, TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */] protected ()
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
  
  @js.native
  class StateNode[TContext, TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */] protected ()
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
      options: js.UndefOr[scala.Nothing],
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
  
  def Machine[TContext, TEvent /* <: EventObject */](config: MachineConfig[TContext, _, TEvent]): StateMachine[TContext, _, TEvent, _] = js.native
  def Machine[TContext, TEvent /* <: EventObject */](
    config: MachineConfig[TContext, _, TEvent],
    options: js.UndefOr[scala.Nothing],
    initialContext: TContext
  ): StateMachine[TContext, _, TEvent, _] = js.native
  def Machine[TContext, TEvent /* <: EventObject */](config: MachineConfig[TContext, _, TEvent], options: Partial[MachineOptions[TContext, TEvent]]): StateMachine[TContext, _, TEvent, _] = js.native
  def Machine[TContext, TEvent /* <: EventObject */](
    config: MachineConfig[TContext, _, TEvent],
    options: Partial[MachineOptions[TContext, TEvent]],
    initialContext: TContext
  ): StateMachine[TContext, _, TEvent, _] = js.native
  @JSName("Machine")
  def Machine_TContextTStateSchema_StateSchemaWildcardTEvent_EventObject[TContext, TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */](config: MachineConfig[TContext, TStateSchema, TEvent]): StateMachine[TContext, TStateSchema, TEvent, _] = js.native
  @JSName("Machine")
  def Machine_TContextTStateSchema_StateSchemaWildcardTEvent_EventObject[TContext, TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */](
    config: MachineConfig[TContext, TStateSchema, TEvent],
    options: js.UndefOr[scala.Nothing],
    initialContext: TContext
  ): StateMachine[TContext, TStateSchema, TEvent, _] = js.native
  @JSName("Machine")
  def Machine_TContextTStateSchema_StateSchemaWildcardTEvent_EventObject[TContext, TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */](
    config: MachineConfig[TContext, TStateSchema, TEvent],
    options: Partial[MachineOptions[TContext, TEvent]]
  ): StateMachine[TContext, TStateSchema, TEvent, _] = js.native
  @JSName("Machine")
  def Machine_TContextTStateSchema_StateSchemaWildcardTEvent_EventObject[TContext, TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */](
    config: MachineConfig[TContext, TStateSchema, TEvent],
    options: Partial[MachineOptions[TContext, TEvent]],
    initialContext: TContext
  ): StateMachine[TContext, TStateSchema, TEvent, _] = js.native
  def assign[TContext, TEvent /* <: EventObject */](assignment: Assigner[TContext, TEvent]): AssignAction[TContext, TEvent] = js.native
  def assign[TContext, TEvent /* <: EventObject */](assignment: PropertyAssigner[TContext, TEvent]): AssignAction[TContext, TEvent] = js.native
  def createMachine[TContext, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */](config: MachineConfig[TContext, _, TEvent]): StateMachine[TContext, _, TEvent, TTypestate] = js.native
  def createMachine[TContext, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */](config: MachineConfig[TContext, _, TEvent], options: Partial[MachineOptions[TContext, TEvent]]): StateMachine[TContext, _, TEvent, TTypestate] = js.native
  def doneInvoke(id: String): DoneEvent = js.native
  def doneInvoke(id: String, data: js.Any): DoneEvent = js.native
  @JSName("forwardTo")
  def forwardTo_to[TContext, TEvent /* <: EventObject */](
    target: /* import warning: importer.ImportType#apply Failed type conversion: std.Required<xstate.xstate/lib/types.SendActionOptions<TContext, TEvent>>['to'] */ js.Any
  ): SendAction[TContext, TEvent, AnyEventObject] = js.native
  @JSName("forwardTo")
  def forwardTo_to[TContext, TEvent /* <: EventObject */](
    target: /* import warning: importer.ImportType#apply Failed type conversion: std.Required<xstate.xstate/lib/types.SendActionOptions<TContext, TEvent>>['to'] */ js.Any,
    options: SendActionOptions[TContext, TEvent]
  ): SendAction[TContext, TEvent, AnyEventObject] = js.native
  def interpret[TContext, TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */](machine: StateMachine[TContext, TStateSchema, TEvent, TTypestate]): typings.xstate.interpreterMod.Interpreter[TContext, TStateSchema, TEvent, TTypestate] = js.native
  def interpret[TContext, TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */](
    machine: StateMachine[TContext, TStateSchema, TEvent, TTypestate],
    options: PartialInterpreterOptions
  ): typings.xstate.interpreterMod.Interpreter[TContext, TStateSchema, TEvent, TTypestate] = js.native
  def mapState(stateMap: StringDictionary[js.Any], stateId: String): js.Any = js.native
  def matchState[T, TContext, TEvent /* <: EventObject */](
    state: typings.xstate.stateMod.State[TContext, TEvent, _, Context[TContext]],
    patterns: js.Array[StatePatternTuple[T, TContext, TEvent]],
    defaultValue: ValueFromStateGetter[T, TContext, TEvent]
  ): T = js.native
  def matchState[T, TContext, TEvent /* <: EventObject */](
    state: StateValue,
    patterns: js.Array[StatePatternTuple[T, TContext, TEvent]],
    defaultValue: ValueFromStateGetter[T, TContext, TEvent]
  ): T = js.native
  def matchesState(parentStateId: StateValue, childStateId: StateValue): Boolean = js.native
  def matchesState(parentStateId: StateValue, childStateId: StateValue, delimiter: String): Boolean = js.native
  def send[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: Event[TSentEvent]): SendAction[TContext, TEvent, TSentEvent] = js.native
  def send[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: Event[TSentEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent, TSentEvent] = js.native
  def send[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: SendExpr[TContext, TEvent, TSentEvent]): SendAction[TContext, TEvent, TSentEvent] = js.native
  def send[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: SendExpr[TContext, TEvent, TSentEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent, TSentEvent] = js.native
  def sendParent[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: Event[TSentEvent]): SendAction[TContext, TEvent, TSentEvent] = js.native
  def sendParent[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: Event[TSentEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent, TSentEvent] = js.native
  def sendParent[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: SendExpr[TContext, TEvent, TSentEvent]): SendAction[TContext, TEvent, TSentEvent] = js.native
  def sendParent[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: SendExpr[TContext, TEvent, TSentEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent, TSentEvent] = js.native
  def sendUpdate[TContext, TEvent /* <: EventObject */](): SendAction[TContext, TEvent, TypeUpdate] = js.native
  def spawn(entity: Spawnable): Actor[_, AnyEventObject] = js.native
  def spawn(entity: Spawnable, nameOrOptions: String): Actor[_, AnyEventObject] = js.native
  def spawn(entity: Spawnable, nameOrOptions: SpawnOptions): Actor[_, AnyEventObject] = js.native
  def spawn[TC, TE /* <: EventObject */](entity: StateMachine[TC, _, TE, _]): typings.xstate.interpreterMod.Interpreter[TC, _, TE, _] = js.native
  def spawn[TC, TE /* <: EventObject */](entity: StateMachine[TC, _, TE, _], nameOrOptions: String): typings.xstate.interpreterMod.Interpreter[TC, _, TE, _] = js.native
  def spawn[TC, TE /* <: EventObject */](entity: StateMachine[TC, _, TE, _], nameOrOptions: SpawnOptions): typings.xstate.interpreterMod.Interpreter[TC, _, TE, _] = js.native
  @js.native
  object ActionTypes extends js.Object {
    /* "xstate.after" */ val After: typings.xstate.typesMod.ActionTypes.After with String = js.native
    /* "xstate.assign" */ val Assign: typings.xstate.typesMod.ActionTypes.Assign with String = js.native
    /* "xstate.cancel" */ val Cancel: typings.xstate.typesMod.ActionTypes.Cancel with String = js.native
    /* "xstate.choose" */ val Choose: typings.xstate.typesMod.ActionTypes.Choose with String = js.native
    /* "done.invoke" */ val DoneInvoke: typings.xstate.typesMod.ActionTypes.DoneInvoke with String = js.native
    /* "done.state" */ val DoneState: typings.xstate.typesMod.ActionTypes.DoneState with String = js.native
    /* "error.communication" */ val ErrorCommunication: typings.xstate.typesMod.ActionTypes.ErrorCommunication with String = js.native
    /* "xstate.error" */ val ErrorCustom: typings.xstate.typesMod.ActionTypes.ErrorCustom with String = js.native
    /* "error.execution" */ val ErrorExecution: typings.xstate.typesMod.ActionTypes.ErrorExecution with String = js.native
    /* "error.platform" */ val ErrorPlatform: typings.xstate.typesMod.ActionTypes.ErrorPlatform with String = js.native
    /* "xstate.init" */ val Init: typings.xstate.typesMod.ActionTypes.Init with String = js.native
    /* "xstate.invoke" */ val Invoke: typings.xstate.typesMod.ActionTypes.Invoke with String = js.native
    /* "xstate.log" */ val Log: typings.xstate.typesMod.ActionTypes.Log with String = js.native
    /* "" */ val NullEvent: typings.xstate.typesMod.ActionTypes.NullEvent with String = js.native
    /* "xstate.pure" */ val Pure: typings.xstate.typesMod.ActionTypes.Pure with String = js.native
    /* "xstate.raise" */ val Raise: typings.xstate.typesMod.ActionTypes.Raise with String = js.native
    /* "xstate.send" */ val Send: typings.xstate.typesMod.ActionTypes.Send with String = js.native
    /* "xstate.start" */ val Start: typings.xstate.typesMod.ActionTypes.Start with String = js.native
    /* "xstate.stop" */ val Stop: typings.xstate.typesMod.ActionTypes.Stop with String = js.native
    /* "xstate.update" */ val Update: typings.xstate.typesMod.ActionTypes.Update with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.xstate.typesMod.ActionTypes with String] = js.native
  }
  
  /* static members */
  @js.native
  object Interpreter extends js.Object {
    /**
      * The default interpreter options:
      *
      * - `clock` uses the global `setTimeout` and `clearTimeout` functions
      * - `logger` uses the global `console.log()` method
      */
    var defaultOptions: InterpreterOptions = js.native
    @JSName("interpret")
    var interpret_Original: FnCallMachineOptions = js.native
    def interpret[TContext, TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */](machine: StateMachine[TContext, TStateSchema, TEvent, TTypestate]): typings.xstate.interpreterMod.Interpreter[TContext, TStateSchema, TEvent, TTypestate] = js.native
    def interpret[TContext, TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */](
      machine: StateMachine[TContext, TStateSchema, TEvent, TTypestate],
      options: PartialInterpreterOptions
    ): typings.xstate.interpreterMod.Interpreter[TContext, TStateSchema, TEvent, TTypestate] = js.native
  }
  
  @js.native
  object SpecialTargets extends js.Object {
    /* "#_internal" */ val Internal: typings.xstate.typesMod.SpecialTargets.Internal with String = js.native
    /* "#_parent" */ val Parent: typings.xstate.typesMod.SpecialTargets.Parent with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.xstate.typesMod.SpecialTargets with String] = js.native
  }
  
  /* static members */
  @js.native
  object State extends js.Object {
    /**
      * Creates a new State instance for the given `config`.
      * @param config The state config
      */
    def create[TC, TE /* <: EventObject */](config: StateConfig[TC, TE]): typings.xstate.stateMod.State[TC, TE, _, Value[TC]] = js.native
    /**
      * Creates a new State instance for the given `stateValue` and `context`.
      * @param stateValue
      * @param context
      */
    def from[TC, TE /* <: EventObject */](stateValue: typings.xstate.stateMod.State[TC, TE, _, Value[TC]]): typings.xstate.stateMod.State[TC, TE, _, Value[TC]] = js.native
    def from[TC, TE /* <: EventObject */](stateValue: typings.xstate.stateMod.State[TC, TE, _, Value[TC]], context: TC): typings.xstate.stateMod.State[TC, TE, _, Value[TC]] = js.native
    def from[TC, TE /* <: EventObject */](stateValue: StateValue): typings.xstate.stateMod.State[TC, TE, _, Value[TC]] = js.native
    def from[TC, TE /* <: EventObject */](stateValue: StateValue, context: TC): typings.xstate.stateMod.State[TC, TE, _, Value[TC]] = js.native
    /**
      * Creates a new `State` instance for the given `stateValue` and `context` with no actions (side-effects).
      * @param stateValue
      * @param context
      */
    def inert[TC, TE /* <: EventObject */](stateValue: typings.xstate.stateMod.State[TC, TE, _, Value[TC]], context: TC): typings.xstate.stateMod.State[TC, TE, _, Value[TC]] = js.native
    def inert[TC, TE /* <: EventObject */](stateValue: StateValue, context: TC): typings.xstate.stateMod.State[TC, TE, _, Value[TC]] = js.native
  }
  
  @js.native
  object actions extends js.Object {
    @JSName("after")
    var after_Original: js.Function2[/* delayRef */ Double | String, /* id */ js.UndefOr[String], String] = js.native
    @JSName("choose")
    var choose_Original: FnCallConds = js.native
    @JSName("done")
    var done_Original: js.Function2[/* id */ String, /* data */ js.UndefOr[js.Any], DoneEventObject] = js.native
    @JSName("escalate")
    var escalate_Original: FnCallErrorDataOptions = js.native
    @JSName("forwardTo")
    var forwardTo_Original: FnCallTargetOptions = js.native
    @JSName("log")
    var log_Original: FnCallExprLabel = js.native
    @JSName("pure")
    var pure_Original: FnCallGetActions = js.native
    @JSName("raise")
    var raise_Original: FnCall = js.native
    @JSName("respond")
    var respond_Original: Fn1 = js.native
    @JSName("sendParent")
    var sendParent_Original: FnCallEventOptions = js.native
    @JSName("sendUpdate")
    var sendUpdate_Original: Fn0 = js.native
    @JSName("send")
    var send_Original: FnCallEventOptions = js.native
    @JSName("start")
    var start_Original: FnCallActivity = js.native
    @JSName("stop")
    var stop_Original: FnCallActivity = js.native
    def after(delayRef: String): String = js.native
    def after(delayRef: String, id: String): String = js.native
    def after(delayRef: Double): String = js.native
    def after(delayRef: Double, id: String): String = js.native
    def assign[TContext, TEvent /* <: EventObject */](assignment: Assigner[TContext, TEvent]): AssignAction[TContext, TEvent] = js.native
    def assign[TContext, TEvent /* <: EventObject */](assignment: PropertyAssigner[TContext, TEvent]): AssignAction[TContext, TEvent] = js.native
    def cancel(sendId: String): CancelAction = js.native
    def cancel(sendId: Double): CancelAction = js.native
    def choose[TContext, TEvent /* <: EventObject */](conds: js.Array[ChooseConditon[TContext, TEvent]]): ChooseAction[TContext, TEvent] = js.native
    def done(id: String): DoneEventObject = js.native
    def done(id: String, data: js.Any): DoneEventObject = js.native
    def escalate[TContext, TEvent /* <: EventObject */, TErrorData](errorData: TErrorData): SendAction[TContext, TEvent, AnyEventObject] = js.native
    def escalate[TContext, TEvent /* <: EventObject */, TErrorData](errorData: TErrorData, options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent, AnyEventObject] = js.native
    def escalate[TContext, TEvent /* <: EventObject */, TErrorData](errorData: ExprWithMeta[TContext, TEvent, TErrorData]): SendAction[TContext, TEvent, AnyEventObject] = js.native
    def escalate[TContext, TEvent /* <: EventObject */, TErrorData](
      errorData: ExprWithMeta[TContext, TEvent, TErrorData],
      options: SendActionOptions[TContext, TEvent]
    ): SendAction[TContext, TEvent, AnyEventObject] = js.native
    @JSName("forwardTo")
    def forwardTo_to[TContext, TEvent /* <: EventObject */](
      target: /* import warning: importer.ImportType#apply Failed type conversion: std.Required<xstate.xstate/lib/types.SendActionOptions<TContext, TEvent>>['to'] */ js.Any
    ): SendAction[TContext, TEvent, AnyEventObject] = js.native
    @JSName("forwardTo")
    def forwardTo_to[TContext, TEvent /* <: EventObject */](
      target: /* import warning: importer.ImportType#apply Failed type conversion: std.Required<xstate.xstate/lib/types.SendActionOptions<TContext, TEvent>>['to'] */ js.Any,
      options: SendActionOptions[TContext, TEvent]
    ): SendAction[TContext, TEvent, AnyEventObject] = js.native
    def log[TContext, TEvent /* <: EventObject */](): LogAction[TContext, TEvent] = js.native
    def log[TContext, TEvent /* <: EventObject */](expr: js.UndefOr[scala.Nothing], label: String): LogAction[TContext, TEvent] = js.native
    def log[TContext, TEvent /* <: EventObject */](expr: String): LogAction[TContext, TEvent] = js.native
    def log[TContext, TEvent /* <: EventObject */](expr: String, label: String): LogAction[TContext, TEvent] = js.native
    def log[TContext, TEvent /* <: EventObject */](expr: LogExpr[TContext, TEvent]): LogAction[TContext, TEvent] = js.native
    def log[TContext, TEvent /* <: EventObject */](expr: LogExpr[TContext, TEvent], label: String): LogAction[TContext, TEvent] = js.native
    def pure[TContext, TEvent /* <: EventObject */](
      getActions: js.Function2[
          /* context */ TContext, 
          /* event */ TEvent, 
          js.UndefOr[SingleOrArray[ActionObject[TContext, TEvent]]]
        ]
    ): PureAction[TContext, TEvent] = js.native
    def raise[TContext, TEvent /* <: EventObject */](event: Event[TEvent]): RaiseAction[TEvent] | (SendAction[TContext, TEvent, TEvent]) = js.native
    def respond[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: Event[TEvent]): SendAction[TContext, TEvent, AnyEventObject] = js.native
    def respond[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: Event[TEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent, AnyEventObject] = js.native
    def respond[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: SendExpr[TContext, TEvent, TSentEvent]): SendAction[TContext, TEvent, AnyEventObject] = js.native
    def respond[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: SendExpr[TContext, TEvent, TSentEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent, AnyEventObject] = js.native
    def send[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: Event[TSentEvent]): SendAction[TContext, TEvent, TSentEvent] = js.native
    def send[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: Event[TSentEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent, TSentEvent] = js.native
    def send[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: SendExpr[TContext, TEvent, TSentEvent]): SendAction[TContext, TEvent, TSentEvent] = js.native
    def send[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: SendExpr[TContext, TEvent, TSentEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent, TSentEvent] = js.native
    def sendParent[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: Event[TSentEvent]): SendAction[TContext, TEvent, TSentEvent] = js.native
    def sendParent[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: Event[TSentEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent, TSentEvent] = js.native
    def sendParent[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: SendExpr[TContext, TEvent, TSentEvent]): SendAction[TContext, TEvent, TSentEvent] = js.native
    def sendParent[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: SendExpr[TContext, TEvent, TSentEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent, TSentEvent] = js.native
    def sendUpdate[TContext, TEvent /* <: EventObject */](): SendAction[TContext, TEvent, TypeUpdate] = js.native
    def start[TContext, TEvent /* <: EventObject */](activity: String): ActivityActionObject[TContext, TEvent] = js.native
    def start[TContext, TEvent /* <: EventObject */](activity: ActivityDefinition[TContext, TEvent]): ActivityActionObject[TContext, TEvent] = js.native
    def stop[TContext, TEvent /* <: EventObject */](activity: String): ActivityActionObject[TContext, TEvent] = js.native
    def stop[TContext, TEvent /* <: EventObject */](activity: ActivityDefinition[TContext, TEvent]): ActivityActionObject[TContext, TEvent] = js.native
  }
  
}


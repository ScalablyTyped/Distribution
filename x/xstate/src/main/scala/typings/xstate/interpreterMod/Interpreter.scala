package typings.xstate.interpreterMod

import typings.std.Map
import typings.std.Partial
import typings.xstate.AnonAutoForward
import typings.xstate.FnMachine
import typings.xstate.actorMod.Actor
import typings.xstate.stateMod.State
import typings.xstate.typesMod.ActionFunctionMap
import typings.xstate.typesMod.AnyEventObject
import typings.xstate.typesMod.DoneEvent
import typings.xstate.typesMod.Event
import typings.xstate.typesMod.EventData
import typings.xstate.typesMod.EventObject
import typings.xstate.typesMod.InterpreterOptions
import typings.xstate.typesMod.Observer
import typings.xstate.typesMod.Spawnable
import typings.xstate.typesMod.StateMachine
import typings.xstate.typesMod.StateSchema
import typings.xstate.typesMod.StateValue
import typings.xstate.typesMod.StateValueMap
import typings.xstate.typesMod.Typestate
import typings.xstate.typesMod.Unsubscribable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/lib/interpreter", "Interpreter")
@js.native
class Interpreter[TContext, TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */] protected ()
  extends Actor[State[TContext, TEvent, js.Any, js.Any], TEvent] {
  /**
    * Creates a new Interpreter instance (i.e., service) for the given machine with the provided options, if any.
    *
    * @param machine The machine to be interpreted
    * @param options Interpreter options
    */
  def this(machine: StateMachine[TContext, TStateSchema, TEvent, TTypestate]) = this()
  def this(
    machine: StateMachine[TContext, TStateSchema, TEvent, TTypestate],
    options: Partial[InterpreterOptions]
  ) = this()
  var _initialState: js.UndefOr[js.Any] = js.native
  /**
    * The current state of the interpreted machine.
    */
  var _state: js.UndefOr[js.Any] = js.native
  var _status: js.Any = js.native
  var attachDev: js.Any = js.native
  var batch: js.Any = js.native
  var cancel: js.Any = js.native
  var children: Map[String | Double, Actor[_, AnyEventObject]] = js.native
  /**
    * The clock that is responsible for setting and clearing timeouts, such as delayed events and transitions.
    */
  var clock: Clock = js.native
  var contextListeners: js.Any = js.native
  var defer: js.Any = js.native
  var delayedEventsMap: js.Any = js.native
  var devTools: js.UndefOr[js.Any] = js.native
  var doneListeners: js.Any = js.native
  var eventListeners: js.Any = js.native
  var exec: js.Any = js.native
  var forward: js.Any = js.native
  var forwardTo: js.Any = js.native
  /**
    * Whether the service is started.
    */
  var initialized: Boolean = js.native
  var listeners: js.Any = js.native
  var logger: js.Any = js.native
  var machine: StateMachine[TContext, TStateSchema, TEvent, TTypestate] = js.native
  var options: InterpreterOptions = js.native
  var parent: js.UndefOr[Interpreter[_, _, EventObject, _]] = js.native
  var scheduler: js.Any = js.native
  var sendListeners: js.Any = js.native
  var sendTo: js.Any = js.native
  /**
    * The globally unique process ID for this invocation.
    */
  var sessionId: String = js.native
  var spawnActivity: js.Any = js.native
  var spawnActor: js.Any = js.native
  var spawnCallback: js.Any = js.native
  var spawnEffect: js.Any = js.native
  var spawnObservable: js.Any = js.native
  var spawnPromise: js.Any = js.native
  var stopChild: js.Any = js.native
  var stopListeners: js.Any = js.native
  var update: js.Any = js.native
  /**
    * Executes the actions of the given state, with that state's `context` and `event`.
    *
    * @param state The state whose actions will be executed
    * @param actionsConfig The action implementations to use
    */
  def execute(state: State[TContext, TEvent, _, _]): Unit = js.native
  def execute(state: State[TContext, TEvent, _, _], actionsConfig: ActionFunctionMap[TContext, TEvent]): Unit = js.native
  /**
    * Alias for Interpreter.prototype.start
    */
  def init(): Interpreter[TContext, TStateSchema, TEvent, _] = js.native
  def init(initialState: String): Interpreter[TContext, TStateSchema, TEvent, _] = js.native
  def init(initialState: State[TContext, TEvent, _, _]): Interpreter[TContext, TStateSchema, TEvent, _] = js.native
  def init(initialState: StateValueMap): Interpreter[TContext, TStateSchema, TEvent, _] = js.native
  def initialState(): State[TContext, TEvent, _, _] = js.native
  /**
    * Returns the next state given the interpreter's current state and the event.
    *
    * This is a pure method that does _not_ update the interpreter's state.
    *
    * @param event The event to determine the next state
    */
  def nextState(event: Event[TEvent]): State[TContext, TEvent, _, _] = js.native
  def nextState(event: typings.xstate.typesMod.SCXML.Event[TEvent]): State[TContext, TEvent, _, _] = js.native
  /**
    * Removes a listener.
    * @param listener The listener to remove
    */
  def off(listener: js.Function1[/* repeated */ js.Any, Unit]): Interpreter[TContext, TStateSchema, TEvent, _] = js.native
  /**
    * Adds a context listener that is notified whenever the state context changes.
    * @param listener The context listener
    */
  def onChange(listener: ContextListener[TContext]): Interpreter[TContext, TStateSchema, TEvent, _] = js.native
  /**
    * Adds a state listener that is notified when the statechart has reached its final state.
    * @param listener The state listener
    */
  def onDone(listener: EventListener[DoneEvent]): Interpreter[TContext, TStateSchema, TEvent, _] = js.native
  /**
    * Adds an event listener that is notified whenever an event is sent to the running interpreter.
    * @param listener The event listener
    */
  def onEvent(listener: EventListener[EventObject]): Interpreter[TContext, TStateSchema, TEvent, _] = js.native
  /**
    * Adds an event listener that is notified whenever a `send` event occurs.
    * @param listener The event listener
    */
  def onSend(listener: EventListener[EventObject]): Interpreter[TContext, TStateSchema, TEvent, _] = js.native
  /**
    * Adds a listener that is notified when the machine is stopped.
    * @param listener The listener
    */
  def onStop(listener: Listener): Interpreter[TContext, TStateSchema, TEvent, _] = js.native
  def onTransition(listener: StateListener[TContext, TEvent, TTypestate]): this.type = js.native
  def send(event: TEvent, payload: EventData): State[TContext, TEvent, _, _] = js.native
  def send(event: js.Array[Event[TEvent]]): State[TContext, TEvent, _, _] = js.native
  def send(event: js.Array[Event[TEvent]], payload: EventData): State[TContext, TEvent, _, _] = js.native
  def send(event: typings.xstate.typesMod.SCXML.Event[TEvent]): State[TContext, TEvent, _, _] = js.native
  def send(event: typings.xstate.typesMod.SCXML.Event[TEvent], payload: EventData): State[TContext, TEvent, _, _] = js.native
  @JSName("send")
  def send_type(
    event: /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any
  ): State[TContext, TEvent, _, _] = js.native
  @JSName("send")
  def send_type(
    event: /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any,
    payload: EventData
  ): State[TContext, TEvent, _, _] = js.native
  /**
    * Returns a send function bound to this interpreter instance.
    *
    * @param event The event to be sent by the sender.
    */
  def sender(event: Event[TEvent]): js.Function0[State[TContext, TEvent, _, _]] = js.native
  def spawn(entity: Spawnable, name: String): Actor[_, AnyEventObject] = js.native
  def spawn(entity: Spawnable, name: String, options: SpawnOptions): Actor[_, AnyEventObject] = js.native
  def spawnMachine[TChildContext, TChildStateSchema, TChildEvent /* <: EventObject */](machine: StateMachine[TChildContext, TChildStateSchema, TChildEvent, _]): Interpreter[TChildContext, TChildStateSchema, TChildEvent, _] = js.native
  def spawnMachine[TChildContext, TChildStateSchema, TChildEvent /* <: EventObject */](machine: StateMachine[TChildContext, TChildStateSchema, TChildEvent, _], options: AnonAutoForward): Interpreter[TChildContext, TChildStateSchema, TChildEvent, _] = js.native
  /**
    * Starts the interpreter from the given state, or the initial state.
    * @param initialState The state to start the statechart from
    */
  def start(): Interpreter[TContext, TStateSchema, TEvent, _] = js.native
  def start(initialState: State[TContext, TEvent, _, _]): Interpreter[TContext, TStateSchema, TEvent, _] = js.native
  def start(initialState: StateValue): Interpreter[TContext, TStateSchema, TEvent, _] = js.native
  @JSName("state")
  def state_MInterpreter(): State[TContext, TEvent, _, _] = js.native
  /**
    * Stops the interpreter and unsubscribe all listeners.
    *
    * This will also notify the `onStop` listeners.
    */
  @JSName("stop")
  def stop_MInterpreter(): Interpreter[TContext, TStateSchema, TEvent, _] = js.native
  def subscribe(observer: Observer[State[TContext, TEvent, _, TTypestate]]): Unsubscribable = js.native
}

/* static members */
@JSImport("xstate/lib/interpreter", "Interpreter")
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
  var interpret_Original: FnMachine = js.native
  def interpret[TContext, TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */](machine: StateMachine[TContext, TStateSchema, TEvent, TTypestate]): Interpreter[TContext, TStateSchema, TEvent, TTypestate] = js.native
  def interpret[TContext, TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */](
    machine: StateMachine[TContext, TStateSchema, TEvent, TTypestate],
    options: Partial[InterpreterOptions]
  ): Interpreter[TContext, TStateSchema, TEvent, TTypestate] = js.native
}


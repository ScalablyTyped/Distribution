package typings.xstate.esInterpreterMod

import typings.std.Map
import typings.std.Partial
import typings.std.Record
import typings.xstate.Anon_AutoForward
import typings.xstate.Anon_Type
import typings.xstate.Fn_Machine
import typings.xstate.esActorMod.Actor
import typings.xstate.esStateMod.State
import typings.xstate.esTypesMod.ActionFunctionMap
import typings.xstate.esTypesMod.DoneEvent
import typings.xstate.esTypesMod.Event
import typings.xstate.esTypesMod.EventObject
import typings.xstate.esTypesMod.InterpreterOptions
import typings.xstate.esTypesMod.OmniEvent
import typings.xstate.esTypesMod.OmniEventObject
import typings.xstate.esTypesMod.SingleOrArray
import typings.xstate.esTypesMod.StateMachine
import typings.xstate.esTypesMod.StateSchema
import typings.xstate.esTypesMod.StateValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/es/interpreter", "Interpreter")
@js.native
class Interpreter[TContext, TStateSchema /* <: StateSchema */, TEvent /* <: EventObject */] protected () extends Actor[State[TContext, TEvent], OmniEventObject[TEvent]] {
  /**
    * Creates a new Interpreter instance (i.e., service) for the given machine with the provided options, if any.
    *
    * @param machine The machine to be interpreted
    * @param options Interpreter options
    */
  def this(machine: StateMachine[TContext, TStateSchema, TEvent]) = this()
  def this(machine: StateMachine[TContext, TStateSchema, TEvent], options: Partial[InterpreterOptions]) = this()
  var attachDev: js.Any = js.native
  var batch: js.Any = js.native
  var cancel: js.Any = js.native
  var children: Map[String | Double, Actor[_, EventObject]] = js.native
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
    * The initial state of the machine.
    */
  var initialState: State[TContext, TEvent] = js.native
  /**
    * Whether the service is started.
    */
  var initialized: Boolean = js.native
  var listeners: js.Any = js.native
  var logger: js.Any = js.native
  var machine: StateMachine[TContext, TStateSchema, TEvent] = js.native
  var options: InterpreterOptions = js.native
  var parent: js.UndefOr[Interpreter[_, _, EventObject]] = js.native
  var reportUnhandledExceptionOnInvocation: js.Any = js.native
  var scheduler: js.Any = js.native
  var sendListeners: js.Any = js.native
  var spawnActivity: js.Any = js.native
  var spawnCallback: js.Any = js.native
  var spawnEffect: js.Any = js.native
  var spawnObservable: js.Any = js.native
  var spawnPromise: js.Any = js.native
  /**
    * The current state of the interpreted machine.
    */
  var state: State[TContext, TEvent] = js.native
  var stopChild: js.Any = js.native
  var stopListeners: js.Any = js.native
  var update: js.Any = js.native
  /**
    * Executes the actions of the given state, with that state's `context` and `event`.
    *
    * @param state The state whose actions will be executed
    * @param actionsConfig The action implementations to use
    */
  def execute(state: State[TContext, TEvent]): Unit = js.native
  def execute(state: State[TContext, TEvent], actionsConfig: ActionFunctionMap[TContext, TEvent]): Unit = js.native
  /**
    * Alias for Interpreter.prototype.start
    */
  def init(): Interpreter[TContext, TStateSchema, TEvent] = js.native
  def init(initialState: String): Interpreter[TContext, TStateSchema, TEvent] = js.native
  def init(
    initialState: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_xstate/es/types.StateValueMap */ js.Any
  ): Interpreter[TContext, TStateSchema, TEvent] = js.native
  def init(initialState: State[TContext, TEvent]): Interpreter[TContext, TStateSchema, TEvent] = js.native
  /**
    * Returns the next state given the interpreter's current state and the event.
    *
    * This is a pure method that does _not_ update the interpreter's state.
    *
    * @param event The event to determine the next state
    */
  def nextState(event: OmniEvent[TEvent]): State[TContext, TEvent] = js.native
  /**
    * Removes a listener.
    * @param listener The listener to remove
    */
  def off(listener: js.Function1[/* repeated */ js.Any, Unit]): Interpreter[TContext, TStateSchema, TEvent] = js.native
  /**
    * Adds a context listener that is notified whenever the state context changes.
    * @param listener The context listener
    */
  def onChange(listener: ContextListener[TContext]): Interpreter[TContext, TStateSchema, TEvent] = js.native
  /**
    * Adds a state listener that is notified when the statechart has reached its final state.
    * @param listener The state listener
    */
  def onDone(listener: EventListener[DoneEvent]): Interpreter[TContext, TStateSchema, TEvent] = js.native
  /**
    * Adds an event listener that is notified whenever an event is sent to the running interpreter.
    * @param listener The event listener
    */
  def onEvent(listener: EventListener[EventObject]): Interpreter[TContext, TStateSchema, TEvent] = js.native
  /**
    * Adds an event listener that is notified whenever a `send` event occurs.
    * @param listener The event listener
    */
  def onSend(listener: EventListener[EventObject]): Interpreter[TContext, TStateSchema, TEvent] = js.native
  /**
    * Adds a listener that is notified when the machine is stopped.
    * @param listener The listener
    */
  def onStop(listener: Listener): Interpreter[TContext, TStateSchema, TEvent] = js.native
  def onTransition(listener: StateListener[TContext, TEvent]): Interpreter[TContext, TStateSchema, TEvent] = js.native
  def send(event: SingleOrArray[OmniEvent[TEvent]], payload: (Record[String, _]) with Anon_Type): State[TContext, TEvent] = js.native
  def sendTo(event: OmniEventObject[TEvent], to: String): Unit = js.native
  def sendTo(event: OmniEventObject[TEvent], to: Double): Unit = js.native
  def sendTo(event: OmniEventObject[TEvent], to: Actor[_, EventObject]): Unit = js.native
  /**
    * Returns a send function bound to this interpreter instance.
    *
    * @param event The event to be sent by the sender.
    */
  def sender(event: Event[TEvent]): js.Function0[State[TContext, TEvent]] = js.native
  def spawn[TChildContext](entity: Spawnable[TChildContext], name: String): Actor[_, EventObject] = js.native
  def spawn[TChildContext](entity: Spawnable[TChildContext], name: String, options: SpawnOptions): Actor[_, EventObject] = js.native
  def spawnMachine[TChildContext, TChildStateSchema, TChildEvents /* <: EventObject */](machine: StateMachine[TChildContext, TChildStateSchema, TChildEvents]): Actor[State[TChildContext, TChildEvents], EventObject] = js.native
  def spawnMachine[TChildContext, TChildStateSchema, TChildEvents /* <: EventObject */](machine: StateMachine[TChildContext, TChildStateSchema, TChildEvents], options: Anon_AutoForward): Actor[State[TChildContext, TChildEvents], EventObject] = js.native
  /**
    * Starts the interpreter from the given state, or the initial state.
    * @param initialState The state to start the statechart from
    */
  def start(): Interpreter[TContext, TStateSchema, TEvent] = js.native
  def start(initialState: State[TContext, TEvent]): Interpreter[TContext, TStateSchema, TEvent] = js.native
  def start(initialState: StateValue): Interpreter[TContext, TStateSchema, TEvent] = js.native
  /**
    * Stops the interpreter and unsubscribe all listeners.
    *
    * This will also notify the `onStop` listeners.
    */
  @JSName("stop")
  def stop_MInterpreter(): Interpreter[TContext, TStateSchema, TEvent] = js.native
}

/* static members */
@JSImport("xstate/es/interpreter", "Interpreter")
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
  var interpret_Original: Fn_Machine = js.native
  def interpret[TContext, TStateSchema /* <: StateSchema */, TEvent /* <: EventObject */](machine: StateMachine[TContext, TStateSchema, TEvent]): Interpreter[TContext, TStateSchema, TEvent] = js.native
  def interpret[TContext, TStateSchema /* <: StateSchema */, TEvent /* <: EventObject */](machine: StateMachine[TContext, TStateSchema, TEvent], options: Partial[InterpreterOptions]): Interpreter[TContext, TStateSchema, TEvent] = js.native
}


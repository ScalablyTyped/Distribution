package typings.xstate.interpreterMod

import typings.std.Map
import typings.xstate.actorMod.Actor
import typings.xstate.anon.AutoForward
import typings.xstate.anon.ContextAny
import typings.xstate.anon.ContextTChildContext
import typings.xstate.anon.FnCallMachineOptions
import typings.xstate.anon.PartialInterpreterOptions
import typings.xstate.anon.ReadonlyInterpreterOption
import typings.xstate.stateMod.State
import typings.xstate.typesMod.ActionFunctionMap
import typings.xstate.typesMod.AnyEventObject
import typings.xstate.typesMod.DoneEvent
import typings.xstate.typesMod.Event
import typings.xstate.typesMod.EventData
import typings.xstate.typesMod.EventObject
import typings.xstate.typesMod.InterpreterOptions
import typings.xstate.typesMod.Observer
import typings.xstate.typesMod.SingleOrArray
import typings.xstate.typesMod.Spawnable
import typings.xstate.typesMod.StateMachine
import typings.xstate.typesMod.StateSchema
import typings.xstate.typesMod.StateValue
import typings.xstate.typesMod.StateValueMap
import typings.xstate.typesMod.Typestate
import typings.xstate.typesMod.Unsubscribable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xstate/lib/interpreter", "Interpreter")
@js.native
class Interpreter[TContext, TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */] protected () extends Actor[State[TContext, TEvent, TStateSchema, TTypestate], TEvent] {
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
  
  var _initialState: js.Any = js.native
  
  /**
    * The current state of the interpreted machine.
    */
  var _state: js.Any = js.native
  
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
  
  var devTools: js.Any = js.native
  
  var doneListeners: js.Any = js.native
  
  var eventListeners: js.Any = js.native
  
  var exec: js.Any = js.native
  
  /**
    * Executes the actions of the given state, with that state's `context` and `event`.
    *
    * @param state The state whose actions will be executed
    * @param actionsConfig The action implementations to use
    */
  def execute(state: State[TContext, TEvent, TStateSchema, TTypestate]): Unit = js.native
  def execute(
    state: State[TContext, TEvent, TStateSchema, TTypestate],
    actionsConfig: ActionFunctionMap[TContext, TEvent]
  ): Unit = js.native
  
  var forward: js.Any = js.native
  
  var forwardTo: js.Any = js.native
  
  /**
    * Alias for Interpreter.prototype.start
    */
  def init(): Interpreter[TContext, TStateSchema, TEvent, TTypestate] = js.native
  def init(initialState: String): Interpreter[TContext, TStateSchema, TEvent, TTypestate] = js.native
  def init(initialState: State[TContext, TEvent, TStateSchema, TTypestate]): Interpreter[TContext, TStateSchema, TEvent, TTypestate] = js.native
  def init(initialState: StateValueMap): Interpreter[TContext, TStateSchema, TEvent, TTypestate] = js.native
  
  def initialState: State[TContext, TEvent, TStateSchema, TTypestate] = js.native
  
  /**
    * Whether the service is started.
    */
  var initialized: Boolean = js.native
  
  var listeners: js.Any = js.native
  
  var logger: js.Any = js.native
  
  var machine: StateMachine[TContext, TStateSchema, TEvent, TTypestate] = js.native
  
  /**
    * Returns the next state given the interpreter's current state and the event.
    *
    * This is a pure method that does _not_ update the interpreter's state.
    *
    * @param event The event to determine the next state
    */
  def nextState(event: Event[TEvent]): State[TContext, TEvent, TStateSchema, TTypestate] = js.native
  def nextState(event: typings.xstate.typesMod.SCXML.Event[TEvent]): State[TContext, TEvent, TStateSchema, TTypestate] = js.native
  
  /**
    * Removes a listener.
    * @param listener The listener to remove
    */
  def off(listener: js.Function1[/* repeated */ js.Any, Unit]): Interpreter[TContext, TStateSchema, TEvent, TTypestate] = js.native
  
  /**
    * Adds a context listener that is notified whenever the state context changes.
    * @param listener The context listener
    */
  def onChange(listener: ContextListener[TContext]): Interpreter[TContext, TStateSchema, TEvent, TTypestate] = js.native
  
  /**
    * Adds a state listener that is notified when the statechart has reached its final state.
    * @param listener The state listener
    */
  def onDone(listener: EventListener[DoneEvent]): Interpreter[TContext, TStateSchema, TEvent, TTypestate] = js.native
  
  /**
    * Adds an event listener that is notified whenever an event is sent to the running interpreter.
    * @param listener The event listener
    */
  def onEvent(listener: EventListener[EventObject]): Interpreter[TContext, TStateSchema, TEvent, TTypestate] = js.native
  
  /**
    * Adds an event listener that is notified whenever a `send` event occurs.
    * @param listener The event listener
    */
  def onSend(listener: EventListener[EventObject]): Interpreter[TContext, TStateSchema, TEvent, TTypestate] = js.native
  
  /**
    * Adds a listener that is notified when the machine is stopped.
    * @param listener The listener
    */
  def onStop(listener: Listener): Interpreter[TContext, TStateSchema, TEvent, TTypestate] = js.native
  
  def onTransition(listener: StateListener[TContext, TEvent, TStateSchema, TTypestate]): this.type = js.native
  
  var options: ReadonlyInterpreterOption = js.native
  
  var parent: js.UndefOr[Interpreter[_, _, EventObject, ContextAny]] = js.native
  
  var removeChild: js.Any = js.native
  
  var scheduler: js.Any = js.native
  
  def send(event: typings.xstate.typesMod.SCXML.Event[TEvent]): State[TContext, TEvent, TStateSchema, TTypestate] = js.native
  def send(event: typings.xstate.typesMod.SCXML.Event[TEvent], payload: EventData): State[TContext, TEvent, TStateSchema, TTypestate] = js.native
  /**
    * Sends an event to the running interpreter to trigger a transition.
    *
    * An array of events (batched) can be sent as well, which will send all
    * batched events to the running interpreter. The listeners will be
    * notified only **once** when all events are processed.
    *
    * @param event The event(s) to send
    */
  def send(event: SingleOrArray[Event[TEvent]]): State[TContext, TEvent, TStateSchema, TTypestate] = js.native
  def send(event: SingleOrArray[Event[TEvent]], payload: EventData): State[TContext, TEvent, TStateSchema, TTypestate] = js.native
  
  var sendListeners: js.Any = js.native
  
  var sendTo: js.Any = js.native
  
  /**
    * Returns a send function bound to this interpreter instance.
    *
    * @param event The event to be sent by the sender.
    */
  def sender(event: Event[TEvent]): js.Function0[State[TContext, TEvent, TStateSchema, TTypestate]] = js.native
  
  /**
    * The globally unique process ID for this invocation.
    */
  var sessionId: String = js.native
  
  def spawn(entity: Spawnable, name: String): Actor[_, AnyEventObject] = js.native
  def spawn(entity: Spawnable, name: String, options: SpawnOptions): Actor[_, AnyEventObject] = js.native
  
  var spawnActivity: js.Any = js.native
  
  var spawnActor: js.Any = js.native
  
  var spawnCallback: js.Any = js.native
  
  var spawnEffect: js.Any = js.native
  
  def spawnMachine[TChildContext, TChildStateSchema, TChildEvent /* <: EventObject */](
    machine: StateMachine[TChildContext, TChildStateSchema, TChildEvent, ContextTChildContext[TChildContext]]
  ): Interpreter[TChildContext, TChildStateSchema, TChildEvent, ContextTChildContext[TChildContext]] = js.native
  def spawnMachine[TChildContext, TChildStateSchema, TChildEvent /* <: EventObject */](
    machine: StateMachine[TChildContext, TChildStateSchema, TChildEvent, ContextTChildContext[TChildContext]],
    options: AutoForward
  ): Interpreter[TChildContext, TChildStateSchema, TChildEvent, ContextTChildContext[TChildContext]] = js.native
  
  var spawnObservable: js.Any = js.native
  
  var spawnPromise: js.Any = js.native
  
  /**
    * Starts the interpreter from the given state, or the initial state.
    * @param initialState The state to start the statechart from
    */
  def start(): Interpreter[TContext, TStateSchema, TEvent, TTypestate] = js.native
  def start(initialState: State[TContext, TEvent, TStateSchema, TTypestate]): Interpreter[TContext, TStateSchema, TEvent, TTypestate] = js.native
  def start(initialState: StateValue): Interpreter[TContext, TStateSchema, TEvent, TTypestate] = js.native
  
  @JSName("state")
  def state_MInterpreter: State[TContext, TEvent, TStateSchema, TTypestate] = js.native
  
  var status: InterpreterStatus = js.native
  
  var stopChild: js.Any = js.native
  
  var stopListeners: js.Any = js.native
  
  /**
    * Stops the interpreter and unsubscribe all listeners.
    *
    * This will also notify the `onStop` listeners.
    */
  @JSName("stop")
  def stop_MInterpreter(): Interpreter[TContext, TStateSchema, TEvent, TTypestate] = js.native
  
  def subscribe(observer: Observer[State[TContext, TEvent, _, TTypestate]]): Unsubscribable = js.native
  
  var update: js.Any = js.native
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
  
  def interpret[TContext, TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */](machine: StateMachine[TContext, TStateSchema, TEvent, TTypestate]): Interpreter[TContext, TStateSchema, TEvent, TTypestate] = js.native
  def interpret[TContext, TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */](
    machine: StateMachine[TContext, TStateSchema, TEvent, TTypestate],
    options: PartialInterpreterOptions
  ): Interpreter[TContext, TStateSchema, TEvent, TTypestate] = js.native
  @JSName("interpret")
  var interpret_Original: FnCallMachineOptions = js.native
}

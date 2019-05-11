package typings
package xstateLib.esInterpreterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/es/interpreter", "Interpreter")
@js.native
class Interpreter[TContext, TStateSchema /* <: xstateLib.esTypesMod.StateSchema */, TEvent /* <: xstateLib.esTypesMod.EventObject */] protected () extends js.Object {
  /**
    * Creates a new Interpreter instance (i.e., service) for the given machine with the provided options, if any.
    *
    * @param machine The machine to be interpreted
    * @param options Interpreter options
    */
  def this(machine: xstateLib.esTypesMod.StateMachine[TContext, TStateSchema, TEvent]) = this()
  def this(machine: xstateLib.esTypesMod.StateMachine[TContext, TStateSchema, TEvent], options: stdLib.Partial[xstateLib.esTypesMod.InterpreterOptions]) = this()
  var attachDev: js.Any = js.native
  var batch: js.Any = js.native
  var cancel: js.Any = js.native
  var children: js.Any = js.native
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
  var id: java.lang.String = js.native
  /**
    * The initial state of the statechart.
    */
  val initialState: xstateLib.esStateMod.State[TContext, TEvent] = js.native
  var initialized: js.Any = js.native
  var listeners: js.Any = js.native
  var logger: js.Any = js.native
  var machine: xstateLib.esTypesMod.StateMachine[TContext, TStateSchema, TEvent] = js.native
  var options: stdLib.Readonly[xstateLib.esTypesMod.InterpreterOptions] = js.native
  var parent: js.UndefOr[Interpreter[_, _, xstateLib.esTypesMod.EventObject]] = js.native
  var reportUnhandledExceptionOnInvocation: js.Any = js.native
  var scheduler: js.Any = js.native
  var sendListeners: js.Any = js.native
  var spawn: js.Any = js.native
  var spawnActivity: js.Any = js.native
  var spawnCallback: js.Any = js.native
  var spawnEffect: js.Any = js.native
  var spawnPromise: js.Any = js.native
  /**
    * The current state of the interpreted machine.
    */
  var state: xstateLib.esStateMod.State[TContext, TEvent] = js.native
  var stopChild: js.Any = js.native
  var stopListeners: js.Any = js.native
  var update: js.Any = js.native
  /**
    * Executes the actions of the given state, with that state's `context` and `event`.
    *
    * @param state The state whose actions will be executed
    */
  def execute(state: xstateLib.esStateMod.State[TContext, TEvent]): scala.Unit = js.native
  /**
    * Alias for Interpreter.prototype.start
    */
  def init(): Interpreter[TContext, TStateSchema, TEvent] = js.native
  def init(initialState: java.lang.String): Interpreter[TContext, TStateSchema, TEvent] = js.native
  def init(
    initialState: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_xstate/es/types.StateValueMap */ js.Any
  ): Interpreter[TContext, TStateSchema, TEvent] = js.native
  def init(initialState: xstateLib.esStateMod.State[TContext, TEvent]): Interpreter[TContext, TStateSchema, TEvent] = js.native
  /**
    * Returns the next state given the interpreter's current state and the event.
    *
    * This is a pure method that does _not_ update the interpreter's state.
    *
    * @param event The event to determine the next state
    */
  def nextState(event: xstateLib.esTypesMod.OmniEvent[TEvent]): xstateLib.esStateMod.State[TContext, TEvent] = js.native
  /**
    * Removes a listener.
    * @param listener The listener to remove
    */
  def off(listener: js.Function1[/* repeated */ js.Any, scala.Unit]): Interpreter[TContext, TStateSchema, TEvent] = js.native
  /**
    * Adds a context listener that is notified whenever the state context changes.
    * @param listener The context listener
    */
  def onChange(listener: ContextListener[TContext]): Interpreter[TContext, TStateSchema, TEvent] = js.native
  /**
    * Adds a state listener that is notified when the statechart has reached its final state.
    * @param listener The state listener
    */
  def onDone(listener: EventListener): Interpreter[TContext, TStateSchema, TEvent] = js.native
  /**
    * Adds an event listener that is notified whenever an event is sent to the running interpreter.
    * @param listener The event listener
    */
  def onEvent(listener: EventListener): Interpreter[TContext, TStateSchema, TEvent] = js.native
  /**
    * Adds an event listener that is notified whenever a `send` event occurs.
    * @param listener The event listener
    */
  def onSend(listener: EventListener): Interpreter[TContext, TStateSchema, TEvent] = js.native
  /**
    * Adds a listener that is notified when the machine is stopped.
    * @param listener The listener
    */
  def onStop(listener: Listener): Interpreter[TContext, TStateSchema, TEvent] = js.native
  def onTransition(listener: StateListener[TContext, TEvent]): Interpreter[TContext, TStateSchema, TEvent] = js.native
  /**
    * Sends an event to the running interpreter to trigger a transition.
    *
    * An array of events (batched) can be sent as well, which will send all
    * batched events to the running interpreter. The listeners will be
    * notified only **once** when all events are processed.
    *
    * @param event The event(s) to send
    */
  def send(event: xstateLib.esTypesMod.SingleOrArray[xstateLib.esTypesMod.OmniEvent[TEvent]]): xstateLib.esStateMod.State[TContext, TEvent] = js.native
  def send(
    event: xstateLib.esTypesMod.SingleOrArray[xstateLib.esTypesMod.OmniEvent[TEvent]],
    payload: (stdLib.Record[java.lang.String, _]) with xstateLib.Anon_TypeUndefined
  ): xstateLib.esStateMod.State[TContext, TEvent] = js.native
  def sendTo(event: xstateLib.esTypesMod.OmniEventObject[TEvent], to: java.lang.String): scala.Unit = js.native
  /**
    * Returns a send function bound to this interpreter instance.
    *
    * @param event The event to be sent by the sender.
    */
  def sender(event: xstateLib.esTypesMod.Event[TEvent]): js.Function0[xstateLib.esStateMod.State[TContext, TEvent]] = js.native
  /**
    * Starts the interpreter from the given state, or the initial state.
    * @param initialState The state to start the statechart from
    */
  def start(): Interpreter[TContext, TStateSchema, TEvent] = js.native
  def start(initialState: xstateLib.esStateMod.State[TContext, TEvent]): Interpreter[TContext, TStateSchema, TEvent] = js.native
  def start(initialState: xstateLib.esTypesMod.StateValue): Interpreter[TContext, TStateSchema, TEvent] = js.native
  /**
    * Stops the interpreter and unsubscribe all listeners.
    *
    * This will also notify the `onStop` listeners.
    */
  def stop(): Interpreter[TContext, TStateSchema, TEvent] = js.native
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
  var defaultOptions: xstateLib.esTypesMod.InterpreterOptions = js.native
  @JSName("interpret")
  var interpret_Original: xstateLib.Anon_Machine = js.native
  def interpret[TContext, TStateSchema /* <: xstateLib.esTypesMod.StateSchema */, TEvent /* <: xstateLib.esTypesMod.EventObject */](machine: xstateLib.esTypesMod.StateMachine[TContext, TStateSchema, TEvent]): xstateLib.esInterpreterMod.Interpreter[TContext, TStateSchema, TEvent] = js.native
  def interpret[TContext, TStateSchema /* <: xstateLib.esTypesMod.StateSchema */, TEvent /* <: xstateLib.esTypesMod.EventObject */](
    machine: xstateLib.esTypesMod.StateMachine[TContext, TStateSchema, TEvent],
    options: stdLib.Partial[xstateLib.esTypesMod.InterpreterOptions]
  ): xstateLib.esInterpreterMod.Interpreter[TContext, TStateSchema, TEvent] = js.native
}


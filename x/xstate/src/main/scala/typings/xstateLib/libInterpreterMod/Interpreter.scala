package typings
package xstateLib.libInterpreterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/lib/interpreter", "Interpreter")
@js.native
class Interpreter[TContext, TStateSchema /* <: xstateLib.libTypesMod.StateSchema */, TEvent /* <: xstateLib.libTypesMod.EventObject */] protected ()
  extends xstateLib.libActorMod.Actor[
      xstateLib.libStateMod.State[TContext, TEvent], 
      xstateLib.libTypesMod.OmniEventObject[TEvent]
    ] {
  /**
    * Creates a new Interpreter instance (i.e., service) for the given machine with the provided options, if any.
    *
    * @param machine The machine to be interpreted
    * @param options Interpreter options
    */
  def this(machine: xstateLib.libTypesMod.StateMachine[TContext, TStateSchema, TEvent]) = this()
  def this(machine: xstateLib.libTypesMod.StateMachine[TContext, TStateSchema, TEvent], options: stdLib.Partial[xstateLib.libTypesMod.InterpreterOptions]) = this()
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
  /**
    * The initial state of the machine.
    */
  var initialState: xstateLib.libStateMod.State[TContext, TEvent] = js.native
  /**
    * Whether the service is started.
    */
  var initialized: scala.Boolean = js.native
  var listeners: js.Any = js.native
  var logger: js.Any = js.native
  var machine: xstateLib.libTypesMod.StateMachine[TContext, TStateSchema, TEvent] = js.native
  var options: stdLib.Readonly[xstateLib.libTypesMod.InterpreterOptions] = js.native
  var parent: js.UndefOr[Interpreter[_, _, xstateLib.libTypesMod.EventObject]] = js.native
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
  var state: xstateLib.libStateMod.State[TContext, TEvent] = js.native
  var stopChild: js.Any = js.native
  var stopListeners: js.Any = js.native
  var update: js.Any = js.native
  /**
    * Executes the actions of the given state, with that state's `context` and `event`.
    *
    * @param state The state whose actions will be executed
    * @param actionsConfig The action implementations to use
    */
  def execute(state: xstateLib.libStateMod.State[TContext, TEvent]): scala.Unit = js.native
  def execute(
    state: xstateLib.libStateMod.State[TContext, TEvent],
    actionsConfig: xstateLib.libTypesMod.ActionFunctionMap[TContext, TEvent]
  ): scala.Unit = js.native
  /**
    * Alias for Interpreter.prototype.start
    */
  def init(): Interpreter[TContext, TStateSchema, TEvent] = js.native
  def init(initialState: java.lang.String): Interpreter[TContext, TStateSchema, TEvent] = js.native
  def init(
    initialState: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_xstate/lib/types.StateValueMap */ js.Any
  ): Interpreter[TContext, TStateSchema, TEvent] = js.native
  def init(initialState: xstateLib.libStateMod.State[TContext, TEvent]): Interpreter[TContext, TStateSchema, TEvent] = js.native
  /**
    * Returns the next state given the interpreter's current state and the event.
    *
    * This is a pure method that does _not_ update the interpreter's state.
    *
    * @param event The event to determine the next state
    */
  def nextState(event: xstateLib.libTypesMod.OmniEvent[TEvent]): xstateLib.libStateMod.State[TContext, TEvent] = js.native
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
  def onDone(listener: EventListener[xstateLib.libTypesMod.DoneEvent]): Interpreter[TContext, TStateSchema, TEvent] = js.native
  /**
    * Adds an event listener that is notified whenever an event is sent to the running interpreter.
    * @param listener The event listener
    */
  def onEvent(listener: EventListener[xstateLib.libTypesMod.EventObject]): Interpreter[TContext, TStateSchema, TEvent] = js.native
  /**
    * Adds an event listener that is notified whenever a `send` event occurs.
    * @param listener The event listener
    */
  def onSend(listener: EventListener[xstateLib.libTypesMod.EventObject]): Interpreter[TContext, TStateSchema, TEvent] = js.native
  /**
    * Adds a listener that is notified when the machine is stopped.
    * @param listener The listener
    */
  def onStop(listener: Listener): Interpreter[TContext, TStateSchema, TEvent] = js.native
  def onTransition(listener: StateListener[TContext, TEvent]): Interpreter[TContext, TStateSchema, TEvent] = js.native
  def send(
    event: xstateLib.libTypesMod.SingleOrArray[xstateLib.libTypesMod.OmniEvent[TEvent]],
    payload: (stdLib.Record[java.lang.String, _]) with xstateLib.Anon_TypeUndefined
  ): xstateLib.libStateMod.State[TContext, TEvent] = js.native
  def sendTo(event: xstateLib.libTypesMod.OmniEventObject[TEvent], to: java.lang.String): scala.Unit = js.native
  def sendTo(event: xstateLib.libTypesMod.OmniEventObject[TEvent], to: scala.Double): scala.Unit = js.native
  def sendTo(
    event: xstateLib.libTypesMod.OmniEventObject[TEvent],
    to: xstateLib.libActorMod.Actor[_, xstateLib.libTypesMod.EventObject]
  ): scala.Unit = js.native
  /**
    * Returns a send function bound to this interpreter instance.
    *
    * @param event The event to be sent by the sender.
    */
  def sender(event: xstateLib.libTypesMod.Event[TEvent]): js.Function0[xstateLib.libStateMod.State[TContext, TEvent]] = js.native
  def spawn[TChildContext](entity: Spawnable[TChildContext], name: java.lang.String): xstateLib.libActorMod.Actor[_, xstateLib.libTypesMod.EventObject] = js.native
  def spawnMachine[TChildContext, TChildStateSchema, TChildEvents /* <: xstateLib.libTypesMod.EventObject */](machine: xstateLib.libTypesMod.StateMachine[TChildContext, TChildStateSchema, TChildEvents]): Interpreter[TChildContext, TChildStateSchema, TChildEvents] = js.native
  def spawnMachine[TChildContext, TChildStateSchema, TChildEvents /* <: xstateLib.libTypesMod.EventObject */](
    machine: xstateLib.libTypesMod.StateMachine[TChildContext, TChildStateSchema, TChildEvents],
    options: xstateLib.Anon_AutoForward
  ): Interpreter[TChildContext, TChildStateSchema, TChildEvents] = js.native
  /**
    * Starts the interpreter from the given state, or the initial state.
    * @param initialState The state to start the statechart from
    */
  def start(): Interpreter[TContext, TStateSchema, TEvent] = js.native
  def start(initialState: xstateLib.libStateMod.State[TContext, TEvent]): Interpreter[TContext, TStateSchema, TEvent] = js.native
  def start(initialState: xstateLib.libTypesMod.StateValue): Interpreter[TContext, TStateSchema, TEvent] = js.native
  /**
    * Stops the interpreter and unsubscribe all listeners.
    *
    * This will also notify the `onStop` listeners.
    */
  @JSName("stop")
  def stop_MInterpreter(): Interpreter[TContext, TStateSchema, TEvent] = js.native
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
  var defaultOptions: xstateLib.libTypesMod.InterpreterOptions = js.native
  @JSName("interpret")
  var interpret_Original: xstateLib.Fn_MachineOptions = js.native
  def interpret[TContext, TStateSchema /* <: xstateLib.libTypesMod.StateSchema */, TEvent /* <: xstateLib.libTypesMod.EventObject */](machine: xstateLib.libTypesMod.StateMachine[TContext, TStateSchema, TEvent]): xstateLib.libInterpreterMod.Interpreter[TContext, TStateSchema, TEvent] = js.native
  def interpret[TContext, TStateSchema /* <: xstateLib.libTypesMod.StateSchema */, TEvent /* <: xstateLib.libTypesMod.EventObject */](
    machine: xstateLib.libTypesMod.StateMachine[TContext, TStateSchema, TEvent],
    options: stdLib.Partial[xstateLib.libTypesMod.InterpreterOptions]
  ): xstateLib.libInterpreterMod.Interpreter[TContext, TStateSchema, TEvent] = js.native
}


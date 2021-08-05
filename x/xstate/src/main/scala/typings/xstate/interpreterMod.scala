package typings.xstate

import typings.std.Map
import typings.xstate.actorMod.Actor
import typings.xstate.anon.AutoForward
import typings.xstate.anon.Context
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interpreterMod {
  
  @JSImport("xstate/lib/interpreter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("xstate/lib/interpreter", "Interpreter")
  @js.native
  class Interpreter[TContext, TStateSchema /* <: StateSchema[js.Any] */, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */] protected ()
    extends StObject
       with Actor[State[TContext, TEvent, TStateSchema, TTypestate], TEvent] {
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
    
    /* private */ var _initialState: js.Any = js.native
    
    /**
      * The current state of the interpreted machine.
      */
    /* private */ var _state: js.Any = js.native
    
    /* private */ var attachDev: js.Any = js.native
    
    /* private */ var batch: js.Any = js.native
    
    /* private */ var cancel: js.Any = js.native
    
    var children: Map[String | Double, Actor[js.Any, AnyEventObject]] = js.native
    
    /**
      * The clock that is responsible for setting and clearing timeouts, such as delayed events and transitions.
      */
    var clock: Clock = js.native
    
    /* private */ var contextListeners: js.Any = js.native
    
    /* private */ var defer: js.Any = js.native
    
    /* private */ var delayedEventsMap: js.Any = js.native
    
    /* private */ var devTools: js.Any = js.native
    
    /* private */ var doneListeners: js.Any = js.native
    
    /* private */ var eventListeners: js.Any = js.native
    
    /* private */ var exec: js.Any = js.native
    
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
    
    /* private */ var forward: js.Any = js.native
    
    /* private */ var forwardTo: js.Any = js.native
    
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
    
    /* private */ var listeners: js.Any = js.native
    
    /* private */ var logger: js.Any = js.native
    
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
    
    var parent: js.UndefOr[Interpreter[js.Any, js.Any, EventObject, ContextAny]] = js.native
    
    /* private */ var removeChild: js.Any = js.native
    
    /* private */ var scheduler: js.Any = js.native
    
    def send(event: typings.xstate.typesMod.SCXML.Event[TEvent]): State[TContext, TEvent, TStateSchema, TTypestate] = js.native
    def send(event: typings.xstate.typesMod.SCXML.Event[TEvent], payload: EventData): State[TContext, TEvent, TStateSchema, TTypestate] = js.native
    def send(event: SingleOrArray[Event[TEvent]], payload: EventData): State[TContext, TEvent, TStateSchema, TTypestate] = js.native
    
    /* private */ var sendListeners: js.Any = js.native
    
    /* private */ var sendTo: js.Any = js.native
    
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
    
    def spawn(entity: Spawnable, name: String): Actor[js.Any, AnyEventObject] = js.native
    def spawn(entity: Spawnable, name: String, options: SpawnOptions): Actor[js.Any, AnyEventObject] = js.native
    
    /* private */ var spawnActivity: js.Any = js.native
    
    /* private */ var spawnActor: js.Any = js.native
    
    /* private */ var spawnCallback: js.Any = js.native
    
    /* private */ var spawnEffect: js.Any = js.native
    
    def spawnMachine[TChildContext, TChildStateSchema, TChildEvent /* <: EventObject */](
      machine: StateMachine[TChildContext, TChildStateSchema, TChildEvent, ContextTChildContext[TChildContext]]
    ): Interpreter[TChildContext, TChildStateSchema, TChildEvent, ContextTChildContext[TChildContext]] = js.native
    def spawnMachine[TChildContext, TChildStateSchema, TChildEvent /* <: EventObject */](
      machine: StateMachine[TChildContext, TChildStateSchema, TChildEvent, ContextTChildContext[TChildContext]],
      options: AutoForward
    ): Interpreter[TChildContext, TChildStateSchema, TChildEvent, ContextTChildContext[TChildContext]] = js.native
    
    /* private */ var spawnObservable: js.Any = js.native
    
    /* private */ var spawnPromise: js.Any = js.native
    
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
    
    /* private */ var stopChild: js.Any = js.native
    
    /* private */ var stopListeners: js.Any = js.native
    
    /**
      * Stops the interpreter and unsubscribe all listeners.
      *
      * This will also notify the `onStop` listeners.
      */
    @JSName("stop")
    def stop_MInterpreter(): Interpreter[TContext, TStateSchema, TEvent, TTypestate] = js.native
    
    def subscribe(observer: Observer[State[TContext, TEvent, js.Any, TTypestate]]): Unsubscribable = js.native
    
    /* private */ var update: js.Any = js.native
  }
  /* static members */
  object Interpreter {
    
    @JSImport("xstate/lib/interpreter", "Interpreter")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The default interpreter options:
      *
      * - `clock` uses the global `setTimeout` and `clearTimeout` functions
      * - `logger` uses the global `console.log()` method
      */
    @JSImport("xstate/lib/interpreter", "Interpreter.defaultOptions")
    @js.native
    def defaultOptions: InterpreterOptions = js.native
    inline def defaultOptions_=(x: InterpreterOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(x.asInstanceOf[js.Any])
    
    @JSImport("xstate/lib/interpreter", "Interpreter.interpret")
    @js.native
    def interpret: FnCallMachineOptions = js.native
    inline def interpret[TContext, TStateSchema /* <: StateSchema[js.Any] */, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */](machine: StateMachine[TContext, TStateSchema, TEvent, TTypestate]): Interpreter[TContext, TStateSchema, TEvent, TTypestate] = ^.asInstanceOf[js.Dynamic].applyDynamic("interpret")(machine.asInstanceOf[js.Any]).asInstanceOf[Interpreter[TContext, TStateSchema, TEvent, TTypestate]]
    inline def interpret[TContext, TStateSchema /* <: StateSchema[js.Any] */, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */](
      machine: StateMachine[TContext, TStateSchema, TEvent, TTypestate],
      options: PartialInterpreterOptions
    ): Interpreter[TContext, TStateSchema, TEvent, TTypestate] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpret")(machine.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Interpreter[TContext, TStateSchema, TEvent, TTypestate]]
    inline def interpret_=(x: FnCallMachineOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("interpret")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  sealed trait InterpreterStatus extends StObject
  @JSImport("xstate/lib/interpreter", "InterpreterStatus")
  @js.native
  object InterpreterStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[InterpreterStatus & Double] = js.native
    
    @js.native
    sealed trait NotStarted
      extends StObject
         with InterpreterStatus
    /* 0 */ val NotStarted: typings.xstate.interpreterMod.InterpreterStatus.NotStarted & Double = js.native
    
    @js.native
    sealed trait Running
      extends StObject
         with InterpreterStatus
    /* 1 */ val Running: typings.xstate.interpreterMod.InterpreterStatus.Running & Double = js.native
    
    @js.native
    sealed trait Stopped
      extends StObject
         with InterpreterStatus
    /* 2 */ val Stopped: typings.xstate.interpreterMod.InterpreterStatus.Stopped & Double = js.native
  }
  
  inline def interpret[TContext, TStateSchema /* <: StateSchema[js.Any] */, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */](machine: StateMachine[TContext, TStateSchema, TEvent, TTypestate]): Interpreter[TContext, TStateSchema, TEvent, TTypestate] = ^.asInstanceOf[js.Dynamic].applyDynamic("interpret")(machine.asInstanceOf[js.Any]).asInstanceOf[Interpreter[TContext, TStateSchema, TEvent, TTypestate]]
  inline def interpret[TContext, TStateSchema /* <: StateSchema[js.Any] */, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */](
    machine: StateMachine[TContext, TStateSchema, TEvent, TTypestate],
    options: PartialInterpreterOptions
  ): Interpreter[TContext, TStateSchema, TEvent, TTypestate] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpret")(machine.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Interpreter[TContext, TStateSchema, TEvent, TTypestate]]
  
  inline def spawn(entity: Spawnable): Actor[js.Any, AnyEventObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(entity.asInstanceOf[js.Any]).asInstanceOf[Actor[js.Any, AnyEventObject]]
  inline def spawn(entity: Spawnable, nameOrOptions: String): Actor[js.Any, AnyEventObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(entity.asInstanceOf[js.Any], nameOrOptions.asInstanceOf[js.Any])).asInstanceOf[Actor[js.Any, AnyEventObject]]
  inline def spawn(entity: Spawnable, nameOrOptions: SpawnOptions): Actor[js.Any, AnyEventObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(entity.asInstanceOf[js.Any], nameOrOptions.asInstanceOf[js.Any])).asInstanceOf[Actor[js.Any, AnyEventObject]]
  inline def spawn[TC, TE /* <: EventObject */](entity: StateMachine[TC, js.Any, TE, Context[TC]]): Actor[State[TC, TE, js.Any, Context[TC]], TE] = ^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(entity.asInstanceOf[js.Any]).asInstanceOf[Actor[State[TC, TE, js.Any, Context[TC]], TE]]
  inline def spawn[TC, TE /* <: EventObject */](entity: StateMachine[TC, js.Any, TE, Context[TC]], nameOrOptions: String): Actor[State[TC, TE, js.Any, Context[TC]], TE] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(entity.asInstanceOf[js.Any], nameOrOptions.asInstanceOf[js.Any])).asInstanceOf[Actor[State[TC, TE, js.Any, Context[TC]], TE]]
  inline def spawn[TC, TE /* <: EventObject */](entity: StateMachine[TC, js.Any, TE, Context[TC]], nameOrOptions: SpawnOptions): Actor[State[TC, TE, js.Any, Context[TC]], TE] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(entity.asInstanceOf[js.Any], nameOrOptions.asInstanceOf[js.Any])).asInstanceOf[Actor[State[TC, TE, js.Any, Context[TC]], TE]]
  
  trait Clock extends StObject {
    
    def clearTimeout(id: js.Any): Unit
    
    def setTimeout(fn: js.Function1[/* repeated */ js.Any, Unit], timeout: Double): js.Any
  }
  object Clock {
    
    inline def apply(
      clearTimeout: js.Any => Unit,
      setTimeout: (js.Function1[/* repeated */ js.Any, Unit], Double) => js.Any
    ): Clock = {
      val __obj = js.Dynamic.literal(clearTimeout = js.Any.fromFunction1(clearTimeout), setTimeout = js.Any.fromFunction2(setTimeout))
      __obj.asInstanceOf[Clock]
    }
    
    extension [Self <: Clock](x: Self) {
      
      inline def setClearTimeout(value: js.Any => Unit): Self = StObject.set(x, "clearTimeout", js.Any.fromFunction1(value))
      
      inline def setSetTimeout(value: (js.Function1[/* repeated */ js.Any, Unit], Double) => js.Any): Self = StObject.set(x, "setTimeout", js.Any.fromFunction2(value))
    }
  }
  
  type ContextListener[TContext] = js.Function2[/* context */ TContext, /* prevContext */ js.UndefOr[TContext], Unit]
  
  type EventListener[TEvent /* <: EventObject */] = js.Function1[/* event */ TEvent, Unit]
  
  type Listener = js.Function0[Unit]
  
  trait SpawnOptions extends StObject {
    
    var autoForward: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var sync: js.UndefOr[Boolean] = js.undefined
  }
  object SpawnOptions {
    
    inline def apply(): SpawnOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpawnOptions]
    }
    
    extension [Self <: SpawnOptions](x: Self) {
      
      inline def setAutoForward(value: Boolean): Self = StObject.set(x, "autoForward", value.asInstanceOf[js.Any])
      
      inline def setAutoForwardUndefined: Self = StObject.set(x, "autoForward", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
      
      inline def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
    }
  }
  
  type StateListener[TContext, TEvent /* <: EventObject */, TStateSchema /* <: StateSchema[TContext] */, TTypestate /* <: Typestate[TContext] */] = js.Function2[
    /* state */ State[TContext, TEvent, TStateSchema, TTypestate], 
    /* event */ TEvent, 
    Unit
  ]
}

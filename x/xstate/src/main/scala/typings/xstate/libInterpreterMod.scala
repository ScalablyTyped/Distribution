package typings.xstate

import typings.std.Map
import typings.xstate.anon.AutoForward
import typings.xstate.anon.ContextAny
import typings.xstate.anon.ContextTChildContext
import typings.xstate.anon.FnCall
import typings.xstate.anon.Id
import typings.xstate.anon.ReadonlyInterpreterOption
import typings.xstate.libStateMod.State
import typings.xstate.libTypegenTypesMod.ResolveTypegenMeta
import typings.xstate.libTypegenTypesMod.TypegenDisabled
import typings.xstate.libTypesMod.ActorRef
import typings.xstate.libTypesMod.ActorRefFrom
import typings.xstate.libTypesMod.BaseActionObject
import typings.xstate.libTypesMod.Behavior
import typings.xstate.libTypesMod.DoneEvent
import typings.xstate.libTypesMod.Event
import typings.xstate.libTypesMod.EventData
import typings.xstate.libTypesMod.EventObject
import typings.xstate.libTypesMod.InterpreterOptions
import typings.xstate.libTypesMod.NoInfer
import typings.xstate.libTypesMod.Observer
import typings.xstate.libTypesMod.ServiceMap
import typings.xstate.libTypesMod.SingleOrArray
import typings.xstate.libTypesMod.Spawnable
import typings.xstate.libTypesMod.StateConfig
import typings.xstate.libTypesMod.StateMachine
import typings.xstate.libTypesMod.StateSchema
import typings.xstate.libTypesMod.StateValue
import typings.xstate.libTypesMod.Subscription
import typings.xstate.libTypesMod.Typestate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInterpreterMod {
  
  @JSImport("xstate/lib/interpreter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("xstate/lib/interpreter", "Interpreter")
  @js.native
  open class Interpreter[TContext, TStateSchema /* <: StateSchema[Any] */, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */, TResolvedTypesMeta] protected ()
    extends StObject
       with ActorRef[TEvent, State[TContext, TEvent, TStateSchema, TTypestate, TResolvedTypesMeta]] {
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
    
    /* private */ var _exec: Any = js.native
    
    /* private */ var _initialState: Any = js.native
    
    /* private */ var _nextState: Any = js.native
    
    /* private */ var _outgoingQueue: Any = js.native
    
    /**
      * The current state of the interpreted machine.
      */
    /* private */ var _state: Any = js.native
    
    /* private */ var _stop: Any = js.native
    
    /* private */ var _stopChildren: Any = js.native
    
    /* private */ var attachDev: Any = js.native
    
    /* private */ var batch: Any = js.native
    
    /* private */ var cancel: Any = js.native
    
    var children: Map[String | Double, ActorRef[Any, Any]] = js.native
    
    /**
      * The clock that is responsible for setting and clearing timeouts, such as delayed events and transitions.
      */
    var clock: Clock = js.native
    
    /* private */ var contextListeners: Any = js.native
    
    /* private */ var defer: Any = js.native
    
    /* private */ var delayedEventsMap: Any = js.native
    
    /* private */ var devTools: Any = js.native
    
    /* private */ var doneListeners: Any = js.native
    
    /* private */ var eventListeners: Any = js.native
    
    /* private */ var exec: Any = js.native
    
    /**
      * Executes the actions of the given state, with that state's `context` and `event`.
      *
      * @param state The state whose actions will be executed
      * @param actionsConfig The action implementations to use
      */
    def execute(state: State[TContext, TEvent, TStateSchema, TTypestate, TResolvedTypesMeta]): Unit = js.native
    @JSName("execute")
    def execute_actions(
      state: State[TContext, TEvent, TStateSchema, TTypestate, TResolvedTypesMeta],
      actionsConfig: /* import warning: importer.ImportType#apply Failed type conversion: xstate.xstate/lib/types.MachineOptions<TContext, TEvent, xstate.xstate/lib/types.BaseActionObject, xstate.xstate/lib/types.ServiceMap, xstate.xstate/lib/typegenTypes.TypegenDisabled>['actions'] */ js.Any
    ): Unit = js.native
    
    /* private */ var forward: Any = js.native
    
    /* private */ var forwardTo: Any = js.native
    
    /**
      * Alias for Interpreter.prototype.start
      */
    def init(): this.type = js.native
    def init(initialState: State[TContext, TEvent, TStateSchema, TTypestate, TResolvedTypesMeta]): this.type = js.native
    def init(initialState: StateConfig[TContext, TEvent]): this.type = js.native
    def init(initialState: StateValue): this.type = js.native
    
    def initialState: State[TContext, TEvent, TStateSchema, TTypestate, TResolvedTypesMeta] = js.native
    
    /**
      * Whether the service is started.
      */
    var initialized: Boolean = js.native
    
    /* private */ var listeners: Any = js.native
    
    /* private */ var logger: Any = js.native
    
    var machine: StateMachine[TContext, TStateSchema, TEvent, TTypestate, Any, Any, TResolvedTypesMeta] = js.native
    
    /**
      * Returns the next state given the interpreter's current state and the event.
      *
      * This is a pure method that does _not_ update the interpreter's state.
      *
      * @param event The event to determine the next state
      */
    def nextState(event: Event[TEvent]): State[TContext, TEvent, TStateSchema, TTypestate, TResolvedTypesMeta] = js.native
    def nextState(event: typings.xstate.libTypesMod.SCXML.Event[TEvent]): State[TContext, TEvent, TStateSchema, TTypestate, TResolvedTypesMeta] = js.native
    
    /**
      * Removes a listener.
      * @param listener The listener to remove
      */
    def off(listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    
    /**
      * Adds a context listener that is notified whenever the state context changes.
      * @param listener The context listener
      */
    def onChange(listener: ContextListener[TContext]): this.type = js.native
    
    /**
      * Adds a state listener that is notified when the statechart has reached its final state.
      * @param listener The state listener
      */
    def onDone(listener: EventListener[DoneEvent]): this.type = js.native
    
    /**
      * Adds an event listener that is notified whenever an event is sent to the running interpreter.
      * @param listener The event listener
      */
    def onEvent(listener: EventListener[EventObject]): this.type = js.native
    
    /**
      * Adds an event listener that is notified whenever a `send` event occurs.
      * @param listener The event listener
      */
    def onSend(listener: EventListener[EventObject]): this.type = js.native
    
    /**
      * Adds a listener that is notified when the machine is stopped.
      * @param listener The listener
      */
    def onStop(listener: Listener): this.type = js.native
    
    def onTransition(listener: StateListener[TContext, TEvent, TStateSchema, TTypestate, TResolvedTypesMeta]): this.type = js.native
    
    var options: ReadonlyInterpreterOption = js.native
    
    var parent: js.UndefOr[Interpreter[Any, Any, EventObject, ContextAny, TypegenDisabled]] = js.native
    
    /* private */ var removeChild: Any = js.native
    
    /* private */ var scheduler: Any = js.native
    
    def send(event: typings.xstate.libTypesMod.SCXML.Event[TEvent]): State[TContext, TEvent, TStateSchema, TTypestate, TResolvedTypesMeta] = js.native
    def send(event: typings.xstate.libTypesMod.SCXML.Event[TEvent], payload: EventData): State[TContext, TEvent, TStateSchema, TTypestate, TResolvedTypesMeta] = js.native
    def send(event: SingleOrArray[Event[TEvent]], payload: EventData): State[TContext, TEvent, TStateSchema, TTypestate, TResolvedTypesMeta] = js.native
    
    /* private */ var sendListeners: Any = js.native
    
    /* private */ var sendTo: Any = js.native
    
    /**
      * Returns a send function bound to this interpreter instance.
      *
      * @param event The event to be sent by the sender.
      */
    def sender(event: Event[TEvent]): js.Function0[State[TContext, TEvent, TStateSchema, TTypestate, TypegenDisabled]] = js.native
    
    /**
      * The globally unique process ID for this invocation.
      */
    var sessionId: String = js.native
    
    def spawn(entity: Spawnable, name: String): ActorRef[Any, Any] = js.native
    def spawn(entity: Spawnable, name: String, options: SpawnOptions): ActorRef[Any, Any] = js.native
    
    /* private */ var spawnActivity: Any = js.native
    
    /* private */ var spawnActor: Any = js.native
    
    /* private */ var spawnBehavior: Any = js.native
    
    /* private */ var spawnCallback: Any = js.native
    
    /* private */ var spawnEffect: Any = js.native
    
    def spawnMachine[TChildContext, TChildStateSchema /* <: StateSchema[Any] */, TChildEvent /* <: EventObject */](
      machine: StateMachine[
          TChildContext, 
          TChildStateSchema, 
          TChildEvent, 
          ContextTChildContext[TChildContext], 
          BaseActionObject, 
          ServiceMap, 
          ResolveTypegenMeta[TypegenDisabled, NoInfer[TChildEvent], BaseActionObject, ServiceMap]
        ]
    ): ActorRef[
        TChildEvent, 
        State[TChildContext, TChildEvent, Any, ContextTChildContext[TChildContext], TypegenDisabled]
      ] = js.native
    def spawnMachine[TChildContext, TChildStateSchema /* <: StateSchema[Any] */, TChildEvent /* <: EventObject */](
      machine: StateMachine[
          TChildContext, 
          TChildStateSchema, 
          TChildEvent, 
          ContextTChildContext[TChildContext], 
          BaseActionObject, 
          ServiceMap, 
          ResolveTypegenMeta[TypegenDisabled, NoInfer[TChildEvent], BaseActionObject, ServiceMap]
        ],
      options: AutoForward
    ): ActorRef[
        TChildEvent, 
        State[TChildContext, TChildEvent, Any, ContextTChildContext[TChildContext], TypegenDisabled]
      ] = js.native
    
    /* private */ var spawnObservable: Any = js.native
    
    /* private */ var spawnPromise: Any = js.native
    
    /**
      * Starts the interpreter from the given state, or the initial state.
      * @param initialState The state to start the statechart from
      */
    def start(): this.type = js.native
    def start(initialState: State[TContext, TEvent, TStateSchema, TTypestate, TResolvedTypesMeta]): this.type = js.native
    def start(initialState: StateConfig[TContext, TEvent]): this.type = js.native
    def start(initialState: StateValue): this.type = js.native
    
    /**
      * @deprecated Use `.getSnapshot()` instead.
      */
    def state: State[TContext, TEvent, TStateSchema, TTypestate, TResolvedTypesMeta] = js.native
    
    var status: InterpreterStatus = js.native
    
    /* private */ var stopChild: Any = js.native
    
    /* private */ var stopListeners: Any = js.native
    
    /**
      * Stops the interpreter and unsubscribe all listeners.
      *
      * This will also notify the `onStop` listeners.
      */
    @JSName("stop")
    def stop_MInterpreter(): this.type = js.native
    
    def subscribe(): Subscription = js.native
    def subscribe(nextListener: Unit, errorListener: js.Function1[/* error */ Any, Unit]): Subscription = js.native
    def subscribe(
      nextListener: Unit,
      errorListener: js.Function1[/* error */ Any, Unit],
      completeListener: js.Function0[Unit]
    ): Subscription = js.native
    def subscribe(nextListener: Unit, errorListener: Unit, completeListener: js.Function0[Unit]): Subscription = js.native
    /* CompleteClass */
    override def subscribe(observer: Observer[State[TContext, TEvent, TStateSchema, TTypestate, TResolvedTypesMeta]]): Subscription = js.native
    
    @JSName("toJSON")
    def toJSON_MInterpreter(): Id = js.native
    
    /* private */ var update: Any = js.native
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
    def defaultOptions: typings.xstate.anon.Clock = js.native
    inline def defaultOptions_=(x: typings.xstate.anon.Clock): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(x.asInstanceOf[js.Any])
    
    @JSImport("xstate/lib/interpreter", "Interpreter.interpret")
    @js.native
    def interpret: FnCall = js.native
    inline def interpret[TContext, TStateSchema /* <: StateSchema[Any] */, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */, TResolvedTypesMeta](
      machine: /* import warning: importer.ImportType#apply Failed type conversion: xstate.xstate/lib/typegenTypes.AreAllImplementationsAssumedToBeProvided<TResolvedTypesMeta, xstate.xstate/lib/types.Prop<xstate.xstate/lib/types.Prop<TResolvedTypesMeta, 'resolved'>, 'missingImplementations'>> extends true ? xstate.xstate/lib/types.StateMachine<TContext, TStateSchema, TEvent, TTypestate, any, any, TResolvedTypesMeta> : 'Some implementations missing' */ js.Any
    ): Interpreter[TContext, TStateSchema, TEvent, TTypestate, TResolvedTypesMeta] = ^.asInstanceOf[js.Dynamic].applyDynamic("interpret")(machine.asInstanceOf[js.Any]).asInstanceOf[Interpreter[TContext, TStateSchema, TEvent, TTypestate, TResolvedTypesMeta]]
    inline def interpret[TContext, TStateSchema /* <: StateSchema[Any] */, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */, TResolvedTypesMeta](
      machine: /* import warning: importer.ImportType#apply Failed type conversion: xstate.xstate/lib/typegenTypes.AreAllImplementationsAssumedToBeProvided<TResolvedTypesMeta, xstate.xstate/lib/types.Prop<xstate.xstate/lib/types.Prop<TResolvedTypesMeta, 'resolved'>, 'missingImplementations'>> extends true ? xstate.xstate/lib/types.StateMachine<TContext, TStateSchema, TEvent, TTypestate, any, any, TResolvedTypesMeta> : 'Some implementations missing' */ js.Any,
      options: InterpreterOptions
    ): Interpreter[TContext, TStateSchema, TEvent, TTypestate, TResolvedTypesMeta] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpret")(machine.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Interpreter[TContext, TStateSchema, TEvent, TTypestate, TResolvedTypesMeta]]
    inline def interpret_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("interpret")(x.asInstanceOf[js.Any])
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
    /* 0 */ val NotStarted: typings.xstate.libInterpreterMod.InterpreterStatus.NotStarted & Double = js.native
    
    @js.native
    sealed trait Running
      extends StObject
         with InterpreterStatus
    /* 1 */ val Running: typings.xstate.libInterpreterMod.InterpreterStatus.Running & Double = js.native
    
    @js.native
    sealed trait Stopped
      extends StObject
         with InterpreterStatus
    /* 2 */ val Stopped: typings.xstate.libInterpreterMod.InterpreterStatus.Stopped & Double = js.native
  }
  
  inline def interpret[TContext, TStateSchema /* <: StateSchema[Any] */, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */, TResolvedTypesMeta](
    machine: /* import warning: importer.ImportType#apply Failed type conversion: xstate.xstate/lib/typegenTypes.AreAllImplementationsAssumedToBeProvided<TResolvedTypesMeta, xstate.xstate/lib/types.Prop<xstate.xstate/lib/types.Prop<TResolvedTypesMeta, 'resolved'>, 'missingImplementations'>> extends true ? xstate.xstate/lib/types.StateMachine<TContext, TStateSchema, TEvent, TTypestate, any, any, TResolvedTypesMeta> : 'Some implementations missing' */ js.Any
  ): Interpreter[TContext, TStateSchema, TEvent, TTypestate, TResolvedTypesMeta] = ^.asInstanceOf[js.Dynamic].applyDynamic("interpret")(machine.asInstanceOf[js.Any]).asInstanceOf[Interpreter[TContext, TStateSchema, TEvent, TTypestate, TResolvedTypesMeta]]
  inline def interpret[TContext, TStateSchema /* <: StateSchema[Any] */, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */, TResolvedTypesMeta](
    machine: /* import warning: importer.ImportType#apply Failed type conversion: xstate.xstate/lib/typegenTypes.AreAllImplementationsAssumedToBeProvided<TResolvedTypesMeta, xstate.xstate/lib/types.Prop<xstate.xstate/lib/types.Prop<TResolvedTypesMeta, 'resolved'>, 'missingImplementations'>> extends true ? xstate.xstate/lib/types.StateMachine<TContext, TStateSchema, TEvent, TTypestate, any, any, TResolvedTypesMeta> : 'Some implementations missing' */ js.Any,
    options: InterpreterOptions
  ): Interpreter[TContext, TStateSchema, TEvent, TTypestate, TResolvedTypesMeta] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpret")(machine.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Interpreter[TContext, TStateSchema, TEvent, TTypestate, TResolvedTypesMeta]]
  
  inline def spawn(entity: Spawnable): ActorRef[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(entity.asInstanceOf[js.Any]).asInstanceOf[ActorRef[Any, Any]]
  inline def spawn(entity: Spawnable, nameOrOptions: String): ActorRef[Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(entity.asInstanceOf[js.Any], nameOrOptions.asInstanceOf[js.Any])).asInstanceOf[ActorRef[Any, Any]]
  inline def spawn(entity: Spawnable, nameOrOptions: SpawnOptions): ActorRef[Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(entity.asInstanceOf[js.Any], nameOrOptions.asInstanceOf[js.Any])).asInstanceOf[ActorRef[Any, Any]]
  inline def spawn[T /* <: Behavior[Any, Any] */](entity: T): ActorRefFrom[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(entity.asInstanceOf[js.Any]).asInstanceOf[ActorRefFrom[T]]
  inline def spawn[T /* <: Behavior[Any, Any] */](entity: T, nameOrOptions: String): ActorRefFrom[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(entity.asInstanceOf[js.Any], nameOrOptions.asInstanceOf[js.Any])).asInstanceOf[ActorRefFrom[T]]
  inline def spawn[T /* <: Behavior[Any, Any] */](entity: T, nameOrOptions: SpawnOptions): ActorRefFrom[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(entity.asInstanceOf[js.Any], nameOrOptions.asInstanceOf[js.Any])).asInstanceOf[ActorRefFrom[T]]
  inline def spawn[TC, TE /* <: EventObject */](entity: StateMachine[TC, Any, TE, Any, Any, Any, Any]): ActorRefFrom[StateMachine[TC, Any, TE, Any, Any, Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(entity.asInstanceOf[js.Any]).asInstanceOf[ActorRefFrom[StateMachine[TC, Any, TE, Any, Any, Any, Any]]]
  inline def spawn[TC, TE /* <: EventObject */](entity: StateMachine[TC, Any, TE, Any, Any, Any, Any], nameOrOptions: String): ActorRefFrom[StateMachine[TC, Any, TE, Any, Any, Any, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(entity.asInstanceOf[js.Any], nameOrOptions.asInstanceOf[js.Any])).asInstanceOf[ActorRefFrom[StateMachine[TC, Any, TE, Any, Any, Any, Any]]]
  inline def spawn[TC, TE /* <: EventObject */](entity: StateMachine[TC, Any, TE, Any, Any, Any, Any], nameOrOptions: SpawnOptions): ActorRefFrom[StateMachine[TC, Any, TE, Any, Any, Any, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(entity.asInstanceOf[js.Any], nameOrOptions.asInstanceOf[js.Any])).asInstanceOf[ActorRefFrom[StateMachine[TC, Any, TE, Any, Any, Any, Any]]]
  
  trait Clock extends StObject {
    
    def clearTimeout(id: Any): Unit
    
    def setTimeout(fn: js.Function1[/* repeated */ Any, Unit], timeout: Double): Any
  }
  object Clock {
    
    inline def apply(clearTimeout: Any => Unit, setTimeout: (js.Function1[/* repeated */ Any, Unit], Double) => Any): Clock = {
      val __obj = js.Dynamic.literal(clearTimeout = js.Any.fromFunction1(clearTimeout), setTimeout = js.Any.fromFunction2(setTimeout))
      __obj.asInstanceOf[Clock]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Clock] (val x: Self) extends AnyVal {
      
      inline def setClearTimeout(value: Any => Unit): Self = StObject.set(x, "clearTimeout", js.Any.fromFunction1(value))
      
      inline def setSetTimeout(value: (js.Function1[/* repeated */ Any, Unit], Double) => Any): Self = StObject.set(x, "setTimeout", js.Any.fromFunction2(value))
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SpawnOptions] (val x: Self) extends AnyVal {
      
      inline def setAutoForward(value: Boolean): Self = StObject.set(x, "autoForward", value.asInstanceOf[js.Any])
      
      inline def setAutoForwardUndefined: Self = StObject.set(x, "autoForward", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
      
      inline def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
    }
  }
  
  type StateListener[TContext, TEvent /* <: EventObject */, TStateSchema /* <: StateSchema[TContext] */, TTypestate /* <: Typestate[TContext] */, TResolvedTypesMeta] = js.Function2[
    /* state */ State[TContext, TEvent, TStateSchema, TTypestate, TResolvedTypesMeta], 
    /* event */ TEvent, 
    Unit
  ]
}

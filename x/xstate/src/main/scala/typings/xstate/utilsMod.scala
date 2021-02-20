package typings.xstate

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import typings.std.Partial
import typings.std.Record
import typings.xstate.anon.ContextTContext
import typings.xstate.anon.`4`
import typings.xstate.mod.State
import typings.xstate.stateNodeMod.StateNode
import typings.xstate.typesMod.Action
import typings.xstate.typesMod.ActionType
import typings.xstate.typesMod.ActionTypes.NullEvent
import typings.xstate.typesMod.AssignAction
import typings.xstate.typesMod.Condition
import typings.xstate.typesMod.ConditionPredicate
import typings.xstate.typesMod.EventData
import typings.xstate.typesMod.EventObject
import typings.xstate.typesMod.EventType
import typings.xstate.typesMod.Guard
import typings.xstate.typesMod.HistoryValue
import typings.xstate.typesMod.InvokeSourceDefinition
import typings.xstate.typesMod.Mapper
import typings.xstate.typesMod.PropertyMapper
import typings.xstate.typesMod.SCXML.Event
import typings.xstate.typesMod.SingleOrArray
import typings.xstate.typesMod.StateLike
import typings.xstate.typesMod.StateValue
import typings.xstate.typesMod.TransitionConfig
import typings.xstate.typesMod.TransitionConfigTarget
import typings.xstate.xstateStrings.Asterisk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("xstate/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("xstate/lib/utils", "evaluateGuard")
  @js.native
  def evaluateGuard[TContext, TEvent /* <: EventObject */](
    machine: StateNode[TContext, _, TEvent, ContextTContext[TContext]],
    guard: Guard[TContext, TEvent],
    context: TContext,
    _event: Event[TEvent],
    state: State[TContext, TEvent, _, ContextTContext[TContext]]
  ): Boolean = js.native
  
  @JSImport("xstate/lib/utils", "flatten")
  @js.native
  def flatten[T](array: js.Array[T | js.Array[T]]): js.Array[T] = js.native
  
  @JSImport("xstate/lib/utils", "getActionType")
  @js.native
  def getActionType(action: Action[_, _]): ActionType = js.native
  
  @JSImport("xstate/lib/utils", "getEventType")
  @js.native
  def getEventType[TEvent /* <: EventObject */](event: typings.xstate.typesMod.Event[TEvent]): /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any = js.native
  
  @JSImport("xstate/lib/utils", "isActor")
  @js.native
  def isActor(value: js.Any): /* is xstate.xstate/lib/Actor.Actor<any, xstate.xstate/lib/types.AnyEventObject> */ Boolean = js.native
  
  @JSImport("xstate/lib/utils", "isArray")
  @js.native
  def isArray(value: js.Any): /* is std.Array<any> */ Boolean = js.native
  
  @JSImport("xstate/lib/utils", "isBuiltInEvent")
  @js.native
  def isBuiltInEvent(eventType: EventType): Boolean = js.native
  
  @JSImport("xstate/lib/utils", "isFunction")
  @js.native
  def isFunction(value: js.Any): /* is std.Function */ Boolean = js.native
  
  @JSImport("xstate/lib/utils", "isMachine")
  @js.native
  def isMachine(value: js.Any): /* is xstate.xstate/lib/types.StateMachine<any, any, any, xstate.anon.ContextAny> */ Boolean = js.native
  
  @JSImport("xstate/lib/utils", "isObservable")
  @js.native
  def isObservable[T](value: js.Any): /* is xstate.xstate/lib/types.Subscribable<T> */ Boolean = js.native
  
  @JSImport("xstate/lib/utils", "isPromiseLike")
  @js.native
  def isPromiseLike(value: js.Any): /* is std.PromiseLike<any> */ Boolean = js.native
  
  @JSImport("xstate/lib/utils", "isStateLike")
  @js.native
  def isStateLike(state: js.Any): /* is xstate.xstate/lib/types.StateLike<any> */ Boolean = js.native
  
  @JSImport("xstate/lib/utils", "isString")
  @js.native
  def isString(value: js.Any): /* is string */ Boolean = js.native
  
  @JSImport("xstate/lib/utils", "keys")
  @js.native
  def keys[T /* <: js.Object */](value: T): js.Array[/* keyof T */ String] = js.native
  
  @JSImport("xstate/lib/utils", "mapContext")
  @js.native
  def mapContext[TContext, TEvent /* <: EventObject */](mapper: Mapper[TContext, TEvent, _], context: TContext, _event: Event[TEvent]): js.Any = js.native
  @JSImport("xstate/lib/utils", "mapContext")
  @js.native
  def mapContext[TContext, TEvent /* <: EventObject */](mapper: PropertyMapper[TContext, TEvent, _], context: TContext, _event: Event[TEvent]): js.Any = js.native
  
  @JSImport("xstate/lib/utils", "mapFilterValues")
  @js.native
  def mapFilterValues[T, P](
    collection: StringDictionary[T],
    iteratee: js.Function3[/* item */ T, /* key */ String, /* collection */ StringDictionary[T], P],
    predicate: js.Function1[/* item */ T, Boolean]
  ): StringDictionary[P] = js.native
  
  @JSImport("xstate/lib/utils", "mapValues")
  @js.native
  def mapValues[T, P](
    collection: StringDictionary[T],
    iteratee: js.Function4[/* item */ T, /* key */ String, /* collection */ StringDictionary[T], /* i */ Double, P]
  ): StringDictionary[P] = js.native
  
  @JSImport("xstate/lib/utils", "matchesState")
  @js.native
  def matchesState(parentStateId: StateValue, childStateId: StateValue): Boolean = js.native
  @JSImport("xstate/lib/utils", "matchesState")
  @js.native
  def matchesState(parentStateId: StateValue, childStateId: StateValue, delimiter: String): Boolean = js.native
  
  @JSImport("xstate/lib/utils", "nestedPath")
  @js.native
  def nestedPath[T /* <: Record[String, _] */](props: js.Array[String], accessorProp: /* keyof T */ String): js.Function1[/* object */ T, T] = js.native
  
  @JSImport("xstate/lib/utils", "normalizeTarget")
  @js.native
  def normalizeTarget[TContext, TEvent /* <: EventObject */](): js.UndefOr[js.Array[String | (StateNode[TContext, _, TEvent, ContextTContext[TContext]])]] = js.native
  @JSImport("xstate/lib/utils", "normalizeTarget")
  @js.native
  def normalizeTarget[TContext, TEvent /* <: EventObject */](target: SingleOrArray[String | (StateNode[TContext, _, TEvent, ContextTContext[TContext]])]): js.UndefOr[js.Array[String | (StateNode[TContext, _, TEvent, ContextTContext[TContext]])]] = js.native
  
  @JSImport("xstate/lib/utils", "partition")
  @js.native
  def partition[T, A /* <: T */, B /* <: T */](items: js.Array[T], predicate: js.Function1[/* item */ T, /* is A */ Boolean]): js.Tuple2[js.Array[A], js.Array[B]] = js.native
  
  @JSImport("xstate/lib/utils", "path")
  @js.native
  def path[T /* <: Record[String, _] */](props: js.Array[String]): js.Any = js.native
  
  @JSImport("xstate/lib/utils", "pathToStateValue")
  @js.native
  def pathToStateValue(statePath: js.Array[String]): StateValue = js.native
  
  @JSImport("xstate/lib/utils", "pathsToStateValue")
  @js.native
  def pathsToStateValue(paths: js.Array[js.Array[String]]): StateValue = js.native
  
  @JSImport("xstate/lib/utils", "reportUnhandledExceptionOnInvocation")
  @js.native
  def reportUnhandledExceptionOnInvocation(originalError: js.Any, currentError: js.Any, id: String): Unit = js.native
  
  @JSImport("xstate/lib/utils", "symbolObservable")
  @js.native
  val symbolObservable: String | js.Symbol = js.native
  
  @JSImport("xstate/lib/utils", "toArray")
  @js.native
  def toArray[T](): js.Array[T] = js.native
  @JSImport("xstate/lib/utils", "toArray")
  @js.native
  def toArray[T](value: T): js.Array[T] = js.native
  @JSImport("xstate/lib/utils", "toArray")
  @js.native
  def toArray[T](value: js.Array[T]): js.Array[T] = js.native
  
  @JSImport("xstate/lib/utils", "toArrayStrict")
  @js.native
  def toArrayStrict[T](value: T): js.Array[T] = js.native
  @JSImport("xstate/lib/utils", "toArrayStrict")
  @js.native
  def toArrayStrict[T](value: js.Array[T]): js.Array[T] = js.native
  
  @JSImport("xstate/lib/utils", "toEventObject")
  @js.native
  def toEventObject[TEvent /* <: EventObject */](event: typings.xstate.typesMod.Event[TEvent]): TEvent = js.native
  @JSImport("xstate/lib/utils", "toEventObject")
  @js.native
  def toEventObject[TEvent /* <: EventObject */](event: typings.xstate.typesMod.Event[TEvent], payload: EventData): TEvent = js.native
  
  @JSImport("xstate/lib/utils", "toGuard")
  @js.native
  def toGuard[TContext, TEvent /* <: EventObject */](): js.UndefOr[Guard[TContext, TEvent]] = js.native
  @JSImport("xstate/lib/utils", "toGuard")
  @js.native
  def toGuard[TContext, TEvent /* <: EventObject */](
    condition: js.UndefOr[Condition[TContext, TEvent]],
    guardMap: Record[String, ConditionPredicate[TContext, TEvent]]
  ): js.UndefOr[Guard[TContext, TEvent]] = js.native
  @JSImport("xstate/lib/utils", "toGuard")
  @js.native
  def toGuard[TContext, TEvent /* <: EventObject */](condition: Condition[TContext, TEvent]): js.UndefOr[Guard[TContext, TEvent]] = js.native
  
  @JSImport("xstate/lib/utils", "toInvokeSource")
  @js.native
  def toInvokeSource(src: String): InvokeSourceDefinition = js.native
  @JSImport("xstate/lib/utils", "toInvokeSource")
  @js.native
  def toInvokeSource(src: InvokeSourceDefinition): InvokeSourceDefinition = js.native
  
  @JSImport("xstate/lib/utils", "toSCXMLEvent")
  @js.native
  def toSCXMLEvent[TEvent /* <: EventObject */](event: typings.xstate.typesMod.Event[TEvent]): Event[TEvent] = js.native
  @JSImport("xstate/lib/utils", "toSCXMLEvent")
  @js.native
  def toSCXMLEvent[TEvent /* <: EventObject */](event: typings.xstate.typesMod.Event[TEvent], scxmlEvent: Partial[Event[TEvent]]): Event[TEvent] = js.native
  @JSImport("xstate/lib/utils", "toSCXMLEvent")
  @js.native
  def toSCXMLEvent[TEvent /* <: EventObject */](event: Event[TEvent]): Event[TEvent] = js.native
  @JSImport("xstate/lib/utils", "toSCXMLEvent")
  @js.native
  def toSCXMLEvent[TEvent /* <: EventObject */](event: Event[TEvent], scxmlEvent: Partial[Event[TEvent]]): Event[TEvent] = js.native
  
  @JSImport("xstate/lib/utils", "toStatePath")
  @js.native
  def toStatePath(stateId: String, delimiter: String): js.Array[String] = js.native
  @JSImport("xstate/lib/utils", "toStatePath")
  @js.native
  def toStatePath(stateId: js.Array[String], delimiter: String): js.Array[String] = js.native
  
  @JSImport("xstate/lib/utils", "toStatePaths")
  @js.native
  def toStatePaths(): js.Array[js.Array[String]] = js.native
  @JSImport("xstate/lib/utils", "toStatePaths")
  @js.native
  def toStatePaths(stateValue: StateValue): js.Array[js.Array[String]] = js.native
  
  @JSImport("xstate/lib/utils", "toStateValue")
  @js.native
  def toStateValue(stateValue: js.Array[String], delimiter: String): StateValue = js.native
  @JSImport("xstate/lib/utils", "toStateValue")
  @js.native
  def toStateValue(stateValue: StateLike[_], delimiter: String): StateValue = js.native
  @JSImport("xstate/lib/utils", "toStateValue")
  @js.native
  def toStateValue(stateValue: StateValue, delimiter: String): StateValue = js.native
  
  @JSImport("xstate/lib/utils", "toTransitionConfigArray")
  @js.native
  def toTransitionConfigArray[TContext, TEvent /* <: EventObject */](
    event: NullEvent,
    configLike: SingleOrArray[
      (TransitionConfig[TContext, TEvent]) | (TransitionConfigTarget[TContext, TEvent])
    ]
  ): js.Array[(TransitionConfig[TContext, TEvent]) with `4`[TEvent]] = js.native
  @JSImport("xstate/lib/utils", "toTransitionConfigArray")
  @js.native
  def toTransitionConfigArray[TContext, TEvent /* <: EventObject */](
    event: Asterisk,
    configLike: SingleOrArray[
      (TransitionConfig[TContext, TEvent]) | (TransitionConfigTarget[TContext, TEvent])
    ]
  ): js.Array[(TransitionConfig[TContext, TEvent]) with `4`[TEvent]] = js.native
  @JSImport("xstate/lib/utils", "toTransitionConfigArray")
  @js.native
  def toTransitionConfigArray_type[TContext, TEvent /* <: EventObject */](
    event: /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any,
    configLike: SingleOrArray[
      (TransitionConfig[TContext, TEvent]) | (TransitionConfigTarget[TContext, TEvent])
    ]
  ): js.Array[(TransitionConfig[TContext, TEvent]) with `4`[TEvent]] = js.native
  
  @JSImport("xstate/lib/utils", "uniqueId")
  @js.native
  def uniqueId(): String = js.native
  
  @JSImport("xstate/lib/utils", "updateContext")
  @js.native
  def updateContext[TContext, TEvent /* <: EventObject */](context: TContext, _event: Event[TEvent], assignActions: js.Array[AssignAction[TContext, TEvent]]): TContext = js.native
  @JSImport("xstate/lib/utils", "updateContext")
  @js.native
  def updateContext[TContext, TEvent /* <: EventObject */](
    context: TContext,
    _event: Event[TEvent],
    assignActions: js.Array[AssignAction[TContext, TEvent]],
    state: State[TContext, TEvent, _, ContextTContext[TContext]]
  ): TContext = js.native
  
  @JSImport("xstate/lib/utils", "updateHistoryStates")
  @js.native
  def updateHistoryStates(hist: HistoryValue, stateValue: StateValue): Record[String, js.UndefOr[HistoryValue]] = js.native
  
  @JSImport("xstate/lib/utils", "updateHistoryValue")
  @js.native
  def updateHistoryValue(hist: HistoryValue, stateValue: StateValue): HistoryValue = js.native
  
  @JSImport("xstate/lib/utils", "warn")
  @js.native
  def warn: js.Function2[/* condition */ Boolean | Error, /* message */ String, Unit] = js.native
  @scala.inline
  def warn_=(x: js.Function2[/* condition */ Boolean | Error, /* message */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("warn")(x.asInstanceOf[js.Any])
}

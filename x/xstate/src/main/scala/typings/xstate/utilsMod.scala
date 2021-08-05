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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("xstate/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def evaluateGuard[TContext, TEvent /* <: EventObject */](
    machine: StateNode[TContext, js.Any, TEvent, ContextTContext[TContext]],
    guard: Guard[TContext, TEvent],
    context: TContext,
    _event: Event[TEvent],
    state: State[TContext, TEvent, js.Any, ContextTContext[TContext]]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("evaluateGuard")(machine.asInstanceOf[js.Any], guard.asInstanceOf[js.Any], context.asInstanceOf[js.Any], _event.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def flatten[T](array: js.Array[T | js.Array[T]]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def getActionType(action: Action[js.Any, js.Any]): ActionType = ^.asInstanceOf[js.Dynamic].applyDynamic("getActionType")(action.asInstanceOf[js.Any]).asInstanceOf[ActionType]
  
  inline def getEventType[TEvent /* <: EventObject */](event: typings.xstate.typesMod.Event[TEvent]): /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getEventType")(event.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any]
  
  inline def isActor(value: js.Any): /* is xstate.xstate/lib/Actor.Actor<any, xstate.xstate/lib/types.AnyEventObject> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isActor")(value.asInstanceOf[js.Any]).asInstanceOf[/* is xstate.xstate/lib/Actor.Actor<any, xstate.xstate/lib/types.AnyEventObject> */ Boolean]
  
  inline def isArray(value: js.Any): /* is std.Array<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<any> */ Boolean]
  
  inline def isBuiltInEvent(eventType: EventType): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBuiltInEvent")(eventType.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isFunction(value: js.Any): /* is std.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Function */ Boolean]
  
  inline def isMachine(value: js.Any): /* is xstate.xstate/lib/types.StateMachine<any, any, any, xstate.anon.ContextAny> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMachine")(value.asInstanceOf[js.Any]).asInstanceOf[/* is xstate.xstate/lib/types.StateMachine<any, any, any, xstate.anon.ContextAny> */ Boolean]
  
  inline def isObservable[T](value: js.Any): /* is xstate.xstate/lib/types.Subscribable<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObservable")(value.asInstanceOf[js.Any]).asInstanceOf[/* is xstate.xstate/lib/types.Subscribable<T> */ Boolean]
  
  inline def isPromiseLike(value: js.Any): /* is std.PromiseLike<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPromiseLike")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.PromiseLike<any> */ Boolean]
  
  inline def isStateLike(state: js.Any): /* is xstate.xstate/lib/types.StateLike<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStateLike")(state.asInstanceOf[js.Any]).asInstanceOf[/* is xstate.xstate/lib/types.StateLike<any> */ Boolean]
  
  inline def isString(value: js.Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(value.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  inline def keys[T /* <: js.Object */](value: T): js.Array[/* keyof T */ String] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[/* keyof T */ String]]
  
  inline def mapContext[TContext, TEvent /* <: EventObject */](mapper: Mapper[TContext, TEvent, js.Any], context: TContext, _event: Event[TEvent]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mapContext")(mapper.asInstanceOf[js.Any], context.asInstanceOf[js.Any], _event.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def mapContext[TContext, TEvent /* <: EventObject */](mapper: PropertyMapper[TContext, TEvent, js.Any], context: TContext, _event: Event[TEvent]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mapContext")(mapper.asInstanceOf[js.Any], context.asInstanceOf[js.Any], _event.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def mapFilterValues[T, P](
    collection: StringDictionary[T],
    iteratee: js.Function3[/* item */ T, /* key */ String, /* collection */ StringDictionary[T], P],
    predicate: js.Function1[/* item */ T, Boolean]
  ): StringDictionary[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapFilterValues")(collection.asInstanceOf[js.Any], iteratee.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[P]]
  
  inline def mapValues[T, P](
    collection: StringDictionary[T],
    iteratee: js.Function4[/* item */ T, /* key */ String, /* collection */ StringDictionary[T], /* i */ Double, P]
  ): StringDictionary[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapValues")(collection.asInstanceOf[js.Any], iteratee.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[P]]
  
  inline def matchesState(parentStateId: StateValue, childStateId: StateValue): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchesState")(parentStateId.asInstanceOf[js.Any], childStateId.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def matchesState(parentStateId: StateValue, childStateId: StateValue, delimiter: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchesState")(parentStateId.asInstanceOf[js.Any], childStateId.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def nestedPath[T /* <: Record[String, js.Any] */](props: js.Array[String], accessorProp: /* keyof T */ String): js.Function1[/* object */ T, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("nestedPath")(props.asInstanceOf[js.Any], accessorProp.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* object */ T, T]]
  
  inline def normalizeTarget[TContext, TEvent /* <: EventObject */](): js.UndefOr[
    js.Array[String | (StateNode[TContext, js.Any, TEvent, ContextTContext[TContext]])]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeTarget")().asInstanceOf[js.UndefOr[
    js.Array[String | (StateNode[TContext, js.Any, TEvent, ContextTContext[TContext]])]
  ]]
  inline def normalizeTarget[TContext, TEvent /* <: EventObject */](target: SingleOrArray[String | (StateNode[TContext, js.Any, TEvent, ContextTContext[TContext]])]): js.UndefOr[
    js.Array[String | (StateNode[TContext, js.Any, TEvent, ContextTContext[TContext]])]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeTarget")(target.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[
    js.Array[String | (StateNode[TContext, js.Any, TEvent, ContextTContext[TContext]])]
  ]]
  
  inline def partition[T, A /* <: T */, B /* <: T */](items: js.Array[T], predicate: js.Function1[/* item */ T, /* is A */ Boolean]): js.Tuple2[js.Array[A], js.Array[B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("partition")(items.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Array[A], js.Array[B]]]
  
  inline def path[T /* <: Record[String, js.Any] */](props: js.Array[String]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("path")(props.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def pathToStateValue(statePath: js.Array[String]): StateValue = ^.asInstanceOf[js.Dynamic].applyDynamic("pathToStateValue")(statePath.asInstanceOf[js.Any]).asInstanceOf[StateValue]
  
  inline def pathsToStateValue(paths: js.Array[js.Array[String]]): StateValue = ^.asInstanceOf[js.Dynamic].applyDynamic("pathsToStateValue")(paths.asInstanceOf[js.Any]).asInstanceOf[StateValue]
  
  inline def reportUnhandledExceptionOnInvocation(originalError: js.Any, currentError: js.Any, id: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reportUnhandledExceptionOnInvocation")(originalError.asInstanceOf[js.Any], currentError.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("xstate/lib/utils", "symbolObservable")
  @js.native
  val symbolObservable: String | js.Symbol = js.native
  
  inline def toArray[T](): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")().asInstanceOf[js.Array[T]]
  inline def toArray[T](value: T): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def toArray[T](value: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def toArrayStrict[T](value: T): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArrayStrict")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def toArrayStrict[T](value: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArrayStrict")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def toEventObject[TEvent /* <: EventObject */](event: typings.xstate.typesMod.Event[TEvent]): TEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("toEventObject")(event.asInstanceOf[js.Any]).asInstanceOf[TEvent]
  inline def toEventObject[TEvent /* <: EventObject */](event: typings.xstate.typesMod.Event[TEvent], payload: EventData): TEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("toEventObject")(event.asInstanceOf[js.Any], payload.asInstanceOf[js.Any])).asInstanceOf[TEvent]
  
  inline def toGuard[TContext, TEvent /* <: EventObject */](): js.UndefOr[Guard[TContext, TEvent]] = ^.asInstanceOf[js.Dynamic].applyDynamic("toGuard")().asInstanceOf[js.UndefOr[Guard[TContext, TEvent]]]
  inline def toGuard[TContext, TEvent /* <: EventObject */](condition: Unit, guardMap: Record[String, ConditionPredicate[TContext, TEvent]]): js.UndefOr[Guard[TContext, TEvent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("toGuard")(condition.asInstanceOf[js.Any], guardMap.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Guard[TContext, TEvent]]]
  inline def toGuard[TContext, TEvent /* <: EventObject */](condition: Condition[TContext, TEvent]): js.UndefOr[Guard[TContext, TEvent]] = ^.asInstanceOf[js.Dynamic].applyDynamic("toGuard")(condition.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Guard[TContext, TEvent]]]
  inline def toGuard[TContext, TEvent /* <: EventObject */](
    condition: Condition[TContext, TEvent],
    guardMap: Record[String, ConditionPredicate[TContext, TEvent]]
  ): js.UndefOr[Guard[TContext, TEvent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("toGuard")(condition.asInstanceOf[js.Any], guardMap.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Guard[TContext, TEvent]]]
  
  inline def toInvokeSource(src: String): InvokeSourceDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("toInvokeSource")(src.asInstanceOf[js.Any]).asInstanceOf[InvokeSourceDefinition]
  inline def toInvokeSource(src: InvokeSourceDefinition): InvokeSourceDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("toInvokeSource")(src.asInstanceOf[js.Any]).asInstanceOf[InvokeSourceDefinition]
  
  inline def toSCXMLEvent[TEvent /* <: EventObject */](event: typings.xstate.typesMod.Event[TEvent]): Event[TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("toSCXMLEvent")(event.asInstanceOf[js.Any]).asInstanceOf[Event[TEvent]]
  inline def toSCXMLEvent[TEvent /* <: EventObject */](event: typings.xstate.typesMod.Event[TEvent], scxmlEvent: Partial[Event[TEvent]]): Event[TEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("toSCXMLEvent")(event.asInstanceOf[js.Any], scxmlEvent.asInstanceOf[js.Any])).asInstanceOf[Event[TEvent]]
  inline def toSCXMLEvent[TEvent /* <: EventObject */](event: Event[TEvent]): Event[TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("toSCXMLEvent")(event.asInstanceOf[js.Any]).asInstanceOf[Event[TEvent]]
  inline def toSCXMLEvent[TEvent /* <: EventObject */](event: Event[TEvent], scxmlEvent: Partial[Event[TEvent]]): Event[TEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("toSCXMLEvent")(event.asInstanceOf[js.Any], scxmlEvent.asInstanceOf[js.Any])).asInstanceOf[Event[TEvent]]
  
  inline def toStatePath(stateId: String, delimiter: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("toStatePath")(stateId.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def toStatePath(stateId: js.Array[String], delimiter: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("toStatePath")(stateId.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def toStatePaths(): js.Array[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("toStatePaths")().asInstanceOf[js.Array[js.Array[String]]]
  inline def toStatePaths(stateValue: StateValue): js.Array[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("toStatePaths")(stateValue.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[String]]]
  
  inline def toStateValue(stateValue: js.Array[String], delimiter: String): StateValue = (^.asInstanceOf[js.Dynamic].applyDynamic("toStateValue")(stateValue.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any])).asInstanceOf[StateValue]
  inline def toStateValue(stateValue: StateLike[js.Any], delimiter: String): StateValue = (^.asInstanceOf[js.Dynamic].applyDynamic("toStateValue")(stateValue.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any])).asInstanceOf[StateValue]
  inline def toStateValue(stateValue: StateValue, delimiter: String): StateValue = (^.asInstanceOf[js.Dynamic].applyDynamic("toStateValue")(stateValue.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any])).asInstanceOf[StateValue]
  
  inline def toTransitionConfigArray[TContext, TEvent /* <: EventObject */](
    event: NullEvent,
    configLike: SingleOrArray[
      (TransitionConfig[TContext, TEvent]) | (TransitionConfigTarget[TContext, TEvent])
    ]
  ): js.Array[(TransitionConfig[TContext, TEvent]) & `4`[TEvent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("toTransitionConfigArray")(event.asInstanceOf[js.Any], configLike.asInstanceOf[js.Any])).asInstanceOf[js.Array[(TransitionConfig[TContext, TEvent]) & `4`[TEvent]]]
  inline def toTransitionConfigArray[TContext, TEvent /* <: EventObject */](
    event: Asterisk,
    configLike: SingleOrArray[
      (TransitionConfig[TContext, TEvent]) | (TransitionConfigTarget[TContext, TEvent])
    ]
  ): js.Array[(TransitionConfig[TContext, TEvent]) & `4`[TEvent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("toTransitionConfigArray")(event.asInstanceOf[js.Any], configLike.asInstanceOf[js.Any])).asInstanceOf[js.Array[(TransitionConfig[TContext, TEvent]) & `4`[TEvent]]]
  
  inline def toTransitionConfigArray_type[TContext, TEvent /* <: EventObject */](
    event: /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any,
    configLike: SingleOrArray[
      (TransitionConfig[TContext, TEvent]) | (TransitionConfigTarget[TContext, TEvent])
    ]
  ): js.Array[(TransitionConfig[TContext, TEvent]) & `4`[TEvent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("toTransitionConfigArray")(event.asInstanceOf[js.Any], configLike.asInstanceOf[js.Any])).asInstanceOf[js.Array[(TransitionConfig[TContext, TEvent]) & `4`[TEvent]]]
  
  inline def uniqueId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("uniqueId")().asInstanceOf[String]
  
  inline def updateContext[TContext, TEvent /* <: EventObject */](context: TContext, _event: Event[TEvent], assignActions: js.Array[AssignAction[TContext, TEvent]]): TContext = (^.asInstanceOf[js.Dynamic].applyDynamic("updateContext")(context.asInstanceOf[js.Any], _event.asInstanceOf[js.Any], assignActions.asInstanceOf[js.Any])).asInstanceOf[TContext]
  inline def updateContext[TContext, TEvent /* <: EventObject */](
    context: TContext,
    _event: Event[TEvent],
    assignActions: js.Array[AssignAction[TContext, TEvent]],
    state: State[TContext, TEvent, js.Any, ContextTContext[TContext]]
  ): TContext = (^.asInstanceOf[js.Dynamic].applyDynamic("updateContext")(context.asInstanceOf[js.Any], _event.asInstanceOf[js.Any], assignActions.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[TContext]
  
  inline def updateHistoryStates(hist: HistoryValue, stateValue: StateValue): Record[String, js.UndefOr[HistoryValue]] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateHistoryStates")(hist.asInstanceOf[js.Any], stateValue.asInstanceOf[js.Any])).asInstanceOf[Record[String, js.UndefOr[HistoryValue]]]
  
  inline def updateHistoryValue(hist: HistoryValue, stateValue: StateValue): HistoryValue = (^.asInstanceOf[js.Dynamic].applyDynamic("updateHistoryValue")(hist.asInstanceOf[js.Any], stateValue.asInstanceOf[js.Any])).asInstanceOf[HistoryValue]
  
  @JSImport("xstate/lib/utils", "warn")
  @js.native
  def warn: js.Function2[/* condition */ Boolean | Error, /* message */ String, Unit] = js.native
  inline def warn_=(x: js.Function2[/* condition */ Boolean | Error, /* message */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("warn")(x.asInstanceOf[js.Any])
}

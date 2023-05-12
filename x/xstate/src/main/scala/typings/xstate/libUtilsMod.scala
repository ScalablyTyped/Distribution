package typings.xstate

import org.scalablytyped.runtime.StringDictionary
import typings.std.Partial
import typings.std.Record
import typings.xstate.anon.Context
import typings.xstate.anon.`5`
import typings.xstate.libStateMod.State
import typings.xstate.libStateNodeMod.StateNode
import typings.xstate.libTypegenTypesMod.TypegenDisabled
import typings.xstate.libTypesMod.Action
import typings.xstate.libTypesMod.ActionObject
import typings.xstate.libTypesMod.ActionType
import typings.xstate.libTypesMod.ActionTypes.NullEvent
import typings.xstate.libTypesMod.AssignAction
import typings.xstate.libTypesMod.BaseActionObject
import typings.xstate.libTypesMod.Condition
import typings.xstate.libTypesMod.ConditionPredicate
import typings.xstate.libTypesMod.EventData
import typings.xstate.libTypesMod.EventObject
import typings.xstate.libTypesMod.EventType
import typings.xstate.libTypesMod.Guard
import typings.xstate.libTypesMod.HistoryValue
import typings.xstate.libTypesMod.InvokeSourceDefinition
import typings.xstate.libTypesMod.Mapper
import typings.xstate.libTypesMod.Observer
import typings.xstate.libTypesMod.PropertyMapper
import typings.xstate.libTypesMod.SCXML.Event
import typings.xstate.libTypesMod.ServiceMap
import typings.xstate.libTypesMod.SingleOrArray
import typings.xstate.libTypesMod.StateLike
import typings.xstate.libTypesMod.StateValue
import typings.xstate.libTypesMod.TransitionConfig
import typings.xstate.libTypesMod.TransitionConfigTarget
import typings.xstate.xstateStrings.Asterisk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsMod {
  
  @JSImport("xstate/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createInvokeId(stateNodeId: String, index: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createInvokeId")(stateNodeId.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def evaluateGuard[TContext, TEvent /* <: EventObject */](
    machine: StateNode[TContext, Any, TEvent, Any, Any, TypegenDisabled],
    guard: Guard[TContext, TEvent],
    context: TContext,
    _event: Event[TEvent],
    state: State[TContext, TEvent, Any, Context[TContext], TypegenDisabled]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("evaluateGuard")(machine.asInstanceOf[js.Any], guard.asInstanceOf[js.Any], context.asInstanceOf[js.Any], _event.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def flatten[T](array: js.Array[T | js.Array[T]]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def getActionType(action: Action[Any, Any, Any]): ActionType = ^.asInstanceOf[js.Dynamic].applyDynamic("getActionType")(action.asInstanceOf[js.Any]).asInstanceOf[ActionType]
  
  inline def getEventType[TEvent /* <: EventObject */](event: typings.xstate.libTypesMod.Event[TEvent]): /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getEventType")(event.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any]
  
  inline def isActor(value: Any): /* is xstate.xstate/lib/Actor.Actor<any, xstate.xstate/lib/types.AnyEventObject> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isActor")(value.asInstanceOf[js.Any]).asInstanceOf[/* is xstate.xstate/lib/Actor.Actor<any, xstate.xstate/lib/types.AnyEventObject> */ Boolean]
  
  inline def isArray(value: Any): /* is std.Array<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<any> */ Boolean]
  
  inline def isBehavior(value: Any): /* is xstate.xstate/lib/types.Behavior<any, any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBehavior")(value.asInstanceOf[js.Any]).asInstanceOf[/* is xstate.xstate/lib/types.Behavior<any, any> */ Boolean]
  
  inline def isBuiltInEvent(eventType: EventType): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBuiltInEvent")(eventType.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isFunction(value: Any): /* is std.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Function */ Boolean]
  
  inline def isMachine(value: Any): /* is xstate.xstate/lib/types.AnyStateMachine */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMachine")(value.asInstanceOf[js.Any]).asInstanceOf[/* is xstate.xstate/lib/types.AnyStateMachine */ Boolean]
  
  inline def isObservable[T](value: Any): /* is xstate.xstate/lib/types.Subscribable<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObservable")(value.asInstanceOf[js.Any]).asInstanceOf[/* is xstate.xstate/lib/types.Subscribable<T> */ Boolean]
  
  inline def isPromiseLike(value: Any): /* is std.PromiseLike<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPromiseLike")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.PromiseLike<any> */ Boolean]
  
  inline def isRaisableAction[TContext, TExpressionEvent /* <: EventObject */, TEvent /* <: EventObject */](action: ActionObject[TContext, TExpressionEvent, TEvent, BaseActionObject]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRaisableAction")(action.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isStateLike(state: Any): /* is xstate.xstate/lib/types.StateLike<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStateLike")(state.asInstanceOf[js.Any]).asInstanceOf[/* is xstate.xstate/lib/types.StateLike<any> */ Boolean]
  
  inline def isString(value: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(value.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  inline def keys[T /* <: js.Object */](value: T): js.Array[/* keyof T */ String] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[/* keyof T */ String]]
  
  inline def mapContext[TContext, TEvent /* <: EventObject */](mapper: Mapper[TContext, TEvent, Any], context: TContext, _event: Event[TEvent]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mapContext")(mapper.asInstanceOf[js.Any], context.asInstanceOf[js.Any], _event.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def mapContext[TContext, TEvent /* <: EventObject */](mapper: PropertyMapper[TContext, TEvent, Any], context: TContext, _event: Event[TEvent]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mapContext")(mapper.asInstanceOf[js.Any], context.asInstanceOf[js.Any], _event.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def mapFilterValues[T, P](
    collection: StringDictionary[T],
    iteratee: js.Function3[/* item */ T, /* key */ String, /* collection */ StringDictionary[T], P],
    predicate: js.Function1[/* item */ T, Boolean]
  ): StringDictionary[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapFilterValues")(collection.asInstanceOf[js.Any], iteratee.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[P]]
  
  inline def mapValues[P, O /* <: Record[String, Any] */](
    collection: O,
    iteratee: js.Function4[
      /* import warning: importer.ImportType#apply Failed type conversion: O[keyof O] */ /* item */ js.Any, 
      /* keyof O */ /* key */ String, 
      /* collection */ O, 
      /* i */ Double, 
      P
    ]
  ): /* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof O ]: P} */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mapValues")(collection.asInstanceOf[js.Any], iteratee.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof O ]: P} */ js.Any]
  
  inline def matchesState(parentStateId: StateValue, childStateId: StateValue): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchesState")(parentStateId.asInstanceOf[js.Any], childStateId.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def matchesState(parentStateId: StateValue, childStateId: StateValue, delimiter: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchesState")(parentStateId.asInstanceOf[js.Any], childStateId.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def nestedPath[T /* <: Record[String, Any] */](props: js.Array[String], accessorProp: /* keyof T */ String): js.Function1[/* object */ T, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("nestedPath")(props.asInstanceOf[js.Any], accessorProp.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* object */ T, T]]
  
  inline def normalizeTarget[TContext, TEvent /* <: EventObject */](): js.UndefOr[
    js.Array[
      String | (StateNode[TContext, Any, TEvent, Context[TContext], ServiceMap, TypegenDisabled])
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeTarget")().asInstanceOf[js.UndefOr[
    js.Array[
      String | (StateNode[TContext, Any, TEvent, Context[TContext], ServiceMap, TypegenDisabled])
    ]
  ]]
  inline def normalizeTarget[TContext, TEvent /* <: EventObject */](
    target: SingleOrArray[
      String | (StateNode[TContext, Any, TEvent, Context[TContext], ServiceMap, TypegenDisabled])
    ]
  ): js.UndefOr[
    js.Array[
      String | (StateNode[TContext, Any, TEvent, Context[TContext], ServiceMap, TypegenDisabled])
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeTarget")(target.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[
    js.Array[
      String | (StateNode[TContext, Any, TEvent, Context[TContext], ServiceMap, TypegenDisabled])
    ]
  ]]
  
  inline def partition[T, A /* <: T */, B /* <: T */](items: js.Array[T], predicate: js.Function1[/* item */ T, /* is A */ Boolean]): js.Tuple2[js.Array[A], js.Array[B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("partition")(items.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Array[A], js.Array[B]]]
  
  inline def path[T /* <: Record[String, Any] */](props: js.Array[String]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("path")(props.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def pathToStateValue(statePath: js.Array[String]): StateValue = ^.asInstanceOf[js.Dynamic].applyDynamic("pathToStateValue")(statePath.asInstanceOf[js.Any]).asInstanceOf[StateValue]
  
  inline def pathsToStateValue(paths: js.Array[js.Array[String]]): StateValue = ^.asInstanceOf[js.Dynamic].applyDynamic("pathsToStateValue")(paths.asInstanceOf[js.Any]).asInstanceOf[StateValue]
  
  inline def reportUnhandledExceptionOnInvocation(originalError: Any, currentError: Any, id: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reportUnhandledExceptionOnInvocation")(originalError.asInstanceOf[js.Any], currentError.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("xstate/lib/utils", "symbolObservable")
  @js.native
  val symbolObservable: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Symbol.observable */ Any = js.native
  
  inline def toArray[T](): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")().asInstanceOf[js.Array[T]]
  inline def toArray[T](value: T): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def toArray[T](value: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def toArrayStrict[T](value: T): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArrayStrict")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def toArrayStrict[T](value: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArrayStrict")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def toEventObject[TEvent /* <: EventObject */](event: typings.xstate.libTypesMod.Event[TEvent]): TEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("toEventObject")(event.asInstanceOf[js.Any]).asInstanceOf[TEvent]
  inline def toEventObject[TEvent /* <: EventObject */](event: typings.xstate.libTypesMod.Event[TEvent], payload: EventData): TEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("toEventObject")(event.asInstanceOf[js.Any], payload.asInstanceOf[js.Any])).asInstanceOf[TEvent]
  
  inline def toGuard[TContext, TEvent /* <: EventObject */](): js.UndefOr[Guard[TContext, TEvent]] = ^.asInstanceOf[js.Dynamic].applyDynamic("toGuard")().asInstanceOf[js.UndefOr[Guard[TContext, TEvent]]]
  inline def toGuard[TContext, TEvent /* <: EventObject */](condition: Unit, guardMap: Record[String, ConditionPredicate[TContext, TEvent]]): js.UndefOr[Guard[TContext, TEvent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("toGuard")(condition.asInstanceOf[js.Any], guardMap.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Guard[TContext, TEvent]]]
  inline def toGuard[TContext, TEvent /* <: EventObject */](condition: Condition[TContext, TEvent]): js.UndefOr[Guard[TContext, TEvent]] = ^.asInstanceOf[js.Dynamic].applyDynamic("toGuard")(condition.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Guard[TContext, TEvent]]]
  inline def toGuard[TContext, TEvent /* <: EventObject */](
    condition: Condition[TContext, TEvent],
    guardMap: Record[String, ConditionPredicate[TContext, TEvent]]
  ): js.UndefOr[Guard[TContext, TEvent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("toGuard")(condition.asInstanceOf[js.Any], guardMap.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Guard[TContext, TEvent]]]
  
  inline def toInvokeSource(src: String): InvokeSourceDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("toInvokeSource")(src.asInstanceOf[js.Any]).asInstanceOf[InvokeSourceDefinition]
  inline def toInvokeSource(src: InvokeSourceDefinition): InvokeSourceDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("toInvokeSource")(src.asInstanceOf[js.Any]).asInstanceOf[InvokeSourceDefinition]
  
  inline def toObserver[T](): Observer[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObserver")().asInstanceOf[Observer[T]]
  inline def toObserver[T](nextHandler: js.Function1[/* value */ T, Unit]): Observer[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObserver")(nextHandler.asInstanceOf[js.Any]).asInstanceOf[Observer[T]]
  inline def toObserver[T](nextHandler: js.Function1[/* value */ T, Unit], errorHandler: js.Function1[/* error */ Any, Unit]): Observer[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObserver")(nextHandler.asInstanceOf[js.Any], errorHandler.asInstanceOf[js.Any])).asInstanceOf[Observer[T]]
  inline def toObserver[T](
    nextHandler: js.Function1[/* value */ T, Unit],
    errorHandler: js.Function1[/* error */ Any, Unit],
    completionHandler: js.Function0[Unit]
  ): Observer[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObserver")(nextHandler.asInstanceOf[js.Any], errorHandler.asInstanceOf[js.Any], completionHandler.asInstanceOf[js.Any])).asInstanceOf[Observer[T]]
  inline def toObserver[T](
    nextHandler: js.Function1[/* value */ T, Unit],
    errorHandler: Unit,
    completionHandler: js.Function0[Unit]
  ): Observer[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObserver")(nextHandler.asInstanceOf[js.Any], errorHandler.asInstanceOf[js.Any], completionHandler.asInstanceOf[js.Any])).asInstanceOf[Observer[T]]
  inline def toObserver[T](nextHandler: Unit, errorHandler: js.Function1[/* error */ Any, Unit]): Observer[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObserver")(nextHandler.asInstanceOf[js.Any], errorHandler.asInstanceOf[js.Any])).asInstanceOf[Observer[T]]
  inline def toObserver[T](
    nextHandler: Unit,
    errorHandler: js.Function1[/* error */ Any, Unit],
    completionHandler: js.Function0[Unit]
  ): Observer[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObserver")(nextHandler.asInstanceOf[js.Any], errorHandler.asInstanceOf[js.Any], completionHandler.asInstanceOf[js.Any])).asInstanceOf[Observer[T]]
  inline def toObserver[T](nextHandler: Unit, errorHandler: Unit, completionHandler: js.Function0[Unit]): Observer[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObserver")(nextHandler.asInstanceOf[js.Any], errorHandler.asInstanceOf[js.Any], completionHandler.asInstanceOf[js.Any])).asInstanceOf[Observer[T]]
  inline def toObserver[T](nextHandler: Partial[Observer[T]]): Observer[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObserver")(nextHandler.asInstanceOf[js.Any]).asInstanceOf[Observer[T]]
  inline def toObserver[T](nextHandler: Partial[Observer[T]], errorHandler: js.Function1[/* error */ Any, Unit]): Observer[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObserver")(nextHandler.asInstanceOf[js.Any], errorHandler.asInstanceOf[js.Any])).asInstanceOf[Observer[T]]
  inline def toObserver[T](
    nextHandler: Partial[Observer[T]],
    errorHandler: js.Function1[/* error */ Any, Unit],
    completionHandler: js.Function0[Unit]
  ): Observer[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObserver")(nextHandler.asInstanceOf[js.Any], errorHandler.asInstanceOf[js.Any], completionHandler.asInstanceOf[js.Any])).asInstanceOf[Observer[T]]
  inline def toObserver[T](nextHandler: Partial[Observer[T]], errorHandler: Unit, completionHandler: js.Function0[Unit]): Observer[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObserver")(nextHandler.asInstanceOf[js.Any], errorHandler.asInstanceOf[js.Any], completionHandler.asInstanceOf[js.Any])).asInstanceOf[Observer[T]]
  
  inline def toSCXMLEvent[TEvent /* <: EventObject */](event: typings.xstate.libTypesMod.Event[TEvent]): Event[TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("toSCXMLEvent")(event.asInstanceOf[js.Any]).asInstanceOf[Event[TEvent]]
  inline def toSCXMLEvent[TEvent /* <: EventObject */](event: typings.xstate.libTypesMod.Event[TEvent], scxmlEvent: Partial[Event[TEvent]]): Event[TEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("toSCXMLEvent")(event.asInstanceOf[js.Any], scxmlEvent.asInstanceOf[js.Any])).asInstanceOf[Event[TEvent]]
  inline def toSCXMLEvent[TEvent /* <: EventObject */](event: Event[TEvent]): Event[TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("toSCXMLEvent")(event.asInstanceOf[js.Any]).asInstanceOf[Event[TEvent]]
  inline def toSCXMLEvent[TEvent /* <: EventObject */](event: Event[TEvent], scxmlEvent: Partial[Event[TEvent]]): Event[TEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("toSCXMLEvent")(event.asInstanceOf[js.Any], scxmlEvent.asInstanceOf[js.Any])).asInstanceOf[Event[TEvent]]
  
  inline def toStatePath(stateId: String, delimiter: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("toStatePath")(stateId.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def toStatePath(stateId: js.Array[String], delimiter: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("toStatePath")(stateId.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def toStatePaths(): js.Array[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("toStatePaths")().asInstanceOf[js.Array[js.Array[String]]]
  inline def toStatePaths(stateValue: StateValue): js.Array[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("toStatePaths")(stateValue.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[String]]]
  
  inline def toStateValue(stateValue: js.Array[String], delimiter: String): StateValue = (^.asInstanceOf[js.Dynamic].applyDynamic("toStateValue")(stateValue.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any])).asInstanceOf[StateValue]
  inline def toStateValue(stateValue: StateLike[Any], delimiter: String): StateValue = (^.asInstanceOf[js.Dynamic].applyDynamic("toStateValue")(stateValue.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any])).asInstanceOf[StateValue]
  inline def toStateValue(stateValue: StateValue, delimiter: String): StateValue = (^.asInstanceOf[js.Dynamic].applyDynamic("toStateValue")(stateValue.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any])).asInstanceOf[StateValue]
  
  inline def toTransitionConfigArray[TContext, TEvent /* <: EventObject */](
    event: NullEvent,
    configLike: SingleOrArray[
      (TransitionConfig[TContext, TEvent, TEvent]) | (TransitionConfigTarget[TContext, TEvent])
    ]
  ): js.Array[(TransitionConfig[TContext, TEvent, TEvent]) & `5`[TEvent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("toTransitionConfigArray")(event.asInstanceOf[js.Any], configLike.asInstanceOf[js.Any])).asInstanceOf[js.Array[(TransitionConfig[TContext, TEvent, TEvent]) & `5`[TEvent]]]
  inline def toTransitionConfigArray[TContext, TEvent /* <: EventObject */](
    event: Asterisk,
    configLike: SingleOrArray[
      (TransitionConfig[TContext, TEvent, TEvent]) | (TransitionConfigTarget[TContext, TEvent])
    ]
  ): js.Array[(TransitionConfig[TContext, TEvent, TEvent]) & `5`[TEvent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("toTransitionConfigArray")(event.asInstanceOf[js.Any], configLike.asInstanceOf[js.Any])).asInstanceOf[js.Array[(TransitionConfig[TContext, TEvent, TEvent]) & `5`[TEvent]]]
  
  inline def toTransitionConfigArray_type[TContext, TEvent /* <: EventObject */](
    event: /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any,
    configLike: SingleOrArray[
      (TransitionConfig[TContext, TEvent, TEvent]) | (TransitionConfigTarget[TContext, TEvent])
    ]
  ): js.Array[(TransitionConfig[TContext, TEvent, TEvent]) & `5`[TEvent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("toTransitionConfigArray")(event.asInstanceOf[js.Any], configLike.asInstanceOf[js.Any])).asInstanceOf[js.Array[(TransitionConfig[TContext, TEvent, TEvent]) & `5`[TEvent]]]
  
  inline def uniqueId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("uniqueId")().asInstanceOf[String]
  
  inline def updateContext[TContext, TEvent /* <: EventObject */](
    context: TContext,
    _event: Event[TEvent],
    assignActions: js.Array[AssignAction[TContext, TEvent, TEvent]]
  ): TContext = (^.asInstanceOf[js.Dynamic].applyDynamic("updateContext")(context.asInstanceOf[js.Any], _event.asInstanceOf[js.Any], assignActions.asInstanceOf[js.Any])).asInstanceOf[TContext]
  inline def updateContext[TContext, TEvent /* <: EventObject */](
    context: TContext,
    _event: Event[TEvent],
    assignActions: js.Array[AssignAction[TContext, TEvent, TEvent]],
    state: State[TContext, TEvent, Any, Context[TContext], TypegenDisabled]
  ): TContext = (^.asInstanceOf[js.Dynamic].applyDynamic("updateContext")(context.asInstanceOf[js.Any], _event.asInstanceOf[js.Any], assignActions.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[TContext]
  
  inline def updateHistoryStates(hist: HistoryValue, stateValue: StateValue): Record[String, js.UndefOr[HistoryValue]] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateHistoryStates")(hist.asInstanceOf[js.Any], stateValue.asInstanceOf[js.Any])).asInstanceOf[Record[String, js.UndefOr[HistoryValue]]]
  
  inline def updateHistoryValue(hist: HistoryValue, stateValue: StateValue): HistoryValue = (^.asInstanceOf[js.Dynamic].applyDynamic("updateHistoryValue")(hist.asInstanceOf[js.Any], stateValue.asInstanceOf[js.Any])).asInstanceOf[HistoryValue]
  
  @JSImport("xstate/lib/utils", "warn")
  @js.native
  def warn: js.Function2[/* condition */ Boolean | js.Error, /* message */ String, Unit] = js.native
  inline def warn_=(x: js.Function2[/* condition */ Boolean | js.Error, /* message */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("warn")(x.asInstanceOf[js.Any])
}

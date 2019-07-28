package typings.xstate

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import typings.std.Record
import typings.xstate.esTypesMod.Action
import typings.xstate.esTypesMod.ActionObject
import typings.xstate.esTypesMod.ActionType
import typings.xstate.esTypesMod.AssignAction
import typings.xstate.esTypesMod.Condition
import typings.xstate.esTypesMod.ConditionPredicate
import typings.xstate.esTypesMod.Event
import typings.xstate.esTypesMod.EventObject
import typings.xstate.esTypesMod.EventType
import typings.xstate.esTypesMod.Guard
import typings.xstate.esTypesMod.HistoryValue
import typings.xstate.esTypesMod.Mapper
import typings.xstate.esTypesMod.OmniEventObject
import typings.xstate.esTypesMod.PropertyMapper
import typings.xstate.esTypesMod.StateInterface
import typings.xstate.esTypesMod.StateValue
import typings.xstate.esTypesMod.Subscribable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/es/utils", JSImport.Namespace)
@js.native
object esUtilsMod extends js.Object {
  var warn: js.Function2[/* condition */ Boolean | Error, /* message */ String, Unit] = js.native
  def bindActionToState[TC, TE /* <: EventObject */](action: ActionObject[TC, TE], state: StateInterface[TC, TE]): ActionObject[TC, TE] = js.native
  def flatten[T](array: js.Array[T | js.Array[T]]): js.Array[T] = js.native
  def getActionType(action: Action[_, _]): ActionType = js.native
  def getEventType[TEvent /* <: EventObject */](event: Event[TEvent]): /* import warning: ImportType.apply Failed type conversion: TEvent['type'] */ js.Any = js.native
  def isArray(value: js.Any): /* is std.Array<any> */ Boolean = js.native
  def isBuiltInEvent(eventType: EventType): Boolean = js.native
  def isFunction(value: js.Any): /* is std.Function */ Boolean = js.native
  def isMachine(value: js.Any): /* is xstate.xstate/es/types.StateMachine<any, any, any> */ Boolean = js.native
  def isObservable[T](value: js.Any): /* is xstate.xstate/es/types.Subscribable<T> */ Boolean = js.native
  def isObservable[T](value: Subscribable[T]): /* is xstate.xstate/es/types.Subscribable<T> */ Boolean = js.native
  def isPromiseLike(value: js.Any): /* is std.PromiseLike<any> */ Boolean = js.native
  def isString(value: js.Any): /* is string */ Boolean = js.native
  def keys[T /* <: js.Object */](value: T): js.Array[String] = js.native
  def mapContext[TContext, TEvent /* <: EventObject */](mapper: Mapper[TContext, TEvent], context: TContext, event: TEvent): js.Any = js.native
  def mapContext[TContext, TEvent /* <: EventObject */](mapper: PropertyMapper[TContext, TEvent], context: TContext, event: TEvent): js.Any = js.native
  def mapFilterValues[T, P](
    collection: StringDictionary[T],
    iteratee: js.Function3[/* item */ T, /* key */ String, /* collection */ StringDictionary[T], P],
    predicate: js.Function1[/* item */ T, Boolean]
  ): StringDictionary[P] = js.native
  def mapValues[T, P](
    collection: StringDictionary[T],
    iteratee: js.Function4[/* item */ T, /* key */ String, /* collection */ StringDictionary[T], /* i */ Double, P]
  ): StringDictionary[P] = js.native
  def matchesState(parentStateId: StateValue, childStateId: StateValue): Boolean = js.native
  def matchesState(parentStateId: StateValue, childStateId: StateValue, delimiter: String): Boolean = js.native
  def nestedPath[T /* <: Record[String, _] */](props: js.Array[String], accessorProp: String): js.Function1[/* object */ T, T] = js.native
  def partition[T, A /* <: T */, B /* <: T */](items: js.Array[T], predicate: js.Function1[/* item */ T, /* is A */ Boolean]): js.Tuple2[js.Array[A], js.Array[B]] = js.native
  def path[T /* <: Record[String, _] */](props: js.Array[String]): js.Any = js.native
  def pathToStateValue(statePath: js.Array[String]): StateValue = js.native
  def pathsToStateValue(paths: js.Array[js.Array[String]]): StateValue = js.native
  def toArray[T](): js.Array[T] = js.native
  def toArray[T](value: T): js.Array[T] = js.native
  def toArray[T](value: js.Array[T]): js.Array[T] = js.native
  def toGuard[TContext, TEvent /* <: EventObject */](): js.UndefOr[Guard[TContext, TEvent]] = js.native
  def toGuard[TContext, TEvent /* <: EventObject */](condition: Condition[TContext, TEvent]): js.UndefOr[Guard[TContext, TEvent]] = js.native
  def toGuard[TContext, TEvent /* <: EventObject */](
    condition: Condition[TContext, TEvent],
    guardMap: Record[String, ConditionPredicate[TContext, TEvent]]
  ): js.UndefOr[Guard[TContext, TEvent]] = js.native
  def toStatePath(stateId: String, delimiter: String): js.Array[String] = js.native
  def toStatePath(stateId: js.Array[String], delimiter: String): js.Array[String] = js.native
  def toStatePaths(): js.Array[js.Array[String]] = js.native
  def toStatePaths(stateValue: StateValue): js.Array[js.Array[String]] = js.native
  def toStateValue(stateValue: js.Array[String], delimiter: String): StateValue = js.native
  def toStateValue(stateValue: StateInterface[_, EventObject], delimiter: String): StateValue = js.native
  def toStateValue(stateValue: StateValue, delimiter: String): StateValue = js.native
  def uniqueId(): String = js.native
  def updateContext[TContext, TEvent /* <: EventObject */](
    context: TContext,
    event: OmniEventObject[TEvent],
    assignActions: js.Array[AssignAction[TContext, TEvent]]
  ): TContext = js.native
  def updateHistoryStates(hist: HistoryValue, stateValue: StateValue): Record[String, js.UndefOr[HistoryValue]] = js.native
  def updateHistoryValue(hist: HistoryValue, stateValue: StateValue): HistoryValue = js.native
}


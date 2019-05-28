package typings
package xstateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/es/utils", JSImport.Namespace)
@js.native
object esUtilsMod extends js.Object {
  var warn: js.Function2[
    /* condition */ scala.Boolean | stdLib.Error, 
    /* message */ java.lang.String, 
    scala.Unit
  ] = js.native
  def bindActionToState[TC, TE /* <: xstateLib.esTypesMod.EventObject */](
    action: xstateLib.esTypesMod.ActionObject[TC, TE],
    state: xstateLib.esTypesMod.StateInterface[TC, TE]
  ): xstateLib.esTypesMod.ActionObject[TC, TE] = js.native
  def flatten[T](array: js.Array[T | js.Array[T]]): js.Array[T] = js.native
  def getActionType(action: xstateLib.esTypesMod.Action[_, _]): xstateLib.esTypesMod.ActionType = js.native
  def getEventType[TEvent /* <: xstateLib.esTypesMod.EventObject */](event: xstateLib.esTypesMod.Event[TEvent]): /* import warning: ImportType.apply Failed type conversion: TEvent['type'] */ js.Any = js.native
  def isArray(value: js.Any): /* is std.Array<any> */ scala.Boolean = js.native
  def isBuiltInEvent(eventType: xstateLib.esTypesMod.EventType): scala.Boolean = js.native
  def isFunction(value: js.Any): /* is std.Function */ scala.Boolean = js.native
  def isMachine(value: js.Any): /* is xstate.xstate/es/types.StateMachine<any, any, any> */ scala.Boolean = js.native
  def isMachine(value: xstateLib.esTypesMod.StateMachine[_, _, _]): /* is xstate.xstate/es/types.StateMachine<any, any, any> */ scala.Boolean = js.native
  def isObservable[T](value: js.Any): /* is xstate.xstate/es/types.Subscribable<T> */ scala.Boolean = js.native
  def isObservable[T](value: xstateLib.esTypesMod.Subscribable[T]): /* is xstate.xstate/es/types.Subscribable<T> */ scala.Boolean = js.native
  def isPromiseLike(value: js.Any): /* is std.PromiseLike<any> */ scala.Boolean = js.native
  def isString(value: js.Any): /* is string */ scala.Boolean = js.native
  def keys[T /* <: js.Object */](value: T): js.Array[java.lang.String] = js.native
  def mapContext[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](mapper: xstateLib.esTypesMod.Mapper[TContext, TEvent], context: TContext, event: TEvent): js.Any = js.native
  def mapContext[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](mapper: xstateLib.esTypesMod.PropertyMapper[TContext, TEvent], context: TContext, event: TEvent): js.Any = js.native
  def mapFilterValues[T, P](
    collection: org.scalablytyped.runtime.StringDictionary[T],
    iteratee: js.Function3[
      /* item */ T, 
      /* key */ java.lang.String, 
      /* collection */ org.scalablytyped.runtime.StringDictionary[T], 
      P
    ],
    predicate: js.Function1[/* item */ T, scala.Boolean]
  ): org.scalablytyped.runtime.StringDictionary[P] = js.native
  def mapValues[T, P](
    collection: org.scalablytyped.runtime.StringDictionary[T],
    iteratee: js.Function4[
      /* item */ T, 
      /* key */ java.lang.String, 
      /* collection */ org.scalablytyped.runtime.StringDictionary[T], 
      /* i */ scala.Double, 
      P
    ]
  ): org.scalablytyped.runtime.StringDictionary[P] = js.native
  def matchesState(parentStateId: xstateLib.esTypesMod.StateValue, childStateId: xstateLib.esTypesMod.StateValue): scala.Boolean = js.native
  def matchesState(
    parentStateId: xstateLib.esTypesMod.StateValue,
    childStateId: xstateLib.esTypesMod.StateValue,
    delimiter: java.lang.String
  ): scala.Boolean = js.native
  def nestedPath[T /* <: stdLib.Record[java.lang.String, _] */](props: js.Array[java.lang.String], accessorProp: java.lang.String): js.Function1[/* object */ T, T] = js.native
  def partition[T, A /* <: T */, B /* <: T */](items: js.Array[T], predicate: js.Function1[/* item */ T, /* is A */ scala.Boolean]): js.Tuple2[js.Array[A], js.Array[B]] = js.native
  def path[T /* <: stdLib.Record[java.lang.String, _] */](props: js.Array[java.lang.String]): js.Any = js.native
  def pathToStateValue(statePath: js.Array[java.lang.String]): xstateLib.esTypesMod.StateValue = js.native
  def pathsToStateValue(paths: js.Array[js.Array[java.lang.String]]): xstateLib.esTypesMod.StateValue = js.native
  def toArray[T](): js.Array[T] = js.native
  def toArray[T](value: T): js.Array[T] = js.native
  def toArray[T](value: js.Array[T]): js.Array[T] = js.native
  def toGuard[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](): js.UndefOr[xstateLib.esTypesMod.Guard[TContext, TEvent]] = js.native
  def toGuard[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](condition: xstateLib.esTypesMod.Condition[TContext, TEvent]): js.UndefOr[xstateLib.esTypesMod.Guard[TContext, TEvent]] = js.native
  def toGuard[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](
    condition: xstateLib.esTypesMod.Condition[TContext, TEvent],
    guardMap: stdLib.Record[java.lang.String, xstateLib.esTypesMod.ConditionPredicate[TContext, TEvent]]
  ): js.UndefOr[xstateLib.esTypesMod.Guard[TContext, TEvent]] = js.native
  def toStatePath(stateId: java.lang.String, delimiter: java.lang.String): js.Array[java.lang.String] = js.native
  def toStatePath(stateId: js.Array[java.lang.String], delimiter: java.lang.String): js.Array[java.lang.String] = js.native
  def toStatePaths(): js.Array[js.Array[java.lang.String]] = js.native
  def toStatePaths(stateValue: xstateLib.esTypesMod.StateValue): js.Array[js.Array[java.lang.String]] = js.native
  def toStateValue(stateValue: js.Array[java.lang.String], delimiter: java.lang.String): xstateLib.esTypesMod.StateValue = js.native
  def toStateValue(
    stateValue: xstateLib.esTypesMod.StateInterface[_, xstateLib.esTypesMod.EventObject],
    delimiter: java.lang.String
  ): xstateLib.esTypesMod.StateValue = js.native
  def toStateValue(stateValue: xstateLib.esTypesMod.StateValue, delimiter: java.lang.String): xstateLib.esTypesMod.StateValue = js.native
  def uniqueId(): java.lang.String = js.native
  def updateContext[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](
    context: TContext,
    event: xstateLib.esTypesMod.OmniEventObject[TEvent],
    assignActions: js.Array[xstateLib.esTypesMod.AssignAction[TContext, TEvent]]
  ): TContext = js.native
  def updateHistoryStates(hist: xstateLib.esTypesMod.HistoryValue, stateValue: xstateLib.esTypesMod.StateValue): stdLib.Record[java.lang.String, js.UndefOr[xstateLib.esTypesMod.HistoryValue]] = js.native
  def updateHistoryValue(hist: xstateLib.esTypesMod.HistoryValue, stateValue: xstateLib.esTypesMod.StateValue): xstateLib.esTypesMod.HistoryValue = js.native
}


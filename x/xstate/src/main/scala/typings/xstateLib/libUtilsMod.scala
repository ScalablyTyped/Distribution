package typings
package xstateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/lib/utils", JSImport.Namespace)
@js.native
object libUtilsMod extends js.Object {
  var warn: js.Function2[
    /* condition */ scala.Boolean | stdLib.Error, 
    /* message */ java.lang.String, 
    scala.Unit
  ] = js.native
  def bindActionToState[TC, TE /* <: xstateLib.libTypesMod.EventObject */](action: xstateLib.libTypesMod.ActionObject[TC, TE], state: xstateLib.libStateMod.State[TC, TE]): xstateLib.libTypesMod.ActionObject[TC, TE] = js.native
  def flatten[T](array: js.Array[js.Array[T]]): js.Array[T] = js.native
  def getActionType(action: xstateLib.libTypesMod.Action[_, _]): xstateLib.libTypesMod.ActionType = js.native
  def getEventType[TEvent /* <: xstateLib.libTypesMod.EventObject */](event: xstateLib.libTypesMod.Event[TEvent]): /* import warning: ImportType.apply Failed type conversion: TEvent['type'] */ js.Any = js.native
  def isArray(value: js.Any): /* is std.Array<any> */ scala.Boolean = js.native
  def isBuiltInEvent(eventType: xstateLib.libTypesMod.EventType): scala.Boolean = js.native
  def isFunction(value: js.Any): /* is std.Function */ scala.Boolean = js.native
  def isPromiseLike(value: js.Any): /* is std.PromiseLike<any> */ scala.Boolean = js.native
  def isString(value: js.Any): /* is string */ scala.Boolean = js.native
  def keys[T /* <: js.Object */](value: T): js.Array[java.lang.String] = js.native
  def mapContext[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](mapper: xstateLib.libTypesMod.Mapper[TContext, TEvent], context: TContext, event: TEvent): js.Any = js.native
  def mapContext[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](mapper: xstateLib.libTypesMod.PropertyMapper[TContext, TEvent], context: TContext, event: TEvent): js.Any = js.native
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
  def matchesState(parentStateId: xstateLib.libTypesMod.StateValue, childStateId: xstateLib.libTypesMod.StateValue): scala.Boolean = js.native
  def matchesState(
    parentStateId: xstateLib.libTypesMod.StateValue,
    childStateId: xstateLib.libTypesMod.StateValue,
    delimiter: java.lang.String
  ): scala.Boolean = js.native
  def nestedPath[T /* <: stdLib.Record[java.lang.String, _] */](props: js.Array[java.lang.String], accessorProp: java.lang.String): js.Function1[/* object */ T, T] = js.native
  def partition[T, A /* <: T */, B /* <: T */](items: js.Array[T], predicate: js.Function1[/* item */ T, /* is A */ scala.Boolean]): js.Tuple2[js.Array[A], js.Array[B]] = js.native
  def path[T /* <: stdLib.Record[java.lang.String, _] */](props: js.Array[java.lang.String]): js.Any = js.native
  def pathToStateValue(statePath: js.Array[java.lang.String]): xstateLib.libTypesMod.StateValue = js.native
  def pathsToStateValue(paths: js.Array[js.Array[java.lang.String]]): xstateLib.libTypesMod.StateValue = js.native
  def toArray[T](): js.Array[T] = js.native
  def toArray[T](value: T): js.Array[T] = js.native
  def toArray[T](value: js.Array[T]): js.Array[T] = js.native
  def toStatePath(stateId: java.lang.String, delimiter: java.lang.String): js.Array[java.lang.String] = js.native
  def toStatePath(stateId: js.Array[java.lang.String], delimiter: java.lang.String): js.Array[java.lang.String] = js.native
  def toStatePaths(): js.Array[js.Array[java.lang.String]] = js.native
  def toStatePaths(stateValue: java.lang.String): js.Array[js.Array[java.lang.String]] = js.native
  def toStatePaths(
    stateValue: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_xstate/lib/types.StateValueMap */ js.Any
  ): js.Array[js.Array[java.lang.String]] = js.native
  def toStateValue(stateValue: js.Array[java.lang.String], delimiter: java.lang.String): xstateLib.libTypesMod.StateValue = js.native
  def toStateValue(
    stateValue: xstateLib.libTypesMod.StateInterface[_, xstateLib.libTypesMod.EventObject],
    delimiter: java.lang.String
  ): xstateLib.libTypesMod.StateValue = js.native
  def toStateValue(stateValue: xstateLib.libTypesMod.StateValue, delimiter: java.lang.String): xstateLib.libTypesMod.StateValue = js.native
  def updateContext[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](
    context: TContext,
    event: xstateLib.libTypesMod.OmniEventObject[TEvent],
    assignActions: js.Array[xstateLib.libTypesMod.AssignAction[TContext, TEvent]]
  ): TContext = js.native
  def updateHistoryStates(hist: xstateLib.libTypesMod.HistoryValue, stateValue: xstateLib.libTypesMod.StateValue): stdLib.Record[java.lang.String, js.UndefOr[xstateLib.libTypesMod.HistoryValue]] = js.native
  def updateHistoryValue(hist: xstateLib.libTypesMod.HistoryValue, stateValue: xstateLib.libTypesMod.StateValue): xstateLib.libTypesMod.HistoryValue = js.native
}


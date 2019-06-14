package typings
package xstateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/lib/actions", JSImport.Namespace)
@js.native
object libActionsMod extends js.Object {
  def after(delayRef: java.lang.String): java.lang.String = js.native
  def after(delayRef: java.lang.String, id: java.lang.String): java.lang.String = js.native
  def after(delayRef: scala.Double): java.lang.String = js.native
  def after(delayRef: scala.Double, id: java.lang.String): java.lang.String = js.native
  def assign[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](
    assignment: stdLib.Partial[
      /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof TContext ]: (context : TContext, event : TEvent): TContext[K] | TContext[K]}
    */ xstateLib.xstateLibStrings.assign with js.Any
    ]
  ): xstateLib.libTypesMod.AssignAction[TContext, TEvent] = js.native
  def assign[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](assignment: xstateLib.libTypesMod.Assigner[TContext, TEvent]): xstateLib.libTypesMod.AssignAction[TContext, TEvent] = js.native
  def cancel(sendId: java.lang.String): xstateLib.libTypesMod.CancelAction = js.native
  def cancel(sendId: scala.Double): xstateLib.libTypesMod.CancelAction = js.native
  def done(id: java.lang.String): xstateLib.libTypesMod.DoneEventObject = js.native
  def done(id: java.lang.String, data: js.Any): xstateLib.libTypesMod.DoneEventObject = js.native
  def doneInvoke(id: java.lang.String): xstateLib.libTypesMod.DoneEvent = js.native
  def doneInvoke(id: java.lang.String, data: js.Any): xstateLib.libTypesMod.DoneEvent = js.native
  def error(id: java.lang.String): xstateLib.libTypesMod.ErrorPlatformEvent with java.lang.String = js.native
  def error(id: java.lang.String, data: js.Any): xstateLib.libTypesMod.ErrorPlatformEvent with java.lang.String = js.native
  def getActionFunction[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](actionType: xstateLib.libTypesMod.ActionType): js.UndefOr[
    (xstateLib.libTypesMod.ActionObject[TContext, TEvent]) | (xstateLib.libTypesMod.ActionFunction[TContext, TEvent])
  ] = js.native
  def getActionFunction[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](
    actionType: xstateLib.libTypesMod.ActionType,
    actionFunctionMap: xstateLib.libTypesMod.ActionFunctionMap[TContext, TEvent]
  ): js.UndefOr[
    (xstateLib.libTypesMod.ActionObject[TContext, TEvent]) | (xstateLib.libTypesMod.ActionFunction[TContext, TEvent])
  ] = js.native
  def isActionObject[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](action: xstateLib.libTypesMod.Action[TContext, TEvent]): /* is xstate.xstate/lib/types.ActionObject<TContext, TEvent> */ scala.Boolean = js.native
  def log[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](): xstateLib.Anon_CtxEvent[TContext, TEvent] = js.native
  def log[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](expr: js.Function2[/* ctx */ TContext, /* event */ TEvent, _]): xstateLib.Anon_CtxEvent[TContext, TEvent] = js.native
  def log[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](expr: js.Function2[/* ctx */ TContext, /* event */ TEvent, _], label: java.lang.String): xstateLib.Anon_CtxEvent[TContext, TEvent] = js.native
  def pure[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](
    getActions: js.Function2[
      /* context */ TContext, 
      /* event */ xstateLib.libTypesMod.OmniEventObject[TEvent], 
      js.UndefOr[
        xstateLib.libTypesMod.SingleOrArray[xstateLib.libTypesMod.ActionObject[TContext, TEvent]]
      ]
    ]
  ): xstateLib.libTypesMod.PureAction[TContext, TEvent] = js.native
  def raise[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](event: xstateLib.libTypesMod.Event[TEvent]): xstateLib.libTypesMod.RaiseEvent[TContext, TEvent] = js.native
  def resolveSend[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](action: xstateLib.libTypesMod.SendAction[TContext, TEvent], ctx: TContext, event: TEvent): xstateLib.libTypesMod.SendActionObject[TContext, xstateLib.libTypesMod.OmniEventObject[TEvent]] = js.native
  def send[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](event: xstateLib.libTypesMod.Event[TEvent]): xstateLib.libTypesMod.SendAction[TContext, TEvent] = js.native
  def send[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](
    event: xstateLib.libTypesMod.Event[TEvent],
    options: xstateLib.libTypesMod.SendActionOptions[TContext, TEvent]
  ): xstateLib.libTypesMod.SendAction[TContext, TEvent] = js.native
  def send[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](event: xstateLib.libTypesMod.SendExpr[TContext, TEvent]): xstateLib.libTypesMod.SendAction[TContext, TEvent] = js.native
  def send[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](
    event: xstateLib.libTypesMod.SendExpr[TContext, TEvent],
    options: xstateLib.libTypesMod.SendActionOptions[TContext, TEvent]
  ): xstateLib.libTypesMod.SendAction[TContext, TEvent] = js.native
  def sendParent[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](event: xstateLib.libTypesMod.Event[TEvent]): xstateLib.libTypesMod.SendAction[TContext, TEvent] = js.native
  def sendParent[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](
    event: xstateLib.libTypesMod.Event[TEvent],
    options: xstateLib.libTypesMod.SendActionOptions[TContext, TEvent]
  ): xstateLib.libTypesMod.SendAction[TContext, TEvent] = js.native
  def sendParent[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](event: xstateLib.libTypesMod.SendExpr[TContext, TEvent]): xstateLib.libTypesMod.SendAction[TContext, TEvent] = js.native
  def sendParent[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](
    event: xstateLib.libTypesMod.SendExpr[TContext, TEvent],
    options: xstateLib.libTypesMod.SendActionOptions[TContext, TEvent]
  ): xstateLib.libTypesMod.SendAction[TContext, TEvent] = js.native
  def start[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](activity: java.lang.String): xstateLib.libTypesMod.ActivityActionObject[TContext, TEvent] = js.native
  def start[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](activity: xstateLib.libTypesMod.ActivityDefinition[TContext, TEvent]): xstateLib.libTypesMod.ActivityActionObject[TContext, TEvent] = js.native
  def stop[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](activity: java.lang.String): xstateLib.libTypesMod.ActivityActionObject[TContext, TEvent] = js.native
  def stop[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](activity: xstateLib.libTypesMod.ActivityDefinition[TContext, TEvent]): xstateLib.libTypesMod.ActivityActionObject[TContext, TEvent] = js.native
  def toActionObject[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](action: xstateLib.libTypesMod.Action[TContext, TEvent]): xstateLib.libTypesMod.ActionObject[TContext, TEvent] = js.native
  def toActionObject[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](
    action: xstateLib.libTypesMod.Action[TContext, TEvent],
    actionFunctionMap: xstateLib.libTypesMod.ActionFunctionMap[TContext, TEvent]
  ): xstateLib.libTypesMod.ActionObject[TContext, TEvent] = js.native
  def toActionObjects[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](): js.Array[xstateLib.libTypesMod.ActionObject[TContext, TEvent]] = js.native
  def toActionObjects[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](
    action: js.UndefOr[scala.Nothing],
    actionFunctionMap: stdLib.Record[
      java.lang.String, 
      (xstateLib.libTypesMod.ActionObject[TContext, TEvent]) | (xstateLib.libTypesMod.ActionFunction[TContext, TEvent])
    ]
  ): js.Array[xstateLib.libTypesMod.ActionObject[TContext, TEvent]] = js.native
  def toActionObjects[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](action: java.lang.String): js.Array[xstateLib.libTypesMod.ActionObject[TContext, TEvent]] = js.native
  def toActionObjects[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](
    action: java.lang.String,
    actionFunctionMap: stdLib.Record[
      java.lang.String, 
      (xstateLib.libTypesMod.ActionObject[TContext, TEvent]) | (xstateLib.libTypesMod.ActionFunction[TContext, TEvent])
    ]
  ): js.Array[xstateLib.libTypesMod.ActionObject[TContext, TEvent]] = js.native
  def toActionObjects[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](action: js.Array[xstateLib.libTypesMod.Action[TContext, TEvent]]): js.Array[xstateLib.libTypesMod.ActionObject[TContext, TEvent]] = js.native
  def toActionObjects[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](
    action: js.Array[xstateLib.libTypesMod.Action[TContext, TEvent]],
    actionFunctionMap: stdLib.Record[
      java.lang.String, 
      (xstateLib.libTypesMod.ActionObject[TContext, TEvent]) | (xstateLib.libTypesMod.ActionFunction[TContext, TEvent])
    ]
  ): js.Array[xstateLib.libTypesMod.ActionObject[TContext, TEvent]] = js.native
  def toActionObjects[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](action: xstateLib.libTypesMod.ActionFunction[TContext, TEvent]): js.Array[xstateLib.libTypesMod.ActionObject[TContext, TEvent]] = js.native
  def toActionObjects[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](
    action: xstateLib.libTypesMod.ActionFunction[TContext, TEvent],
    actionFunctionMap: stdLib.Record[
      java.lang.String, 
      (xstateLib.libTypesMod.ActionObject[TContext, TEvent]) | (xstateLib.libTypesMod.ActionFunction[TContext, TEvent])
    ]
  ): js.Array[xstateLib.libTypesMod.ActionObject[TContext, TEvent]] = js.native
  def toActionObjects[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](action: xstateLib.libTypesMod.ActionObject[TContext, TEvent]): js.Array[xstateLib.libTypesMod.ActionObject[TContext, TEvent]] = js.native
  def toActionObjects[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](
    action: xstateLib.libTypesMod.ActionObject[TContext, TEvent],
    actionFunctionMap: stdLib.Record[
      java.lang.String, 
      (xstateLib.libTypesMod.ActionObject[TContext, TEvent]) | (xstateLib.libTypesMod.ActionFunction[TContext, TEvent])
    ]
  ): js.Array[xstateLib.libTypesMod.ActionObject[TContext, TEvent]] = js.native
  def toActivityDefinition[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](action: java.lang.String): xstateLib.libTypesMod.ActivityDefinition[TContext, TEvent] = js.native
  def toActivityDefinition[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](action: xstateLib.libTypesMod.ActivityDefinition[TContext, TEvent]): xstateLib.libTypesMod.ActivityDefinition[TContext, TEvent] = js.native
  def toEventObject[TEvent /* <: xstateLib.libTypesMod.EventObject */](event: xstateLib.libTypesMod.Event[TEvent]): TEvent = js.native
  def toEventObject[TEvent /* <: xstateLib.libTypesMod.EventObject */](
    event: xstateLib.libTypesMod.Event[TEvent],
    payload: (stdLib.Record[java.lang.String, _]) with xstateLib.Anon_Type
  ): TEvent = js.native
  @JSName("actionTypes")
  @js.native
  object actionTypesNs extends js.Object {
    val after: java.lang.String | scala.Double = js.native
    val assign: java.lang.String | scala.Double = js.native
    val cancel: java.lang.String | scala.Double = js.native
    val doneState: java.lang.String | scala.Double = js.native
    val errorExecution: java.lang.String | scala.Double = js.native
    val errorPlatform: java.lang.String | scala.Double = js.native
    val init: java.lang.String | scala.Double = js.native
    val invoke: java.lang.String | scala.Double = js.native
    val log: java.lang.String | scala.Double = js.native
    val nullEvent: java.lang.String | scala.Double = js.native
    val raise: java.lang.String | scala.Double = js.native
    val send: java.lang.String | scala.Double = js.native
    val start: java.lang.String | scala.Double = js.native
    val stop: java.lang.String | scala.Double = js.native
    val update: java.lang.String | scala.Double = js.native
  }
  
  @js.native
  object initEvent extends js.Object {
    var `type`: xstateLib.libTypesMod.ActionTypes.Init = js.native
  }
  
}


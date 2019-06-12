package typings
package xstateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/es/actions", JSImport.Namespace)
@js.native
object esActionsMod extends js.Object {
  def after(delayRef: java.lang.String): java.lang.String = js.native
  def after(delayRef: java.lang.String, id: java.lang.String): java.lang.String = js.native
  def after(delayRef: scala.Double): java.lang.String = js.native
  def after(delayRef: scala.Double, id: java.lang.String): java.lang.String = js.native
  def assign[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](
    assignment: stdLib.Partial[
      /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof TContext ]: (context : TContext, event : TEvent): TContext[K] | TContext[K]}
    */ xstateLib.xstateLibStrings.assign with js.Any
    ]
  ): xstateLib.esTypesMod.AssignAction[TContext, TEvent] = js.native
  def assign[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](assignment: xstateLib.esTypesMod.Assigner[TContext, TEvent]): xstateLib.esTypesMod.AssignAction[TContext, TEvent] = js.native
  def cancel(sendId: java.lang.String): xstateLib.esTypesMod.CancelAction = js.native
  def cancel(sendId: scala.Double): xstateLib.esTypesMod.CancelAction = js.native
  def done(id: java.lang.String): xstateLib.esTypesMod.DoneEventObject = js.native
  def done(id: java.lang.String, data: js.Any): xstateLib.esTypesMod.DoneEventObject = js.native
  def doneInvoke(id: java.lang.String): xstateLib.esTypesMod.DoneEvent = js.native
  def doneInvoke(id: java.lang.String, data: js.Any): xstateLib.esTypesMod.DoneEvent = js.native
  def error(id: java.lang.String): xstateLib.esTypesMod.ErrorPlatformEvent with java.lang.String = js.native
  def error(id: java.lang.String, data: js.Any): xstateLib.esTypesMod.ErrorPlatformEvent with java.lang.String = js.native
  def getActionFunction[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](actionType: xstateLib.esTypesMod.ActionType): js.UndefOr[
    (xstateLib.esTypesMod.ActionObject[TContext, TEvent]) | (xstateLib.esTypesMod.ActionFunction[TContext, TEvent])
  ] = js.native
  def getActionFunction[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](
    actionType: xstateLib.esTypesMod.ActionType,
    actionFunctionMap: xstateLib.esTypesMod.ActionFunctionMap[TContext, TEvent]
  ): js.UndefOr[
    (xstateLib.esTypesMod.ActionObject[TContext, TEvent]) | (xstateLib.esTypesMod.ActionFunction[TContext, TEvent])
  ] = js.native
  def isActionObject[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](action: xstateLib.esTypesMod.Action[TContext, TEvent]): /* is xstate.xstate/es/types.ActionObject<TContext, TEvent> */ scala.Boolean = js.native
  def log[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](): xstateLib.Anon_Ctx[TContext, TEvent] = js.native
  def log[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](expr: js.Function2[/* ctx */ TContext, /* event */ TEvent, _]): xstateLib.Anon_Ctx[TContext, TEvent] = js.native
  def log[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](expr: js.Function2[/* ctx */ TContext, /* event */ TEvent, _], label: java.lang.String): xstateLib.Anon_Ctx[TContext, TEvent] = js.native
  def pure[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](
    getActions: js.Function2[
      /* context */ TContext, 
      /* event */ xstateLib.esTypesMod.OmniEventObject[TEvent], 
      js.UndefOr[
        xstateLib.esTypesMod.SingleOrArray[xstateLib.esTypesMod.ActionObject[TContext, TEvent]]
      ]
    ]
  ): xstateLib.esTypesMod.PureAction[TContext, TEvent] = js.native
  def raise[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](event: xstateLib.esTypesMod.Event[TEvent]): xstateLib.esTypesMod.RaiseEvent[TContext, TEvent] = js.native
  def resolveSend[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](action: xstateLib.esTypesMod.SendAction[TContext, TEvent], ctx: TContext, event: TEvent): xstateLib.esTypesMod.SendActionObject[TContext, xstateLib.esTypesMod.OmniEventObject[TEvent]] = js.native
  def send[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](event: xstateLib.esTypesMod.Event[TEvent]): xstateLib.esTypesMod.SendAction[TContext, TEvent] = js.native
  def send[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](
    event: xstateLib.esTypesMod.Event[TEvent],
    options: xstateLib.esTypesMod.SendActionOptions[TContext, TEvent]
  ): xstateLib.esTypesMod.SendAction[TContext, TEvent] = js.native
  def send[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](event: xstateLib.esTypesMod.SendExpr[TContext, TEvent]): xstateLib.esTypesMod.SendAction[TContext, TEvent] = js.native
  def send[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](
    event: xstateLib.esTypesMod.SendExpr[TContext, TEvent],
    options: xstateLib.esTypesMod.SendActionOptions[TContext, TEvent]
  ): xstateLib.esTypesMod.SendAction[TContext, TEvent] = js.native
  def sendParent[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](event: xstateLib.esTypesMod.Event[TEvent]): xstateLib.esTypesMod.SendAction[TContext, TEvent] = js.native
  def sendParent[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](
    event: xstateLib.esTypesMod.Event[TEvent],
    options: xstateLib.esTypesMod.SendActionOptions[TContext, TEvent]
  ): xstateLib.esTypesMod.SendAction[TContext, TEvent] = js.native
  def sendParent[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](event: xstateLib.esTypesMod.SendExpr[TContext, TEvent]): xstateLib.esTypesMod.SendAction[TContext, TEvent] = js.native
  def sendParent[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](
    event: xstateLib.esTypesMod.SendExpr[TContext, TEvent],
    options: xstateLib.esTypesMod.SendActionOptions[TContext, TEvent]
  ): xstateLib.esTypesMod.SendAction[TContext, TEvent] = js.native
  def start[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](activity: java.lang.String): xstateLib.esTypesMod.ActivityActionObject[TContext, TEvent] = js.native
  def start[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](activity: xstateLib.esTypesMod.ActivityDefinition[TContext, TEvent]): xstateLib.esTypesMod.ActivityActionObject[TContext, TEvent] = js.native
  def stop[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](activity: java.lang.String): xstateLib.esTypesMod.ActivityActionObject[TContext, TEvent] = js.native
  def stop[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](activity: xstateLib.esTypesMod.ActivityDefinition[TContext, TEvent]): xstateLib.esTypesMod.ActivityActionObject[TContext, TEvent] = js.native
  def toActionObject[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](action: xstateLib.esTypesMod.Action[TContext, TEvent]): xstateLib.esTypesMod.ActionObject[TContext, TEvent] = js.native
  def toActionObject[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](
    action: xstateLib.esTypesMod.Action[TContext, TEvent],
    actionFunctionMap: xstateLib.esTypesMod.ActionFunctionMap[TContext, TEvent]
  ): xstateLib.esTypesMod.ActionObject[TContext, TEvent] = js.native
  def toActionObjects[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](): js.Array[xstateLib.esTypesMod.ActionObject[TContext, TEvent]] = js.native
  def toActionObjects[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](
    action: js.UndefOr[scala.Nothing],
    actionFunctionMap: stdLib.Record[
      java.lang.String, 
      (xstateLib.esTypesMod.ActionObject[TContext, TEvent]) | (xstateLib.esTypesMod.ActionFunction[TContext, TEvent])
    ]
  ): js.Array[xstateLib.esTypesMod.ActionObject[TContext, TEvent]] = js.native
  def toActionObjects[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](action: java.lang.String): js.Array[xstateLib.esTypesMod.ActionObject[TContext, TEvent]] = js.native
  def toActionObjects[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](
    action: java.lang.String,
    actionFunctionMap: stdLib.Record[
      java.lang.String, 
      (xstateLib.esTypesMod.ActionObject[TContext, TEvent]) | (xstateLib.esTypesMod.ActionFunction[TContext, TEvent])
    ]
  ): js.Array[xstateLib.esTypesMod.ActionObject[TContext, TEvent]] = js.native
  def toActionObjects[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](action: js.Array[xstateLib.esTypesMod.Action[TContext, TEvent]]): js.Array[xstateLib.esTypesMod.ActionObject[TContext, TEvent]] = js.native
  def toActionObjects[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](
    action: js.Array[xstateLib.esTypesMod.Action[TContext, TEvent]],
    actionFunctionMap: stdLib.Record[
      java.lang.String, 
      (xstateLib.esTypesMod.ActionObject[TContext, TEvent]) | (xstateLib.esTypesMod.ActionFunction[TContext, TEvent])
    ]
  ): js.Array[xstateLib.esTypesMod.ActionObject[TContext, TEvent]] = js.native
  def toActionObjects[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](action: xstateLib.esTypesMod.ActionFunction[TContext, TEvent]): js.Array[xstateLib.esTypesMod.ActionObject[TContext, TEvent]] = js.native
  def toActionObjects[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](
    action: xstateLib.esTypesMod.ActionFunction[TContext, TEvent],
    actionFunctionMap: stdLib.Record[
      java.lang.String, 
      (xstateLib.esTypesMod.ActionObject[TContext, TEvent]) | (xstateLib.esTypesMod.ActionFunction[TContext, TEvent])
    ]
  ): js.Array[xstateLib.esTypesMod.ActionObject[TContext, TEvent]] = js.native
  def toActionObjects[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](action: xstateLib.esTypesMod.ActionObject[TContext, TEvent]): js.Array[xstateLib.esTypesMod.ActionObject[TContext, TEvent]] = js.native
  def toActionObjects[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](
    action: xstateLib.esTypesMod.ActionObject[TContext, TEvent],
    actionFunctionMap: stdLib.Record[
      java.lang.String, 
      (xstateLib.esTypesMod.ActionObject[TContext, TEvent]) | (xstateLib.esTypesMod.ActionFunction[TContext, TEvent])
    ]
  ): js.Array[xstateLib.esTypesMod.ActionObject[TContext, TEvent]] = js.native
  def toActivityDefinition[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](action: java.lang.String): xstateLib.esTypesMod.ActivityDefinition[TContext, TEvent] = js.native
  def toActivityDefinition[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](action: xstateLib.esTypesMod.ActivityDefinition[TContext, TEvent]): xstateLib.esTypesMod.ActivityDefinition[TContext, TEvent] = js.native
  def toEventObject[TEvent /* <: xstateLib.esTypesMod.EventObject */](event: xstateLib.esTypesMod.Event[TEvent]): TEvent = js.native
  def toEventObject[TEvent /* <: xstateLib.esTypesMod.EventObject */](
    event: xstateLib.esTypesMod.Event[TEvent],
    payload: (stdLib.Record[java.lang.String, _]) with xstateLib.Anon_Type
  ): TEvent = js.native
  @JSName("actionTypes")
  @js.native
  object actionTypesNs extends js.Object {
    val after: xstateLib.esTypesMod.ActionTypes.After = js.native
    val assign: xstateLib.esTypesMod.ActionTypes.Assign = js.native
    val cancel: xstateLib.esTypesMod.ActionTypes.Cancel = js.native
    val doneState: xstateLib.esTypesMod.ActionTypes.DoneState = js.native
    val errorExecution: xstateLib.esTypesMod.ActionTypes.ErrorExecution = js.native
    val errorPlatform: xstateLib.esTypesMod.ActionTypes.ErrorPlatform = js.native
    val init: xstateLib.esTypesMod.ActionTypes.Init = js.native
    val invoke: xstateLib.esTypesMod.ActionTypes.Invoke = js.native
    val log: xstateLib.esTypesMod.ActionTypes.Log = js.native
    val nullEvent: xstateLib.esTypesMod.ActionTypes.NullEvent = js.native
    val raise: xstateLib.esTypesMod.ActionTypes.Raise = js.native
    val send: xstateLib.esTypesMod.ActionTypes.Send = js.native
    val start: xstateLib.esTypesMod.ActionTypes.Start = js.native
    val stop: xstateLib.esTypesMod.ActionTypes.Stop = js.native
    val update: xstateLib.esTypesMod.ActionTypes.Update = js.native
  }
  
  @js.native
  object initEvent extends js.Object {
    var `type`: xstateLib.esTypesMod.ActionTypes.Init = js.native
  }
  
}


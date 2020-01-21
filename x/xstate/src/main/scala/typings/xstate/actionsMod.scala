package typings.xstate

import typings.std.Record
import typings.std.Required
import typings.xstate.typesMod.Action
import typings.xstate.typesMod.ActionFunction
import typings.xstate.typesMod.ActionFunctionMap
import typings.xstate.typesMod.ActionObject
import typings.xstate.typesMod.ActionType
import typings.xstate.typesMod.ActivityActionObject
import typings.xstate.typesMod.ActivityDefinition
import typings.xstate.typesMod.AssignAction
import typings.xstate.typesMod.Assigner
import typings.xstate.typesMod.CancelAction
import typings.xstate.typesMod.DelayFunctionMap
import typings.xstate.typesMod.DoneEvent
import typings.xstate.typesMod.DoneEventObject
import typings.xstate.typesMod.ErrorPlatformEvent
import typings.xstate.typesMod.EventObject
import typings.xstate.typesMod.LogAction
import typings.xstate.typesMod.LogActionObject
import typings.xstate.typesMod.LogExpr
import typings.xstate.typesMod.PropertyAssigner
import typings.xstate.typesMod.PureAction
import typings.xstate.typesMod.RaiseAction
import typings.xstate.typesMod.RaiseActionObject
import typings.xstate.typesMod.SCXML.Event
import typings.xstate.typesMod.SendAction
import typings.xstate.typesMod.SendActionObject
import typings.xstate.typesMod.SendActionOptions
import typings.xstate.typesMod.SendExpr
import typings.xstate.typesMod.SingleOrArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/lib/actions", JSImport.Namespace)
@js.native
object actionsMod extends js.Object {
  val initEvent: Event[AnonType] = js.native
  def after(delayRef: String): String = js.native
  def after(delayRef: String, id: String): String = js.native
  def after(delayRef: Double): String = js.native
  def after(delayRef: Double, id: String): String = js.native
  def assign[TContext, TEvent /* <: EventObject */](assignment: Assigner[TContext, TEvent]): AssignAction[TContext, TEvent] = js.native
  def assign[TContext, TEvent /* <: EventObject */](assignment: PropertyAssigner[TContext, TEvent]): AssignAction[TContext, TEvent] = js.native
  def cancel(sendId: String): CancelAction = js.native
  def cancel(sendId: Double): CancelAction = js.native
  def done(id: String): DoneEventObject = js.native
  def done(id: String, data: js.Any): DoneEventObject = js.native
  def doneInvoke(id: String): DoneEvent = js.native
  def doneInvoke(id: String, data: js.Any): DoneEvent = js.native
  def error(id: String): ErrorPlatformEvent with String = js.native
  def error(id: String, data: js.Any): ErrorPlatformEvent with String = js.native
  def escalate[TContext, TEvent /* <: EventObject */](errorData: js.Any): SendAction[TContext, TEvent] = js.native
  def escalate[TContext, TEvent /* <: EventObject */](errorData: js.Any, options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
  @JSName("forwardTo")
  def forwardTo_to[TContext, TEvent /* <: EventObject */](
    target: /* import warning: importer.ImportType#apply Failed type conversion: std.Required<xstate.xstate/lib/types.SendActionOptions<TContext, TEvent>>['to'] */ js.Any
  ): SendAction[TContext, TEvent] = js.native
  @JSName("forwardTo")
  def forwardTo_to[TContext, TEvent /* <: EventObject */](
    target: /* import warning: importer.ImportType#apply Failed type conversion: std.Required<xstate.xstate/lib/types.SendActionOptions<TContext, TEvent>>['to'] */ js.Any,
    options: SendActionOptions[TContext, TEvent]
  ): SendAction[TContext, TEvent] = js.native
  def getActionFunction[TContext, TEvent /* <: EventObject */](actionType: ActionType): js.UndefOr[(ActionObject[TContext, TEvent]) | (ActionFunction[TContext, TEvent])] = js.native
  def getActionFunction[TContext, TEvent /* <: EventObject */](actionType: ActionType, actionFunctionMap: ActionFunctionMap[TContext, TEvent]): js.UndefOr[(ActionObject[TContext, TEvent]) | (ActionFunction[TContext, TEvent])] = js.native
  def isActionObject[TContext, TEvent /* <: EventObject */](action: Action[TContext, TEvent]): /* is xstate.xstate/lib/types.ActionObject<TContext, TEvent> */ Boolean = js.native
  def log[TContext, TEvent /* <: EventObject */](): LogAction[TContext, TEvent] = js.native
  def log[TContext, TEvent /* <: EventObject */](expr: String): LogAction[TContext, TEvent] = js.native
  def log[TContext, TEvent /* <: EventObject */](expr: String, label: String): LogAction[TContext, TEvent] = js.native
  def log[TContext, TEvent /* <: EventObject */](expr: LogExpr[TContext, TEvent]): LogAction[TContext, TEvent] = js.native
  def log[TContext, TEvent /* <: EventObject */](expr: LogExpr[TContext, TEvent], label: String): LogAction[TContext, TEvent] = js.native
  def pure[TContext, TEvent /* <: EventObject */](
    getActions: js.Function2[
      /* context */ TContext, 
      /* event */ TEvent, 
      js.UndefOr[SingleOrArray[ActionObject[TContext, TEvent]]]
    ]
  ): PureAction[TContext, TEvent] = js.native
  def raise[TContext, TEvent /* <: EventObject */](event: typings.xstate.typesMod.Event[TEvent]): RaiseAction[TEvent] | (SendAction[TContext, TEvent]) = js.native
  def resolveLog[TContext, TEvent /* <: EventObject */](action: LogAction[TContext, TEvent], ctx: TContext, _event: Event[TEvent]): LogActionObject[TContext, TEvent] = js.native
  def resolveRaise[TEvent /* <: EventObject */](action: RaiseAction[TEvent]): RaiseActionObject[TEvent] = js.native
  def resolveSend[TContext, TEvent /* <: EventObject */](action: SendAction[TContext, TEvent], ctx: TContext, _event: Event[TEvent]): SendActionObject[TContext, TEvent] = js.native
  def resolveSend[TContext, TEvent /* <: EventObject */](
    action: SendAction[TContext, TEvent],
    ctx: TContext,
    _event: Event[TEvent],
    delaysMap: DelayFunctionMap[TContext, TEvent]
  ): SendActionObject[TContext, TEvent] = js.native
  def respond[TContext, TEvent /* <: EventObject */](event: typings.xstate.typesMod.Event[TEvent]): SendAction[TContext, TEvent] = js.native
  def respond[TContext, TEvent /* <: EventObject */](event: typings.xstate.typesMod.Event[TEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
  def respond[TContext, TEvent /* <: EventObject */](event: SendExpr[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
  def respond[TContext, TEvent /* <: EventObject */](event: SendExpr[TContext, TEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
  def send[TContext, TEvent /* <: EventObject */](event: typings.xstate.typesMod.Event[TEvent]): SendAction[TContext, TEvent] = js.native
  def send[TContext, TEvent /* <: EventObject */](event: typings.xstate.typesMod.Event[TEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
  def send[TContext, TEvent /* <: EventObject */](event: SendExpr[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
  def send[TContext, TEvent /* <: EventObject */](event: SendExpr[TContext, TEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
  def sendParent[TContext, TEvent /* <: EventObject */](event: typings.xstate.typesMod.Event[_]): SendAction[TContext, TEvent] = js.native
  def sendParent[TContext, TEvent /* <: EventObject */](event: typings.xstate.typesMod.Event[_], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
  def sendParent[TContext, TEvent /* <: EventObject */](event: SendExpr[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
  def sendParent[TContext, TEvent /* <: EventObject */](event: SendExpr[TContext, TEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
  def sendUpdate[TContext, TEvent /* <: EventObject */](): SendAction[TContext, TEvent] = js.native
  def start[TContext, TEvent /* <: EventObject */](activity: String): ActivityActionObject[TContext, TEvent] = js.native
  def start[TContext, TEvent /* <: EventObject */](activity: ActivityDefinition[TContext, TEvent]): ActivityActionObject[TContext, TEvent] = js.native
  def stop[TContext, TEvent /* <: EventObject */](activity: String): ActivityActionObject[TContext, TEvent] = js.native
  def stop[TContext, TEvent /* <: EventObject */](activity: ActivityDefinition[TContext, TEvent]): ActivityActionObject[TContext, TEvent] = js.native
  def toActionObject[TContext, TEvent /* <: EventObject */](action: Action[TContext, TEvent]): ActionObject[TContext, TEvent] = js.native
  def toActionObject[TContext, TEvent /* <: EventObject */](action: Action[TContext, TEvent], actionFunctionMap: ActionFunctionMap[TContext, TEvent]): ActionObject[TContext, TEvent] = js.native
  def toActionObjects[TContext, TEvent /* <: EventObject */](): js.Array[ActionObject[TContext, TEvent]] = js.native
  def toActionObjects[TContext, TEvent /* <: EventObject */](
    action: js.UndefOr[scala.Nothing],
    actionFunctionMap: Record[String, (ActionFunction[TContext, TEvent]) | (ActionObject[TContext, TEvent])]
  ): js.Array[ActionObject[TContext, TEvent]] = js.native
  def toActionObjects[TContext, TEvent /* <: EventObject */](action: String): js.Array[ActionObject[TContext, TEvent]] = js.native
  def toActionObjects[TContext, TEvent /* <: EventObject */](
    action: String,
    actionFunctionMap: Record[String, (ActionFunction[TContext, TEvent]) | (ActionObject[TContext, TEvent])]
  ): js.Array[ActionObject[TContext, TEvent]] = js.native
  def toActionObjects[TContext, TEvent /* <: EventObject */](action: js.Array[Action[TContext, TEvent]]): js.Array[ActionObject[TContext, TEvent]] = js.native
  def toActionObjects[TContext, TEvent /* <: EventObject */](
    action: js.Array[Action[TContext, TEvent]],
    actionFunctionMap: Record[String, (ActionFunction[TContext, TEvent]) | (ActionObject[TContext, TEvent])]
  ): js.Array[ActionObject[TContext, TEvent]] = js.native
  def toActionObjects[TContext, TEvent /* <: EventObject */](action: ActionFunction[TContext, TEvent]): js.Array[ActionObject[TContext, TEvent]] = js.native
  def toActionObjects[TContext, TEvent /* <: EventObject */](
    action: ActionFunction[TContext, TEvent],
    actionFunctionMap: Record[String, (ActionFunction[TContext, TEvent]) | (ActionObject[TContext, TEvent])]
  ): js.Array[ActionObject[TContext, TEvent]] = js.native
  def toActionObjects[TContext, TEvent /* <: EventObject */](action: ActionObject[TContext, TEvent]): js.Array[ActionObject[TContext, TEvent]] = js.native
  def toActionObjects[TContext, TEvent /* <: EventObject */](
    action: ActionObject[TContext, TEvent],
    actionFunctionMap: Record[String, (ActionFunction[TContext, TEvent]) | (ActionObject[TContext, TEvent])]
  ): js.Array[ActionObject[TContext, TEvent]] = js.native
  def toActionObjects[TContext, TEvent /* <: EventObject */](action: AssignAction[Required[TContext], TEvent]): js.Array[ActionObject[TContext, TEvent]] = js.native
  def toActionObjects[TContext, TEvent /* <: EventObject */](
    action: AssignAction[Required[TContext], TEvent],
    actionFunctionMap: Record[String, (ActionFunction[TContext, TEvent]) | (ActionObject[TContext, TEvent])]
  ): js.Array[ActionObject[TContext, TEvent]] = js.native
  def toActionObjects[TContext, TEvent /* <: EventObject */](action: RaiseAction[TEvent]): js.Array[ActionObject[TContext, TEvent]] = js.native
  def toActionObjects[TContext, TEvent /* <: EventObject */](
    action: RaiseAction[TEvent],
    actionFunctionMap: Record[String, (ActionFunction[TContext, TEvent]) | (ActionObject[TContext, TEvent])]
  ): js.Array[ActionObject[TContext, TEvent]] = js.native
  def toActionObjects[TContext, TEvent /* <: EventObject */](action: SendAction[TContext, TEvent]): js.Array[ActionObject[TContext, TEvent]] = js.native
  def toActionObjects[TContext, TEvent /* <: EventObject */](
    action: SendAction[TContext, TEvent],
    actionFunctionMap: Record[String, (ActionFunction[TContext, TEvent]) | (ActionObject[TContext, TEvent])]
  ): js.Array[ActionObject[TContext, TEvent]] = js.native
  def toActivityDefinition[TContext, TEvent /* <: EventObject */](action: String): ActivityDefinition[TContext, TEvent] = js.native
  def toActivityDefinition[TContext, TEvent /* <: EventObject */](action: ActivityDefinition[TContext, TEvent]): ActivityDefinition[TContext, TEvent] = js.native
  @js.native
  object actionTypes extends js.Object {
    val after: String | Double = js.native
    val assign: String | Double = js.native
    val cancel: String | Double = js.native
    val doneState: String | Double = js.native
    val error: String | Double = js.native
    val errorExecution: String | Double = js.native
    val errorPlatform: String | Double = js.native
    val init: String | Double = js.native
    val invoke: String | Double = js.native
    val log: String | Double = js.native
    val nullEvent: String | Double = js.native
    val pure: String | Double = js.native
    val raise: String | Double = js.native
    val send: String | Double = js.native
    val start: String | Double = js.native
    val stop: String | Double = js.native
    val update: String | Double = js.native
  }
  
}


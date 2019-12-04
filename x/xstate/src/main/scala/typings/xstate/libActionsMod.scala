package typings.xstate

import typings.std.Partial
import typings.std.Record
import typings.xstate.libTypesMod.Action
import typings.xstate.libTypesMod.ActionFunction
import typings.xstate.libTypesMod.ActionFunctionMap
import typings.xstate.libTypesMod.ActionObject
import typings.xstate.libTypesMod.ActionType
import typings.xstate.libTypesMod.ActionTypes.Init
import typings.xstate.libTypesMod.ActivityActionObject
import typings.xstate.libTypesMod.ActivityDefinition
import typings.xstate.libTypesMod.AssignAction
import typings.xstate.libTypesMod.Assigner
import typings.xstate.libTypesMod.CancelAction
import typings.xstate.libTypesMod.DoneEvent
import typings.xstate.libTypesMod.DoneEventObject
import typings.xstate.libTypesMod.ErrorPlatformEvent
import typings.xstate.libTypesMod.Event
import typings.xstate.libTypesMod.EventObject
import typings.xstate.libTypesMod.OmniEventObject
import typings.xstate.libTypesMod.PureAction
import typings.xstate.libTypesMod.RaiseEvent
import typings.xstate.libTypesMod.SendAction
import typings.xstate.libTypesMod.SendActionObject
import typings.xstate.libTypesMod.SendActionOptions
import typings.xstate.libTypesMod.SendExpr
import typings.xstate.libTypesMod.SingleOrArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/lib/actions", JSImport.Namespace)
@js.native
object libActionsMod extends js.Object {
  def after(delayRef: String): String = js.native
  def after(delayRef: String, id: String): String = js.native
  def after(delayRef: Double): String = js.native
  def after(delayRef: Double, id: String): String = js.native
  def assign[TContext, TEvent /* <: EventObject */](
    assignment: Partial[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof TContext ]: (context : TContext, event : TEvent): TContext[K] | TContext[K]}
    */ typings.xstate.xstateStrings.assign with js.Any
    ]
  ): AssignAction[TContext, TEvent] = js.native
  def assign[TContext, TEvent /* <: EventObject */](assignment: Assigner[TContext, TEvent]): AssignAction[TContext, TEvent] = js.native
  def cancel(sendId: String): CancelAction = js.native
  def cancel(sendId: Double): CancelAction = js.native
  def done(id: String): DoneEventObject = js.native
  def done(id: String, data: js.Any): DoneEventObject = js.native
  def doneInvoke(id: String): DoneEvent = js.native
  def doneInvoke(id: String, data: js.Any): DoneEvent = js.native
  def error(id: String): ErrorPlatformEvent with String = js.native
  def error(id: String, data: js.Any): ErrorPlatformEvent with String = js.native
  def getActionFunction[TContext, TEvent /* <: EventObject */](actionType: ActionType): js.UndefOr[(ActionObject[TContext, TEvent]) | (ActionFunction[TContext, TEvent])] = js.native
  def getActionFunction[TContext, TEvent /* <: EventObject */](actionType: ActionType, actionFunctionMap: ActionFunctionMap[TContext, TEvent]): js.UndefOr[(ActionObject[TContext, TEvent]) | (ActionFunction[TContext, TEvent])] = js.native
  def isActionObject[TContext, TEvent /* <: EventObject */](action: Action[TContext, TEvent]): /* is xstate.xstate/lib/types.ActionObject<TContext, TEvent> */ Boolean = js.native
  def log[TContext, TEvent /* <: EventObject */](): Anon_Ctx[TContext, TEvent] = js.native
  def log[TContext, TEvent /* <: EventObject */](expr: js.Function2[/* ctx */ TContext, /* event */ TEvent, _]): Anon_Ctx[TContext, TEvent] = js.native
  def log[TContext, TEvent /* <: EventObject */](expr: js.Function2[/* ctx */ TContext, /* event */ TEvent, _], label: String): Anon_Ctx[TContext, TEvent] = js.native
  def pure[TContext, TEvent /* <: EventObject */](
    getActions: js.Function2[
      /* context */ TContext, 
      /* event */ OmniEventObject[TEvent], 
      js.UndefOr[SingleOrArray[ActionObject[TContext, TEvent]]]
    ]
  ): PureAction[TContext, TEvent] = js.native
  def raise[TContext, TEvent /* <: EventObject */](event: Event[TEvent]): RaiseEvent[TContext, TEvent] = js.native
  def resolveSend[TContext, TEvent /* <: EventObject */](action: SendAction[TContext, TEvent], ctx: TContext, event: TEvent): SendActionObject[TContext, OmniEventObject[TEvent]] = js.native
  def send[TContext, TEvent /* <: EventObject */](event: Event[TEvent]): SendAction[TContext, TEvent] = js.native
  def send[TContext, TEvent /* <: EventObject */](event: Event[TEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
  def send[TContext, TEvent /* <: EventObject */](event: SendExpr[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
  def send[TContext, TEvent /* <: EventObject */](event: SendExpr[TContext, TEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
  def sendParent[TContext, TEvent /* <: EventObject */](event: Event[TEvent]): SendAction[TContext, TEvent] = js.native
  def sendParent[TContext, TEvent /* <: EventObject */](event: Event[TEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
  def sendParent[TContext, TEvent /* <: EventObject */](event: SendExpr[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
  def sendParent[TContext, TEvent /* <: EventObject */](event: SendExpr[TContext, TEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
  def start[TContext, TEvent /* <: EventObject */](activity: String): ActivityActionObject[TContext, TEvent] = js.native
  def start[TContext, TEvent /* <: EventObject */](activity: ActivityDefinition[TContext, TEvent]): ActivityActionObject[TContext, TEvent] = js.native
  def stop[TContext, TEvent /* <: EventObject */](activity: String): ActivityActionObject[TContext, TEvent] = js.native
  def stop[TContext, TEvent /* <: EventObject */](activity: ActivityDefinition[TContext, TEvent]): ActivityActionObject[TContext, TEvent] = js.native
  def toActionObject[TContext, TEvent /* <: EventObject */](action: Action[TContext, TEvent]): ActionObject[TContext, TEvent] = js.native
  def toActionObject[TContext, TEvent /* <: EventObject */](action: Action[TContext, TEvent], actionFunctionMap: ActionFunctionMap[TContext, TEvent]): ActionObject[TContext, TEvent] = js.native
  def toActionObjects[TContext, TEvent /* <: EventObject */](): js.Array[ActionObject[TContext, TEvent]] = js.native
  def toActionObjects[TContext, TEvent /* <: EventObject */](
    action: js.UndefOr[scala.Nothing],
    actionFunctionMap: Record[String, (ActionObject[TContext, TEvent]) | (ActionFunction[TContext, TEvent])]
  ): js.Array[ActionObject[TContext, TEvent]] = js.native
  def toActionObjects[TContext, TEvent /* <: EventObject */](action: String): js.Array[ActionObject[TContext, TEvent]] = js.native
  def toActionObjects[TContext, TEvent /* <: EventObject */](
    action: String,
    actionFunctionMap: Record[String, (ActionObject[TContext, TEvent]) | (ActionFunction[TContext, TEvent])]
  ): js.Array[ActionObject[TContext, TEvent]] = js.native
  def toActionObjects[TContext, TEvent /* <: EventObject */](action: js.Array[Action[TContext, TEvent]]): js.Array[ActionObject[TContext, TEvent]] = js.native
  def toActionObjects[TContext, TEvent /* <: EventObject */](
    action: js.Array[Action[TContext, TEvent]],
    actionFunctionMap: Record[String, (ActionObject[TContext, TEvent]) | (ActionFunction[TContext, TEvent])]
  ): js.Array[ActionObject[TContext, TEvent]] = js.native
  def toActionObjects[TContext, TEvent /* <: EventObject */](action: ActionFunction[TContext, TEvent]): js.Array[ActionObject[TContext, TEvent]] = js.native
  def toActionObjects[TContext, TEvent /* <: EventObject */](
    action: ActionFunction[TContext, TEvent],
    actionFunctionMap: Record[String, (ActionObject[TContext, TEvent]) | (ActionFunction[TContext, TEvent])]
  ): js.Array[ActionObject[TContext, TEvent]] = js.native
  def toActionObjects[TContext, TEvent /* <: EventObject */](action: ActionObject[TContext, TEvent]): js.Array[ActionObject[TContext, TEvent]] = js.native
  def toActionObjects[TContext, TEvent /* <: EventObject */](
    action: ActionObject[TContext, TEvent],
    actionFunctionMap: Record[String, (ActionObject[TContext, TEvent]) | (ActionFunction[TContext, TEvent])]
  ): js.Array[ActionObject[TContext, TEvent]] = js.native
  def toActivityDefinition[TContext, TEvent /* <: EventObject */](action: String): ActivityDefinition[TContext, TEvent] = js.native
  def toActivityDefinition[TContext, TEvent /* <: EventObject */](action: ActivityDefinition[TContext, TEvent]): ActivityDefinition[TContext, TEvent] = js.native
  def toEventObject[TEvent /* <: EventObject */](event: Event[TEvent]): TEvent = js.native
  def toEventObject[TEvent /* <: EventObject */](event: Event[TEvent], payload: (Record[String, _]) with js.Object): TEvent = js.native
  @js.native
  object actionTypes extends js.Object {
    val after: String | Double = js.native
    val assign: String | Double = js.native
    val cancel: String | Double = js.native
    val doneState: String | Double = js.native
    val errorExecution: String | Double = js.native
    val errorPlatform: String | Double = js.native
    val init: String | Double = js.native
    val invoke: String | Double = js.native
    val log: String | Double = js.native
    val nullEvent: String | Double = js.native
    val raise: String | Double = js.native
    val send: String | Double = js.native
    val start: String | Double = js.native
    val stop: String | Double = js.native
    val update: String | Double = js.native
  }
  
  @js.native
  object initEvent extends js.Object {
    var `type`: Init = js.native
  }
  
}


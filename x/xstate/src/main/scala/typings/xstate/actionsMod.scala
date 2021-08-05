package typings.xstate

import typings.std.Record
import typings.xstate.anon.ContextTContext
import typings.xstate.anon.Id
import typings.xstate.anon.Type
import typings.xstate.anon.TypeUpdate
import typings.xstate.stateMod.State
import typings.xstate.stateNodeMod.StateNode
import typings.xstate.typesMod.Action
import typings.xstate.typesMod.ActionFunction
import typings.xstate.typesMod.ActionFunctionMap
import typings.xstate.typesMod.ActionObject
import typings.xstate.typesMod.ActionType
import typings.xstate.typesMod.ActivityActionObject
import typings.xstate.typesMod.ActivityDefinition
import typings.xstate.typesMod.AnyEventObject
import typings.xstate.typesMod.AssignAction
import typings.xstate.typesMod.Assigner
import typings.xstate.typesMod.CancelAction
import typings.xstate.typesMod.ChooseAction
import typings.xstate.typesMod.ChooseConditon
import typings.xstate.typesMod.DelayFunctionMap
import typings.xstate.typesMod.DoneEvent
import typings.xstate.typesMod.DoneEventObject
import typings.xstate.typesMod.ErrorPlatformEvent
import typings.xstate.typesMod.EventObject
import typings.xstate.typesMod.Expr
import typings.xstate.typesMod.ExprWithMeta
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
import typings.xstate.typesMod.StopAction
import typings.xstate.typesMod.StopActionObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionsMod {
  
  @JSImport("xstate/lib/actions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object actionTypes {
    
    @JSImport("xstate/lib/actions", "actionTypes.after")
    @js.native
    val after: String | Double = js.native
    
    @JSImport("xstate/lib/actions", "actionTypes.assign")
    @js.native
    val assign: String | Double = js.native
    
    @JSImport("xstate/lib/actions", "actionTypes.cancel")
    @js.native
    val cancel: String | Double = js.native
    
    @JSImport("xstate/lib/actions", "actionTypes.choose")
    @js.native
    val choose: String | Double = js.native
    
    @JSImport("xstate/lib/actions", "actionTypes.doneState")
    @js.native
    val doneState: String | Double = js.native
    
    @JSImport("xstate/lib/actions", "actionTypes.error")
    @js.native
    val error: String | Double = js.native
    
    @JSImport("xstate/lib/actions", "actionTypes.errorExecution")
    @js.native
    val errorExecution: String | Double = js.native
    
    @JSImport("xstate/lib/actions", "actionTypes.errorPlatform")
    @js.native
    val errorPlatform: String | Double = js.native
    
    @JSImport("xstate/lib/actions", "actionTypes.init")
    @js.native
    val init: String | Double = js.native
    
    @JSImport("xstate/lib/actions", "actionTypes.invoke")
    @js.native
    val invoke: String | Double = js.native
    
    @JSImport("xstate/lib/actions", "actionTypes.log")
    @js.native
    val log: String | Double = js.native
    
    @JSImport("xstate/lib/actions", "actionTypes.nullEvent")
    @js.native
    val nullEvent: String | Double = js.native
    
    @JSImport("xstate/lib/actions", "actionTypes.pure")
    @js.native
    val pure: String | Double = js.native
    
    @JSImport("xstate/lib/actions", "actionTypes.raise")
    @js.native
    val raise: String | Double = js.native
    
    @JSImport("xstate/lib/actions", "actionTypes.send")
    @js.native
    val send: String | Double = js.native
    
    @JSImport("xstate/lib/actions", "actionTypes.start")
    @js.native
    val start: String | Double = js.native
    
    @JSImport("xstate/lib/actions", "actionTypes.stop")
    @js.native
    val stop: String | Double = js.native
    
    @JSImport("xstate/lib/actions", "actionTypes.update")
    @js.native
    val update: String | Double = js.native
  }
  
  inline def after(delayRef: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("after")(delayRef.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def after(delayRef: String, id: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("after")(delayRef.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def after(delayRef: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("after")(delayRef.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def after(delayRef: Double, id: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("after")(delayRef.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def assign[TContext, TEvent /* <: EventObject */](assignment: Assigner[TContext, TEvent]): AssignAction[TContext, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("assign")(assignment.asInstanceOf[js.Any]).asInstanceOf[AssignAction[TContext, TEvent]]
  inline def assign[TContext, TEvent /* <: EventObject */](assignment: PropertyAssigner[TContext, TEvent]): AssignAction[TContext, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("assign")(assignment.asInstanceOf[js.Any]).asInstanceOf[AssignAction[TContext, TEvent]]
  
  inline def cancel(sendId: String): CancelAction = ^.asInstanceOf[js.Dynamic].applyDynamic("cancel")(sendId.asInstanceOf[js.Any]).asInstanceOf[CancelAction]
  inline def cancel(sendId: Double): CancelAction = ^.asInstanceOf[js.Dynamic].applyDynamic("cancel")(sendId.asInstanceOf[js.Any]).asInstanceOf[CancelAction]
  
  inline def choose[TContext, TEvent /* <: EventObject */](conds: js.Array[ChooseConditon[TContext, TEvent]]): ChooseAction[TContext, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("choose")(conds.asInstanceOf[js.Any]).asInstanceOf[ChooseAction[TContext, TEvent]]
  
  inline def done(id: String): DoneEventObject = ^.asInstanceOf[js.Dynamic].applyDynamic("done")(id.asInstanceOf[js.Any]).asInstanceOf[DoneEventObject]
  inline def done(id: String, data: js.Any): DoneEventObject = (^.asInstanceOf[js.Dynamic].applyDynamic("done")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[DoneEventObject]
  
  inline def doneInvoke(id: String): DoneEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("doneInvoke")(id.asInstanceOf[js.Any]).asInstanceOf[DoneEvent]
  inline def doneInvoke(id: String, data: js.Any): DoneEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("doneInvoke")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[DoneEvent]
  
  inline def error(id: String): ErrorPlatformEvent & String = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(id.asInstanceOf[js.Any]).asInstanceOf[ErrorPlatformEvent & String]
  inline def error(id: String, data: js.Any): ErrorPlatformEvent & String = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[ErrorPlatformEvent & String]
  
  inline def escalate[TContext, TEvent /* <: EventObject */, TErrorData](errorData: TErrorData): SendAction[TContext, TEvent, AnyEventObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("escalate")(errorData.asInstanceOf[js.Any]).asInstanceOf[SendAction[TContext, TEvent, AnyEventObject]]
  inline def escalate[TContext, TEvent /* <: EventObject */, TErrorData](errorData: TErrorData, options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent, AnyEventObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("escalate")(errorData.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, AnyEventObject]]
  inline def escalate[TContext, TEvent /* <: EventObject */, TErrorData](errorData: ExprWithMeta[TContext, TEvent, TErrorData]): SendAction[TContext, TEvent, AnyEventObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("escalate")(errorData.asInstanceOf[js.Any]).asInstanceOf[SendAction[TContext, TEvent, AnyEventObject]]
  inline def escalate[TContext, TEvent /* <: EventObject */, TErrorData](
    errorData: ExprWithMeta[TContext, TEvent, TErrorData],
    options: SendActionOptions[TContext, TEvent]
  ): SendAction[TContext, TEvent, AnyEventObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("escalate")(errorData.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, AnyEventObject]]
  
  inline def forwardTo_to[TContext, TEvent /* <: EventObject */](
    target: /* import warning: importer.ImportType#apply Failed type conversion: std.Required<xstate.xstate/lib/types.SendActionOptions<TContext, TEvent>>['to'] */ js.Any
  ): SendAction[TContext, TEvent, AnyEventObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("forwardTo")(target.asInstanceOf[js.Any]).asInstanceOf[SendAction[TContext, TEvent, AnyEventObject]]
  inline def forwardTo_to[TContext, TEvent /* <: EventObject */](
    target: /* import warning: importer.ImportType#apply Failed type conversion: std.Required<xstate.xstate/lib/types.SendActionOptions<TContext, TEvent>>['to'] */ js.Any,
    options: SendActionOptions[TContext, TEvent]
  ): SendAction[TContext, TEvent, AnyEventObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("forwardTo")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, AnyEventObject]]
  
  inline def getActionFunction[TContext, TEvent /* <: EventObject */](actionType: ActionType): js.UndefOr[(ActionObject[TContext, TEvent]) | (ActionFunction[TContext, TEvent])] = ^.asInstanceOf[js.Dynamic].applyDynamic("getActionFunction")(actionType.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[(ActionObject[TContext, TEvent]) | (ActionFunction[TContext, TEvent])]]
  inline def getActionFunction[TContext, TEvent /* <: EventObject */](actionType: ActionType, actionFunctionMap: ActionFunctionMap[TContext, TEvent]): js.UndefOr[(ActionObject[TContext, TEvent]) | (ActionFunction[TContext, TEvent])] = (^.asInstanceOf[js.Dynamic].applyDynamic("getActionFunction")(actionType.asInstanceOf[js.Any], actionFunctionMap.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[(ActionObject[TContext, TEvent]) | (ActionFunction[TContext, TEvent])]]
  
  @JSImport("xstate/lib/actions", "initEvent")
  @js.native
  val initEvent: Event[Type] = js.native
  
  inline def isActionObject[TContext, TEvent /* <: EventObject */](action: Action[TContext, TEvent]): /* is xstate.xstate/lib/types.ActionObject<TContext, TEvent> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isActionObject")(action.asInstanceOf[js.Any]).asInstanceOf[/* is xstate.xstate/lib/types.ActionObject<TContext, TEvent> */ Boolean]
  
  inline def log[TContext, TEvent /* <: EventObject */](): LogAction[TContext, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("log")().asInstanceOf[LogAction[TContext, TEvent]]
  inline def log[TContext, TEvent /* <: EventObject */](expr: String): LogAction[TContext, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(expr.asInstanceOf[js.Any]).asInstanceOf[LogAction[TContext, TEvent]]
  inline def log[TContext, TEvent /* <: EventObject */](expr: String, label: String): LogAction[TContext, TEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("log")(expr.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[LogAction[TContext, TEvent]]
  inline def log[TContext, TEvent /* <: EventObject */](expr: Unit, label: String): LogAction[TContext, TEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("log")(expr.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[LogAction[TContext, TEvent]]
  inline def log[TContext, TEvent /* <: EventObject */](expr: LogExpr[TContext, TEvent]): LogAction[TContext, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(expr.asInstanceOf[js.Any]).asInstanceOf[LogAction[TContext, TEvent]]
  inline def log[TContext, TEvent /* <: EventObject */](expr: LogExpr[TContext, TEvent], label: String): LogAction[TContext, TEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("log")(expr.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[LogAction[TContext, TEvent]]
  
  inline def pure[TContext, TEvent /* <: EventObject */](
    getActions: js.Function2[
      /* context */ TContext, 
      /* event */ TEvent, 
      js.UndefOr[SingleOrArray[ActionObject[TContext, TEvent]]]
    ]
  ): PureAction[TContext, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("pure")(getActions.asInstanceOf[js.Any]).asInstanceOf[PureAction[TContext, TEvent]]
  
  inline def raise[TContext, TEvent /* <: EventObject */](event: typings.xstate.typesMod.Event[TEvent]): RaiseAction[TEvent] | (SendAction[TContext, AnyEventObject, TEvent]) = ^.asInstanceOf[js.Dynamic].applyDynamic("raise")(event.asInstanceOf[js.Any]).asInstanceOf[RaiseAction[TEvent] | (SendAction[TContext, AnyEventObject, TEvent])]
  
  inline def resolveActions[TContext, TEvent /* <: EventObject */](
    machine: StateNode[TContext, js.Any, TEvent, ContextTContext[TContext]],
    currentState: Unit,
    currentContext: TContext,
    _event: Event[TEvent],
    actions: js.Array[ActionObject[TContext, TEvent]]
  ): js.Tuple2[js.Array[ActionObject[TContext, TEvent]], TContext] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveActions")(machine.asInstanceOf[js.Any], currentState.asInstanceOf[js.Any], currentContext.asInstanceOf[js.Any], _event.asInstanceOf[js.Any], actions.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Array[ActionObject[TContext, TEvent]], TContext]]
  inline def resolveActions[TContext, TEvent /* <: EventObject */](
    machine: StateNode[TContext, js.Any, TEvent, ContextTContext[TContext]],
    currentState: State[TContext, TEvent, js.Any, ContextTContext[TContext]],
    currentContext: TContext,
    _event: Event[TEvent],
    actions: js.Array[ActionObject[TContext, TEvent]]
  ): js.Tuple2[js.Array[ActionObject[TContext, TEvent]], TContext] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveActions")(machine.asInstanceOf[js.Any], currentState.asInstanceOf[js.Any], currentContext.asInstanceOf[js.Any], _event.asInstanceOf[js.Any], actions.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Array[ActionObject[TContext, TEvent]], TContext]]
  
  inline def resolveLog[TContext, TEvent /* <: EventObject */](action: LogAction[TContext, TEvent], ctx: TContext, _event: Event[TEvent]): LogActionObject[TContext, TEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveLog")(action.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], _event.asInstanceOf[js.Any])).asInstanceOf[LogActionObject[TContext, TEvent]]
  
  inline def resolveRaise[TEvent /* <: EventObject */](action: RaiseAction[TEvent]): RaiseActionObject[TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveRaise")(action.asInstanceOf[js.Any]).asInstanceOf[RaiseActionObject[TEvent]]
  
  inline def resolveSend[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](action: SendAction[TContext, TEvent, TSentEvent], ctx: TContext, _event: Event[TEvent]): SendActionObject[TContext, TEvent, TSentEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveSend")(action.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], _event.asInstanceOf[js.Any])).asInstanceOf[SendActionObject[TContext, TEvent, TSentEvent]]
  inline def resolveSend[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](
    action: SendAction[TContext, TEvent, TSentEvent],
    ctx: TContext,
    _event: Event[TEvent],
    delaysMap: DelayFunctionMap[TContext, TEvent]
  ): SendActionObject[TContext, TEvent, TSentEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveSend")(action.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], _event.asInstanceOf[js.Any], delaysMap.asInstanceOf[js.Any])).asInstanceOf[SendActionObject[TContext, TEvent, TSentEvent]]
  
  inline def resolveStop[TContext, TEvent /* <: EventObject */](action: StopAction[TContext, TEvent], context: TContext, _event: Event[TEvent]): StopActionObject = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveStop")(action.asInstanceOf[js.Any], context.asInstanceOf[js.Any], _event.asInstanceOf[js.Any])).asInstanceOf[StopActionObject]
  
  inline def respond[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: typings.xstate.typesMod.Event[TEvent]): SendAction[TContext, TEvent, AnyEventObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("respond")(event.asInstanceOf[js.Any]).asInstanceOf[SendAction[TContext, TEvent, AnyEventObject]]
  inline def respond[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: typings.xstate.typesMod.Event[TEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent, AnyEventObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("respond")(event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, AnyEventObject]]
  inline def respond[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: SendExpr[TContext, TEvent, TSentEvent]): SendAction[TContext, TEvent, AnyEventObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("respond")(event.asInstanceOf[js.Any]).asInstanceOf[SendAction[TContext, TEvent, AnyEventObject]]
  inline def respond[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: SendExpr[TContext, TEvent, TSentEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent, AnyEventObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("respond")(event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, AnyEventObject]]
  
  inline def send[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: typings.xstate.typesMod.Event[TSentEvent]): SendAction[TContext, TEvent, TSentEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("send")(event.asInstanceOf[js.Any]).asInstanceOf[SendAction[TContext, TEvent, TSentEvent]]
  inline def send[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: typings.xstate.typesMod.Event[TSentEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent, TSentEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("send")(event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, TSentEvent]]
  inline def send[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: SendExpr[TContext, TEvent, TSentEvent]): SendAction[TContext, TEvent, TSentEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("send")(event.asInstanceOf[js.Any]).asInstanceOf[SendAction[TContext, TEvent, TSentEvent]]
  inline def send[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: SendExpr[TContext, TEvent, TSentEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent, TSentEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("send")(event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, TSentEvent]]
  
  inline def sendParent[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: typings.xstate.typesMod.Event[TSentEvent]): SendAction[TContext, TEvent, TSentEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("sendParent")(event.asInstanceOf[js.Any]).asInstanceOf[SendAction[TContext, TEvent, TSentEvent]]
  inline def sendParent[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: typings.xstate.typesMod.Event[TSentEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent, TSentEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendParent")(event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, TSentEvent]]
  inline def sendParent[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: SendExpr[TContext, TEvent, TSentEvent]): SendAction[TContext, TEvent, TSentEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("sendParent")(event.asInstanceOf[js.Any]).asInstanceOf[SendAction[TContext, TEvent, TSentEvent]]
  inline def sendParent[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: SendExpr[TContext, TEvent, TSentEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent, TSentEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendParent")(event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, TSentEvent]]
  
  inline def sendUpdate[TContext, TEvent /* <: EventObject */](): SendAction[TContext, TEvent, TypeUpdate] = ^.asInstanceOf[js.Dynamic].applyDynamic("sendUpdate")().asInstanceOf[SendAction[TContext, TEvent, TypeUpdate]]
  
  inline def start[TContext, TEvent /* <: EventObject */](activity: String): ActivityActionObject[TContext, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(activity.asInstanceOf[js.Any]).asInstanceOf[ActivityActionObject[TContext, TEvent]]
  inline def start[TContext, TEvent /* <: EventObject */](activity: ActivityDefinition[TContext, TEvent]): ActivityActionObject[TContext, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(activity.asInstanceOf[js.Any]).asInstanceOf[ActivityActionObject[TContext, TEvent]]
  
  inline def stop[TContext, TEvent /* <: EventObject */](actorRef: String): StopAction[TContext, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")(actorRef.asInstanceOf[js.Any]).asInstanceOf[StopAction[TContext, TEvent]]
  inline def stop[TContext, TEvent /* <: EventObject */](actorRef: ActivityDefinition[TContext, TEvent]): StopAction[TContext, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")(actorRef.asInstanceOf[js.Any]).asInstanceOf[StopAction[TContext, TEvent]]
  inline def stop[TContext, TEvent /* <: EventObject */](actorRef: Expr[TContext, TEvent, String | Id]): StopAction[TContext, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")(actorRef.asInstanceOf[js.Any]).asInstanceOf[StopAction[TContext, TEvent]]
  
  inline def toActionObject[TContext, TEvent /* <: EventObject */](action: Action[TContext, TEvent]): ActionObject[TContext, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("toActionObject")(action.asInstanceOf[js.Any]).asInstanceOf[ActionObject[TContext, TEvent]]
  inline def toActionObject[TContext, TEvent /* <: EventObject */](action: Action[TContext, TEvent], actionFunctionMap: ActionFunctionMap[TContext, TEvent]): ActionObject[TContext, TEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("toActionObject")(action.asInstanceOf[js.Any], actionFunctionMap.asInstanceOf[js.Any])).asInstanceOf[ActionObject[TContext, TEvent]]
  
  inline def toActionObjects[TContext, TEvent /* <: EventObject */](): js.Array[ActionObject[TContext, TEvent]] = ^.asInstanceOf[js.Dynamic].applyDynamic("toActionObjects")().asInstanceOf[js.Array[ActionObject[TContext, TEvent]]]
  inline def toActionObjects[TContext, TEvent /* <: EventObject */](action: String): js.Array[ActionObject[TContext, TEvent]] = ^.asInstanceOf[js.Dynamic].applyDynamic("toActionObjects")(action.asInstanceOf[js.Any]).asInstanceOf[js.Array[ActionObject[TContext, TEvent]]]
  inline def toActionObjects[TContext, TEvent /* <: EventObject */](
    action: String,
    actionFunctionMap: Record[String, (ActionObject[TContext, TEvent]) | (ActionFunction[TContext, TEvent])]
  ): js.Array[ActionObject[TContext, TEvent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("toActionObjects")(action.asInstanceOf[js.Any], actionFunctionMap.asInstanceOf[js.Any])).asInstanceOf[js.Array[ActionObject[TContext, TEvent]]]
  inline def toActionObjects[TContext, TEvent /* <: EventObject */](action: js.Array[Action[TContext, TEvent]]): js.Array[ActionObject[TContext, TEvent]] = ^.asInstanceOf[js.Dynamic].applyDynamic("toActionObjects")(action.asInstanceOf[js.Any]).asInstanceOf[js.Array[ActionObject[TContext, TEvent]]]
  inline def toActionObjects[TContext, TEvent /* <: EventObject */](
    action: js.Array[Action[TContext, TEvent]],
    actionFunctionMap: Record[String, (ActionObject[TContext, TEvent]) | (ActionFunction[TContext, TEvent])]
  ): js.Array[ActionObject[TContext, TEvent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("toActionObjects")(action.asInstanceOf[js.Any], actionFunctionMap.asInstanceOf[js.Any])).asInstanceOf[js.Array[ActionObject[TContext, TEvent]]]
  inline def toActionObjects[TContext, TEvent /* <: EventObject */](
    action: Unit,
    actionFunctionMap: Record[String, (ActionObject[TContext, TEvent]) | (ActionFunction[TContext, TEvent])]
  ): js.Array[ActionObject[TContext, TEvent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("toActionObjects")(action.asInstanceOf[js.Any], actionFunctionMap.asInstanceOf[js.Any])).asInstanceOf[js.Array[ActionObject[TContext, TEvent]]]
  inline def toActionObjects[TContext, TEvent /* <: EventObject */](action: ActionFunction[TContext, TEvent]): js.Array[ActionObject[TContext, TEvent]] = ^.asInstanceOf[js.Dynamic].applyDynamic("toActionObjects")(action.asInstanceOf[js.Any]).asInstanceOf[js.Array[ActionObject[TContext, TEvent]]]
  inline def toActionObjects[TContext, TEvent /* <: EventObject */](
    action: ActionFunction[TContext, TEvent],
    actionFunctionMap: Record[String, (ActionObject[TContext, TEvent]) | (ActionFunction[TContext, TEvent])]
  ): js.Array[ActionObject[TContext, TEvent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("toActionObjects")(action.asInstanceOf[js.Any], actionFunctionMap.asInstanceOf[js.Any])).asInstanceOf[js.Array[ActionObject[TContext, TEvent]]]
  inline def toActionObjects[TContext, TEvent /* <: EventObject */](action: ActionObject[TContext, TEvent]): js.Array[ActionObject[TContext, TEvent]] = ^.asInstanceOf[js.Dynamic].applyDynamic("toActionObjects")(action.asInstanceOf[js.Any]).asInstanceOf[js.Array[ActionObject[TContext, TEvent]]]
  inline def toActionObjects[TContext, TEvent /* <: EventObject */](
    action: ActionObject[TContext, TEvent],
    actionFunctionMap: Record[String, (ActionObject[TContext, TEvent]) | (ActionFunction[TContext, TEvent])]
  ): js.Array[ActionObject[TContext, TEvent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("toActionObjects")(action.asInstanceOf[js.Any], actionFunctionMap.asInstanceOf[js.Any])).asInstanceOf[js.Array[ActionObject[TContext, TEvent]]]
  
  inline def toActivityDefinition[TContext, TEvent /* <: EventObject */](action: String): ActivityDefinition[TContext, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("toActivityDefinition")(action.asInstanceOf[js.Any]).asInstanceOf[ActivityDefinition[TContext, TEvent]]
  inline def toActivityDefinition[TContext, TEvent /* <: EventObject */](action: ActivityDefinition[TContext, TEvent]): ActivityDefinition[TContext, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("toActivityDefinition")(action.asInstanceOf[js.Any]).asInstanceOf[ActivityDefinition[TContext, TEvent]]
}

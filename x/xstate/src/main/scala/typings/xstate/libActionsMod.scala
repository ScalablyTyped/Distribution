package typings.xstate

import typings.xstate.anon.Actions
import typings.xstate.anon.Id
import typings.xstate.anon.Type
import typings.xstate.libStateMod.State
import typings.xstate.libStateNodeMod.StateNode
import typings.xstate.libTypesMod.Action
import typings.xstate.libTypesMod.ActionFunction
import typings.xstate.libTypesMod.ActionFunctionMap
import typings.xstate.libTypesMod.ActionObject
import typings.xstate.libTypesMod.ActionType
import typings.xstate.libTypesMod.ActivityActionObject
import typings.xstate.libTypesMod.ActivityDefinition
import typings.xstate.libTypesMod.AnyActorRef
import typings.xstate.libTypesMod.AnyEventObject
import typings.xstate.libTypesMod.AssignAction
import typings.xstate.libTypesMod.Assigner
import typings.xstate.libTypesMod.BaseActionObject
import typings.xstate.libTypesMod.CancelAction
import typings.xstate.libTypesMod.Cast
import typings.xstate.libTypesMod.ChooseAction
import typings.xstate.libTypesMod.ChooseCondition
import typings.xstate.libTypesMod.DelayFunctionMap
import typings.xstate.libTypesMod.DoneEvent
import typings.xstate.libTypesMod.DoneEventObject
import typings.xstate.libTypesMod.ErrorPlatformEvent
import typings.xstate.libTypesMod.EventFrom
import typings.xstate.libTypesMod.EventObject
import typings.xstate.libTypesMod.Expr
import typings.xstate.libTypesMod.ExprWithMeta
import typings.xstate.libTypesMod.LogAction
import typings.xstate.libTypesMod.LogActionObject
import typings.xstate.libTypesMod.LogExpr
import typings.xstate.libTypesMod.LowInfer
import typings.xstate.libTypesMod.NoInfer
import typings.xstate.libTypesMod.PredictableActionArgumentsExec
import typings.xstate.libTypesMod.PropertyAssigner
import typings.xstate.libTypesMod.PureAction
import typings.xstate.libTypesMod.RaiseAction
import typings.xstate.libTypesMod.RaiseActionObject
import typings.xstate.libTypesMod.RaiseActionOptions
import typings.xstate.libTypesMod.ResolveEventType
import typings.xstate.libTypesMod.SCXML.Event
import typings.xstate.libTypesMod.SendAction
import typings.xstate.libTypesMod.SendActionObject
import typings.xstate.libTypesMod.SendActionOptions
import typings.xstate.libTypesMod.SendExpr
import typings.xstate.libTypesMod.SingleOrArray
import typings.xstate.libTypesMod.StopAction
import typings.xstate.libTypesMod.StopActionObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libActionsMod {
  
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
  
  inline def assign[TContext, TExpressionEvent /* <: EventObject */, TEvent /* <: EventObject */](assignment: Assigner[LowInfer[TContext], TExpressionEvent]): AssignAction[TContext, TExpressionEvent, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("assign")(assignment.asInstanceOf[js.Any]).asInstanceOf[AssignAction[TContext, TExpressionEvent, TEvent]]
  inline def assign[TContext, TExpressionEvent /* <: EventObject */, TEvent /* <: EventObject */](assignment: PropertyAssigner[LowInfer[TContext], TExpressionEvent]): AssignAction[TContext, TExpressionEvent, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("assign")(assignment.asInstanceOf[js.Any]).asInstanceOf[AssignAction[TContext, TExpressionEvent, TEvent]]
  
  inline def cancel[TContext, TExpressionEvent /* <: EventObject */, TEvent /* <: EventObject */](sendId: String): CancelAction[TContext, TExpressionEvent, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("cancel")(sendId.asInstanceOf[js.Any]).asInstanceOf[CancelAction[TContext, TExpressionEvent, TEvent]]
  inline def cancel[TContext, TExpressionEvent /* <: EventObject */, TEvent /* <: EventObject */](sendId: Double): CancelAction[TContext, TExpressionEvent, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("cancel")(sendId.asInstanceOf[js.Any]).asInstanceOf[CancelAction[TContext, TExpressionEvent, TEvent]]
  
  inline def choose[TContext, TExpressionEvent /* <: EventObject */, TEvent /* <: EventObject */](conds: js.Array[ChooseCondition[TContext, TExpressionEvent, TEvent]]): ChooseAction[TContext, TExpressionEvent, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("choose")(conds.asInstanceOf[js.Any]).asInstanceOf[ChooseAction[TContext, TExpressionEvent, TEvent]]
  
  inline def done(id: String): DoneEventObject = ^.asInstanceOf[js.Dynamic].applyDynamic("done")(id.asInstanceOf[js.Any]).asInstanceOf[DoneEventObject]
  inline def done(id: String, data: Any): DoneEventObject = (^.asInstanceOf[js.Dynamic].applyDynamic("done")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[DoneEventObject]
  
  inline def doneInvoke(id: String): DoneEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("doneInvoke")(id.asInstanceOf[js.Any]).asInstanceOf[DoneEvent]
  inline def doneInvoke(id: String, data: Any): DoneEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("doneInvoke")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[DoneEvent]
  
  inline def error(id: String): ErrorPlatformEvent & String = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(id.asInstanceOf[js.Any]).asInstanceOf[ErrorPlatformEvent & String]
  inline def error(id: String, data: Any): ErrorPlatformEvent & String = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[ErrorPlatformEvent & String]
  
  inline def escalate[TContext, TEvent /* <: EventObject */, TErrorData](errorData: TErrorData): SendAction[TContext, TEvent, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("escalate")(errorData.asInstanceOf[js.Any]).asInstanceOf[SendAction[TContext, TEvent, Any]]
  inline def escalate[TContext, TEvent /* <: EventObject */, TErrorData](errorData: TErrorData, options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("escalate")(errorData.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, Any]]
  inline def escalate[TContext, TEvent /* <: EventObject */, TErrorData](errorData: ExprWithMeta[TContext, TEvent, TErrorData]): SendAction[TContext, TEvent, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("escalate")(errorData.asInstanceOf[js.Any]).asInstanceOf[SendAction[TContext, TEvent, Any]]
  inline def escalate[TContext, TEvent /* <: EventObject */, TErrorData](
    errorData: ExprWithMeta[TContext, TEvent, TErrorData],
    options: SendActionOptions[TContext, TEvent]
  ): SendAction[TContext, TEvent, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("escalate")(errorData.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, Any]]
  
  inline def forwardTo_to[TContext, TEvent /* <: EventObject */](
    target: /* import warning: importer.ImportType#apply Failed type conversion: std.Required<xstate.xstate/lib/types.SendActionOptions<TContext, TEvent>>['to'] */ js.Any
  ): SendAction[TContext, TEvent, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("forwardTo")(target.asInstanceOf[js.Any]).asInstanceOf[SendAction[TContext, TEvent, Any]]
  inline def forwardTo_to[TContext, TEvent /* <: EventObject */](
    target: /* import warning: importer.ImportType#apply Failed type conversion: std.Required<xstate.xstate/lib/types.SendActionOptions<TContext, TEvent>>['to'] */ js.Any,
    options: SendActionOptions[TContext, TEvent]
  ): SendAction[TContext, TEvent, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("forwardTo")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, Any]]
  
  inline def getActionFunction[TContext, TEvent /* <: EventObject */](actionType: ActionType): js.UndefOr[
    (ActionObject[TContext, TEvent, TEvent, BaseActionObject]) | (ActionFunction[TContext, TEvent, BaseActionObject, TEvent])
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getActionFunction")(actionType.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[
    (ActionObject[TContext, TEvent, TEvent, BaseActionObject]) | (ActionFunction[TContext, TEvent, BaseActionObject, TEvent])
  ]]
  inline def getActionFunction[TContext, TEvent /* <: EventObject */](actionType: ActionType, actionFunctionMap: ActionFunctionMap[TContext, TEvent, BaseActionObject]): js.UndefOr[
    (ActionObject[TContext, TEvent, TEvent, BaseActionObject]) | (ActionFunction[TContext, TEvent, BaseActionObject, TEvent])
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("getActionFunction")(actionType.asInstanceOf[js.Any], actionFunctionMap.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
    (ActionObject[TContext, TEvent, TEvent, BaseActionObject]) | (ActionFunction[TContext, TEvent, BaseActionObject, TEvent])
  ]]
  
  @JSImport("xstate/lib/actions", "initEvent")
  @js.native
  val initEvent: Event[Type] = js.native
  
  inline def isActionObject[TContext, TEvent /* <: EventObject */](action: Action[TContext, TEvent, TEvent]): /* is xstate.xstate/lib/types.ActionObject<TContext, TEvent, TEvent, xstate.xstate/lib/types.BaseActionObject> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isActionObject")(action.asInstanceOf[js.Any]).asInstanceOf[/* is xstate.xstate/lib/types.ActionObject<TContext, TEvent, TEvent, xstate.xstate/lib/types.BaseActionObject> */ Boolean]
  
  inline def log[TContext, TExpressionEvent /* <: EventObject */, TEvent /* <: EventObject */](): LogAction[TContext, TExpressionEvent, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("log")().asInstanceOf[LogAction[TContext, TExpressionEvent, TEvent]]
  inline def log[TContext, TExpressionEvent /* <: EventObject */, TEvent /* <: EventObject */](expr: String): LogAction[TContext, TExpressionEvent, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(expr.asInstanceOf[js.Any]).asInstanceOf[LogAction[TContext, TExpressionEvent, TEvent]]
  inline def log[TContext, TExpressionEvent /* <: EventObject */, TEvent /* <: EventObject */](expr: String, label: String): LogAction[TContext, TExpressionEvent, TEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("log")(expr.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[LogAction[TContext, TExpressionEvent, TEvent]]
  inline def log[TContext, TExpressionEvent /* <: EventObject */, TEvent /* <: EventObject */](expr: Unit, label: String): LogAction[TContext, TExpressionEvent, TEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("log")(expr.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[LogAction[TContext, TExpressionEvent, TEvent]]
  inline def log[TContext, TExpressionEvent /* <: EventObject */, TEvent /* <: EventObject */](expr: LogExpr[TContext, TExpressionEvent]): LogAction[TContext, TExpressionEvent, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(expr.asInstanceOf[js.Any]).asInstanceOf[LogAction[TContext, TExpressionEvent, TEvent]]
  inline def log[TContext, TExpressionEvent /* <: EventObject */, TEvent /* <: EventObject */](expr: LogExpr[TContext, TExpressionEvent], label: String): LogAction[TContext, TExpressionEvent, TEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("log")(expr.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[LogAction[TContext, TExpressionEvent, TEvent]]
  
  inline def pure[TContext, TExpressionEvent /* <: EventObject */, TEvent /* <: EventObject */](
    getActions: js.Function2[
      /* context */ TContext, 
      /* event */ TExpressionEvent, 
      js.UndefOr[
        SingleOrArray[
          BaseActionObject | String | (ActionObject[TContext, TExpressionEvent, TEvent, BaseActionObject])
        ]
      ]
    ]
  ): PureAction[TContext, TExpressionEvent, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("pure")(getActions.asInstanceOf[js.Any]).asInstanceOf[PureAction[TContext, TExpressionEvent, TEvent]]
  
  inline def raise[TContext, TExpressionEvent /* <: EventObject */, TEvent /* <: EventObject */](event: NoInfer[typings.xstate.libTypesMod.Event[TEvent]]): RaiseAction[TContext, TExpressionEvent, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("raise")(event.asInstanceOf[js.Any]).asInstanceOf[RaiseAction[TContext, TExpressionEvent, TEvent]]
  inline def raise[TContext, TExpressionEvent /* <: EventObject */, TEvent /* <: EventObject */](
    event: NoInfer[typings.xstate.libTypesMod.Event[TEvent]],
    options: RaiseActionOptions[TContext, TExpressionEvent]
  ): RaiseAction[TContext, TExpressionEvent, TEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("raise")(event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RaiseAction[TContext, TExpressionEvent, TEvent]]
  inline def raise[TContext, TExpressionEvent /* <: EventObject */, TEvent /* <: EventObject */](event: SendExpr[TContext, TExpressionEvent, TEvent]): RaiseAction[TContext, TExpressionEvent, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("raise")(event.asInstanceOf[js.Any]).asInstanceOf[RaiseAction[TContext, TExpressionEvent, TEvent]]
  inline def raise[TContext, TExpressionEvent /* <: EventObject */, TEvent /* <: EventObject */](
    event: SendExpr[TContext, TExpressionEvent, TEvent],
    options: RaiseActionOptions[TContext, TExpressionEvent]
  ): RaiseAction[TContext, TExpressionEvent, TEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("raise")(event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RaiseAction[TContext, TExpressionEvent, TEvent]]
  
  inline def resolveActions[TContext, TEvent /* <: EventObject */](
    machine: StateNode[TContext, Any, TEvent, Any, Any, Any],
    currentState: Unit,
    currentContext: TContext,
    _event: Event[TEvent],
    actionBlocks: js.Array[Actions[TContext, TEvent]]
  ): js.Tuple2[js.Array[ActionObject[TContext, TEvent, TEvent, BaseActionObject]], TContext] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveActions")(machine.asInstanceOf[js.Any], currentState.asInstanceOf[js.Any], currentContext.asInstanceOf[js.Any], _event.asInstanceOf[js.Any], actionBlocks.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Array[ActionObject[TContext, TEvent, TEvent, BaseActionObject]], TContext]]
  inline def resolveActions[TContext, TEvent /* <: EventObject */](
    machine: StateNode[TContext, Any, TEvent, Any, Any, Any],
    currentState: Unit,
    currentContext: TContext,
    _event: Event[TEvent],
    actionBlocks: js.Array[Actions[TContext, TEvent]],
    predictableExec: Unit,
    preserveActionOrder: Boolean
  ): js.Tuple2[js.Array[ActionObject[TContext, TEvent, TEvent, BaseActionObject]], TContext] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveActions")(machine.asInstanceOf[js.Any], currentState.asInstanceOf[js.Any], currentContext.asInstanceOf[js.Any], _event.asInstanceOf[js.Any], actionBlocks.asInstanceOf[js.Any], predictableExec.asInstanceOf[js.Any], preserveActionOrder.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Array[ActionObject[TContext, TEvent, TEvent, BaseActionObject]], TContext]]
  inline def resolveActions[TContext, TEvent /* <: EventObject */](
    machine: StateNode[TContext, Any, TEvent, Any, Any, Any],
    currentState: Unit,
    currentContext: TContext,
    _event: Event[TEvent],
    actionBlocks: js.Array[Actions[TContext, TEvent]],
    predictableExec: PredictableActionArgumentsExec
  ): js.Tuple2[js.Array[ActionObject[TContext, TEvent, TEvent, BaseActionObject]], TContext] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveActions")(machine.asInstanceOf[js.Any], currentState.asInstanceOf[js.Any], currentContext.asInstanceOf[js.Any], _event.asInstanceOf[js.Any], actionBlocks.asInstanceOf[js.Any], predictableExec.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Array[ActionObject[TContext, TEvent, TEvent, BaseActionObject]], TContext]]
  inline def resolveActions[TContext, TEvent /* <: EventObject */](
    machine: StateNode[TContext, Any, TEvent, Any, Any, Any],
    currentState: Unit,
    currentContext: TContext,
    _event: Event[TEvent],
    actionBlocks: js.Array[Actions[TContext, TEvent]],
    predictableExec: PredictableActionArgumentsExec,
    preserveActionOrder: Boolean
  ): js.Tuple2[js.Array[ActionObject[TContext, TEvent, TEvent, BaseActionObject]], TContext] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveActions")(machine.asInstanceOf[js.Any], currentState.asInstanceOf[js.Any], currentContext.asInstanceOf[js.Any], _event.asInstanceOf[js.Any], actionBlocks.asInstanceOf[js.Any], predictableExec.asInstanceOf[js.Any], preserveActionOrder.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Array[ActionObject[TContext, TEvent, TEvent, BaseActionObject]], TContext]]
  inline def resolveActions[TContext, TEvent /* <: EventObject */](
    machine: StateNode[TContext, Any, TEvent, Any, Any, Any],
    currentState: State[TContext, TEvent, Any, Any, Any],
    currentContext: TContext,
    _event: Event[TEvent],
    actionBlocks: js.Array[Actions[TContext, TEvent]]
  ): js.Tuple2[js.Array[ActionObject[TContext, TEvent, TEvent, BaseActionObject]], TContext] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveActions")(machine.asInstanceOf[js.Any], currentState.asInstanceOf[js.Any], currentContext.asInstanceOf[js.Any], _event.asInstanceOf[js.Any], actionBlocks.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Array[ActionObject[TContext, TEvent, TEvent, BaseActionObject]], TContext]]
  inline def resolveActions[TContext, TEvent /* <: EventObject */](
    machine: StateNode[TContext, Any, TEvent, Any, Any, Any],
    currentState: State[TContext, TEvent, Any, Any, Any],
    currentContext: TContext,
    _event: Event[TEvent],
    actionBlocks: js.Array[Actions[TContext, TEvent]],
    predictableExec: Unit,
    preserveActionOrder: Boolean
  ): js.Tuple2[js.Array[ActionObject[TContext, TEvent, TEvent, BaseActionObject]], TContext] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveActions")(machine.asInstanceOf[js.Any], currentState.asInstanceOf[js.Any], currentContext.asInstanceOf[js.Any], _event.asInstanceOf[js.Any], actionBlocks.asInstanceOf[js.Any], predictableExec.asInstanceOf[js.Any], preserveActionOrder.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Array[ActionObject[TContext, TEvent, TEvent, BaseActionObject]], TContext]]
  inline def resolveActions[TContext, TEvent /* <: EventObject */](
    machine: StateNode[TContext, Any, TEvent, Any, Any, Any],
    currentState: State[TContext, TEvent, Any, Any, Any],
    currentContext: TContext,
    _event: Event[TEvent],
    actionBlocks: js.Array[Actions[TContext, TEvent]],
    predictableExec: PredictableActionArgumentsExec
  ): js.Tuple2[js.Array[ActionObject[TContext, TEvent, TEvent, BaseActionObject]], TContext] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveActions")(machine.asInstanceOf[js.Any], currentState.asInstanceOf[js.Any], currentContext.asInstanceOf[js.Any], _event.asInstanceOf[js.Any], actionBlocks.asInstanceOf[js.Any], predictableExec.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Array[ActionObject[TContext, TEvent, TEvent, BaseActionObject]], TContext]]
  inline def resolveActions[TContext, TEvent /* <: EventObject */](
    machine: StateNode[TContext, Any, TEvent, Any, Any, Any],
    currentState: State[TContext, TEvent, Any, Any, Any],
    currentContext: TContext,
    _event: Event[TEvent],
    actionBlocks: js.Array[Actions[TContext, TEvent]],
    predictableExec: PredictableActionArgumentsExec,
    preserveActionOrder: Boolean
  ): js.Tuple2[js.Array[ActionObject[TContext, TEvent, TEvent, BaseActionObject]], TContext] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveActions")(machine.asInstanceOf[js.Any], currentState.asInstanceOf[js.Any], currentContext.asInstanceOf[js.Any], _event.asInstanceOf[js.Any], actionBlocks.asInstanceOf[js.Any], predictableExec.asInstanceOf[js.Any], preserveActionOrder.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Array[ActionObject[TContext, TEvent, TEvent, BaseActionObject]], TContext]]
  
  inline def resolveLog[TContext, TEvent /* <: EventObject */](action: LogAction[TContext, TEvent, TEvent], ctx: TContext, _event: Event[TEvent]): LogActionObject[TContext, TEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveLog")(action.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], _event.asInstanceOf[js.Any])).asInstanceOf[LogActionObject[TContext, TEvent]]
  
  inline def resolveRaise[TContext, TEvent /* <: EventObject */, TExpressionEvent /* <: EventObject */](
    action: RaiseAction[TContext, TExpressionEvent, TEvent],
    ctx: TContext,
    _event: Event[TExpressionEvent]
  ): RaiseActionObject[TContext, TExpressionEvent, TEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveRaise")(action.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], _event.asInstanceOf[js.Any])).asInstanceOf[RaiseActionObject[TContext, TExpressionEvent, TEvent]]
  inline def resolveRaise[TContext, TEvent /* <: EventObject */, TExpressionEvent /* <: EventObject */](
    action: RaiseAction[TContext, TExpressionEvent, TEvent],
    ctx: TContext,
    _event: Event[TExpressionEvent],
    delaysMap: DelayFunctionMap[TContext, TEvent]
  ): RaiseActionObject[TContext, TExpressionEvent, TEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveRaise")(action.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], _event.asInstanceOf[js.Any], delaysMap.asInstanceOf[js.Any])).asInstanceOf[RaiseActionObject[TContext, TExpressionEvent, TEvent]]
  
  inline def resolveSend[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](action: SendAction[TContext, TEvent, TSentEvent], ctx: TContext, _event: Event[TEvent]): SendActionObject[TContext, TEvent, TSentEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveSend")(action.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], _event.asInstanceOf[js.Any])).asInstanceOf[SendActionObject[TContext, TEvent, TSentEvent]]
  inline def resolveSend[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](
    action: SendAction[TContext, TEvent, TSentEvent],
    ctx: TContext,
    _event: Event[TEvent],
    delaysMap: DelayFunctionMap[TContext, TEvent]
  ): SendActionObject[TContext, TEvent, TSentEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveSend")(action.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], _event.asInstanceOf[js.Any], delaysMap.asInstanceOf[js.Any])).asInstanceOf[SendActionObject[TContext, TEvent, TSentEvent]]
  
  inline def resolveStop[TContext, TEvent /* <: EventObject */](action: StopAction[TContext, TEvent, TEvent], context: TContext, _event: Event[TEvent]): StopActionObject = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveStop")(action.asInstanceOf[js.Any], context.asInstanceOf[js.Any], _event.asInstanceOf[js.Any])).asInstanceOf[StopActionObject]
  
  inline def respond[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: typings.xstate.libTypesMod.Event[TEvent]): SendAction[TContext, TEvent, AnyEventObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("respond")(event.asInstanceOf[js.Any]).asInstanceOf[SendAction[TContext, TEvent, AnyEventObject]]
  inline def respond[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: typings.xstate.libTypesMod.Event[TEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent, AnyEventObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("respond")(event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, AnyEventObject]]
  inline def respond[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: SendExpr[TContext, TEvent, TSentEvent]): SendAction[TContext, TEvent, AnyEventObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("respond")(event.asInstanceOf[js.Any]).asInstanceOf[SendAction[TContext, TEvent, AnyEventObject]]
  inline def respond[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: SendExpr[TContext, TEvent, TSentEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent, AnyEventObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("respond")(event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, AnyEventObject]]
  
  inline def send[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: typings.xstate.libTypesMod.Event[AnyEventObject]): SendAction[TContext, TEvent, TSentEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("send")(event.asInstanceOf[js.Any]).asInstanceOf[SendAction[TContext, TEvent, TSentEvent]]
  inline def send[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](
    event: typings.xstate.libTypesMod.Event[AnyEventObject],
    options: SendActionOptions[TContext, TEvent]
  ): SendAction[TContext, TEvent, TSentEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("send")(event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, TSentEvent]]
  inline def send[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: SendExpr[TContext, TEvent, AnyEventObject]): SendAction[TContext, TEvent, TSentEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("send")(event.asInstanceOf[js.Any]).asInstanceOf[SendAction[TContext, TEvent, TSentEvent]]
  inline def send[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: SendExpr[TContext, TEvent, AnyEventObject], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent, TSentEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("send")(event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, TSentEvent]]
  
  inline def sendParent[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: typings.xstate.libTypesMod.Event[AnyEventObject]): SendAction[TContext, TEvent, TSentEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("sendParent")(event.asInstanceOf[js.Any]).asInstanceOf[SendAction[TContext, TEvent, TSentEvent]]
  inline def sendParent[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](
    event: typings.xstate.libTypesMod.Event[AnyEventObject],
    options: SendActionOptions[TContext, TEvent]
  ): SendAction[TContext, TEvent, TSentEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendParent")(event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, TSentEvent]]
  inline def sendParent[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: SendExpr[TContext, TEvent, AnyEventObject]): SendAction[TContext, TEvent, TSentEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("sendParent")(event.asInstanceOf[js.Any]).asInstanceOf[SendAction[TContext, TEvent, TSentEvent]]
  inline def sendParent[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: SendExpr[TContext, TEvent, AnyEventObject], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent, TSentEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendParent")(event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, TSentEvent]]
  
  inline def sendTo[TContext, TEvent /* <: EventObject */, TActor /* <: AnyActorRef */](actor: TActor, event: EventFrom[TActor, scala.Nothing, ResolveEventType[TActor]]): SendAction[TContext, TEvent, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendTo")(actor.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, Any]]
  inline def sendTo[TContext, TEvent /* <: EventObject */, TActor /* <: AnyActorRef */](
    actor: TActor,
    event: EventFrom[TActor, scala.Nothing, ResolveEventType[TActor]],
    options: SendActionOptions[TContext, TEvent]
  ): SendAction[TContext, TEvent, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendTo")(actor.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, Any]]
  inline def sendTo[TContext, TEvent /* <: EventObject */, TActor /* <: AnyActorRef */](
    actor: TActor,
    event: SendExpr[
      TContext, 
      TEvent, 
      InferEvent[Cast[EventFrom[TActor, scala.Nothing, ResolveEventType[TActor]], EventObject]]
    ]
  ): SendAction[TContext, TEvent, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendTo")(actor.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, Any]]
  inline def sendTo[TContext, TEvent /* <: EventObject */, TActor /* <: AnyActorRef */](
    actor: TActor,
    event: SendExpr[
      TContext, 
      TEvent, 
      InferEvent[Cast[EventFrom[TActor, scala.Nothing, ResolveEventType[TActor]], EventObject]]
    ],
    options: SendActionOptions[TContext, TEvent]
  ): SendAction[TContext, TEvent, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendTo")(actor.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, Any]]
  inline def sendTo[TContext, TEvent /* <: EventObject */, TActor /* <: AnyActorRef */](actor: String, event: EventFrom[TActor, scala.Nothing, ResolveEventType[TActor]]): SendAction[TContext, TEvent, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendTo")(actor.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, Any]]
  inline def sendTo[TContext, TEvent /* <: EventObject */, TActor /* <: AnyActorRef */](
    actor: String,
    event: EventFrom[TActor, scala.Nothing, ResolveEventType[TActor]],
    options: SendActionOptions[TContext, TEvent]
  ): SendAction[TContext, TEvent, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendTo")(actor.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, Any]]
  inline def sendTo[TContext, TEvent /* <: EventObject */, TActor /* <: AnyActorRef */](
    actor: String,
    event: SendExpr[
      TContext, 
      TEvent, 
      InferEvent[Cast[EventFrom[TActor, scala.Nothing, ResolveEventType[TActor]], EventObject]]
    ]
  ): SendAction[TContext, TEvent, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendTo")(actor.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, Any]]
  inline def sendTo[TContext, TEvent /* <: EventObject */, TActor /* <: AnyActorRef */](
    actor: String,
    event: SendExpr[
      TContext, 
      TEvent, 
      InferEvent[Cast[EventFrom[TActor, scala.Nothing, ResolveEventType[TActor]], EventObject]]
    ],
    options: SendActionOptions[TContext, TEvent]
  ): SendAction[TContext, TEvent, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendTo")(actor.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, Any]]
  inline def sendTo[TContext, TEvent /* <: EventObject */, TActor /* <: AnyActorRef */](
    actor: js.Function2[/* ctx */ TContext, /* event */ TEvent, TActor],
    event: EventFrom[TActor, scala.Nothing, ResolveEventType[TActor]]
  ): SendAction[TContext, TEvent, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendTo")(actor.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, Any]]
  inline def sendTo[TContext, TEvent /* <: EventObject */, TActor /* <: AnyActorRef */](
    actor: js.Function2[/* ctx */ TContext, /* event */ TEvent, TActor],
    event: EventFrom[TActor, scala.Nothing, ResolveEventType[TActor]],
    options: SendActionOptions[TContext, TEvent]
  ): SendAction[TContext, TEvent, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendTo")(actor.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, Any]]
  inline def sendTo[TContext, TEvent /* <: EventObject */, TActor /* <: AnyActorRef */](
    actor: js.Function2[/* ctx */ TContext, /* event */ TEvent, TActor],
    event: SendExpr[
      TContext, 
      TEvent, 
      InferEvent[Cast[EventFrom[TActor, scala.Nothing, ResolveEventType[TActor]], EventObject]]
    ]
  ): SendAction[TContext, TEvent, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendTo")(actor.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, Any]]
  inline def sendTo[TContext, TEvent /* <: EventObject */, TActor /* <: AnyActorRef */](
    actor: js.Function2[/* ctx */ TContext, /* event */ TEvent, TActor],
    event: SendExpr[
      TContext, 
      TEvent, 
      InferEvent[Cast[EventFrom[TActor, scala.Nothing, ResolveEventType[TActor]], EventObject]]
    ],
    options: SendActionOptions[TContext, TEvent]
  ): SendAction[TContext, TEvent, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendTo")(actor.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SendAction[TContext, TEvent, Any]]
  
  inline def sendUpdate[TContext, TEvent /* <: EventObject */](): SendAction[TContext, TEvent, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("sendUpdate")().asInstanceOf[SendAction[TContext, TEvent, Any]]
  
  inline def start[TContext, TEvent /* <: EventObject */](activity: String): ActivityActionObject[TContext, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(activity.asInstanceOf[js.Any]).asInstanceOf[ActivityActionObject[TContext, TEvent]]
  inline def start[TContext, TEvent /* <: EventObject */](activity: ActivityDefinition[TContext, TEvent]): ActivityActionObject[TContext, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(activity.asInstanceOf[js.Any]).asInstanceOf[ActivityActionObject[TContext, TEvent]]
  
  inline def stop[TContext, TExpressionEvent /* <: EventObject */, TEvent /* <: EventObject */](actorRef: String): StopAction[TContext, TExpressionEvent, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")(actorRef.asInstanceOf[js.Any]).asInstanceOf[StopAction[TContext, TExpressionEvent, TEvent]]
  inline def stop[TContext, TExpressionEvent /* <: EventObject */, TEvent /* <: EventObject */](actorRef: Expr[TContext, TExpressionEvent, String | Id]): StopAction[TContext, TExpressionEvent, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")(actorRef.asInstanceOf[js.Any]).asInstanceOf[StopAction[TContext, TExpressionEvent, TEvent]]
  
  inline def toActionObject[TContext, TEvent /* <: EventObject */](action: Action[TContext, TEvent, TEvent]): ActionObject[TContext, TEvent, TEvent, BaseActionObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("toActionObject")(action.asInstanceOf[js.Any]).asInstanceOf[ActionObject[TContext, TEvent, TEvent, BaseActionObject]]
  inline def toActionObject[TContext, TEvent /* <: EventObject */](
    action: Action[TContext, TEvent, TEvent],
    actionFunctionMap: ActionFunctionMap[TContext, TEvent, BaseActionObject]
  ): ActionObject[TContext, TEvent, TEvent, BaseActionObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("toActionObject")(action.asInstanceOf[js.Any], actionFunctionMap.asInstanceOf[js.Any])).asInstanceOf[ActionObject[TContext, TEvent, TEvent, BaseActionObject]]
  
  inline def toActionObjects[TContext, TEvent /* <: EventObject */](): js.Array[ActionObject[TContext, TEvent, TEvent, BaseActionObject]] = ^.asInstanceOf[js.Dynamic].applyDynamic("toActionObjects")().asInstanceOf[js.Array[ActionObject[TContext, TEvent, TEvent, BaseActionObject]]]
  inline def toActionObjects[TContext, TEvent /* <: EventObject */](action: Unit, actionFunctionMap: ActionFunctionMap[TContext, TEvent, BaseActionObject]): js.Array[ActionObject[TContext, TEvent, TEvent, BaseActionObject]] = (^.asInstanceOf[js.Dynamic].applyDynamic("toActionObjects")(action.asInstanceOf[js.Any], actionFunctionMap.asInstanceOf[js.Any])).asInstanceOf[js.Array[ActionObject[TContext, TEvent, TEvent, BaseActionObject]]]
  inline def toActionObjects[TContext, TEvent /* <: EventObject */](action: SingleOrArray[Action[TContext, TEvent, TEvent]]): js.Array[ActionObject[TContext, TEvent, TEvent, BaseActionObject]] = ^.asInstanceOf[js.Dynamic].applyDynamic("toActionObjects")(action.asInstanceOf[js.Any]).asInstanceOf[js.Array[ActionObject[TContext, TEvent, TEvent, BaseActionObject]]]
  inline def toActionObjects[TContext, TEvent /* <: EventObject */](
    action: SingleOrArray[Action[TContext, TEvent, TEvent]],
    actionFunctionMap: ActionFunctionMap[TContext, TEvent, BaseActionObject]
  ): js.Array[ActionObject[TContext, TEvent, TEvent, BaseActionObject]] = (^.asInstanceOf[js.Dynamic].applyDynamic("toActionObjects")(action.asInstanceOf[js.Any], actionFunctionMap.asInstanceOf[js.Any])).asInstanceOf[js.Array[ActionObject[TContext, TEvent, TEvent, BaseActionObject]]]
  
  inline def toActivityDefinition[TContext, TEvent /* <: EventObject */](action: String): ActivityDefinition[TContext, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("toActivityDefinition")(action.asInstanceOf[js.Any]).asInstanceOf[ActivityDefinition[TContext, TEvent]]
  inline def toActivityDefinition[TContext, TEvent /* <: EventObject */](action: ActivityDefinition[TContext, TEvent]): ActivityDefinition[TContext, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("toActivityDefinition")(action.asInstanceOf[js.Any]).asInstanceOf[ActivityDefinition[TContext, TEvent]]
  
  type InferEvent[E /* <: EventObject */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ T in E['type'] ]: {  type :T} & std.Extract<E, {  type :T}>}[E['type']] */ js.Any
}

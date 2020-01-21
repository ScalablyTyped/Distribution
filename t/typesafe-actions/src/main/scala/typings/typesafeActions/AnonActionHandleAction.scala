package typings.typesafeActions

import typings.std.Exclude
import typings.std.Record
import typings.std.ReturnType
import typings.typesafeActions.typeHelpersMod.Action
import typings.typesafeActions.typeHelpersMod.TypeConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActionHandleAction[TRootAction /* <: Action[TypeConstant] */, TNextNotHandledAction /* <: Exclude[TPrevNotHandledAction, Action[TType] with ReturnType[TCreator]] */, TState] extends js.Object {
  var handleAction: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias typesafe-actions.typesafe-actions/dist/create-reducer.CreateReducerChainApi<TState, TNextNotHandledAction, TRootAction> */ js.Object
  var handlers: Record[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Exclude<TRootAction, TNextNotHandledAction>['type'] */ js.Any, 
    js.Function2[/* state */ TState, /* action */ TRootAction, TState]
  ]
}

object AnonActionHandleAction {
  @scala.inline
  def apply[TRootAction /* <: Action[TypeConstant] */, TNextNotHandledAction /* <: Exclude[TPrevNotHandledAction, Action[TType] with ReturnType[TCreator]] */, TState](
    handleAction: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias typesafe-actions.typesafe-actions/dist/create-reducer.CreateReducerChainApi<TState, TNextNotHandledAction, TRootAction> */ js.Object,
    handlers: Record[
      /* import warning: importer.ImportType#apply Failed type conversion: std.Exclude<TRootAction, TNextNotHandledAction>['type'] */ js.Any, 
      js.Function2[/* state */ TState, /* action */ TRootAction, TState]
    ]
  ): AnonActionHandleAction[TRootAction, TNextNotHandledAction, TState] = {
    val __obj = js.Dynamic.literal(handleAction = handleAction.asInstanceOf[js.Any], handlers = handlers.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonActionHandleAction[TRootAction, TNextNotHandledAction, TState]]
  }
}


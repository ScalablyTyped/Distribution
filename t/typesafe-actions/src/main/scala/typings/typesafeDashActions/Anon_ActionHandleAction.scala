package typings.typesafeDashActions

import typings.std.Exclude
import typings.std.Record
import typings.std.ReturnType
import typings.typesafeDashActions.distTypeDashHelpersMod.Action
import typings.typesafeDashActions.distTypeDashHelpersMod.TypeConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionHandleAction[TRootAction /* <: Action[TypeConstant] */, TNextNotHandledAction /* <: Exclude[TPrevNotHandledAction, Action[TType] with ReturnType[TCreator]] */, TState] extends js.Object {
  var handleAction: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias typesafe-actions.typesafe-actions/dist/create-reducer.CreateReducerChainApi<TState, TNextNotHandledAction, TRootAction> */ js.Object
  var handlers: Record[
    /* import warning: ImportType.apply Failed type conversion: std.Exclude<TRootAction, TNextNotHandledAction>['type'] */ js.Any, 
    js.Function2[/* state */ TState, /* action */ TRootAction, TState]
  ]
}

object Anon_ActionHandleAction {
  @scala.inline
  def apply[TRootAction /* <: Action[TypeConstant] */, TNextNotHandledAction /* <: Exclude[TPrevNotHandledAction, Action[TType] with ReturnType[TCreator]] */, TState](
    handleAction: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias typesafe-actions.typesafe-actions/dist/create-reducer.CreateReducerChainApi<TState, TNextNotHandledAction, TRootAction> */ js.Object,
    handlers: Record[
      /* import warning: ImportType.apply Failed type conversion: std.Exclude<TRootAction, TNextNotHandledAction>['type'] */ js.Any, 
      js.Function2[/* state */ TState, /* action */ TRootAction, TState]
    ]
  ): Anon_ActionHandleAction[TRootAction, TNextNotHandledAction, TState] = {
    val __obj = js.Dynamic.literal(handleAction = handleAction, handlers = handlers)
  
    __obj.asInstanceOf[Anon_ActionHandleAction[TRootAction, TNextNotHandledAction, TState]]
  }
}


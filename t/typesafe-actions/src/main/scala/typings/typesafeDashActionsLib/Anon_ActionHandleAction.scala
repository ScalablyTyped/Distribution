package typings
package typesafeDashActionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionHandleAction[TRootAction /* <: typesafeDashActionsLib.distTypeDashHelpersMod.Action[typesafeDashActionsLib.distTypeDashHelpersMod.TypeConstant] */, TNextNotHandledAction /* <: stdLib.Exclude[
TPrevNotHandledAction, 
typesafeDashActionsLib.distTypeDashHelpersMod.Action[TType] with stdLib.ReturnType[TCreator]] */, TState] extends js.Object {
  var handleAction: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias typesafe-actions.typesafe-actions/dist/create-reducer.CreateReducerChainApi<TState, TNextNotHandledAction, TRootAction> */ js.Object
  var handlers: stdLib.Record[
    /* import warning: ImportType.apply Failed type conversion: std.Exclude<TRootAction, TNextNotHandledAction>['type'] */ js.Any, 
    js.Function2[/* state */ TState, /* action */ TRootAction, TState]
  ]
}

object Anon_ActionHandleAction {
  @scala.inline
  def apply[TRootAction /* <: typesafeDashActionsLib.distTypeDashHelpersMod.Action[typesafeDashActionsLib.distTypeDashHelpersMod.TypeConstant] */, TNextNotHandledAction /* <: stdLib.Exclude[
    TPrevNotHandledAction, 
    typesafeDashActionsLib.distTypeDashHelpersMod.Action[TType] with stdLib.ReturnType[TCreator]
  ] */, TState](
    handleAction: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias typesafe-actions.typesafe-actions/dist/create-reducer.CreateReducerChainApi<TState, TNextNotHandledAction, TRootAction> */ js.Object,
    handlers: stdLib.Record[
      /* import warning: ImportType.apply Failed type conversion: std.Exclude<TRootAction, TNextNotHandledAction>['type'] */ js.Any, 
      js.Function2[/* state */ TState, /* action */ TRootAction, TState]
    ]
  ): Anon_ActionHandleAction[TRootAction, TNextNotHandledAction, TState] = {
    val __obj = js.Dynamic.literal(handleAction = handleAction, handlers = handlers)
  
    __obj.asInstanceOf[Anon_ActionHandleAction[TRootAction, TNextNotHandledAction, TState]]
  }
}


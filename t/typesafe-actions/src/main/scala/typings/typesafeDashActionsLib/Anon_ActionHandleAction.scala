package typings
package typesafeDashActionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionHandleAction[TRootAction /* <: typesafeDashActionsLib.distTypeDashHelpersMod.Action[typesafeDashActionsLib.distTypeDashHelpersMod.TypeConstant] */, THandledCreatorAction /* <: TPrevNotHandledAction */, THandledTypeAction /* <: TPrevNotHandledAction */, TPrevNotHandledAction /* <: typesafeDashActionsLib.distTypeDashHelpersMod.Action[typesafeDashActionsLib.distTypeDashHelpersMod.TypeConstant] */, TState] extends js.Object {
  var handleAction: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias typesafe-actions.typesafe-actions/dist/create-reducer.CreateReducerChainApi<TState, std.Exclude<TPrevNotHandledAction, THandledTypeAction & THandledCreatorAction>, TRootAction> */ js.Object
  var handlers: stdLib.Record[
    /* import warning: ImportType.apply Failed type conversion: std.Exclude<TRootAction, std.Exclude<TPrevNotHandledAction, THandledTypeAction & THandledCreatorAction>>['type'] */ js.Any, 
    js.Function2[/* state */ TState, /* action */ TRootAction, TState]
  ]
}

object Anon_ActionHandleAction {
  @scala.inline
  def apply[TRootAction /* <: typesafeDashActionsLib.distTypeDashHelpersMod.Action[typesafeDashActionsLib.distTypeDashHelpersMod.TypeConstant] */, THandledCreatorAction /* <: TPrevNotHandledAction */, THandledTypeAction /* <: TPrevNotHandledAction */, TPrevNotHandledAction /* <: typesafeDashActionsLib.distTypeDashHelpersMod.Action[typesafeDashActionsLib.distTypeDashHelpersMod.TypeConstant] */, TState](
    handleAction: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias typesafe-actions.typesafe-actions/dist/create-reducer.CreateReducerChainApi<TState, std.Exclude<TPrevNotHandledAction, THandledTypeAction & THandledCreatorAction>, TRootAction> */ js.Object,
    handlers: stdLib.Record[
      /* import warning: ImportType.apply Failed type conversion: std.Exclude<TRootAction, std.Exclude<TPrevNotHandledAction, THandledTypeAction & THandledCreatorAction>>['type'] */ js.Any, 
      js.Function2[/* state */ TState, /* action */ TRootAction, TState]
    ]
  ): Anon_ActionHandleAction[TRootAction, THandledCreatorAction, THandledTypeAction, TPrevNotHandledAction, TState] = {
    val __obj = js.Dynamic.literal(handleAction = handleAction, handlers = handlers)
  
    __obj.asInstanceOf[Anon_ActionHandleAction[TRootAction, THandledCreatorAction, THandledTypeAction, TPrevNotHandledAction, TState]]
  }
}


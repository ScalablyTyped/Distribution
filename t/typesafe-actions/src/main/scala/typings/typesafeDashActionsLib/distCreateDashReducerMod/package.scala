package typings
package typesafeDashActionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distCreateDashReducerMod {
  type CreateReducerChainApi[TState, TPrevNotHandledAction /* <: typesafeDashActionsLib.distTypeDashHelpersMod.Action[typesafeDashActionsLib.distTypeDashHelpersMod.TypeConstant] */, TRootAction /* <: typesafeDashActionsLib.distTypeDashHelpersMod.Action[typesafeDashActionsLib.distTypeDashHelpersMod.TypeConstant] */] = js.Function2[
    /* singleOrMultipleCreatorsAndTypes */ (/* import warning: ImportType.apply Failed type conversion: TPrevNotHandledAction['type'] */ js.Any) | (js.Array[
      /* import warning: ImportType.apply Failed type conversion: TPrevNotHandledAction['type'] */ js.Any
    ]) | (js.Function1[/* repeated */ js.Any, TPrevNotHandledAction]) | (js.Array[js.Function1[/* repeated */ js.Any, TPrevNotHandledAction]]), 
    /* reducer */ js.Function2[/* state */ TState, /* action */ TPrevNotHandledAction, TState], 
    ((typesafeDashActionsLib.distTypeDashHelpersMod.Reducer[TState, TRootAction]) with (typesafeDashActionsLib.Anon_ActionHandleAction[TRootAction, TPrevNotHandledAction, TPrevNotHandledAction, TPrevNotHandledAction, TState])) | ((typesafeDashActionsLib.distTypeDashHelpersMod.Reducer[TState, TRootAction]) with (typesafeDashActionsLib.Anon_ActionHandlers[TRootAction, TState]))
  ]
  type GetAction[TAction /* <: typesafeDashActionsLib.distTypeDashHelpersMod.Action[typesafeDashActionsLib.distTypeDashHelpersMod.TypeConstant] */, TType /* <: /* import warning: ImportType.apply Failed type conversion: TAction['type'] */ js.Any */] = TAction
  type InitialHandler[TState, TRootAction /* <: typesafeDashActionsLib.distTypeDashHelpersMod.Action[typesafeDashActionsLib.distTypeDashHelpersMod.TypeConstant] */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in TRootAction['type'] ]:? (state : TState, action : typesafe-actions.typesafe-actions/dist/create-reducer.GetAction<TRootAction, P>): TState}
    */ typesafeDashActionsLib.typesafeDashActionsLibStrings.InitialHandler with js.Any
  type RootAction = js.Any
}

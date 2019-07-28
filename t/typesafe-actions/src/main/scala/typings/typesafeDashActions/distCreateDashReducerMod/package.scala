package typings.typesafeDashActions

import typings.std.Exclude
import typings.std.ReturnType
import typings.typesafeDashActions.Anon_Action
import typings.typesafeDashActions.Anon_ActionHandleAction
import typings.typesafeDashActions.distTypeDashHelpersMod.Action
import typings.typesafeDashActions.distTypeDashHelpersMod.Reducer
import typings.typesafeDashActions.distTypeDashHelpersMod.TypeConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distCreateDashReducerMod {
  type CreateReducerChainApi[TState, TPrevNotHandledAction /* <: Action[TypeConstant] */, TRootAction /* <: Action[TypeConstant] */] = js.Function2[
    /* singleOrMultipleCreatorsAndTypes */ (/* import warning: ImportType.apply Failed type conversion: TPrevNotHandledAction['type'] */ js.Any) | (js.Array[
      (/* import warning: ImportType.apply Failed type conversion: TPrevNotHandledAction['type'] */ js.Any) | (js.Function1[/* repeated */ js.Any, TPrevNotHandledAction])
    ]) | (js.Function1[/* repeated */ js.Any, TPrevNotHandledAction]), 
    /* reducer */ js.Function2[/* state */ TState, /* action */ TPrevNotHandledAction, TState], 
    ((Reducer[TState, TRootAction]) with (Anon_ActionHandleAction[
      TRootAction, 
      Exclude[
        TPrevNotHandledAction, 
        (Action[
          /* import warning: ImportType.apply Failed type conversion: TPrevNotHandledAction['type'] */ js.Any
        ]) with (ReturnType[js.Function1[/* repeated */ _, TPrevNotHandledAction]])
      ], 
      TState
    ])) | ((Reducer[TState, TRootAction]) with (Anon_Action[TRootAction, TState]))
  ]
  type GetAction[TAction /* <: Action[TypeConstant] */, TType /* <: /* import warning: ImportType.apply Failed type conversion: TAction['type'] */ js.Any */] = TAction
  type InitialHandler[TState, TRootAction /* <: Action[TypeConstant] */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in TRootAction['type'] ]:? (state : TState, action : typesafe-actions.typesafe-actions/dist/create-reducer.GetAction<TRootAction, P>): TState}
    */ typings.typesafeDashActions.typesafeDashActionsStrings.InitialHandler with js.Any
  type RootAction = js.Any
}

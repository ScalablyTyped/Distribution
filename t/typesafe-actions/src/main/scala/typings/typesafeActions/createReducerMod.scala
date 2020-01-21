package typings.typesafeActions

import typings.std.Exclude
import typings.std.ReturnType
import typings.typesafeActions.typeHelpersMod.Action
import typings.typesafeActions.typeHelpersMod.Reducer
import typings.typesafeActions.typeHelpersMod.TypeConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesafe-actions/dist/create-reducer", JSImport.Namespace)
@js.native
object createReducerMod extends js.Object {
  def createReducer[TState, TRootAction /* <: Action[TypeConstant] */](initialState: TState): (Reducer[TState, TRootAction]) with (AnonHandleAction[TState, TRootAction]) = js.native
  def createReducer[TState, TRootAction /* <: Action[TypeConstant] */](initialState: TState, initialHandlers: InitialHandler[TState, TRootAction]): (Reducer[TState, TRootAction]) with (AnonHandleAction[TState, TRootAction]) = js.native
  type CreateReducerChainApi[TState, TPrevNotHandledAction /* <: Action[TypeConstant] */, TRootAction /* <: Action[TypeConstant] */] = js.Function2[
    /* singleOrMultipleCreatorsAndTypes */ (/* import warning: importer.ImportType#apply Failed type conversion: TPrevNotHandledAction['type'] */ js.Any) | (js.Array[
      (/* import warning: importer.ImportType#apply Failed type conversion: TPrevNotHandledAction['type'] */ js.Any) | (js.Function1[/* repeated */ js.Any, TPrevNotHandledAction])
    ]) | (js.Function1[/* repeated */ js.Any, TPrevNotHandledAction]), 
    /* reducer */ js.Function2[/* state */ TState, /* action */ TPrevNotHandledAction, TState], 
    ((Reducer[TState, TRootAction]) with (AnonActionHandleAction[
      TRootAction, 
      Exclude[
        TPrevNotHandledAction, 
        (Action[
          /* import warning: importer.ImportType#apply Failed type conversion: TPrevNotHandledAction['type'] */ js.Any
        ]) with (ReturnType[js.Function1[/* repeated */ _, TPrevNotHandledAction]])
      ], 
      TState
    ])) | ((Reducer[TState, TRootAction]) with (AnonAction[TRootAction, TState]))
  ]
  type GetAction[TAction /* <: Action[TypeConstant] */, TType /* <: /* import warning: importer.ImportType#apply Failed type conversion: TAction['type'] */ js.Any */] = TAction
  type InitialHandler[TState, TRootAction /* <: Action[TypeConstant] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in TRootAction['type'] ]:? (state : TState, action : typesafe-actions.typesafe-actions/dist/create-reducer.GetAction<TRootAction, P>): TState}
    */ typings.typesafeActions.typesafeActionsStrings.InitialHandler with js.Any
  type RootAction = js.Any
}


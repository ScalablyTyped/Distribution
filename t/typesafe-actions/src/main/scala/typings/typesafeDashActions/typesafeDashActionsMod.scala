package typings.typesafeDashActions

import typings.typesafeDashActions.distCreateDashActionDashDeprecatedMod.FSA
import typings.typesafeDashActions.distCreateDashActionMod.PayloadMetaAction
import typings.typesafeDashActions.distCreateDashAsyncDashActionMod.AsyncActionBuilder
import typings.typesafeDashActions.distCreateDashReducerMod.InitialHandler
import typings.typesafeDashActions.distCreateDashStandardDashActionMod.ActionBuilder
import typings.typesafeDashActions.distTypeDashHelpersMod.Action
import typings.typesafeDashActions.distTypeDashHelpersMod.ActionCreator
import typings.typesafeDashActions.distTypeDashHelpersMod.Reducer
import typings.typesafeDashActions.distTypeDashHelpersMod.TypeConstant
import typings.typesafeDashActions.distTypeDashHelpersMod.TypeMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesafe-actions", JSImport.Namespace)
@js.native
object typesafeDashActionsMod extends js.Object {
  def action[T /* <: TypeConstant */](`type`: T): Anon_Type[T] = js.native
  def action[T /* <: TypeConstant */, P](`type`: T, payload: P): Anon_Payload[T, P] = js.native
  def action[T /* <: TypeConstant */, M](`type`: T, payload: js.UndefOr[scala.Nothing], meta: M): Anon_Meta[T, M] = js.native
  def action[T /* <: TypeConstant */, E](`type`: T, payload: js.UndefOr[scala.Nothing], meta: js.UndefOr[scala.Nothing], error: E): Anon_Error[T, E] = js.native
  def action[T /* <: TypeConstant */, P, M](`type`: T, payload: P, meta: M): Anon_MetaPayload[T, P, M] = js.native
  def action[T /* <: TypeConstant */, P, E](`type`: T, payload: P, meta: js.UndefOr[scala.Nothing], error: E): Anon_ErrorPayload[T, P, E] = js.native
  def action[T /* <: TypeConstant */, M, E](`type`: T, payload: js.UndefOr[scala.Nothing], meta: M, error: E): Anon_ErrorMeta[T, M, E] = js.native
  def action[T /* <: TypeConstant */, P, M, E](`type`: T, payload: P, meta: M, error: E): Anon_ErrorMetaPayload[T, P, M, E] = js.native
  def createAction[T /* <: TypeConstant */, AC /* <: ActionCreator[T] */](`type`: T): AC = js.native
  def createAction[T /* <: TypeConstant */, AC /* <: ActionCreator[T] */](
    `type`: T,
    createHandler: js.Function1[
      /* actionCallback */ js.Function2[
        /* payload */ js.UndefOr[js.Any], 
        /* meta */ js.UndefOr[js.Any], 
        PayloadMetaAction[T, _, _]
      ], 
      AC
    ]
  ): AC = js.native
  def createActionDeprecated[T /* <: TypeConstant */, AC /* <: js.Function0[Anon_Type[T]] */](actionType: T): AC = js.native
  def createActionDeprecated[T /* <: TypeConstant */, AC /* <: js.Function1[/* repeated */ js.Any, FSA[T, js.Object, js.Object, Boolean]] */](actionType: T, creatorFunction: AC): AC = js.native
  def createAsyncAction[TType1 /* <: TypeConstant */, TType2 /* <: TypeConstant */, TType3 /* <: TypeConstant */, TType4 /* <: TypeConstant */](requestType: TType1, successType: TType2, failureType: TType3): AsyncActionBuilder[TType1, TType2, TType3, TType4] = js.native
  def createAsyncAction[TType1 /* <: TypeConstant */, TType2 /* <: TypeConstant */, TType3 /* <: TypeConstant */, TType4 /* <: TypeConstant */](requestType: TType1, successType: TType2, failureType: TType3, cancelType: TType4): AsyncActionBuilder[TType1, TType2, TType3, TType4] = js.native
  def createCustomAction[T /* <: TypeConstant */, AC /* <: ActionCreator[T] */](`type`: T): AC = js.native
  def createCustomAction[T /* <: TypeConstant */, AC /* <: ActionCreator[T] */](`type`: T, createHandler: js.Function1[/* type */ T, AC]): AC = js.native
  def createReducer[TState, TRootAction /* <: Action[TypeConstant] */](initialState: TState): (Reducer[TState, TRootAction]) with (Anon_HandleAction[TState, TRootAction]) = js.native
  def createReducer[TState, TRootAction /* <: Action[TypeConstant] */](initialState: TState, initialHandlers: InitialHandler[TState, TRootAction]): (Reducer[TState, TRootAction]) with (Anon_HandleAction[TState, TRootAction]) = js.native
  def createStandardAction[T /* <: TypeConstant */](`type`: T): ActionBuilder[T] = js.native
  def getType[T /* <: TypeConstant */](actionCreator: ActionCreator[T] with TypeMeta[T]): T = js.native
  def isActionOf[AC /* <: typings.typesafeDashActions.distIsDashActionDashOfMod.ActionCreator[Anon_TypeString] */](actionCreator: AC): js.Function1[/* action */ Anon_TypeString, /* is std.ReturnType<AC> */ Boolean] = js.native
  def isActionOf[AC /* <: typings.typesafeDashActions.distIsDashActionDashOfMod.ActionCreator[Anon_TypeString] */](actionCreator: AC, action: Anon_TypeString): /* is std.ReturnType<AC> */ Boolean = js.native
  def isActionOf[AC /* <: typings.typesafeDashActions.distIsDashActionDashOfMod.ActionCreator[Anon_TypeString] */](actionCreator: js.Array[AC]): js.Function1[/* action */ Anon_TypeString, /* is std.ReturnType<AC> */ Boolean] = js.native
  def isActionOf[AC /* <: typings.typesafeDashActions.distIsDashActionDashOfMod.ActionCreator[Anon_TypeString] */](actionCreator: js.Array[AC], action: Anon_TypeString): /* is std.ReturnType<AC> */ Boolean = js.native
  def isOfType[T /* <: String */](`type`: T): js.Function1[/* action */ Anon_TypeString, Boolean] = js.native
  def isOfType[T /* <: String */](`type`: js.Array[T]): js.Function1[/* action */ Anon_TypeString, Boolean] = js.native
  def isOfType[T /* <: String */, A /* <: Anon_TypeString */](`type`: T, action: A): Boolean = js.native
  def isOfType[T /* <: String */, A /* <: Anon_TypeString */](`type`: js.Array[T], action: A): Boolean = js.native
}


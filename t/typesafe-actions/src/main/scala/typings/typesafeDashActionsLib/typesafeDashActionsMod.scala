package typings
package typesafeDashActionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesafe-actions", JSImport.Namespace)
@js.native
object typesafeDashActionsMod extends js.Object {
  def action[T /* <: typesafeDashActionsLib.distTypeDashHelpersMod.TypeConstant */](`type`: T): typesafeDashActionsLib.Anon_Type[T] = js.native
  def action[T /* <: typesafeDashActionsLib.distTypeDashHelpersMod.TypeConstant */, P](`type`: T, payload: P): typesafeDashActionsLib.Anon_Payload[T, P] = js.native
  def action[T /* <: typesafeDashActionsLib.distTypeDashHelpersMod.TypeConstant */, M](`type`: T, payload: js.UndefOr[scala.Nothing], meta: M): typesafeDashActionsLib.Anon_Meta[T, M] = js.native
  def action[T /* <: typesafeDashActionsLib.distTypeDashHelpersMod.TypeConstant */, E](`type`: T, payload: js.UndefOr[scala.Nothing], meta: js.UndefOr[scala.Nothing], error: E): typesafeDashActionsLib.Anon_Error[T, E] = js.native
  def action[T /* <: typesafeDashActionsLib.distTypeDashHelpersMod.TypeConstant */, P, M](`type`: T, payload: P, meta: M): typesafeDashActionsLib.Anon_MetaPayload[T, P, M] = js.native
  def action[T /* <: typesafeDashActionsLib.distTypeDashHelpersMod.TypeConstant */, P, E](`type`: T, payload: P, meta: js.UndefOr[scala.Nothing], error: E): typesafeDashActionsLib.Anon_ErrorPayload[T, P, E] = js.native
  def action[T /* <: typesafeDashActionsLib.distTypeDashHelpersMod.TypeConstant */, M, E](`type`: T, payload: js.UndefOr[scala.Nothing], meta: M, error: E): typesafeDashActionsLib.Anon_ErrorMeta[T, M, E] = js.native
  def action[T /* <: typesafeDashActionsLib.distTypeDashHelpersMod.TypeConstant */, P, M, E](`type`: T, payload: P, meta: M, error: E): typesafeDashActionsLib.Anon_ErrorMetaPayload[T, P, M, E] = js.native
  def createAction[T /* <: typesafeDashActionsLib.distTypeDashHelpersMod.TypeConstant */, AC /* <: typesafeDashActionsLib.distTypeDashHelpersMod.ActionCreator[T] */](`type`: T): AC = js.native
  def createAction[T /* <: typesafeDashActionsLib.distTypeDashHelpersMod.TypeConstant */, AC /* <: typesafeDashActionsLib.distTypeDashHelpersMod.ActionCreator[T] */](
    `type`: T,
    createHandler: js.Function1[
      /* actionCallback */ js.Function2[
        /* payload */ js.UndefOr[js.Any], 
        /* meta */ js.UndefOr[js.Any], 
        typesafeDashActionsLib.distCreateDashActionMod.PayloadMetaAction[T, _, _]
      ], 
      AC
    ]
  ): AC = js.native
  def createActionDeprecated[T /* <: typesafeDashActionsLib.distTypeDashHelpersMod.TypeConstant */, AC /* <: js.Function0[typesafeDashActionsLib.Anon_Type[T]] */](actionType: T): AC = js.native
  def createActionDeprecated[T /* <: typesafeDashActionsLib.distTypeDashHelpersMod.TypeConstant */, AC /* <: js.Function1[
    /* repeated */ js.Any, 
    typesafeDashActionsLib.distCreateDashActionDashDeprecatedMod.FSA[T, js.Object, js.Object, scala.Boolean]
  ] */](actionType: T, creatorFunction: AC): AC = js.native
  def createAsyncAction[TType1 /* <: typesafeDashActionsLib.distTypeDashHelpersMod.TypeConstant */, TType2 /* <: typesafeDashActionsLib.distTypeDashHelpersMod.TypeConstant */, TType3 /* <: typesafeDashActionsLib.distTypeDashHelpersMod.TypeConstant */, TType4 /* <: typesafeDashActionsLib.distTypeDashHelpersMod.TypeConstant */](requestType: TType1, successType: TType2, failureType: TType3): typesafeDashActionsLib.distCreateDashAsyncDashActionMod.AsyncActionBuilder[TType1, TType2, TType3, TType4] = js.native
  def createAsyncAction[TType1 /* <: typesafeDashActionsLib.distTypeDashHelpersMod.TypeConstant */, TType2 /* <: typesafeDashActionsLib.distTypeDashHelpersMod.TypeConstant */, TType3 /* <: typesafeDashActionsLib.distTypeDashHelpersMod.TypeConstant */, TType4 /* <: typesafeDashActionsLib.distTypeDashHelpersMod.TypeConstant */](requestType: TType1, successType: TType2, failureType: TType3, cancelType: TType4): typesafeDashActionsLib.distCreateDashAsyncDashActionMod.AsyncActionBuilder[TType1, TType2, TType3, TType4] = js.native
  def createCustomAction[T /* <: typesafeDashActionsLib.distTypeDashHelpersMod.TypeConstant */, AC /* <: typesafeDashActionsLib.distTypeDashHelpersMod.ActionCreator[T] */](`type`: T): AC = js.native
  def createCustomAction[T /* <: typesafeDashActionsLib.distTypeDashHelpersMod.TypeConstant */, AC /* <: typesafeDashActionsLib.distTypeDashHelpersMod.ActionCreator[T] */](`type`: T, createHandler: js.Function1[/* type */ T, AC]): AC = js.native
  def createReducer[TState, TRootAction /* <: typesafeDashActionsLib.distTypeDashHelpersMod.Action[typesafeDashActionsLib.distTypeDashHelpersMod.TypeConstant] */](initialState: TState): (typesafeDashActionsLib.distTypeDashHelpersMod.Reducer[TState, TRootAction]) with (typesafeDashActionsLib.Anon_HandleAction[TState, TRootAction]) = js.native
  def createReducer[TState, TRootAction /* <: typesafeDashActionsLib.distTypeDashHelpersMod.Action[typesafeDashActionsLib.distTypeDashHelpersMod.TypeConstant] */](
    initialState: TState,
    initialHandlers: typesafeDashActionsLib.distCreateDashReducerMod.InitialHandler[TState, TRootAction]
  ): (typesafeDashActionsLib.distTypeDashHelpersMod.Reducer[TState, TRootAction]) with (typesafeDashActionsLib.Anon_HandleAction[TState, TRootAction]) = js.native
  def createStandardAction[T /* <: typesafeDashActionsLib.distTypeDashHelpersMod.TypeConstant */](`type`: T): typesafeDashActionsLib.distCreateDashStandardDashActionMod.ActionBuilder[T] = js.native
  def getType[T /* <: typesafeDashActionsLib.distTypeDashHelpersMod.TypeConstant */](
    actionCreator: typesafeDashActionsLib.distTypeDashHelpersMod.ActionCreator[T] with typesafeDashActionsLib.distTypeDashHelpersMod.TypeMeta[T]
  ): T = js.native
  def isActionOf[AC /* <: typesafeDashActionsLib.distIsDashActionDashOfMod.ActionCreator[typesafeDashActionsLib.Anon_TypeString] */](actionCreator: AC): js.Function1[
    /* action */ typesafeDashActionsLib.Anon_TypeString, 
    /* is std.ReturnType<AC> */ scala.Boolean
  ] = js.native
  def isActionOf[AC /* <: typesafeDashActionsLib.distIsDashActionDashOfMod.ActionCreator[typesafeDashActionsLib.Anon_TypeString] */](actionCreator: AC, action: typesafeDashActionsLib.Anon_TypeString): /* is std.ReturnType<AC> */ scala.Boolean = js.native
  def isActionOf[AC /* <: typesafeDashActionsLib.distIsDashActionDashOfMod.ActionCreator[typesafeDashActionsLib.Anon_TypeString] */](actionCreator: js.Array[AC]): js.Function1[
    /* action */ typesafeDashActionsLib.Anon_TypeString, 
    /* is std.ReturnType<AC> */ scala.Boolean
  ] = js.native
  def isActionOf[AC /* <: typesafeDashActionsLib.distIsDashActionDashOfMod.ActionCreator[typesafeDashActionsLib.Anon_TypeString] */](actionCreator: js.Array[AC], action: typesafeDashActionsLib.Anon_TypeString): /* is std.ReturnType<AC> */ scala.Boolean = js.native
  def isOfType[T /* <: java.lang.String */](`type`: T): js.Function1[/* action */ typesafeDashActionsLib.Anon_TypeString, scala.Boolean] = js.native
  def isOfType[T /* <: java.lang.String */](`type`: js.Array[T]): js.Function1[/* action */ typesafeDashActionsLib.Anon_TypeString, scala.Boolean] = js.native
  def isOfType[T /* <: java.lang.String */, A /* <: typesafeDashActionsLib.Anon_TypeString */](`type`: T, action: A): scala.Boolean = js.native
  def isOfType[T /* <: java.lang.String */, A /* <: typesafeDashActionsLib.Anon_TypeString */](`type`: js.Array[T], action: A): scala.Boolean = js.native
}


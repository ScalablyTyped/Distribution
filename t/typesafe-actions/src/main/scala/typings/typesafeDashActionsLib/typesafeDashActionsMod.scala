package typings
package typesafeDashActionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesafe-actions", JSImport.Namespace)
@js.native
object typesafeDashActionsMod extends js.Object {
  def action[T /* <: typesafeDashActionsLib.distTypeDashHelpersMod.StringType */](`type`: T): typesafeDashActionsLib.Anon_Type[T] = js.native
  def action[T /* <: typesafeDashActionsLib.distTypeDashHelpersMod.StringType */, P](`type`: T, payload: P): typesafeDashActionsLib.Anon_Payload[T, P] = js.native
  def action[T /* <: typesafeDashActionsLib.distTypeDashHelpersMod.StringType */, M](`type`: T, payload: js.UndefOr[scala.Nothing], meta: M): typesafeDashActionsLib.Anon_Meta[T, M] = js.native
  def action[T /* <: typesafeDashActionsLib.distTypeDashHelpersMod.StringType */, E](`type`: T, payload: js.UndefOr[scala.Nothing], meta: js.UndefOr[scala.Nothing], error: E): typesafeDashActionsLib.Anon_Error[T, E] = js.native
  def action[T /* <: typesafeDashActionsLib.distTypeDashHelpersMod.StringType */, P, M](`type`: T, payload: P, meta: M): typesafeDashActionsLib.Anon_MetaPayload[T, P, M] = js.native
  def action[T /* <: typesafeDashActionsLib.distTypeDashHelpersMod.StringType */, P, E](`type`: T, payload: P, meta: js.UndefOr[scala.Nothing], error: E): typesafeDashActionsLib.Anon_ErrorPayload[T, P, E] = js.native
  def action[T /* <: typesafeDashActionsLib.distTypeDashHelpersMod.StringType */, M, E](`type`: T, payload: js.UndefOr[scala.Nothing], meta: M, error: E): typesafeDashActionsLib.Anon_ErrorMeta[T, M, E] = js.native
  def action[T /* <: typesafeDashActionsLib.distTypeDashHelpersMod.StringType */, P, M, E](`type`: T, payload: P, meta: M, error: E): typesafeDashActionsLib.Anon_ErrorMetaPayload[T, P, M, E] = js.native
  def createAction[T /* <: typesafeDashActionsLib.distTypeDashHelpersMod.StringType */, AC /* <: typesafeDashActionsLib.distTypeDashHelpersMod.ActionCreator[T] */](`type`: T): AC = js.native
  def createAction[T /* <: typesafeDashActionsLib.distTypeDashHelpersMod.StringType */, AC /* <: typesafeDashActionsLib.distTypeDashHelpersMod.ActionCreator[T] */](
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
  def createActionDeprecated[T /* <: typesafeDashActionsLib.distTypeDashHelpersMod.StringType */, AC /* <: js.Function0[typesafeDashActionsLib.Anon_Type[T]] */](actionType: T): AC = js.native
  def createActionDeprecated[T /* <: typesafeDashActionsLib.distTypeDashHelpersMod.StringType */, AC /* <: js.Function1[
    /* repeated */ js.Any, 
    typesafeDashActionsLib.distCreateDashActionDashDeprecatedMod.FSA[T, js.Object, js.Object, scala.Boolean]
  ] */](actionType: T, creatorFunction: AC): AC = js.native
  def createAsyncAction[T1 /* <: typesafeDashActionsLib.distTypeDashHelpersMod.StringType */, T2 /* <: typesafeDashActionsLib.distTypeDashHelpersMod.StringType */, T3 /* <: typesafeDashActionsLib.distTypeDashHelpersMod.StringType */](requestType: T1, successType: T2, failureType: T3): typesafeDashActionsLib.distCreateDashAsyncDashActionMod.AsyncActionBuilder[T1, T2, T3] = js.native
  def createCustomAction[T /* <: typesafeDashActionsLib.distTypeDashHelpersMod.StringType */, AC /* <: typesafeDashActionsLib.distTypeDashHelpersMod.ActionCreator[T] */](`type`: T): AC = js.native
  def createCustomAction[T /* <: typesafeDashActionsLib.distTypeDashHelpersMod.StringType */, AC /* <: typesafeDashActionsLib.distTypeDashHelpersMod.ActionCreator[T] */](`type`: T, createHandler: js.Function1[/* type */ T, AC]): AC = js.native
  def createStandardAction[T /* <: typesafeDashActionsLib.distTypeDashHelpersMod.StringType */](`type`: T): typesafeDashActionsLib.distCreateDashStandardDashActionMod.ActionBuilder[T] = js.native
  def getType[T /* <: typesafeDashActionsLib.distTypeDashHelpersMod.StringType */](
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
  def isOfType[T /* <: java.lang.String */](`type`: T): js.Function1[
    /* action */ typesafeDashActionsLib.Anon_TypeString, 
    /* is typesafe-actions.Anon_TypeString */ scala.Boolean
  ] = js.native
  def isOfType[T /* <: java.lang.String */](`type`: js.Array[T]): js.Function1[
    /* action */ typesafeDashActionsLib.Anon_TypeString, 
    /* is typesafe-actions.Anon_TypeString */ scala.Boolean
  ] = js.native
  def isOfType[T /* <: java.lang.String */, A /* <: typesafeDashActionsLib.Anon_TypeString */](`type`: T, action: A): /* is A */ scala.Boolean = js.native
  def isOfType[T /* <: java.lang.String */, A /* <: typesafeDashActionsLib.Anon_TypeString */](`type`: js.Array[T], action: A): /* is A */ scala.Boolean = js.native
}


package typings
package typesafeDashActionsLib.typesafeDashActionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesafe-actions", JSImport.Namespace)
@js.native
object typesafeDashActionsModMembers extends js.Object {
  def action[T /* <: typesafeDashActionsLib.distTypesMod.StringType */, P, M](`type`: T): typesafeDashActionsLib.distTypesMod.PayloadMetaAction[T, P, M] = js.native
  def action[T /* <: typesafeDashActionsLib.distTypesMod.StringType */, P, M](`type`: T, payload: P): typesafeDashActionsLib.distTypesMod.PayloadMetaAction[T, P, M] = js.native
  def action[T /* <: typesafeDashActionsLib.distTypesMod.StringType */, P, M](`type`: T, payload: P, meta: M): typesafeDashActionsLib.distTypesMod.PayloadMetaAction[T, P, M] = js.native
  def createAction[T /* <: typesafeDashActionsLib.distTypesMod.StringType */, AC /* <: typesafeDashActionsLib.distTypesMod.ActionCreator[T] */](actionType: T): AC = js.native
  def createAction[T /* <: typesafeDashActionsLib.distTypesMod.StringType */, AC /* <: typesafeDashActionsLib.distTypesMod.ActionCreator[T] */](
    actionType: T,
    creatorHandler: js.Function1[
      /* action */ js.Function2[
        /* payload */ js.UndefOr[js.Any], 
        /* meta */ js.UndefOr[js.Any], 
        typesafeDashActionsLib.distTypesMod.PayloadMetaAction[T, _, _]
      ], 
      AC
    ]
  ): AC = js.native
  def createActionDeprecated[T /* <: typesafeDashActionsLib.distTypesMod.StringType */, AC /* <: js.Function0[typesafeDashActionsLib.Anon_TypeT[T]] */](actionType: T): AC with typesafeDashActionsLib.distTypesMod.TypeMeta[T] = js.native
  def createActionDeprecated[T /* <: typesafeDashActionsLib.distTypesMod.StringType */, AC /* <: js.Function1[
    /* repeated */js.Any, 
    typesafeDashActionsLib.distCreateDashActionDashDeprecatedMod.FSA[T, js.Object, js.Object, scala.Boolean]
  ] */](actionType: T, creatorFunction: AC): AC with typesafeDashActionsLib.distTypesMod.TypeMeta[T] = js.native
  def createActionDeprecated[T /* <: typesafeDashActionsLib.distTypesMod.StringType */, AC /* <: js.Function0[typesafeDashActionsLib.Anon_TypeT[T]] */](actionType: js.Symbol): AC with typesafeDashActionsLib.distTypesMod.TypeMeta[T] = js.native
  def createActionDeprecated[T /* <: typesafeDashActionsLib.distTypesMod.StringType */, AC /* <: js.Function1[
    /* repeated */js.Any, 
    typesafeDashActionsLib.distCreateDashActionDashDeprecatedMod.FSA[T, js.Object, js.Object, scala.Boolean]
  ] */](actionType: js.Symbol, creatorFunction: AC): AC with typesafeDashActionsLib.distTypesMod.TypeMeta[T] = js.native
  def createAsyncAction[T1 /* <: typesafeDashActionsLib.distTypesMod.StringType */, T2 /* <: typesafeDashActionsLib.distTypesMod.StringType */, T3 /* <: typesafeDashActionsLib.distTypesMod.StringType */](requestType: T1, successType: T2, failureType: T3): typesafeDashActionsLib.distCreateDashAsyncDashActionMod.CreateAsyncAction[T1, T2, T3] = js.native
  def createStandardAction[T /* <: typesafeDashActionsLib.distTypesMod.StringType */](actionType: T): typesafeDashActionsLib.distCreateDashStandardDashActionMod.CreateStandardAction[T] = js.native
  def getType[T /* <: typesafeDashActionsLib.distTypesMod.StringType */](
    creator: typesafeDashActionsLib.distTypesMod.ActionCreator[T] with typesafeDashActionsLib.distTypesMod.TypeMeta[T]
  ): T = js.native
  def isActionOf[A /* <: typesafeDashActionsLib.Anon_TypeString */, T1 /* <: A */](actionCreator: typesafeDashActionsLib.distIsDashActionDashOfMod.AC[T1]): js.Function1[/* action */ A, /* is T1 */scala.Boolean] = js.native
  def isActionOf[A /* <: typesafeDashActionsLib.Anon_TypeString */, T1 /* <: A */](
    actionCreator: typesafeDashActionsLib.distIsDashActionDashOfMod.AC[T1],
    action: typesafeDashActionsLib.Anon_TypeString
  ): /* is T1 */scala.Boolean = js.native
  def isActionOf[A /* <: typesafeDashActionsLib.Anon_TypeString */, T1 /* <: A */, T2 /* <: A */, T3 /* <: A */, T4 /* <: A */, T5 /* <: A */](
    actionCreators: typesafeDashActionsLib.distIsDashActionDashOfMod.ACs[T1, _ | T2, _ | T3, _ | T4, _ | T5]
  ): js.Function1[/* action */ A, scala.Boolean] = js.native
  def isActionOf[A /* <: typesafeDashActionsLib.Anon_TypeString */, T1 /* <: A */, T2 /* <: A */, T3 /* <: A */, T4 /* <: A */, T5 /* <: A */](
    actionCreators: typesafeDashActionsLib.distIsDashActionDashOfMod.ACs[T1, _ | T2, _ | T3, _ | T4, _ | T5],
    action: typesafeDashActionsLib.Anon_TypeString
  ): scala.Boolean = js.native
  def isOfType[T /* <: typesafeDashActionsLib.distTypesMod.StringType */](`type`: T): js.Function1[/* action */ typesafeDashActionsLib.Anon_Type, /* is Anon_Type */scala.Boolean] = js.native
  def isOfType[T /* <: typesafeDashActionsLib.distTypesMod.StringType */, A /* <: typesafeDashActionsLib.Anon_Type */](`type`: T, action: A): /* is A */scala.Boolean = js.native
  @JSName("isOfType")
  def isOfType_TArrayKStringType[T /* <: js.Array[K] */, K /* <: typesafeDashActionsLib.distTypesMod.StringType */](`type`: T): js.Function1[/* action */ typesafeDashActionsLib.Anon_Type, /* is Anon_Type */scala.Boolean] = js.native
  @JSName("isOfType")
  def isOfType_TArrayKStringTypeAAnon_Type[T /* <: js.Array[K] */, K /* <: typesafeDashActionsLib.distTypesMod.StringType */, A /* <: typesafeDashActionsLib.Anon_Type */](`type`: T, action: A): /* is A */scala.Boolean = js.native
}


package typings
package typesafeDashActionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesafe-actions", JSImport.Namespace)
@js.native
object typesafeDashActionsMod extends js.Object {
  def action[T /* <: typesafeDashActionsLib.distTypesMod.StringType */](`type`: T): typesafeDashActionsLib.distTypesMod.EmptyAction[T] = js.native
  def action[T /* <: typesafeDashActionsLib.distTypesMod.StringType */, P](`type`: T, payload: P): typesafeDashActionsLib.distTypesMod.PayloadAction[T, P] = js.native
  def action[T /* <: typesafeDashActionsLib.distTypesMod.StringType */, P, M](`type`: T, payload: P, meta: M): typesafeDashActionsLib.distTypesMod.PayloadMetaAction[T, P, M] = js.native
  def createAction[T /* <: typesafeDashActionsLib.distTypesMod.StringType */, AC /* <: typesafeDashActionsLib.distTypesMod.ActionCreator[T] */](actionType: T): AC = js.native
  def createAction[T /* <: typesafeDashActionsLib.distTypesMod.StringType */, AC /* <: typesafeDashActionsLib.distTypesMod.ActionCreator[T] */](
    actionType: T,
    actionResolverHandler: js.Function1[
      /* resolve */ js.Function2[
        /* payload */ js.UndefOr[js.Any], 
        /* meta */ js.UndefOr[js.Any], 
        typesafeDashActionsLib.distCreateDashActionMod.PayloadMetaAction[T, _, _]
      ], 
      AC
    ]
  ): AC = js.native
  def createActionDeprecated[T /* <: typesafeDashActionsLib.distTypesMod.StringOrSymbol */, AC /* <: js.Function0[typesafeDashActionsLib.Anon_Type[T]] */](actionType: T): AC = js.native
  def createActionDeprecated[T /* <: typesafeDashActionsLib.distTypesMod.StringOrSymbol */, AC /* <: js.Function1[
    /* repeated */ js.Any, 
    typesafeDashActionsLib.distCreateDashActionDashDeprecatedMod.FSA[T, js.Object, js.Object, scala.Boolean]
  ] */](actionType: T, creatorFunction: AC): AC = js.native
  def createAsyncAction[T1 /* <: typesafeDashActionsLib.distTypesMod.StringType */, T2 /* <: typesafeDashActionsLib.distTypesMod.StringType */, T3 /* <: typesafeDashActionsLib.distTypesMod.StringType */](requestType: T1, successType: T2, failureType: T3): typesafeDashActionsLib.distCreateDashAsyncDashActionMod.CreateAsyncAction[T1, T2, T3] = js.native
  def createStandardAction[T /* <: typesafeDashActionsLib.distTypesMod.StringType */](actionType: T): typesafeDashActionsLib.distCreateDashStandardDashActionMod.CreateStandardAction[T] = js.native
  def getType[T /* <: typesafeDashActionsLib.distTypesMod.StringType */](
    creator: typesafeDashActionsLib.distTypesMod.ActionCreator[T] with typesafeDashActionsLib.distTypesMod.TypeMeta[T]
  ): T = js.native
  def isActionOf[A /* <: typesafeDashActionsLib.Anon_TypeString */, T1 /* <: A */](actionCreators: js.Array[typesafeDashActionsLib.distIsDashActionDashOfMod.AC[T1]]): js.Function1[/* action */ A, scala.Boolean] = js.native
  def isActionOf[A /* <: typesafeDashActionsLib.Anon_TypeString */, T1 /* <: A */](
    actionCreators: js.Array[typesafeDashActionsLib.distIsDashActionDashOfMod.AC[T1]],
    action: typesafeDashActionsLib.Anon_TypeString
  ): scala.Boolean = js.native
  def isActionOf[A /* <: typesafeDashActionsLib.Anon_TypeString */, T1 /* <: A */](actionCreator: typesafeDashActionsLib.distIsDashActionDashOfMod.AC[T1]): js.Function1[/* action */ A, /* is T1 */ scala.Boolean] = js.native
  def isActionOf[A /* <: typesafeDashActionsLib.Anon_TypeString */, T1 /* <: A */](
    actionCreator: typesafeDashActionsLib.distIsDashActionDashOfMod.AC[T1],
    action: typesafeDashActionsLib.Anon_TypeString
  ): /* is T1 */ scala.Boolean = js.native
  def isActionOf[A /* <: typesafeDashActionsLib.Anon_TypeString */, T1 /* <: A */, T2 /* <: A */](
    actionCreators: js.Tuple2[
      typesafeDashActionsLib.distIsDashActionDashOfMod.AC[T1], 
      typesafeDashActionsLib.distIsDashActionDashOfMod.AC[T2]
    ]
  ): js.Function1[/* action */ A, scala.Boolean] = js.native
  def isActionOf[A /* <: typesafeDashActionsLib.Anon_TypeString */, T1 /* <: A */, T2 /* <: A */](
    actionCreators: js.Tuple2[
      typesafeDashActionsLib.distIsDashActionDashOfMod.AC[T1], 
      typesafeDashActionsLib.distIsDashActionDashOfMod.AC[T2]
    ],
    action: typesafeDashActionsLib.Anon_TypeString
  ): scala.Boolean = js.native
  def isActionOf[A /* <: typesafeDashActionsLib.Anon_TypeString */, T1 /* <: A */, T2 /* <: A */, T3 /* <: A */](
    actionCreators: js.Tuple3[
      typesafeDashActionsLib.distIsDashActionDashOfMod.AC[T1], 
      typesafeDashActionsLib.distIsDashActionDashOfMod.AC[T2], 
      typesafeDashActionsLib.distIsDashActionDashOfMod.AC[T3]
    ]
  ): js.Function1[/* action */ A, scala.Boolean] = js.native
  def isActionOf[A /* <: typesafeDashActionsLib.Anon_TypeString */, T1 /* <: A */, T2 /* <: A */, T3 /* <: A */](
    actionCreators: js.Tuple3[
      typesafeDashActionsLib.distIsDashActionDashOfMod.AC[T1], 
      typesafeDashActionsLib.distIsDashActionDashOfMod.AC[T2], 
      typesafeDashActionsLib.distIsDashActionDashOfMod.AC[T3]
    ],
    action: typesafeDashActionsLib.Anon_TypeString
  ): scala.Boolean = js.native
  def isActionOf[A /* <: typesafeDashActionsLib.Anon_TypeString */, T1 /* <: A */, T2 /* <: A */, T3 /* <: A */, T4 /* <: A */](
    actionCreators: js.Tuple4[
      typesafeDashActionsLib.distIsDashActionDashOfMod.AC[T1], 
      typesafeDashActionsLib.distIsDashActionDashOfMod.AC[T2], 
      typesafeDashActionsLib.distIsDashActionDashOfMod.AC[T3], 
      typesafeDashActionsLib.distIsDashActionDashOfMod.AC[T4]
    ]
  ): js.Function1[/* action */ A, scala.Boolean] = js.native
  def isActionOf[A /* <: typesafeDashActionsLib.Anon_TypeString */, T1 /* <: A */, T2 /* <: A */, T3 /* <: A */, T4 /* <: A */](
    actionCreators: js.Tuple4[
      typesafeDashActionsLib.distIsDashActionDashOfMod.AC[T1], 
      typesafeDashActionsLib.distIsDashActionDashOfMod.AC[T2], 
      typesafeDashActionsLib.distIsDashActionDashOfMod.AC[T3], 
      typesafeDashActionsLib.distIsDashActionDashOfMod.AC[T4]
    ],
    action: typesafeDashActionsLib.Anon_TypeString
  ): scala.Boolean = js.native
  def isActionOf[A /* <: typesafeDashActionsLib.Anon_TypeString */, T1 /* <: A */, T2 /* <: A */, T3 /* <: A */, T4 /* <: A */, T5 /* <: A */](
    actionCreators: js.Tuple5[
      typesafeDashActionsLib.distIsDashActionDashOfMod.AC[T1], 
      typesafeDashActionsLib.distIsDashActionDashOfMod.AC[T2], 
      typesafeDashActionsLib.distIsDashActionDashOfMod.AC[T3], 
      typesafeDashActionsLib.distIsDashActionDashOfMod.AC[T4], 
      typesafeDashActionsLib.distIsDashActionDashOfMod.AC[T5]
    ]
  ): js.Function1[/* action */ A, scala.Boolean] = js.native
  def isActionOf[A /* <: typesafeDashActionsLib.Anon_TypeString */, T1 /* <: A */, T2 /* <: A */, T3 /* <: A */, T4 /* <: A */, T5 /* <: A */](
    actionCreators: js.Tuple5[
      typesafeDashActionsLib.distIsDashActionDashOfMod.AC[T1], 
      typesafeDashActionsLib.distIsDashActionDashOfMod.AC[T2], 
      typesafeDashActionsLib.distIsDashActionDashOfMod.AC[T3], 
      typesafeDashActionsLib.distIsDashActionDashOfMod.AC[T4], 
      typesafeDashActionsLib.distIsDashActionDashOfMod.AC[T5]
    ],
    action: typesafeDashActionsLib.Anon_TypeString
  ): scala.Boolean = js.native
  def isOfType[T /* <: typesafeDashActionsLib.distTypesMod.StringType */](`type`: T): js.Function1[
    /* action */ typesafeDashActionsLib.Anon_TypeStringType, 
    /* is typesafe-actions.Anon_TypeStringType */ scala.Boolean
  ] = js.native
  def isOfType[T /* <: typesafeDashActionsLib.distTypesMod.StringType */, A /* <: typesafeDashActionsLib.Anon_TypeStringType */](`type`: T, action: A): /* is A */ scala.Boolean = js.native
  @JSName("isOfType")
  def isOfType_TArrayKStringType[T /* <: js.Array[K] */, K /* <: typesafeDashActionsLib.distTypesMod.StringType */](`type`: T): js.Function1[
    /* action */ typesafeDashActionsLib.Anon_TypeStringType, 
    /* is typesafe-actions.Anon_TypeStringType */ scala.Boolean
  ] = js.native
  @JSName("isOfType")
  def isOfType_TArrayKStringTypeAAnon_TypeStringType[T /* <: js.Array[K] */, K /* <: typesafeDashActionsLib.distTypesMod.StringType */, A /* <: typesafeDashActionsLib.Anon_TypeStringType */](`type`: T, action: A): /* is A */ scala.Boolean = js.native
}


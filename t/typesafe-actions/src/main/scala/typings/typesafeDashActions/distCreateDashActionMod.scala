package typings.typesafeDashActions

import typings.typesafeDashActions.distTypeDashHelpersMod.ActionCreator
import typings.typesafeDashActions.distTypeDashHelpersMod.TypeConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesafe-actions/dist/create-action", JSImport.Namespace)
@js.native
object distCreateDashActionMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.typesafeDashActions.Anon_MetaPayload[T, P, M]
    - typings.typesafeDashActions.Anon_Payload[T, P]
    - typings.typesafeDashActions.Anon_Meta[T, M]
    - typings.typesafeDashActions.Anon_Type[T]
  */
  trait PayloadMetaAction[T /* <: TypeConstant */, P, M] extends js.Object
  
  def createAction[T /* <: TypeConstant */, AC /* <: ActionCreator[T] */](`type`: T): AC = js.native
  def createAction[T /* <: TypeConstant */, AC /* <: ActionCreator[T] */](
    `type`: T,
    createHandler: js.Function1[
      /* actionCallback */ js.Function2[
        /* payload */ js.UndefOr[scala.Nothing], 
        /* meta */ js.UndefOr[scala.Nothing], 
        PayloadMetaAction[T, js.UndefOr[scala.Nothing], js.UndefOr[scala.Nothing]]
      ], 
      AC
    ]
  ): AC = js.native
}


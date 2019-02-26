package typings
package typesafeDashActionsLib.distCreateDashActionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesafe-actions/dist/create-action", JSImport.Namespace)
@js.native
object ^ extends js.Object {
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
}


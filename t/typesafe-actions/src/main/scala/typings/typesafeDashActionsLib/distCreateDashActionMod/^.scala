package typings
package typesafeDashActionsLib.distCreateDashActionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesafe-actions/dist/create-action", JSImport.Namespace)
@js.native
object ^ extends js.Object {
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
}


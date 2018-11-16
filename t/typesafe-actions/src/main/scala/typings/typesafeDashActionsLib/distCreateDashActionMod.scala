package typings
package typesafeDashActionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesafe-actions/dist/create-action", JSImport.Namespace)
@js.native
object distCreateDashActionMod extends js.Object {
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
}


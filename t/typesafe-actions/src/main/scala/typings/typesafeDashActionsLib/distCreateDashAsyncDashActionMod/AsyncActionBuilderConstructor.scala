package typings
package typesafeDashActionsLib.distCreateDashAsyncDashActionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncActionBuilderConstructor[T1 /* <: typesafeDashActionsLib.distTypeDashHelpersMod.StringType */, T2 /* <: typesafeDashActionsLib.distTypeDashHelpersMod.StringType */, T3 /* <: typesafeDashActionsLib.distTypeDashHelpersMod.StringType */, P1, P2, P3] extends js.Object {
  var failure: typesafeDashActionsLib.distTypeDashHelpersMod.ActionBuilderConstructor[T3, P3, js.UndefOr[scala.Nothing]]
  var request: typesafeDashActionsLib.distTypeDashHelpersMod.ActionBuilderConstructor[T1, P1, js.UndefOr[scala.Nothing]]
  var success: typesafeDashActionsLib.distTypeDashHelpersMod.ActionBuilderConstructor[T2, P2, js.UndefOr[scala.Nothing]]
}

object AsyncActionBuilderConstructor {
  @scala.inline
  def apply[T1 /* <: typesafeDashActionsLib.distTypeDashHelpersMod.StringType */, T2 /* <: typesafeDashActionsLib.distTypeDashHelpersMod.StringType */, T3 /* <: typesafeDashActionsLib.distTypeDashHelpersMod.StringType */, P1, P2, P3](
    failure: typesafeDashActionsLib.distTypeDashHelpersMod.ActionBuilderConstructor[T3, P3, js.UndefOr[scala.Nothing]],
    request: typesafeDashActionsLib.distTypeDashHelpersMod.ActionBuilderConstructor[T1, P1, js.UndefOr[scala.Nothing]],
    success: typesafeDashActionsLib.distTypeDashHelpersMod.ActionBuilderConstructor[T2, P2, js.UndefOr[scala.Nothing]]
  ): AsyncActionBuilderConstructor[T1, T2, T3, P1, P2, P3] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("failure")(failure.asInstanceOf[js.Any])
    __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    __obj.updateDynamic("success")(success.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncActionBuilderConstructor[T1, T2, T3, P1, P2, P3]]
  }
}


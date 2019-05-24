package typings
package typesafeDashActionsLib.distCreateDashAsyncDashActionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncActionCreator[TRequest /* <: js.Tuple2[T1, P1] */, TSuccess /* <: js.Tuple2[T2, P2] */, TFailure /* <: js.Tuple2[T3, P3] */, TCancel /* <: js.Tuple2[T4, P4] */, T1 /* <: typesafeDashActionsLib.distTypeDashHelpersMod.TypeConstant */, P1, T2 /* <: typesafeDashActionsLib.distTypeDashHelpersMod.TypeConstant */, P2, T3 /* <: typesafeDashActionsLib.distTypeDashHelpersMod.TypeConstant */, P3, T4 /* <: typesafeDashActionsLib.distTypeDashHelpersMod.TypeConstant */, P4] extends js.Object {
  var cancel: typesafeDashActionsLib.distTypeDashHelpersMod.ActionBuilderConstructor[T4, P4, js.UndefOr[scala.Nothing]]
  var failure: typesafeDashActionsLib.distTypeDashHelpersMod.ActionBuilderConstructor[T3, P3, js.UndefOr[scala.Nothing]]
  var request: typesafeDashActionsLib.distTypeDashHelpersMod.ActionBuilderConstructor[T1, P1, js.UndefOr[scala.Nothing]]
  var success: typesafeDashActionsLib.distTypeDashHelpersMod.ActionBuilderConstructor[T2, P2, js.UndefOr[scala.Nothing]]
}

object AsyncActionCreator {
  @scala.inline
  def apply[TRequest /* <: js.Tuple2[T1, P1] */, TSuccess /* <: js.Tuple2[T2, P2] */, TFailure /* <: js.Tuple2[T3, P3] */, TCancel /* <: js.Tuple2[T4, P4] */, T1 /* <: typesafeDashActionsLib.distTypeDashHelpersMod.TypeConstant */, P1, T2 /* <: typesafeDashActionsLib.distTypeDashHelpersMod.TypeConstant */, P2, T3 /* <: typesafeDashActionsLib.distTypeDashHelpersMod.TypeConstant */, P3, T4 /* <: typesafeDashActionsLib.distTypeDashHelpersMod.TypeConstant */, P4](
    cancel: typesafeDashActionsLib.distTypeDashHelpersMod.ActionBuilderConstructor[T4, P4, js.UndefOr[scala.Nothing]],
    failure: typesafeDashActionsLib.distTypeDashHelpersMod.ActionBuilderConstructor[T3, P3, js.UndefOr[scala.Nothing]],
    request: typesafeDashActionsLib.distTypeDashHelpersMod.ActionBuilderConstructor[T1, P1, js.UndefOr[scala.Nothing]],
    success: typesafeDashActionsLib.distTypeDashHelpersMod.ActionBuilderConstructor[T2, P2, js.UndefOr[scala.Nothing]]
  ): AsyncActionCreator[TRequest, TSuccess, TFailure, TCancel, T1, P1, T2, P2, T3, P3, T4, P4] = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], failure = failure.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AsyncActionCreator[TRequest, TSuccess, TFailure, TCancel, T1, P1, T2, P2, T3, P3, T4, P4]]
  }
}


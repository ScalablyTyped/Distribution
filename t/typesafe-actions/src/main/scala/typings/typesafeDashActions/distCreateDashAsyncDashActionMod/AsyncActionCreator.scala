package typings.typesafeDashActions.distCreateDashAsyncDashActionMod

import typings.typesafeDashActions.distTypeDashHelpersMod.ActionBuilderConstructor
import typings.typesafeDashActions.distTypeDashHelpersMod.TypeConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncActionCreator[TRequest /* <: js.Tuple2[T1, P1] */, TSuccess /* <: js.Tuple2[T2, P2] */, TFailure /* <: js.Tuple2[T3, P3] */, TCancel /* <: js.Tuple2[T4, P4] */, T1 /* <: TypeConstant */, P1, T2 /* <: TypeConstant */, P2, T3 /* <: TypeConstant */, P3, T4 /* <: TypeConstant */, P4] extends js.Object {
  var cancel: ActionBuilderConstructor[T4, P4, js.UndefOr[scala.Nothing]]
  var failure: ActionBuilderConstructor[T3, P3, js.UndefOr[scala.Nothing]]
  var request: ActionBuilderConstructor[T1, P1, js.UndefOr[scala.Nothing]]
  var success: ActionBuilderConstructor[T2, P2, js.UndefOr[scala.Nothing]]
}

object AsyncActionCreator {
  @scala.inline
  def apply[TRequest /* <: js.Tuple2[T1, P1] */, TSuccess /* <: js.Tuple2[T2, P2] */, TFailure /* <: js.Tuple2[T3, P3] */, TCancel /* <: js.Tuple2[T4, P4] */, T1 /* <: TypeConstant */, P1, T2 /* <: TypeConstant */, P2, T3 /* <: TypeConstant */, P3, T4 /* <: TypeConstant */, P4](
    cancel: ActionBuilderConstructor[T4, P4, js.UndefOr[scala.Nothing]],
    failure: ActionBuilderConstructor[T3, P3, js.UndefOr[scala.Nothing]],
    request: ActionBuilderConstructor[T1, P1, js.UndefOr[scala.Nothing]],
    success: ActionBuilderConstructor[T2, P2, js.UndefOr[scala.Nothing]]
  ): AsyncActionCreator[TRequest, TSuccess, TFailure, TCancel, T1, P1, T2, P2, T3, P3, T4, P4] = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], failure = failure.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AsyncActionCreator[TRequest, TSuccess, TFailure, TCancel, T1, P1, T2, P2, T3, P3, T4, P4]]
  }
}


package typings.urql

import typings.std.RequestInit
import typings.urqlCore.typesMod.OperationDebugMeta
import typings.urqlCore.typesMod.RequestPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@urql/core.@urql/core.OperationContext> */
trait PartialOperationContext extends js.Object {
  var additionalTypenames: js.UndefOr[js.Array[String]] = js.undefined
  var fetchOptions: js.UndefOr[RequestInit | js.Function0[RequestInit]] = js.undefined
  var meta: js.UndefOr[OperationDebugMeta] = js.undefined
  var pollInterval: js.UndefOr[Double] = js.undefined
  var preferGetMethod: js.UndefOr[Boolean] = js.undefined
  var requestPolicy: js.UndefOr[RequestPolicy] = js.undefined
  var suspense: js.UndefOr[Boolean] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object PartialOperationContext {
  @scala.inline
  def apply(
    additionalTypenames: js.Array[String] = null,
    fetchOptions: RequestInit | js.Function0[RequestInit] = null,
    meta: OperationDebugMeta = null,
    pollInterval: Int | Double = null,
    preferGetMethod: js.UndefOr[Boolean] = js.undefined,
    requestPolicy: RequestPolicy = null,
    suspense: js.UndefOr[Boolean] = js.undefined,
    url: String = null
  ): PartialOperationContext = {
    val __obj = js.Dynamic.literal()
    if (additionalTypenames != null) __obj.updateDynamic("additionalTypenames")(additionalTypenames.asInstanceOf[js.Any])
    if (fetchOptions != null) __obj.updateDynamic("fetchOptions")(fetchOptions.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (pollInterval != null) __obj.updateDynamic("pollInterval")(pollInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(preferGetMethod)) __obj.updateDynamic("preferGetMethod")(preferGetMethod.asInstanceOf[js.Any])
    if (requestPolicy != null) __obj.updateDynamic("requestPolicy")(requestPolicy.asInstanceOf[js.Any])
    if (!js.isUndefined(suspense)) __obj.updateDynamic("suspense")(suspense.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialOperationContext]
  }
}


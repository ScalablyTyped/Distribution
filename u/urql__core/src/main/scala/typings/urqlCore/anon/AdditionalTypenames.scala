package typings.urqlCore.anon

import typings.std.RequestInit
import typings.urqlCore.typesMod.RequestPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdditionalTypenames extends js.Object {
  var additionalTypenames: js.UndefOr[js.Array[String]] = js.undefined
  var fetch: js.UndefOr[FnCall] = js.undefined
  var fetchOptions: js.UndefOr[RequestInit | js.Function0[RequestInit]] = js.undefined
  var meta: CacheOutcome
  var pollInterval: js.UndefOr[Double] = js.undefined
  var preferGetMethod: js.UndefOr[Boolean] = js.undefined
  var requestPolicy: RequestPolicy
  var suspense: js.UndefOr[Boolean] = js.undefined
  var url: String
}

object AdditionalTypenames {
  @scala.inline
  def apply(
    meta: CacheOutcome,
    requestPolicy: RequestPolicy,
    url: String,
    additionalTypenames: js.Array[String] = null,
    fetch: FnCall = null,
    fetchOptions: RequestInit | js.Function0[RequestInit] = null,
    pollInterval: js.UndefOr[Double] = js.undefined,
    preferGetMethod: js.UndefOr[Boolean] = js.undefined,
    suspense: js.UndefOr[Boolean] = js.undefined
  ): AdditionalTypenames = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], requestPolicy = requestPolicy.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (additionalTypenames != null) __obj.updateDynamic("additionalTypenames")(additionalTypenames.asInstanceOf[js.Any])
    if (fetch != null) __obj.updateDynamic("fetch")(fetch.asInstanceOf[js.Any])
    if (fetchOptions != null) __obj.updateDynamic("fetchOptions")(fetchOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(pollInterval)) __obj.updateDynamic("pollInterval")(pollInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preferGetMethod)) __obj.updateDynamic("preferGetMethod")(preferGetMethod.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suspense)) __obj.updateDynamic("suspense")(suspense.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdditionalTypenames]
  }
}


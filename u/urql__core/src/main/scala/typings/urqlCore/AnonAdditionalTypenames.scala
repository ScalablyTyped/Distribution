package typings.urqlCore

import typings.std.RequestInit
import typings.urqlCore.typesMod.RequestPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAdditionalTypenames extends js.Object {
  var additionalTypenames: js.UndefOr[js.Array[String]] = js.undefined
  var fetchOptions: js.UndefOr[RequestInit | js.Function0[RequestInit]] = js.undefined
  var meta: AnonCacheOutcome
  var pollInterval: js.UndefOr[Double] = js.undefined
  var preferGetMethod: js.UndefOr[Boolean] = js.undefined
  var requestPolicy: RequestPolicy
  var suspense: js.UndefOr[Boolean] = js.undefined
  var url: String
}

object AnonAdditionalTypenames {
  @scala.inline
  def apply(
    meta: AnonCacheOutcome,
    requestPolicy: RequestPolicy,
    url: String,
    additionalTypenames: js.Array[String] = null,
    fetchOptions: RequestInit | js.Function0[RequestInit] = null,
    pollInterval: Int | Double = null,
    preferGetMethod: js.UndefOr[Boolean] = js.undefined,
    suspense: js.UndefOr[Boolean] = js.undefined
  ): AnonAdditionalTypenames = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], requestPolicy = requestPolicy.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (additionalTypenames != null) __obj.updateDynamic("additionalTypenames")(additionalTypenames.asInstanceOf[js.Any])
    if (fetchOptions != null) __obj.updateDynamic("fetchOptions")(fetchOptions.asInstanceOf[js.Any])
    if (pollInterval != null) __obj.updateDynamic("pollInterval")(pollInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(preferGetMethod)) __obj.updateDynamic("preferGetMethod")(preferGetMethod.asInstanceOf[js.Any])
    if (!js.isUndefined(suspense)) __obj.updateDynamic("suspense")(suspense.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAdditionalTypenames]
  }
}


package typings.urqlCore.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationContext
  extends /* key */ StringDictionary[js.Any] {
  var additionalTypenames: js.UndefOr[js.Array[String]] = js.undefined
  var fetchOptions: js.UndefOr[RequestInit | js.Function0[RequestInit]] = js.undefined
  var meta: js.UndefOr[OperationDebugMeta] = js.undefined
  var pollInterval: js.UndefOr[Double] = js.undefined
  var preferGetMethod: js.UndefOr[Boolean] = js.undefined
  var requestPolicy: RequestPolicy
  var suspense: js.UndefOr[Boolean] = js.undefined
  var url: String
}

object OperationContext {
  @scala.inline
  def apply(
    requestPolicy: RequestPolicy,
    url: String,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    additionalTypenames: js.Array[String] = null,
    fetchOptions: RequestInit | js.Function0[RequestInit] = null,
    meta: OperationDebugMeta = null,
    pollInterval: Int | Double = null,
    preferGetMethod: js.UndefOr[Boolean] = js.undefined,
    suspense: js.UndefOr[Boolean] = js.undefined
  ): OperationContext = {
    val __obj = js.Dynamic.literal(requestPolicy = requestPolicy.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (additionalTypenames != null) __obj.updateDynamic("additionalTypenames")(additionalTypenames.asInstanceOf[js.Any])
    if (fetchOptions != null) __obj.updateDynamic("fetchOptions")(fetchOptions.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (pollInterval != null) __obj.updateDynamic("pollInterval")(pollInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(preferGetMethod)) __obj.updateDynamic("preferGetMethod")(preferGetMethod.asInstanceOf[js.Any])
    if (!js.isUndefined(suspense)) __obj.updateDynamic("suspense")(suspense.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationContext]
  }
}


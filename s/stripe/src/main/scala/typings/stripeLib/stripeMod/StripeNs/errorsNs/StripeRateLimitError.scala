package typings
package stripeLib.stripeMod.StripeNs.errorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripeRateLimitError extends StripeError {
  @JSName("type")
  val type_StripeRateLimitError: stripeLib.stripeLibStrings.StripeRateLimitError
}

object StripeRateLimitError {
  @scala.inline
  def apply(
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    name: java.lang.String,
    raw: js.Any,
    rawType: RawType,
    readonly: scala.Double,
    requestId: java.lang.String,
    `type`: stripeLib.stripeLibStrings.StripeRateLimitError,
    code: java.lang.String = null,
    detail: js.Any = null,
    message: java.lang.String = null,
    param: java.lang.String = null,
    params: java.lang.String = null,
    stack: java.lang.String = null
  ): StripeRateLimitError = {
    val __obj = js.Dynamic.literal(headers = headers, name = name, raw = raw, rawType = rawType, readonly = readonly, requestId = requestId)
    __obj.updateDynamic("type")(`type`)
    if (code != null) __obj.updateDynamic("code")(code)
    if (detail != null) __obj.updateDynamic("detail")(detail)
    if (message != null) __obj.updateDynamic("message")(message)
    if (param != null) __obj.updateDynamic("param")(param)
    if (params != null) __obj.updateDynamic("params")(params)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[StripeRateLimitError]
  }
}


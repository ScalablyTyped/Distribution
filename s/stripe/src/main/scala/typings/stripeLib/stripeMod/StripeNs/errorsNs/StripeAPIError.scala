package typings
package stripeLib.stripeMod.StripeNs.errorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripeAPIError extends StripeError {
  @JSName("type")
  val type_StripeAPIError: stripeLib.stripeLibStrings.StripeAPIError
}

object StripeAPIError {
  @scala.inline
  def apply(
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    raw: js.Any,
    rawType: RawType,
    readonly: scala.Double,
    requestId: java.lang.String,
    `type`: stripeLib.stripeLibStrings.StripeAPIError,
    code: java.lang.String = null,
    detail: js.Any = null,
    message: java.lang.String = null,
    param: java.lang.String = null,
    params: java.lang.String = null,
    stack: java.lang.String = null
  ): StripeAPIError = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("headers")(headers)
    __obj.updateDynamic("raw")(raw)
    __obj.updateDynamic("rawType")(rawType)
    __obj.updateDynamic("readonly")(readonly)
    __obj.updateDynamic("requestId")(requestId)
    if (code != null) __obj.updateDynamic("code")(code)
    if (detail != null) __obj.updateDynamic("detail")(detail)
    if (message != null) __obj.updateDynamic("message")(message)
    if (param != null) __obj.updateDynamic("param")(param)
    if (params != null) __obj.updateDynamic("params")(params)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[StripeAPIError]
  }
}


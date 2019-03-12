package typings
package stripeLib.stripeMod.StripeNs.errorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- stripeLib.stripeMod.StripeNs.IStripeError because var conflicts: message. Inlined `type`, code, param */ trait StripeError extends _Error {
  val code: js.UndefOr[java.lang.String] = js.undefined
  val detail: js.UndefOr[js.Any] = js.undefined
  val headers: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  /**
    * The parameter the error relates to if the error is parameter-specific. You can use this to display a
    * message near the correct form field, for example.
    */
  var param: js.UndefOr[java.lang.String] = js.undefined
  val params: js.UndefOr[java.lang.String] = js.undefined
  val raw: js.Any
  val rawType: RawType
  var readonly: scala.Double
  val requestId: java.lang.String
  val `type`: java.lang.String
}

object StripeError {
  @scala.inline
  def apply(
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    name: java.lang.String,
    raw: js.Any,
    rawType: RawType,
    readonly: scala.Double,
    requestId: java.lang.String,
    `type`: java.lang.String,
    code: java.lang.String = null,
    detail: js.Any = null,
    message: java.lang.String = null,
    param: java.lang.String = null,
    params: java.lang.String = null,
    stack: java.lang.String = null
  ): StripeError = {
    val __obj = js.Dynamic.literal(headers = headers, name = name, raw = raw, rawType = rawType, readonly = readonly, requestId = requestId)
    __obj.updateDynamic("type")(`type`)
    if (code != null) __obj.updateDynamic("code")(code)
    if (detail != null) __obj.updateDynamic("detail")(detail)
    if (message != null) __obj.updateDynamic("message")(message)
    if (param != null) __obj.updateDynamic("param")(param)
    if (params != null) __obj.updateDynamic("params")(params)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[StripeError]
  }
}


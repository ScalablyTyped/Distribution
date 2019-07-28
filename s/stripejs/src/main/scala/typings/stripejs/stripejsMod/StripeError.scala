package typings.stripejs.stripejsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripeError extends js.Object {
  /**
    * For card errors, the ID of the failed charge
    */
  var charge: js.UndefOr[String] = js.undefined
  /**
    * For some errors that could be handled programmatically,
    * a short string indicating the error code reported
    */
  var code: js.UndefOr[String] = js.undefined
  /**
    * For card errors resulting from a card issuer decline,
    * a short string indicating the card issuer’s reason for the decline if they provide one
    */
  var decline_code: js.UndefOr[String] = js.undefined
  /**
    * A URL to more information about the error code reported
    */
  var doc_url: js.UndefOr[String] = js.undefined
  /**
    * A human-readable message providing more details about the error.
    * NOTE: For card errors, these messages can be shown to your users
    */
  var message: js.UndefOr[String] = js.undefined
  /**
    * If the error is parameter-specific, the parameter related to the error
    */
  var param: js.UndefOr[String] = js.undefined
  /**
    * The type of error that has occurred
    */
  var `type`: errorType
}

object StripeError {
  @scala.inline
  def apply(
    `type`: errorType,
    charge: String = null,
    code: String = null,
    decline_code: String = null,
    doc_url: String = null,
    message: String = null,
    param: String = null
  ): StripeError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (charge != null) __obj.updateDynamic("charge")(charge)
    if (code != null) __obj.updateDynamic("code")(code)
    if (decline_code != null) __obj.updateDynamic("decline_code")(decline_code)
    if (doc_url != null) __obj.updateDynamic("doc_url")(doc_url)
    if (message != null) __obj.updateDynamic("message")(message)
    if (param != null) __obj.updateDynamic("param")(param)
    __obj.asInstanceOf[StripeError]
  }
}


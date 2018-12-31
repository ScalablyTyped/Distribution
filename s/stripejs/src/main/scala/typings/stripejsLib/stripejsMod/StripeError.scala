package typings
package stripejsLib.stripejsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripeError extends js.Object {
  /**
    * For card errors, the ID of the failed charge
    */
  var charge: js.UndefOr[java.lang.String] = js.undefined
  /**
    * For some errors that could be handled programmatically,
    * a short string indicating the error code reported
    */
  var code: js.UndefOr[java.lang.String] = js.undefined
  /**
    * For card errors resulting from a card issuer decline,
    * a short string indicating the card issuer’s reason for the decline if they provide one
    */
  var decline_code: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A URL to more information about the error code reported
    */
  var doc_url: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A human-readable message providing more details about the error.
    * NOTE: For card errors, these messages can be shown to your users
    */
  var message: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If the error is parameter-specific, the parameter related to the error
    */
  var param: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The type of error that has occurred
    */
  var `type`: errorType
}


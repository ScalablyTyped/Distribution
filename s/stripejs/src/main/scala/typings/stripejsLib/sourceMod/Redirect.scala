package typings
package stripejsLib.sourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Redirect extends js.Object {
  /**
    * The failure reason for the redirect
    * Present only if the redirect status is `'failed'`
    */
  var failure_reason: js.UndefOr[
    stripejsLib.stripejsLibStrings.user_abort | stripejsLib.stripejsLibStrings.declined | stripejsLib.stripejsLibStrings.processing_error
  ] = js.undefined
  /**
    * The URL you provide to redirect the customer to after they authenticated their payment
    */
  var return_url: java.lang.String
  /**
    * The status of the redirect
    * - Pending: ready to be used by your customer to authenticate the transaction
    * - succeeded: succesful authentication, cannot be reused
    * - not_required: redirect should not be used
    * - failed: failed authentication, cannot be reused
    */
  var status: stripejsLib.stripejsLibStrings.pending | stripejsLib.stripejsLibStrings.succeeded | stripejsLib.stripejsLibStrings.not_required | stripejsLib.stripejsLibStrings.failed
  /**
    * The URL provided to you to redirect a customer to as part of a redirect
    * authentication flow
    */
  var url: java.lang.String
}


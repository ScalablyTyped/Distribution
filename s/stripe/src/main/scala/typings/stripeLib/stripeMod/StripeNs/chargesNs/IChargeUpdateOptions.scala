package typings
package stripeLib.stripeMod.StripeNs.chargesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChargeUpdateOptions
  extends stripeLib.stripeMod.StripeNs.IDataOptionsWithMetadata {
  /**
    * An arbitrary string which you can attach to a charge object. It is displayed when in the web interface alongside the charge.
    * Note that if you use Stripe to send automatic email receipts to your customers, your receipt emails will include the description
    * of the charge(s) that they are describing. This can be unset by updating the value to null and then saving.
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A set of key/value pairs you can attach to a charge giving information about its riskiness.
    */
  var fraud_details: js.UndefOr[stripeLib.Anon_Userreport] = js.undefined
  /**
    * This is the email address that the receipt for this charge will be sent to.
    * If this field is updated, then a new email receipt will be sent to the updated address.
    */
  var receipt_email: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Shipping information for the charge. Helps prevent fraud on charges for
    * physical goods.
    */
  var shipping: js.UndefOr[stripeLib.stripeMod.StripeNs.IShippingInformation] = js.undefined
}


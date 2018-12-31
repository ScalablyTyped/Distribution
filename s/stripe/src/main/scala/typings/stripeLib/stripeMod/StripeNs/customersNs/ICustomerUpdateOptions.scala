package typings
package stripeLib.stripeMod.StripeNs.customersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomerUpdateOptions
  extends stripeLib.stripeMod.StripeNs.IDataOptionsWithMetadata {
  /**
    * An integer amount in cents that is the starting account balance for your customer. A negative amount represents a credit that
    * will be used before attempting any charges to the customer's card; a positive amount will be added to the next invoice.
    */
  var account_balance: js.UndefOr[scala.Double] = js.undefined
  /**
    * If you provide a coupon code, the customer will have a discount applied on all recurring charges. Charges you create through the
    * API will not have the discount.
    */
  var coupon: js.UndefOr[java.lang.String] = js.undefined
  /**
    * ID of source to make the customer’s new default for invoice payments
    */
  var default_source: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An arbitrary string that you can attach to a customer object. It is displayed alongside the customer in the dashboard. This can
    * be unset by updating the value to null and then saving.
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Customer's email address. It's displayed alongside the customer in your dashboard and can be useful for searching and tracking.
    * This can be unset by updating the value to null and then saving.
    */
  var email: js.UndefOr[java.lang.String] = js.undefined
  var shipping: js.UndefOr[stripeLib.stripeMod.StripeNs.IShippingInformation] = js.undefined
  /**
    * The source can either be a token, like the ones returned by our Stripe.js, or
    * a dictionary containing a user’s credit card details (with the options shown
    * below). Passing source will create a new source object, make it the new
    * customer default source, and delete the old customer default if one exists.
    * If you want to add additional sources instead of replacing the existing
    * default, use the card creation API. Whenever you attach a card to a
    * customer, Stripe will automatically validate the card.
    */
  var source: js.UndefOr[stripeLib.stripeMod.StripeNs.sourcesNs.ISourceCreationOptionsExtended] = js.undefined
}


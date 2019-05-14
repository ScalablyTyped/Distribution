package typings
package stripeLib.stripeMod.customersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomerUpdateOptions
  extends stripeLib.stripeMod.IDataOptionsWithMetadata {
  /**
    * An integer amount in cents that is the starting account balance for your customer. A negative amount represents a credit that
    * will be used before attempting any charges to the customer's card; a positive amount will be added to the next invoice.
    */
  var account_balance: js.UndefOr[scala.Double] = js.undefined
  var address: js.UndefOr[stripeLib.stripeMod.IAddress] = js.undefined
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
  /**
    * The prefix for the customer used to generate unique invoice numbers.
    */
  var invoice_prefix: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The customer’s full name or business name. This can be unset by updating the value to null and then saving.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The customer’s phone number. This can be unset by updating the value to null and then saving.
    */
  var phone: js.UndefOr[java.lang.String] = js.undefined
  var shipping: js.UndefOr[stripeLib.stripeMod.IShippingInformation] = js.undefined
  /**
    * The source can either be a token, like the ones returned by our Stripe.js, or
    * a dictionary containing a user’s credit card details (with the options shown
    * below). Passing source will create a new source object, make it the new
    * customer default source, and delete the old customer default if one exists.
    * If you want to add additional sources instead of replacing the existing
    * default, use the card creation API. Whenever you attach a card to a
    * customer, Stripe will automatically validate the card.
    */
  var source: js.UndefOr[stripeLib.stripeMod.sourcesNs.ISourceCreationOptionsExtended] = js.undefined
}

object ICustomerUpdateOptions {
  @scala.inline
  def apply(
    account_balance: scala.Int | scala.Double = null,
    address: stripeLib.stripeMod.IAddress = null,
    coupon: java.lang.String = null,
    default_source: java.lang.String = null,
    description: java.lang.String = null,
    email: java.lang.String = null,
    expand: js.Array[java.lang.String] = null,
    include: js.Array[java.lang.String] = null,
    invoice_prefix: java.lang.String = null,
    metadata: stripeLib.stripeMod.IOptionsMetadata = null,
    name: java.lang.String = null,
    phone: java.lang.String = null,
    shipping: stripeLib.stripeMod.IShippingInformation = null,
    source: stripeLib.stripeMod.sourcesNs.ISourceCreationOptionsExtended = null
  ): ICustomerUpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (account_balance != null) __obj.updateDynamic("account_balance")(account_balance.asInstanceOf[js.Any])
    if (address != null) __obj.updateDynamic("address")(address)
    if (coupon != null) __obj.updateDynamic("coupon")(coupon)
    if (default_source != null) __obj.updateDynamic("default_source")(default_source)
    if (description != null) __obj.updateDynamic("description")(description)
    if (email != null) __obj.updateDynamic("email")(email)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (include != null) __obj.updateDynamic("include")(include)
    if (invoice_prefix != null) __obj.updateDynamic("invoice_prefix")(invoice_prefix)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (name != null) __obj.updateDynamic("name")(name)
    if (phone != null) __obj.updateDynamic("phone")(phone)
    if (shipping != null) __obj.updateDynamic("shipping")(shipping)
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomerUpdateOptions]
  }
}


package typings.stripe.mod.customers

import typings.stripe.mod.IAddress
import typings.stripe.mod.IDataOptionsWithMetadata
import typings.stripe.mod.IOptionsMetadata
import typings.stripe.mod.IShippingInformation
import typings.stripe.mod.cards.ICardSourceCreationOptionsExtended
import typings.stripe.stripeStrings.exempt
import typings.stripe.stripeStrings.none
import typings.stripe.stripeStrings.reverse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomerUpdateOptions extends IDataOptionsWithMetadata {
  /**
    * This field has been renamed to balance and will be removed in a future API version.
    * @deprecated
    */
  var account_balance: js.UndefOr[Double] = js.undefined
  var address: js.UndefOr[IAddress] = js.undefined
  /**
    * An integer amount in cents that represents the customer’s current balance, which affect the
    * customer’s future invoices. A negative amount represents a credit that decreases the amount
    * due on an invoice; a positive amount increases the amount due on an invoice.
    */
  var balance: js.UndefOr[Double] = js.undefined
  /**
    * If you provide a coupon code, the customer will have a discount applied on all recurring charges. Charges you create through the
    * API will not have the discount.
    */
  var coupon: js.UndefOr[String] = js.undefined
  /**
    * ID of source to make the customer’s new default for invoice payments
    */
  var default_source: js.UndefOr[String] = js.undefined
  /**
    * An arbitrary string that you can attach to a customer object. It is displayed alongside the customer in the dashboard. This can
    * be unset by updating the value to null and then saving.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Customer's email address. It's displayed alongside the customer in your dashboard and can be useful for searching and tracking.
    * This can be unset by updating the value to null and then saving.
    */
  var email: js.UndefOr[String] = js.undefined
  /**
    * The prefix for the customer used to generate unique invoice numbers.
    */
  var invoice_prefix: js.UndefOr[String] = js.undefined
  /**
    * Default invoice settings for this customer.
    */
  var invoice_settings: js.UndefOr[ICustomerInvoiceSettings | Null] = js.undefined
  /**
    * The customer’s full name or business name. This can be unset by updating the value to null and then saving.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The customer’s phone number. This can be unset by updating the value to null and then saving.
    */
  var phone: js.UndefOr[String] = js.undefined
  /**
    * Customer’s preferred languages, ordered by preference. This can be unset by updating
    * the value to null and then saving.
    */
  var preferred_locales: js.UndefOr[js.Array[String] | Null] = js.undefined
  var shipping: js.UndefOr[IShippingInformation] = js.undefined
  /**
    * The source can either be a token, like the ones returned by our Stripe.js, or
    * a dictionary containing a user’s credit card details (with the options shown
    * below). Passing source will create a new source object, make it the new
    * customer default source, and delete the old customer default if one exists.
    * If you want to add additional sources instead of replacing the existing
    * default, use the card creation API. Whenever you attach a card to a
    * customer, Stripe will automatically validate the card.
    */
  var source: js.UndefOr[String | ICardSourceCreationOptionsExtended] = js.undefined
  /**
    * The customer’s tax exemption. One of none, exempt, or reverse.
    */
  var tax_exempt: js.UndefOr[none | exempt | reverse] = js.undefined
  /**
    * @deprecated
    */
  var tax_info: js.UndefOr[js.Any] = js.undefined
}

object ICustomerUpdateOptions {
  @scala.inline
  def apply(
    account_balance: Int | Double = null,
    address: IAddress = null,
    balance: Int | Double = null,
    coupon: String = null,
    default_source: String = null,
    description: String = null,
    email: String = null,
    expand: js.Array[String] = null,
    include: js.Array[String] = null,
    invoice_prefix: String = null,
    invoice_settings: ICustomerInvoiceSettings = null,
    metadata: IOptionsMetadata = null,
    name: String = null,
    phone: String = null,
    preferred_locales: js.Array[String] = null,
    shipping: IShippingInformation = null,
    source: String | ICardSourceCreationOptionsExtended = null,
    tax_exempt: none | exempt | reverse = null,
    tax_info: js.Any = null
  ): ICustomerUpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (account_balance != null) __obj.updateDynamic("account_balance")(account_balance.asInstanceOf[js.Any])
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (balance != null) __obj.updateDynamic("balance")(balance.asInstanceOf[js.Any])
    if (coupon != null) __obj.updateDynamic("coupon")(coupon.asInstanceOf[js.Any])
    if (default_source != null) __obj.updateDynamic("default_source")(default_source.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (invoice_prefix != null) __obj.updateDynamic("invoice_prefix")(invoice_prefix.asInstanceOf[js.Any])
    if (invoice_settings != null) __obj.updateDynamic("invoice_settings")(invoice_settings.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (phone != null) __obj.updateDynamic("phone")(phone.asInstanceOf[js.Any])
    if (preferred_locales != null) __obj.updateDynamic("preferred_locales")(preferred_locales.asInstanceOf[js.Any])
    if (shipping != null) __obj.updateDynamic("shipping")(shipping.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (tax_exempt != null) __obj.updateDynamic("tax_exempt")(tax_exempt.asInstanceOf[js.Any])
    if (tax_info != null) __obj.updateDynamic("tax_info")(tax_info.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomerUpdateOptions]
  }
}


package typings.stripe.stripeMod.customers

import typings.stripe.stripeMod.IAddress
import typings.stripe.stripeMod.IList
import typings.stripe.stripeMod.IMetadata
import typings.stripe.stripeMod.IResourceObject
import typings.stripe.stripeMod.IShippingInformation
import typings.stripe.stripeMod.IStripeSource
import typings.stripe.stripeMod.coupons.IDiscount
import typings.stripe.stripeMod.customerTaxIds.ITaxId
import typings.stripe.stripeMod.resources.CustomerCards
import typings.stripe.stripeStrings.customer
import typings.stripe.stripeStrings.exempt
import typings.stripe.stripeStrings.none
import typings.stripe.stripeStrings.reverse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Customer objects allow you to perform recurring charges and track multiple charges that are associated
  * with the same customer. The API allows you to create, delete, and update your customers. You can
  * retrieve individual customers as well as a list of all your customers.
  */
trait ICustomer extends IResourceObject {
  /**
    * This field has been renamed to balance and will be removed in a future API version.
    * @deprecated
    */
  var account_balance: js.UndefOr[Double] = js.undefined
  var address: IAddress | Null
  /**
    * Current balance, if any, being stored on the customer. If negative, the customer has credit
    * to apply to their next invoice. If positive, the customer has an amount owed that will be
    * added to their next invoice. The balance does not refer to any unpaid invoices; it solely
    * takes into account amounts that have yet to be successfully applied to any invoice. This
    * balance is only taken into account as invoices are finalized.
    */
  var balance: js.UndefOr[Double] = js.undefined
  var cards: js.UndefOr[CustomerCards] = js.undefined
  var created: Double
  /**
    * The currency the customer can be charged in for recurring billing purposes (subscriptions, invoices, invoice items).
    */
  var currency: String | Null
  /**
    * ID of the default source attached to this customer. [Expandable]
    */
  var default_source: String | IStripeSource | Null
  /**
    * Whether or not the latest charge for the customer's latest invoice has failed
    */
  var delinquent: Boolean
  var description: js.UndefOr[String] = js.undefined
  /**
    * Describes the current discount active on the customer, if there is one.
    */
  var discount: js.UndefOr[IDiscount] = js.undefined
  var email: js.UndefOr[String] = js.undefined
  /**
    * The prefix for the customer used to generate unique invoice numbers.
    */
  var invoice_prefix: js.UndefOr[String] = js.undefined
  /**
    * Default invoice settings for this customer.
    */
  var invoice_settings: js.UndefOr[ICustomerInvoiceSettings | Null] = js.undefined
  var livemode: Boolean
  var metadata: IMetadata
  /**
    * The customer’s full name or business name.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  /**
    * Value is 'customer'
    */
  @JSName("object")
  var object_ICustomer: customer
  /**
    * The customer’s phone number.
    */
  var phone: js.UndefOr[String] = js.undefined
  /**
    * The customer’s preferred locales (languages), ordered by preference.
    */
  var preferred_locales: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Shipping information associated with the customer.
    */
  var shipping: IShippingInformation | Null
  /**
    * The customer’s payment sources, if any
    */
  var sources: js.UndefOr[IList[IStripeSource]] = js.undefined
  /**
    * The customer's current subscriptions, if any
    */
  var subscriptions: ICustomerSubscriptions
  /**
    * Describes the customer’s tax exemption status. One of none, exempt, or reverse.
    * When set to reverse, invoice and receipt PDFs include the text “Reverse charge”.
    */
  var tax_exempt: js.UndefOr[none | exempt | reverse] = js.undefined
  /**
    * The customer’s tax IDs.
    */
  var tax_ids: js.UndefOr[IList[ITaxId]] = js.undefined
  /**
    * @deprecated
    */
  var tax_info: js.UndefOr[js.Any] = js.undefined
  /**
    * @deprecated
    */
  var tax_info_verification: js.UndefOr[js.Any] = js.undefined
}

object ICustomer {
  @scala.inline
  def apply(
    created: Double,
    delinquent: Boolean,
    id: String,
    livemode: Boolean,
    metadata: IMetadata,
    `object`: customer,
    subscriptions: ICustomerSubscriptions,
    account_balance: Int | Double = null,
    address: IAddress = null,
    balance: Int | Double = null,
    cards: CustomerCards = null,
    currency: String = null,
    default_source: String | IStripeSource = null,
    description: String = null,
    discount: IDiscount = null,
    email: String = null,
    invoice_prefix: String = null,
    invoice_settings: ICustomerInvoiceSettings = null,
    name: String = null,
    phone: String = null,
    preferred_locales: js.Array[String] = null,
    shipping: IShippingInformation = null,
    sources: IList[IStripeSource] = null,
    tax_exempt: none | exempt | reverse = null,
    tax_ids: IList[ITaxId] = null,
    tax_info: js.Any = null,
    tax_info_verification: js.Any = null
  ): ICustomer = {
    val __obj = js.Dynamic.literal(created = created, delinquent = delinquent, id = id, livemode = livemode, metadata = metadata, subscriptions = subscriptions)
    __obj.updateDynamic("object")(`object`)
    if (account_balance != null) __obj.updateDynamic("account_balance")(account_balance.asInstanceOf[js.Any])
    if (address != null) __obj.updateDynamic("address")(address)
    if (balance != null) __obj.updateDynamic("balance")(balance.asInstanceOf[js.Any])
    if (cards != null) __obj.updateDynamic("cards")(cards)
    if (currency != null) __obj.updateDynamic("currency")(currency)
    if (default_source != null) __obj.updateDynamic("default_source")(default_source.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description)
    if (discount != null) __obj.updateDynamic("discount")(discount)
    if (email != null) __obj.updateDynamic("email")(email)
    if (invoice_prefix != null) __obj.updateDynamic("invoice_prefix")(invoice_prefix)
    if (invoice_settings != null) __obj.updateDynamic("invoice_settings")(invoice_settings)
    if (name != null) __obj.updateDynamic("name")(name)
    if (phone != null) __obj.updateDynamic("phone")(phone)
    if (preferred_locales != null) __obj.updateDynamic("preferred_locales")(preferred_locales)
    if (shipping != null) __obj.updateDynamic("shipping")(shipping)
    if (sources != null) __obj.updateDynamic("sources")(sources)
    if (tax_exempt != null) __obj.updateDynamic("tax_exempt")(tax_exempt.asInstanceOf[js.Any])
    if (tax_ids != null) __obj.updateDynamic("tax_ids")(tax_ids)
    if (tax_info != null) __obj.updateDynamic("tax_info")(tax_info)
    if (tax_info_verification != null) __obj.updateDynamic("tax_info_verification")(tax_info_verification)
    __obj.asInstanceOf[ICustomer]
  }
}


package typings.stripe.stripeMod.customersNs

import typings.stripe.stripeMod.IAddress
import typings.stripe.stripeMod.IList
import typings.stripe.stripeMod.IMetadata
import typings.stripe.stripeMod.IResourceObject
import typings.stripe.stripeMod.IShippingInformation
import typings.stripe.stripeMod.IStripeSource
import typings.stripe.stripeMod.couponsNs.IDiscount
import typings.stripe.stripeMod.resourcesNs.CustomerCards
import typings.stripe.stripeStrings.customer
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
    * Current balance, if any, being stored on the customer's account. If negative, the customer has credit to apply to
    * the next invoice. If positive, the customer has an amount owed that will be added to the next invoice. The balance
    * does not refer to any unpaid invoices; it solely takes into account amounts that have yet to be successfully applied
    * to any invoice. This balance is only taken into account for recurring charges.
    */
  var account_balance: js.UndefOr[Double] = js.undefined
  var address: IAddress | Null
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
    cards: CustomerCards = null,
    currency: String = null,
    default_source: String | IStripeSource = null,
    description: String = null,
    discount: IDiscount = null,
    email: String = null,
    invoice_settings: ICustomerInvoiceSettings = null,
    name: String = null,
    phone: String = null,
    shipping: IShippingInformation = null,
    sources: IList[IStripeSource] = null
  ): ICustomer = {
    val __obj = js.Dynamic.literal(created = created, delinquent = delinquent, id = id, livemode = livemode, metadata = metadata, subscriptions = subscriptions)
    __obj.updateDynamic("object")(`object`)
    if (account_balance != null) __obj.updateDynamic("account_balance")(account_balance.asInstanceOf[js.Any])
    if (address != null) __obj.updateDynamic("address")(address)
    if (cards != null) __obj.updateDynamic("cards")(cards)
    if (currency != null) __obj.updateDynamic("currency")(currency)
    if (default_source != null) __obj.updateDynamic("default_source")(default_source.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description)
    if (discount != null) __obj.updateDynamic("discount")(discount)
    if (email != null) __obj.updateDynamic("email")(email)
    if (invoice_settings != null) __obj.updateDynamic("invoice_settings")(invoice_settings)
    if (name != null) __obj.updateDynamic("name")(name)
    if (phone != null) __obj.updateDynamic("phone")(phone)
    if (shipping != null) __obj.updateDynamic("shipping")(shipping)
    if (sources != null) __obj.updateDynamic("sources")(sources)
    __obj.asInstanceOf[ICustomer]
  }
}


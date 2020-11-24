package typings.stripe.mod.customers

import typings.stripe.mod.IAddress
import typings.stripe.mod.IList
import typings.stripe.mod.IMetadata
import typings.stripe.mod.IResourceObject
import typings.stripe.mod.IShippingInformation
import typings.stripe.mod.IStripeSource
import typings.stripe.mod.coupons.IDiscount
import typings.stripe.mod.customerTaxIds.ITaxId
import typings.stripe.mod.resources.CustomerCards
import typings.stripe.stripeStrings.customer
import typings.stripe.stripeStrings.exempt
import typings.stripe.stripeStrings.none
import typings.stripe.stripeStrings.reverse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Customer objects allow you to perform recurring charges and track multiple charges that are associated
  * with the same customer. The API allows you to create, delete, and update your customers. You can
  * retrieve individual customers as well as a list of all your customers.
  */
@js.native
trait ICustomer extends IResourceObject {
  
  /**
    * This field has been renamed to balance and will be removed in a future API version.
    * @deprecated
    */
  var account_balance: js.UndefOr[Double] = js.native
  
  var address: IAddress | Null = js.native
  
  /**
    * Current balance, if any, being stored on the customer. If negative, the customer has credit
    * to apply to their next invoice. If positive, the customer has an amount owed that will be
    * added to their next invoice. The balance does not refer to any unpaid invoices; it solely
    * takes into account amounts that have yet to be successfully applied to any invoice. This
    * balance is only taken into account as invoices are finalized.
    */
  var balance: js.UndefOr[Double] = js.native
  
  var cards: js.UndefOr[CustomerCards] = js.native
  
  var created: Double = js.native
  
  /**
    * The currency the customer can be charged in for recurring billing purposes (subscriptions, invoices, invoice items).
    */
  var currency: String | Null = js.native
  
  /**
    * ID of the default source attached to this customer. [Expandable]
    */
  var default_source: String | IStripeSource | Null = js.native
  
  /**
    * Whether or not the latest charge for the customer's latest invoice has failed
    */
  var delinquent: Boolean = js.native
  
  var description: js.UndefOr[String] = js.native
  
  /**
    * Describes the current discount active on the customer, if there is one.
    */
  var discount: js.UndefOr[IDiscount] = js.native
  
  var email: js.UndefOr[String] = js.native
  
  /**
    * The prefix for the customer used to generate unique invoice numbers.
    */
  var invoice_prefix: js.UndefOr[String] = js.native
  
  /**
    * Default invoice settings for this customer.
    */
  var invoice_settings: js.UndefOr[ICustomerInvoiceSettings | Null] = js.native
  
  var livemode: Boolean = js.native
  
  var metadata: IMetadata = js.native
  
  /**
    * The customer’s full name or business name.
    */
  var name: js.UndefOr[String | Null] = js.native
  
  /**
    * Value is 'customer'
    */
  @JSName("object")
  var object_ICustomer: customer = js.native
  
  /**
    * The customer’s phone number.
    */
  var phone: js.UndefOr[String] = js.native
  
  /**
    * The customer’s preferred locales (languages), ordered by preference.
    */
  var preferred_locales: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Shipping information associated with the customer.
    */
  var shipping: IShippingInformation | Null = js.native
  
  /**
    * The customer’s payment sources, if any
    */
  var sources: js.UndefOr[IList[IStripeSource]] = js.native
  
  /**
    * The customer's current subscriptions, if any
    */
  var subscriptions: ICustomerSubscriptions = js.native
  
  /**
    * Describes the customer’s tax exemption status. One of none, exempt, or reverse.
    * When set to reverse, invoice and receipt PDFs include the text “Reverse charge”.
    */
  var tax_exempt: js.UndefOr[none | exempt | reverse] = js.native
  
  /**
    * The customer’s tax IDs.
    */
  var tax_ids: js.UndefOr[IList[ITaxId]] = js.native
  
  /**
    * @deprecated
    */
  var tax_info: js.UndefOr[js.Any] = js.native
  
  /**
    * @deprecated
    */
  var tax_info_verification: js.UndefOr[js.Any] = js.native
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
    subscriptions: ICustomerSubscriptions
  ): ICustomer = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], delinquent = delinquent.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], subscriptions = subscriptions.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomer]
  }
  
  @scala.inline
  implicit class ICustomerOps[Self <: ICustomer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreated(value: Double): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelinquent(value: Boolean): Self = this.set("delinquent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLivemode(value: Boolean): Self = this.set("livemode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: IMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: customer): Self = this.set("object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptions(value: ICustomerSubscriptions): Self = this.set("subscriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccount_balance(value: Double): Self = this.set("account_balance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccount_balance: Self = this.set("account_balance", js.undefined)
    
    @scala.inline
    def setAddress(value: IAddress): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressNull: Self = this.set("address", null)
    
    @scala.inline
    def setBalance(value: Double): Self = this.set("balance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBalance: Self = this.set("balance", js.undefined)
    
    @scala.inline
    def setCards(value: CustomerCards): Self = this.set("cards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCards: Self = this.set("cards", js.undefined)
    
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyNull: Self = this.set("currency", null)
    
    @scala.inline
    def setDefault_source(value: String | IStripeSource): Self = this.set("default_source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault_sourceNull: Self = this.set("default_source", null)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDiscount(value: IDiscount): Self = this.set("discount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiscount: Self = this.set("discount", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setInvoice_prefix(value: String): Self = this.set("invoice_prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvoice_prefix: Self = this.set("invoice_prefix", js.undefined)
    
    @scala.inline
    def setInvoice_settings(value: ICustomerInvoiceSettings): Self = this.set("invoice_settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvoice_settings: Self = this.set("invoice_settings", js.undefined)
    
    @scala.inline
    def setInvoice_settingsNull: Self = this.set("invoice_settings", null)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNameNull: Self = this.set("name", null)
    
    @scala.inline
    def setPhone(value: String): Self = this.set("phone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhone: Self = this.set("phone", js.undefined)
    
    @scala.inline
    def setPreferred_localesVarargs(value: String*): Self = this.set("preferred_locales", js.Array(value :_*))
    
    @scala.inline
    def setPreferred_locales(value: js.Array[String]): Self = this.set("preferred_locales", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferred_locales: Self = this.set("preferred_locales", js.undefined)
    
    @scala.inline
    def setShipping(value: IShippingInformation): Self = this.set("shipping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShippingNull: Self = this.set("shipping", null)
    
    @scala.inline
    def setSources(value: IList[IStripeSource]): Self = this.set("sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSources: Self = this.set("sources", js.undefined)
    
    @scala.inline
    def setTax_exempt(value: none | exempt | reverse): Self = this.set("tax_exempt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTax_exempt: Self = this.set("tax_exempt", js.undefined)
    
    @scala.inline
    def setTax_ids(value: IList[ITaxId]): Self = this.set("tax_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTax_ids: Self = this.set("tax_ids", js.undefined)
    
    @scala.inline
    def setTax_info(value: js.Any): Self = this.set("tax_info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTax_info: Self = this.set("tax_info", js.undefined)
    
    @scala.inline
    def setTax_info_verification(value: js.Any): Self = this.set("tax_info_verification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTax_info_verification: Self = this.set("tax_info_verification", js.undefined)
  }
}

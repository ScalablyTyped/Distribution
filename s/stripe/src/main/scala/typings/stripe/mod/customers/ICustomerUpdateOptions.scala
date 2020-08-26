package typings.stripe.mod.customers

import typings.stripe.mod.IAddress
import typings.stripe.mod.IDataOptionsWithMetadata
import typings.stripe.mod.IShippingInformation
import typings.stripe.mod.cards.ICardSourceCreationOptionsExtended
import typings.stripe.stripeStrings.exempt
import typings.stripe.stripeStrings.none
import typings.stripe.stripeStrings.reverse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICustomerUpdateOptions extends IDataOptionsWithMetadata {
  /**
    * This field has been renamed to balance and will be removed in a future API version.
    * @deprecated
    */
  var account_balance: js.UndefOr[Double] = js.native
  var address: js.UndefOr[IAddress] = js.native
  /**
    * An integer amount in cents that represents the customer’s current balance, which affect the
    * customer’s future invoices. A negative amount represents a credit that decreases the amount
    * due on an invoice; a positive amount increases the amount due on an invoice.
    */
  var balance: js.UndefOr[Double] = js.native
  /**
    * If you provide a coupon code, the customer will have a discount applied on all recurring charges. Charges you create through the
    * API will not have the discount.
    */
  var coupon: js.UndefOr[String] = js.native
  /**
    * ID of source to make the customer’s new default for invoice payments
    */
  var default_source: js.UndefOr[String] = js.native
  /**
    * An arbitrary string that you can attach to a customer object. It is displayed alongside the customer in the dashboard. This can
    * be unset by updating the value to null and then saving.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Customer's email address. It's displayed alongside the customer in your dashboard and can be useful for searching and tracking.
    * This can be unset by updating the value to null and then saving.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * The prefix for the customer used to generate unique invoice numbers.
    */
  var invoice_prefix: js.UndefOr[String] = js.native
  /**
    * Default invoice settings for this customer.
    */
  var invoice_settings: js.UndefOr[ICustomerInvoiceSettings | Null] = js.native
  /**
    * The customer’s full name or business name. This can be unset by updating the value to null and then saving.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The customer’s phone number. This can be unset by updating the value to null and then saving.
    */
  var phone: js.UndefOr[String] = js.native
  /**
    * Customer’s preferred languages, ordered by preference. This can be unset by updating
    * the value to null and then saving.
    */
  var preferred_locales: js.UndefOr[js.Array[String] | Null] = js.native
  var shipping: js.UndefOr[IShippingInformation] = js.native
  /**
    * The source can either be a token, like the ones returned by our Stripe.js, or
    * a dictionary containing a user’s credit card details (with the options shown
    * below). Passing source will create a new source object, make it the new
    * customer default source, and delete the old customer default if one exists.
    * If you want to add additional sources instead of replacing the existing
    * default, use the card creation API. Whenever you attach a card to a
    * customer, Stripe will automatically validate the card.
    */
  var source: js.UndefOr[String | ICardSourceCreationOptionsExtended] = js.native
  /**
    * The customer’s tax exemption. One of none, exempt, or reverse.
    */
  var tax_exempt: js.UndefOr[none | exempt | reverse] = js.native
  /**
    * @deprecated
    */
  var tax_info: js.UndefOr[js.Any] = js.native
}

object ICustomerUpdateOptions {
  @scala.inline
  def apply(): ICustomerUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICustomerUpdateOptions]
  }
  @scala.inline
  implicit class ICustomerUpdateOptionsOps[Self <: ICustomerUpdateOptions] (val x: Self) extends AnyVal {
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
    def setAccount_balance(value: Double): Self = this.set("account_balance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccount_balance: Self = this.set("account_balance", js.undefined)
    @scala.inline
    def setAddress(value: IAddress): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    @scala.inline
    def setBalance(value: Double): Self = this.set("balance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBalance: Self = this.set("balance", js.undefined)
    @scala.inline
    def setCoupon(value: String): Self = this.set("coupon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoupon: Self = this.set("coupon", js.undefined)
    @scala.inline
    def setDefault_source(value: String): Self = this.set("default_source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault_source: Self = this.set("default_source", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
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
    def setPreferred_localesNull: Self = this.set("preferred_locales", null)
    @scala.inline
    def setShipping(value: IShippingInformation): Self = this.set("shipping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShipping: Self = this.set("shipping", js.undefined)
    @scala.inline
    def setSource(value: String | ICardSourceCreationOptionsExtended): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setTax_exempt(value: none | exempt | reverse): Self = this.set("tax_exempt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTax_exempt: Self = this.set("tax_exempt", js.undefined)
    @scala.inline
    def setTax_info(value: js.Any): Self = this.set("tax_info", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTax_info: Self = this.set("tax_info", js.undefined)
  }
  
}


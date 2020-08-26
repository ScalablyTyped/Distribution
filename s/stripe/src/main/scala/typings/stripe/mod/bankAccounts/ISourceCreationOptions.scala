package typings.stripe.mod.bankAccounts

import typings.stripe.stripeStrings.bank_account
import typings.stripe.stripeStrings.company
import typings.stripe.stripeStrings.individual
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISourceCreationOptions extends js.Object {
  /**
    * The name of the person or business that owns the bank
    * account. This field is required when attaching the bank
    * account to a customer object.
    */
  var account_holder_name: js.UndefOr[String] = js.native
  /**
    * The type of entity that holds the account. This can be either
    * "individual" or "company". This field is required when
    * attaching the bank account to a customer object.
    */
  var account_holder_type: js.UndefOr[individual | company] = js.native
  /**
    * The account number for the bank account in string form.
    * Must be a checking account.
    */
  var account_number: String = js.native
  /**
    * The country the bank account is in.
    */
  var country: String = js.native
  /**
    * The currency the bank account is in. This must be a
    * country/currency pairing that Stripe supports.
    */
  var currency: String = js.native
  /**
    * The type of payment source. Should be "bank_account".
    */
  var `object`: bank_account = js.native
  /**
    * The routing number, sort code, or other country-appropriate
    * institution number for the bank account. For US bank
    * accounts, this is required and should be the ACH routing
    * number, not the wire routing number. If you are providing an
    * IBAN for account_number, this field is not required.
    */
  var routing_number: js.UndefOr[String] = js.native
}

object ISourceCreationOptions {
  @scala.inline
  def apply(account_number: String, country: String, currency: String, `object`: bank_account): ISourceCreationOptions = {
    val __obj = js.Dynamic.literal(account_number = account_number.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISourceCreationOptions]
  }
  @scala.inline
  implicit class ISourceCreationOptionsOps[Self <: ISourceCreationOptions] (val x: Self) extends AnyVal {
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
    def setAccount_number(value: String): Self = this.set("account_number", value.asInstanceOf[js.Any])
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def setObject(value: bank_account): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccount_holder_name(value: String): Self = this.set("account_holder_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccount_holder_name: Self = this.set("account_holder_name", js.undefined)
    @scala.inline
    def setAccount_holder_type(value: individual | company): Self = this.set("account_holder_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccount_holder_type: Self = this.set("account_holder_type", js.undefined)
    @scala.inline
    def setRouting_number(value: String): Self = this.set("routing_number", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRouting_number: Self = this.set("routing_number", js.undefined)
  }
  
}


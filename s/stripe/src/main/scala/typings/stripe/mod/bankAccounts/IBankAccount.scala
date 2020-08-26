package typings.stripe.mod.bankAccounts

import typings.stripe.mod.IMetadata
import typings.stripe.mod.IStripeSource
import typings.stripe.mod.accounts.IExternalAccount
import typings.stripe.stripeStrings.`new`
import typings.stripe.stripeStrings.bank_account
import typings.stripe.stripeStrings.errored
import typings.stripe.stripeStrings.validated
import typings.stripe.stripeStrings.verification_failed
import typings.stripe.stripeStrings.verified
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBankAccount
  extends IBankAccountHash
     with IExternalAccount
     with IStripeSource {
  var account: js.UndefOr[String] = js.native
  /**
    * This indicates whether or not this bank account is the default external account for its currency.
    */
  var default_for_currency: js.UndefOr[Boolean] = js.native
  /**
    * A set of key/value pairs that you can attach to a bank account object. It
    * can be useful for storing additional information about the bank account in
    * a structured format.
    */
  var metadata: IMetadata = js.native
}

object IBankAccount {
  @scala.inline
  def apply(
    bank_name: String,
    country: String,
    currency: String,
    fingerprint: String,
    id: String,
    last4: String,
    metadata: IMetadata,
    `object`: bank_account,
    routing_number: String,
    status: `new` | validated | verified | verification_failed | errored
  ): IBankAccount = {
    val __obj = js.Dynamic.literal(bank_name = bank_name.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], routing_number = routing_number.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBankAccount]
  }
  @scala.inline
  implicit class IBankAccountOps[Self <: IBankAccount] (val x: Self) extends AnyVal {
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
    def setMetadata(value: IMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccount(value: String): Self = this.set("account", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccount: Self = this.set("account", js.undefined)
    @scala.inline
    def setDefault_for_currency(value: Boolean): Self = this.set("default_for_currency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault_for_currency: Self = this.set("default_for_currency", js.undefined)
  }
  
}


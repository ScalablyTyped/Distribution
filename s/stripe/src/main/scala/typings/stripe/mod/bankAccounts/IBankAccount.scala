package typings.stripe.mod.bankAccounts

import typings.stripe.mod.IMetadata
import typings.stripe.mod.IStripeSource
import typings.stripe.mod.accounts.IExternalAccount
import typings.stripe.stripeStrings.`new`
import typings.stripe.stripeStrings.bank_account
import typings.stripe.stripeStrings.company
import typings.stripe.stripeStrings.errored
import typings.stripe.stripeStrings.individual
import typings.stripe.stripeStrings.validated
import typings.stripe.stripeStrings.verification_failed
import typings.stripe.stripeStrings.verified
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBankAccount
  extends IBankAccountHash
     with IExternalAccount
     with IStripeSource {
  var account: js.UndefOr[String] = js.undefined
  /**
    * This indicates whether or not this bank account is the default external account for its currency.
    */
  var default_for_currency: js.UndefOr[Boolean] = js.undefined
  /**
    * A set of key/value pairs that you can attach to a bank account object. It
    * can be useful for storing additional information about the bank account in
    * a structured format.
    */
  var metadata: IMetadata
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
    status: `new` | validated | verified | verification_failed | errored,
    account: String = null,
    account_holder_name: String = null,
    account_holder_type: individual | company = null,
    customer: String = null,
    default_for_currency: js.UndefOr[Boolean] = js.undefined
  ): IBankAccount = {
    val __obj = js.Dynamic.literal(bank_name = bank_name.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], routing_number = routing_number.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], account_holder_name = account_holder_name.asInstanceOf[js.Any], account_holder_type = account_holder_type.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (account != null) __obj.updateDynamic("account")(account.asInstanceOf[js.Any])
    if (customer != null) __obj.updateDynamic("customer")(customer.asInstanceOf[js.Any])
    if (!js.isUndefined(default_for_currency)) __obj.updateDynamic("default_for_currency")(default_for_currency.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBankAccount]
  }
}


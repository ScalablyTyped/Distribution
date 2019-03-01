package typings
package stripeLib.stripeMod.StripeNs.bankAccountsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBankAccount extends IBankAccountHash {
  var account: js.UndefOr[java.lang.String] = js.undefined
  /**
    * This indicates whether or not this bank account is the default external account for its currency.
    */
  var default_for_currency: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A set of key/value pairs that you can attach to a bank account object. It
    * can be useful for storing additional information about the bank account in
    * a structured format.
    */
  var metadata: stripeLib.stripeMod.StripeNs.IMetadata
}

object IBankAccount {
  @scala.inline
  def apply(
    bank_name: java.lang.String,
    country: java.lang.String,
    currency: java.lang.String,
    fingerprint: java.lang.String,
    id: java.lang.String,
    last4: java.lang.String,
    metadata: stripeLib.stripeMod.StripeNs.IMetadata,
    `object`: stripeLib.stripeLibStrings.bank_account,
    routing_number: java.lang.String,
    status: stripeLib.stripeLibStrings.`new` | stripeLib.stripeLibStrings.validated | stripeLib.stripeLibStrings.verified | stripeLib.stripeLibStrings.verification_failed | stripeLib.stripeLibStrings.errored,
    account: java.lang.String = null,
    account_holder_name: java.lang.String = null,
    account_holder_type: stripeLib.stripeLibStrings.individual | stripeLib.stripeLibStrings.company = null,
    customer: java.lang.String = null,
    default_for_currency: js.UndefOr[scala.Boolean] = js.undefined
  ): IBankAccount = {
    val __obj = js.Dynamic.literal(`object` = `object`)
    __obj.updateDynamic("bank_name")(bank_name)
    __obj.updateDynamic("country")(country)
    __obj.updateDynamic("currency")(currency)
    __obj.updateDynamic("fingerprint")(fingerprint)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("last4")(last4)
    __obj.updateDynamic("metadata")(metadata)
    __obj.updateDynamic("routing_number")(routing_number)
    __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (account != null) __obj.updateDynamic("account")(account)
    if (account_holder_name != null) __obj.updateDynamic("account_holder_name")(account_holder_name)
    if (account_holder_type != null) __obj.updateDynamic("account_holder_type")(account_holder_type.asInstanceOf[js.Any])
    if (customer != null) __obj.updateDynamic("customer")(customer)
    if (!js.isUndefined(default_for_currency)) __obj.updateDynamic("default_for_currency")(default_for_currency)
    __obj.asInstanceOf[IBankAccount]
  }
}


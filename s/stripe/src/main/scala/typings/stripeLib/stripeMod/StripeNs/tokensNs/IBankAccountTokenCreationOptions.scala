package typings
package stripeLib.stripeMod.StripeNs.tokensNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBankAccountTokenCreationOptions extends ITokenCreationOptionsBase {
  /**
    * The card this token will represent. If you also pass in a customer,
    * the card must be the ID of a card belonging to the customer.
    * Otherwise, if you do not pass a customer, a object containing a
    * user's credit card details, with the options described below.
    */
  var bank_account: stripeLib.stripeMod.StripeNs.bankAccountsNs.ISourceCreationOptions
}

object IBankAccountTokenCreationOptions {
  @scala.inline
  def apply(
    bank_account: stripeLib.stripeMod.StripeNs.bankAccountsNs.ISourceCreationOptions,
    customer: java.lang.String = null,
    expand: js.Array[java.lang.String] = null,
    include: js.Array[java.lang.String] = null
  ): IBankAccountTokenCreationOptions = {
    val __obj = js.Dynamic.literal(bank_account = bank_account)
    if (customer != null) __obj.updateDynamic("customer")(customer)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (include != null) __obj.updateDynamic("include")(include)
    __obj.asInstanceOf[IBankAccountTokenCreationOptions]
  }
}


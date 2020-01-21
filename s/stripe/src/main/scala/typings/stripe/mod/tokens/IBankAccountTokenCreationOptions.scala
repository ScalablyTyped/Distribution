package typings.stripe.mod.tokens

import typings.stripe.mod.bankAccounts.ISourceCreationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBankAccountTokenCreationOptions extends ITokenCreationOptionsBase {
  /**
    * The bank account this token will represent. If you also pass in
    * a customer, the bank account must be the ID of a bank account
    * belonging to the customer.  Otherwise, if you do not pass a
    * customer, a object containing a user's bank account details,
    * with the options described below.
    */
  var bank_account: String | ISourceCreationOptions
}

object IBankAccountTokenCreationOptions {
  @scala.inline
  def apply(
    bank_account: String | ISourceCreationOptions,
    customer: String = null,
    expand: js.Array[String] = null,
    include: js.Array[String] = null
  ): IBankAccountTokenCreationOptions = {
    val __obj = js.Dynamic.literal(bank_account = bank_account.asInstanceOf[js.Any])
    if (customer != null) __obj.updateDynamic("customer")(customer.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBankAccountTokenCreationOptions]
  }
}


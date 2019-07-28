package typings.stripe.stripeMod.bankAccountsNs

import typings.stripe.stripeMod.IDataOptionsWithMetadata
import typings.stripe.stripeMod.IOptionsMetadata
import typings.stripe.stripeStrings.company
import typings.stripe.stripeStrings.individual
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBankAccountUpdateOptions extends IDataOptionsWithMetadata {
  /**
    * The name of the person or business that owns the bank account.
    */
  var account_holder_name: js.UndefOr[String | Null] = js.undefined
  /**
    * The type of entity that holds the account. This can be either "individual" or "company".
    */
  var account_holder_type: js.UndefOr[individual | company | Null] = js.undefined
}

object IBankAccountUpdateOptions {
  @scala.inline
  def apply(
    account_holder_name: String = null,
    account_holder_type: individual | company = null,
    expand: js.Array[String] = null,
    include: js.Array[String] = null,
    metadata: IOptionsMetadata = null
  ): IBankAccountUpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (account_holder_name != null) __obj.updateDynamic("account_holder_name")(account_holder_name)
    if (account_holder_type != null) __obj.updateDynamic("account_holder_type")(account_holder_type.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (include != null) __obj.updateDynamic("include")(include)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    __obj.asInstanceOf[IBankAccountUpdateOptions]
  }
}


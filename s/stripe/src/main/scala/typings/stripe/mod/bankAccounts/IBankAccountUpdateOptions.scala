package typings.stripe.mod.bankAccounts

import typings.stripe.mod.IDataOptionsWithMetadata
import typings.stripe.mod.IOptionsMetadata
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
    account_holder_name: js.UndefOr[Null | String] = js.undefined,
    account_holder_type: js.UndefOr[Null | individual | company] = js.undefined,
    expand: js.Array[String] = null,
    include: js.Array[String] = null,
    metadata: IOptionsMetadata = null
  ): IBankAccountUpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(account_holder_name)) __obj.updateDynamic("account_holder_name")(account_holder_name.asInstanceOf[js.Any])
    if (!js.isUndefined(account_holder_type)) __obj.updateDynamic("account_holder_type")(account_holder_type.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBankAccountUpdateOptions]
  }
}


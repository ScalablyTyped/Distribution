package typings.stripe.stripeMod.customers

import typings.stripe.stripeMod.IOptionsMetadata
import typings.stripe.stripeMod.bankAccounts.ISourceCreationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomerBankAccountSourceCreationOptions extends ICustomerSourceCreationOptions {
  @JSName("source")
  var source_ICustomerBankAccountSourceCreationOptions: ISourceCreationOptions
}

object ICustomerBankAccountSourceCreationOptions {
  @scala.inline
  def apply(
    source: ISourceCreationOptions,
    expand: js.Array[String] = null,
    include: js.Array[String] = null,
    metadata: IOptionsMetadata = null
  ): ICustomerBankAccountSourceCreationOptions = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomerBankAccountSourceCreationOptions]
  }
}


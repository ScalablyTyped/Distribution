package typings.stripe.mod.customerBalanceTransactions

import typings.stripe.mod.IMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomerBalanceTransactionUpdateOptions extends js.Object {
  /**
    * An arbitrary string attached to the object. Often useful for displaying to users.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Set of key-value pairs that you can attach to an object. This can be useful for storing additional
    * information about the object in a structured format.
    */
  var metadata: js.UndefOr[IMetadata] = js.undefined
}

object ICustomerBalanceTransactionUpdateOptions {
  @scala.inline
  def apply(description: String = null, metadata: IMetadata = null): ICustomerBalanceTransactionUpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomerBalanceTransactionUpdateOptions]
  }
}


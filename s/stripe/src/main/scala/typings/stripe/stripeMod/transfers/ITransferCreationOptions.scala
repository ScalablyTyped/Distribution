package typings.stripe.stripeMod.transfers

import typings.stripe.stripeMod.IDataOptionsWithMetadata
import typings.stripe.stripeMod.IOptionsMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITransferCreationOptions extends IDataOptionsWithMetadata {
  /**
    * A positive integer in cents/pence representing how much to transfer.
    */
  var amount: Double
  /**
    * 3-letter ISO code for currency.
    */
  var currency: String
  /**
    * An arbitrary string attached to the object. Often useful for
    * displaying to users. This can be unset by updating the value
    * to null and then saving.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * The id of a bank account or a card to send the transfer to, or the
    * string "default_for_currency" to use the default external
    * account for the specified currency.
    *
    * If you use Stripe Connect, this can be the the id of a connected
    * Stripe account; see the details about when such transfers are
    * permitted.
    */
  var destination: String
  /**
    * You can use this parameter to transfer funds from a charge (or
    * other transaction) before they are added to your available
    * balance. A pending balance will transfer immediately but the
    * funds will not become available until the original charge
    * becomes available. See the Connect documentation for details.
    */
  var source_transaction: js.UndefOr[String] = js.undefined
  /**
    * The source balance to use for this transfer. One of bank_account
    * or card. For most users, this will default to card.
    */
  var source_type: js.UndefOr[SourceTypes] = js.undefined
  /**
    * A string that identifies this transaction as part of a group.
    * See the Connect documentation for details.
    */
  var transfer_group: js.UndefOr[String] = js.undefined
}

object ITransferCreationOptions {
  @scala.inline
  def apply(
    amount: Double,
    currency: String,
    destination: String,
    description: String = null,
    expand: js.Array[String] = null,
    include: js.Array[String] = null,
    metadata: IOptionsMetadata = null,
    source_transaction: String = null,
    source_type: SourceTypes = null,
    transfer_group: String = null
  ): ITransferCreationOptions = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (source_transaction != null) __obj.updateDynamic("source_transaction")(source_transaction.asInstanceOf[js.Any])
    if (source_type != null) __obj.updateDynamic("source_type")(source_type.asInstanceOf[js.Any])
    if (transfer_group != null) __obj.updateDynamic("transfer_group")(transfer_group.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITransferCreationOptions]
  }
}


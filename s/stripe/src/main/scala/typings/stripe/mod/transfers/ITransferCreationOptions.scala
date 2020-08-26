package typings.stripe.mod.transfers

import typings.stripe.mod.IDataOptionsWithMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITransferCreationOptions extends IDataOptionsWithMetadata {
  /**
    * A positive integer in cents/pence representing how much to transfer.
    */
  var amount: Double = js.native
  /**
    * 3-letter ISO code for currency.
    */
  var currency: String = js.native
  /**
    * An arbitrary string attached to the object. Often useful for
    * displaying to users. This can be unset by updating the value
    * to null and then saving.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The id of a bank account or a card to send the transfer to, or the
    * string "default_for_currency" to use the default external
    * account for the specified currency.
    *
    * If you use Stripe Connect, this can be the the id of a connected
    * Stripe account; see the details about when such transfers are
    * permitted.
    */
  var destination: String = js.native
  /**
    * You can use this parameter to transfer funds from a charge (or
    * other transaction) before they are added to your available
    * balance. A pending balance will transfer immediately but the
    * funds will not become available until the original charge
    * becomes available. See the Connect documentation for details.
    */
  var source_transaction: js.UndefOr[String] = js.native
  /**
    * The source balance to use for this transfer. One of bank_account
    * or card. For most users, this will default to card.
    */
  var source_type: js.UndefOr[SourceTypes] = js.native
  /**
    * A string that identifies this transaction as part of a group.
    * See the Connect documentation for details.
    */
  var transfer_group: js.UndefOr[String] = js.native
}

object ITransferCreationOptions {
  @scala.inline
  def apply(amount: Double, currency: String, destination: String): ITransferCreationOptions = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITransferCreationOptions]
  }
  @scala.inline
  implicit class ITransferCreationOptionsOps[Self <: ITransferCreationOptions] (val x: Self) extends AnyVal {
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
    def setAmount(value: Double): Self = this.set("amount", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def setDestination(value: String): Self = this.set("destination", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setSource_transaction(value: String): Self = this.set("source_transaction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource_transaction: Self = this.set("source_transaction", js.undefined)
    @scala.inline
    def setSource_type(value: SourceTypes): Self = this.set("source_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource_type: Self = this.set("source_type", js.undefined)
    @scala.inline
    def setTransfer_group(value: String): Self = this.set("transfer_group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransfer_group: Self = this.set("transfer_group", js.undefined)
  }
  
}


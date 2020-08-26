package typings.stripe.mod.topups

import typings.stripe.mod.IDataOptionsWithMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITopupCreationOptions extends IDataOptionsWithMetadata {
  /**
    * A positive integer representing how much to transfer.
    */
  var amount: Double = js.native
  /**
    * Three-letter ISO currency code, in lowercase. Must be a supported currency.
    */
  var currency: String = js.native
  /**
    * An arbitrary string attached to the object. Often useful for displaying to users.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The ID of a source to transfer funds from. For most users, this should be left unspecified
    * which will use the bank account that was set up in the dashboard for the specified currency.
    * In test mode, this can be a test bank token (see https://stripe.com/docs/connect/testing#testing-top-ups).
    */
  var source: js.UndefOr[String] = js.native
  /**
    * Extra information about a top-up for the source’s bank statement. Limited to 15 ASCII characters.
    */
  var statement_descriptor: js.UndefOr[String] = js.native
  /**
    * A string that identifies this top-up as part of a group.
    */
  var transfer_group: js.UndefOr[String] = js.native
}

object ITopupCreationOptions {
  @scala.inline
  def apply(amount: Double, currency: String): ITopupCreationOptions = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITopupCreationOptions]
  }
  @scala.inline
  implicit class ITopupCreationOptionsOps[Self <: ITopupCreationOptions] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setStatement_descriptor(value: String): Self = this.set("statement_descriptor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatement_descriptor: Self = this.set("statement_descriptor", js.undefined)
    @scala.inline
    def setTransfer_group(value: String): Self = this.set("transfer_group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransfer_group: Self = this.set("transfer_group", js.undefined)
  }
  
}


package typings.stripe.mod.topups

import typings.stripe.mod.IMetadata
import typings.stripe.mod.IResourceObject
import typings.stripe.mod.ISource
import typings.stripe.stripeStrings.canceled
import typings.stripe.stripeStrings.failed
import typings.stripe.stripeStrings.pending
import typings.stripe.stripeStrings.reversed
import typings.stripe.stripeStrings.succeeded
import typings.stripe.stripeStrings.topup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITopup extends IResourceObject {
  /**
    * Amount transferred
    */
  var amount: Double = js.native
  /**
    * ID of the balance transaction that describes the impact of this top-up on your account balance.
    * May not be specified depending on status of top-up.
    */
  var balance_transaction: String | Null = js.native
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double = js.native
  /**
    * Three-letter ISO currency code, in lowercase. Must be a supported currency.
    */
  var currency: String = js.native
  /**
    * An arbitrary string attached to the object. Often useful for displaying to users.
    */
  var description: String = js.native
  /**
    * Date the funds are expected to arrive in your Stripe account for payouts. This factors in delays
    * like weekends or bank holidays. May not be specified depending on status of top-up.
    */
  var expected_availability_date: Double = js.native
  /**
    * Error code explaining reason for top-up failure if available
    */
  var failure_code: String | Null = js.native
  /**
    * Message to user further explaining reason for top-up failure if available.
    */
  var failure_message: String | Null = js.native
  /**
    * Has the value true if the object exists in live mode or the value false if the object exists
    * in test mode.
    */
  var livemode: Boolean = js.native
  /**
    * Set of key-value pairs that you can attach to an object. This can be useful for storing
    * additional information about the object in a structured format.
    */
  var metaData: IMetadata = js.native
  /**
    * Value is "topup"
    */
  @JSName("object")
  var object_ITopup: topup = js.native
  /**
    * For most Stripe users, the source of every top-up is a bank account. This hash is then the
    * source object describing that bank account.
    */
  var source: ISource = js.native
  /**
    * Extra information about a top-up. This will appear on your source’s bank statement.
    * It must contain at least one letter.
    */
  var statement_descriptor: String | Null = js.native
  /**
    * Status of topup
    */
  var status: canceled | failed | pending | reversed | succeeded = js.native
  /**
    * A string that identifies this top-up as part of a group.
    */
  var transfer_group: String | Null = js.native
}

object ITopup {
  @scala.inline
  def apply(
    amount: Double,
    created: Double,
    currency: String,
    description: String,
    expected_availability_date: Double,
    id: String,
    livemode: Boolean,
    metaData: IMetadata,
    `object`: topup,
    source: ISource,
    status: canceled | failed | pending | reversed | succeeded
  ): ITopup = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], expected_availability_date = expected_availability_date.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metaData = metaData.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITopup]
  }
  @scala.inline
  implicit class ITopupOps[Self <: ITopup] (val x: Self) extends AnyVal {
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
    def setCreated(value: Double): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpected_availability_date(value: Double): Self = this.set("expected_availability_date", value.asInstanceOf[js.Any])
    @scala.inline
    def setLivemode(value: Boolean): Self = this.set("livemode", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetaData(value: IMetadata): Self = this.set("metaData", value.asInstanceOf[js.Any])
    @scala.inline
    def setObject(value: topup): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: ISource): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: canceled | failed | pending | reversed | succeeded): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setBalance_transaction(value: String): Self = this.set("balance_transaction", value.asInstanceOf[js.Any])
    @scala.inline
    def setBalance_transactionNull: Self = this.set("balance_transaction", null)
    @scala.inline
    def setFailure_code(value: String): Self = this.set("failure_code", value.asInstanceOf[js.Any])
    @scala.inline
    def setFailure_codeNull: Self = this.set("failure_code", null)
    @scala.inline
    def setFailure_message(value: String): Self = this.set("failure_message", value.asInstanceOf[js.Any])
    @scala.inline
    def setFailure_messageNull: Self = this.set("failure_message", null)
    @scala.inline
    def setStatement_descriptor(value: String): Self = this.set("statement_descriptor", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatement_descriptorNull: Self = this.set("statement_descriptor", null)
    @scala.inline
    def setTransfer_group(value: String): Self = this.set("transfer_group", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransfer_groupNull: Self = this.set("transfer_group", null)
  }
  
}


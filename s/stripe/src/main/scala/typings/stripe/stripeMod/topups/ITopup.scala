package typings.stripe.stripeMod.topups

import typings.stripe.stripeMod.IMetadata
import typings.stripe.stripeMod.IResourceObject
import typings.stripe.stripeMod.ISource
import typings.stripe.stripeStrings.canceled
import typings.stripe.stripeStrings.failed
import typings.stripe.stripeStrings.pending
import typings.stripe.stripeStrings.reversed
import typings.stripe.stripeStrings.succeeded
import typings.stripe.stripeStrings.topup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITopup extends IResourceObject {
  /**
    * Amount transferred
    */
  var amount: Double
  /**
    * ID of the balance transaction that describes the impact of this top-up on your account balance.
    * May not be specified depending on status of top-up.
    */
  var balance_transaction: String | Null
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  /**
    * Three-letter ISO currency code, in lowercase. Must be a supported currency.
    */
  var currency: String
  /**
    * An arbitrary string attached to the object. Often useful for displaying to users.
    */
  var description: String
  /**
    * Date the funds are expected to arrive in your Stripe account for payouts. This factors in delays
    * like weekends or bank holidays. May not be specified depending on status of top-up.
    */
  var expected_availability_date: Double
  /**
    * Error code explaining reason for top-up failure if available
    */
  var failure_code: String | Null
  /**
    * Message to user further explaining reason for top-up failure if available.
    */
  var failure_message: String | Null
  /**
    * Has the value true if the object exists in live mode or the value false if the object exists
    * in test mode.
    */
  var livemode: Boolean
  /**
    * Set of key-value pairs that you can attach to an object. This can be useful for storing
    * additional information about the object in a structured format.
    */
  var metaData: IMetadata
  /**
    * Value is "topup"
    */
  @JSName("object")
  var object_ITopup: topup
  /**
    * For most Stripe users, the source of every top-up is a bank account. This hash is then the
    * source object describing that bank account.
    */
  var source: ISource
  /**
    * Extra information about a top-up. This will appear on your source’s bank statement.
    * It must contain at least one letter.
    */
  var statement_descriptor: String | Null
  /**
    * Status of topup
    */
  var status: canceled | failed | pending | reversed | succeeded
  /**
    * A string that identifies this top-up as part of a group.
    */
  var transfer_group: String | Null
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
    status: canceled | failed | pending | reversed | succeeded,
    balance_transaction: String = null,
    failure_code: String = null,
    failure_message: String = null,
    statement_descriptor: String = null,
    transfer_group: String = null
  ): ITopup = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], expected_availability_date = expected_availability_date.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metaData = metaData.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (balance_transaction != null) __obj.updateDynamic("balance_transaction")(balance_transaction.asInstanceOf[js.Any])
    if (failure_code != null) __obj.updateDynamic("failure_code")(failure_code.asInstanceOf[js.Any])
    if (failure_message != null) __obj.updateDynamic("failure_message")(failure_message.asInstanceOf[js.Any])
    if (statement_descriptor != null) __obj.updateDynamic("statement_descriptor")(statement_descriptor.asInstanceOf[js.Any])
    if (transfer_group != null) __obj.updateDynamic("transfer_group")(transfer_group.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITopup]
  }
}


package typings.stripe.stripeMod.bitcoinReceivers

import typings.stripe.stripeMod.IDataOptionsWithMetadata
import typings.stripe.stripeMod.IOptionsMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBitcoinReceiverCreationOptions extends IDataOptionsWithMetadata {
  /**
    * The amount of currency that you will be paid.
    */
  var amount: Double
  /**
    * The currency to which the bitcoin will be converted. You will be paid out in this currency. Only USD is currently supported.
    */
  var currency: String
  var description: js.UndefOr[String] = js.undefined
  /**
    * The email address of the customer.
    */
  var email: String
  /**
    * A flag that indicates whether you would like Stripe to automatically handle refunds for any mispayments to the receiver.
    */
  var refund_mispayments: js.UndefOr[Boolean] = js.undefined
}

object IBitcoinReceiverCreationOptions {
  @scala.inline
  def apply(
    amount: Double,
    currency: String,
    email: String,
    description: String = null,
    expand: js.Array[String] = null,
    include: js.Array[String] = null,
    metadata: IOptionsMetadata = null,
    refund_mispayments: js.UndefOr[Boolean] = js.undefined
  ): IBitcoinReceiverCreationOptions = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (!js.isUndefined(refund_mispayments)) __obj.updateDynamic("refund_mispayments")(refund_mispayments.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBitcoinReceiverCreationOptions]
  }
}


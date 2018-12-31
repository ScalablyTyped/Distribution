package typings
package stripeLib.stripeMod.StripeNs.bitcoinReceiversNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBitcoinReceiverCreationOptions
  extends stripeLib.stripeMod.StripeNs.IDataOptionsWithMetadata {
  /**
    * The amount of currency that you will be paid.
    */
  var amount: scala.Double
  /**
    * The currency to which the bitcoin will be converted. You will be paid out in this currency. Only USD is currently supported.
    */
  var currency: java.lang.String
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The email address of the customer.
    */
  var email: java.lang.String
  /**
    * A flag that indicates whether you would like Stripe to automatically handle refunds for any mispayments to the receiver.
    */
  var refund_mispayments: js.UndefOr[scala.Boolean] = js.undefined
}


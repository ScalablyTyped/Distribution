package typings
package stripeLib.stripeMod.StripeNs.applicationFeesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IApplicationFeeRefund
  extends stripeLib.stripeMod.StripeNs.IResourceObject {
  /**
    * Amount, in cents/pence.
    */
  var amount: scala.Double
  /**
    * Balance transaction that describes the impact on your account balance.
    */
  var balance_transaction: java.lang.String | stripeLib.stripeMod.StripeNs.balanceNs.IBalanceTransaction
  var created: scala.Double
  /**
    * Three-letter ISO code representing the currency.
    */
  var currency: java.lang.String
  /**
    * ID of the application fee that was refunded.
    */
  var fee: java.lang.String | IApplicationFee
  /**
    * A set of key/value pairs that you can attach to the object. It can be useful
    * for storing additional information in a structured format.
    */
  var metadata: stripeLib.stripeMod.StripeNs.IMetadata
}


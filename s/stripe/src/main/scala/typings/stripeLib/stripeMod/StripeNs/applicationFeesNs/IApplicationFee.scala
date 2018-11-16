package typings
package stripeLib.stripeMod.StripeNs.applicationFeesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IApplicationFee
  extends stripeLib.stripeMod.StripeNs.IResourceObject {
  /**
               * ID of the Stripe account this fee was taken from. [Expandable]
               */
  var account: java.lang.String | stripeLib.stripeMod.StripeNs.accountsNs.IAccount
  /**
               * Amount earned, in cents/pence.
               */
  var amount: scala.Double
  /**
               * Positive integer or zero
               */
  var amount_refunded: scala.Double
  /**
               * ID of the Connect Application that earned the fee. [Expandable]
               */
  var application: java.lang.String | stripeLib.stripeMod.StripeNs.applicationsNs.IApplication
  /**
               * Balance transaction that describes the impact of this collected application
               * fee on your account balance (not including refunds). [Expandable]
               */
  var balance_transaction: java.lang.String | stripeLib.stripeMod.StripeNs.balanceNs.IBalanceTransaction
  /**
               * ID of the charge that the application fee was taken from. [Expandable]
               */
  var charge: java.lang.String | stripeLib.stripeMod.StripeNs.chargesNs.ICharge
  var created: scala.Double
  /**
               * Three-letter ISO code representing the currency of the charge.
               */
  var currency: java.lang.String
  var livemode: scala.Boolean
  /**
               * ID of the corresponding charge on the platform account, if this fee was the
               * result of a charge using the destination parameter. [Expandable]
               */
  var originating_transaction: java.lang.String
  /**
               * Whether or not the fee has been fully refunded. If the fee is only partially
               * refunded, this attribute will still be false.
               */
  var refunded: scala.Boolean
  /**
               * A list of refunds that have been applied to the fee.
               */
  var refunds: IApplicationFeeRefunds
}


package typings
package stripeLib.stripeMod.StripeNs.balanceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IBalanceTransaction
  extends stripeLib.stripeMod.StripeNs.IResourceObject {
  /**
               * Gross amount of the transaction, in cents/pence.
               */
  var amount: scala.Double
  /**
               * The date the transaction's net funds will become available in the Stripe balance.
               */
  var available_on: scala.Double
  var created: scala.Double
  /**
               * Three-letter ISO currency code representing the currency.
               */
  var currency: java.lang.String
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Fee (in cents/pence) paid for this transaction
               */
  var fee: scala.Double
  /**
               * Detailed breakdown of fees (in cents/pence) paid for this transaction
               */
  var fee_details: js.Array[stripeLib.Anon_Application]
  /**
               * Net amount of the transaction, in cents.
               */
  var net: scala.Double
  /**
               * The Stripe object this transaction is related to. [Expandable]
               */
  var source: java.lang.String | stripeLib.stripeMod.StripeNs.IResourceObject
  /**
               * The transfers (if any) for which source is a source_transaction.
               */
  var source_transfers: stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.transfersNs.ITransfer]
  /**
               * If the transaction's net funds are available in the Stripe balance yet. Either "available" or "pending".
               */
  var status: java.lang.String
  /**
               * Transaction type: "adjustment", "application_fee",
               * "application_fee_refund", "charge", "payment", "payment_refund",
               * "refund", "transfer", "transfer_cancel", "transfer_failure", or
               * "transfer_refund".
               */
  var `type`: java.lang.String
}


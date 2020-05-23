package typings.winrtUwp.Windows.ApplicationModel.Store

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information detailing the results of an in-app product purchase transaction. */
trait PurchaseResults extends js.Object {
  /** A unique ID used to identify a specific in-app product within a large catalog. */
  var offerId: String
  /** A full receipt that provides a transaction history for the purchase of an in-app product */
  var receiptXml: String
  /** The current state of the purchase transaction for an in-app product. */
  var status: ProductPurchaseStatus
  /** A unique transaction ID associated with the purchase of a consumable in-app product. */
  var transactionId: String
}

object PurchaseResults {
  @scala.inline
  def apply(offerId: String, receiptXml: String, status: ProductPurchaseStatus, transactionId: String): PurchaseResults = {
    val __obj = js.Dynamic.literal(offerId = offerId.asInstanceOf[js.Any], receiptXml = receiptXml.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], transactionId = transactionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchaseResults]
  }
}


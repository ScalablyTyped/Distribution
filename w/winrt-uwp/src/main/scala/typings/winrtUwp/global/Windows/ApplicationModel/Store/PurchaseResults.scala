package typings.winrtUwp.global.Windows.ApplicationModel.Store

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information detailing the results of an in-app product purchase transaction. */
@JSGlobal("Windows.ApplicationModel.Store.PurchaseResults")
@js.native
abstract class PurchaseResults ()
  extends typings.winrtUwp.Windows.ApplicationModel.Store.PurchaseResults {
  /** A unique ID used to identify a specific in-app product within a large catalog. */
  /* CompleteClass */
  override var offerId: String = js.native
  /** A full receipt that provides a transaction history for the purchase of an in-app product */
  /* CompleteClass */
  override var receiptXml: String = js.native
  /** The current state of the purchase transaction for an in-app product. */
  /* CompleteClass */
  override var status: typings.winrtUwp.Windows.ApplicationModel.Store.ProductPurchaseStatus = js.native
  /** A unique transaction ID associated with the purchase of a consumable in-app product. */
  /* CompleteClass */
  override var transactionId: String = js.native
}


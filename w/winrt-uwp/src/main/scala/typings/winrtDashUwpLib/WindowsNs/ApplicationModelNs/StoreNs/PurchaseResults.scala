package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information detailing the results of an in-app product purchase transaction. */
@JSGlobal("Windows.ApplicationModel.Store.PurchaseResults")
@js.native
abstract class PurchaseResults () extends js.Object {
  /** A unique ID used to identify a specific in-app product within a large catalog. */
  var offerId: java.lang.String = js.native
  /** A full receipt that provides a transaction history for the purchase of an in-app product */
  var receiptXml: java.lang.String = js.native
  /** The current state of the purchase transaction for an in-app product. */
  var status: ProductPurchaseStatus = js.native
  /** A unique transaction ID associated with the purchase of a consumable in-app product. */
  var transactionId: java.lang.String = js.native
}


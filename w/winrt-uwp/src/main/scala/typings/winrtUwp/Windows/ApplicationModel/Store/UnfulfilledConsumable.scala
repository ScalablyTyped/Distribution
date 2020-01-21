package typings.winrtUwp.Windows.ApplicationModel.Store

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains purchase and product information for an unfulfilled consumable in-app product. */
@JSGlobal("Windows.ApplicationModel.Store.UnfulfilledConsumable")
@js.native
abstract class UnfulfilledConsumable () extends js.Object {
  /** A unique ID used to identify a consumable in-app product within a large purchase catalog. */
  var offerId: String = js.native
  /** A unique ID used to identify a consumable in-app product. This ID is used by the app to get info about the product or feature that is enabled when the customer buys it through an in-app purchase. */
  var productId: String = js.native
  /** A unique ID used to identify the transaction that included the purchase of a consumable in-app product. */
  var transactionId: String = js.native
}


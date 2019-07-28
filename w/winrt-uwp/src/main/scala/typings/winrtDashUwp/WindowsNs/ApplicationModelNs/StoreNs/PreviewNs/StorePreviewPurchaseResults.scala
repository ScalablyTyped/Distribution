package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about the results of a purchase transaction for an in-app product SKU that was purchased by using the RequestProductPurchaseByProductIdAndSkuIdAsync method. */
@JSGlobal("Windows.ApplicationModel.Store.Preview.StorePreviewPurchaseResults")
@js.native
abstract class StorePreviewPurchaseResults () extends js.Object {
  /** Gets the current state of the purchase transaction for an in-app product SKU that was purchased by using the RequestProductPurchaseByProductIdAndSkuIdAsync method. */
  var productPurchaseStatus: StorePreviewProductPurchaseStatus = js.native
}


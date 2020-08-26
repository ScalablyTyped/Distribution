package typings.winrtUwp.Windows.ApplicationModel.Store.Preview

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about the results of a purchase transaction for an in-app product SKU that was purchased by using the RequestProductPurchaseByProductIdAndSkuIdAsync method. */
@js.native
trait StorePreviewPurchaseResults extends js.Object {
  /** Gets the current state of the purchase transaction for an in-app product SKU that was purchased by using the RequestProductPurchaseByProductIdAndSkuIdAsync method. */
  var productPurchaseStatus: StorePreviewProductPurchaseStatus = js.native
}

object StorePreviewPurchaseResults {
  @scala.inline
  def apply(productPurchaseStatus: StorePreviewProductPurchaseStatus): StorePreviewPurchaseResults = {
    val __obj = js.Dynamic.literal(productPurchaseStatus = productPurchaseStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorePreviewPurchaseResults]
  }
  @scala.inline
  implicit class StorePreviewPurchaseResultsOps[Self <: StorePreviewPurchaseResults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setProductPurchaseStatus(value: StorePreviewProductPurchaseStatus): Self = this.set("productPurchaseStatus", value.asInstanceOf[js.Any])
  }
  
}


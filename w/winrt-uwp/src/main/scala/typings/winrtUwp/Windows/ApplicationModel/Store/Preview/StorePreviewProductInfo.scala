package typings.winrtUwp.Windows.ApplicationModel.Store.Preview

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about an in-app product, including details about available SKUs. */
trait StorePreviewProductInfo extends js.Object {
  /** Gets the description of the in-app product. */
  var description: String
  /** Gets the ID of the in-app product. */
  var productId: String
  /** Gets the type of the in-app product. */
  var productType: String
  /** Gets information about the available SKUs for the in-app product. */
  var skuInfoList: IVectorView[StorePreviewSkuInfo]
  /** Gets the name of the in-app product that is displayed to customers. */
  var title: String
}

object StorePreviewProductInfo {
  @scala.inline
  def apply(
    description: String,
    productId: String,
    productType: String,
    skuInfoList: IVectorView[StorePreviewSkuInfo],
    title: String
  ): StorePreviewProductInfo = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any], productType = productType.asInstanceOf[js.Any], skuInfoList = skuInfoList.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorePreviewProductInfo]
  }
}


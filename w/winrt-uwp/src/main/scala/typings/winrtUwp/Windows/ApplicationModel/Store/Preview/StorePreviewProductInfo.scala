package typings.winrtUwp.Windows.ApplicationModel.Store.Preview

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about an in-app product, including details about available SKUs. */
@js.native
trait StorePreviewProductInfo extends js.Object {
  /** Gets the description of the in-app product. */
  var description: String = js.native
  /** Gets the ID of the in-app product. */
  var productId: String = js.native
  /** Gets the type of the in-app product. */
  var productType: String = js.native
  /** Gets information about the available SKUs for the in-app product. */
  var skuInfoList: IVectorView[StorePreviewSkuInfo] = js.native
  /** Gets the name of the in-app product that is displayed to customers. */
  var title: String = js.native
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
  @scala.inline
  implicit class StorePreviewProductInfoOps[Self <: StorePreviewProductInfo] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setProductId(value: String): Self = this.set("productId", value.asInstanceOf[js.Any])
    @scala.inline
    def setProductType(value: String): Self = this.set("productType", value.asInstanceOf[js.Any])
    @scala.inline
    def setSkuInfoList(value: IVectorView[StorePreviewSkuInfo]): Self = this.set("skuInfoList", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
  
}


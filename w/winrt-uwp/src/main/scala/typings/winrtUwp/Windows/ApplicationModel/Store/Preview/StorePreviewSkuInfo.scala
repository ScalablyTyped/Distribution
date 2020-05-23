package typings.winrtUwp.Windows.ApplicationModel.Store.Preview

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the available SKUs for an in-app product. */
trait StorePreviewSkuInfo extends js.Object {
  /** Gets the currency code for the current market. */
  var currencyCode: String
  /** Gets custom developer data for the current SKU. */
  var customDeveloperData: String
  /** Gets the description for the current SKU. */
  var description: String
  /** Gets extended data for the current SKU. */
  var extendedData: String
  /** Gets the current SKU's purchase price with the appropriate formatting for the current market. */
  var formattedListPrice: String
  /** Gets the ID of the product that this SKU is associated with. */
  var productId: String
  /** Gets the ID of this SKU. */
  var skuId: String
  /** Gets a string that specifies the type of the in-app product SKU. */
  var skuType: String
  /** Gets the name of the in-app product SKU that is displayed to customers. */
  var title: String
}

object StorePreviewSkuInfo {
  @scala.inline
  def apply(
    currencyCode: String,
    customDeveloperData: String,
    description: String,
    extendedData: String,
    formattedListPrice: String,
    productId: String,
    skuId: String,
    skuType: String,
    title: String
  ): StorePreviewSkuInfo = {
    val __obj = js.Dynamic.literal(currencyCode = currencyCode.asInstanceOf[js.Any], customDeveloperData = customDeveloperData.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], extendedData = extendedData.asInstanceOf[js.Any], formattedListPrice = formattedListPrice.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any], skuId = skuId.asInstanceOf[js.Any], skuType = skuType.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorePreviewSkuInfo]
  }
}


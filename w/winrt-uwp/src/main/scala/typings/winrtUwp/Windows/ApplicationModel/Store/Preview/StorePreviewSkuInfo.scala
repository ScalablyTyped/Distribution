package typings.winrtUwp.Windows.ApplicationModel.Store.Preview

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the available SKUs for an in-app product. */
@JSGlobal("Windows.ApplicationModel.Store.Preview.StorePreviewSkuInfo")
@js.native
abstract class StorePreviewSkuInfo () extends js.Object {
  /** Gets the currency code for the current market. */
  var currencyCode: String = js.native
  /** Gets custom developer data for the current SKU. */
  var customDeveloperData: String = js.native
  /** Gets the description for the current SKU. */
  var description: String = js.native
  /** Gets extended data for the current SKU. */
  var extendedData: String = js.native
  /** Gets the current SKU's purchase price with the appropriate formatting for the current market. */
  var formattedListPrice: String = js.native
  /** Gets the ID of the product that this SKU is associated with. */
  var productId: String = js.native
  /** Gets the ID of this SKU. */
  var skuId: String = js.native
  /** Gets a string that specifies the type of the in-app product SKU. */
  var skuType: String = js.native
  /** Gets the name of the in-app product SKU that is displayed to customers. */
  var title: String = js.native
}


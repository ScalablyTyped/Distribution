package typings.winrtDashUwp.Windows.ApplicationModel.Store.Preview

import typings.winrtDashUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about an in-app product, including details about available SKUs. */
@JSGlobal("Windows.ApplicationModel.Store.Preview.StorePreviewProductInfo")
@js.native
abstract class StorePreviewProductInfo () extends js.Object {
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


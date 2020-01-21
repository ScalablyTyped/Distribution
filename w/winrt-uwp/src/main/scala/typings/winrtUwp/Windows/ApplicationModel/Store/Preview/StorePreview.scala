package typings.winrtUwp.Windows.ApplicationModel.Store.Preview

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines static methods for retrieving the in-app product SKUs available for the current app and requesting the purchase of an in-app product SKU for the app. */
@JSGlobal("Windows.ApplicationModel.Store.Preview.StorePreview")
@js.native
abstract class StorePreview () extends js.Object

/* static members */
@JSGlobal("Windows.ApplicationModel.Store.Preview.StorePreview")
@js.native
object StorePreview extends js.Object {
  /**
    * Retrieves the in-app products available for the current app asynchronously, including the available SKUs for each product.
    * @return An asynchronous operation that, on successful completion, returns the collection of in-app products for the current app (including the available SKUs for each product). If you use Asynchronous programming, the result type is a read-only list/vector of StorePreviewProductInfo items. (You can use APIs of IVectorView<StorePreviewProductInfo> for C++ or JavaScript, APIs of IReadOnlyList<StorePreviewProductInfo> for .NET.)
    */
  def loadAddOnProductInfosAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Requests the purchase of a SKU for an in-app product that is associated with the current app. Calling this method displays the UI that is used to complete the transaction via the Windows Store.
    * @param productId Specifies the ID of the in-app product. This corresponds to the StorePreviewProductInfo.ProductId value and the StorePreviewSkuInfo.ProductId values for all SKUs of the in-app product.
    * @param skuId Specifies the ID of the SKU for the in-app product. This corresponds to the StorePreviewSkuInfo.SkuId value.
    * @return An asynchronous operation that, on successful completion, returns a StorePreviewPurchaseResults that contains the results of the in-app product purchase request.
    */
  def requestProductPurchaseByProductIdAndSkuIdAsync(productId: String, skuId: String): IPromiseWithIAsyncOperation[StorePreviewPurchaseResults] = js.native
}


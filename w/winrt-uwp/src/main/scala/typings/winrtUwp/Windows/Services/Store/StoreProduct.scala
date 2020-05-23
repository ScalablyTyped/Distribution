package typings.winrtUwp.Windows.Services.Store

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a product that is available in the Windows Store. */
@js.native
trait StoreProduct extends js.Object {
  /** Gets the product description from the Windows Store listing. */
  var description: String = js.native
  /** Gets complete data for the product from the Store in JSON format. */
  var extendedJsonData: String = js.native
  /** Gets a value that indicates whether the product has optional downloadable content (DLC). */
  var hasDigitalDownload: Boolean = js.native
  /** Gets the images from the Windows Store listing for the product. */
  var images: IVectorView[StoreImage] = js.native
  /** Gets the product ID for this product, if the current StoreProduct represents an add-on. */
  var inAppOfferToken: String = js.native
  /** Gets a value that indicates whether the current user has an entitlement to use the default SKU of the product. */
  var isInUserCollection: Boolean = js.native
  /** Gets the keywords that are associated with the product in the Windows Dev Center dashboard. This property only applies to StoreProduct objects that represent add-ons. These strings correspond to the value of the Keywords field in the properties page for the add-on in the Windows Dev Center dashboard. */
  var keywords: IVectorView[String] = js.native
  /** Gets the language for the data in the Windows Store listing for the product. */
  var language: String = js.native
  /** Gets the URI to the Windows Store listing for the product. */
  var linkUri: Uri = js.native
  /** Gets the price for the default SKU and availability for the product. */
  var price: StorePrice = js.native
  /** Gets the type of the product. These values are currently supported: Application, Game, Consumable, UnmanagedConsumable, and Durable. */
  var productKind: String = js.native
  /** Gets the list of available SKUs for the product. */
  var skus: IVectorView[StoreSku] = js.native
  /** Gets the Store ID for this product. */
  var storeId: String = js.native
  /** Gets the product title from the Windows Store listing. */
  var title: String = js.native
  /** Gets the videos from the Windows Store listing for the product. */
  var videos: IVectorView[StoreVideo] = js.native
  /**
    * Indicates whether any SKU of this product is installed on the current device. This method is intended to be used for products that have downloadable content (DLC).
    * @return An asynchronous operation that, on successful completion, returns true if a SKU of this product is installed on the current device; otherwise, false.
    */
  def getIsAnySkuInstalledAsync(): IPromiseWithIAsyncOperation[Boolean] = js.native
  /**
    * Requests the purchase of the default SKU and availability for the product and displays the UI that is used to complete the transaction via the Windows Store.
    * @return An asynchronous operation that, on successful completion, returns a StorePurchaseResult object that provides status and error info about the purchase.
    */
  def requestPurchaseAsync(): IPromiseWithIAsyncOperation[StorePurchaseResult] = js.native
  /**
    * Requests the purchase of the default SKU and availability for the product and displays the UI that is used to complete the transaction via the Windows Store. This method provides the option to specify additional details for a specific offer within a large catalog of products that are represented by a single listing in the Windows Store, including the product name to display to the user during the purchase.
    * @param storePurchaseProperties An object that specifies additional info for the purchase request, including the product name to display to the user during the purchase.
    * @return An asynchronous operation that, on successful completion, returns a StorePurchaseResult object that provides status and error info about the purchase.
    */
  def requestPurchaseAsync(storePurchaseProperties: StorePurchaseProperties): IPromiseWithIAsyncOperation[StorePurchaseResult] = js.native
}


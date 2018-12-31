package typings
package winrtDashUwpLib.WindowsNs.ServicesNs.StoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a product that is available in the Windows Store. */
@JSGlobal("Windows.Services.Store.StoreProduct")
@js.native
abstract class StoreProduct () extends js.Object {
  /** Gets the product description from the Windows Store listing. */
  var description: java.lang.String = js.native
  /** Gets complete data for the product from the Store in JSON format. */
  var extendedJsonData: java.lang.String = js.native
  /** Gets a value that indicates whether the product has optional downloadable content (DLC). */
  var hasDigitalDownload: scala.Boolean = js.native
  /** Gets the images from the Windows Store listing for the product. */
  var images: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[StoreImage] = js.native
  /** Gets the product ID for this product, if the current StoreProduct represents an add-on. */
  var inAppOfferToken: java.lang.String = js.native
  /** Gets a value that indicates whether the current user has an entitlement to use the default SKU of the product. */
  var isInUserCollection: scala.Boolean = js.native
  /** Gets the keywords that are associated with the product in the Windows Dev Center dashboard. This property only applies to StoreProduct objects that represent add-ons. These strings correspond to the value of the Keywords field in the properties page for the add-on in the Windows Dev Center dashboard. */
  var keywords: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String] = js.native
  /** Gets the language for the data in the Windows Store listing for the product. */
  var language: java.lang.String = js.native
  /** Gets the URI to the Windows Store listing for the product. */
  var linkUri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri = js.native
  /** Gets the price for the default SKU and availability for the product. */
  var price: StorePrice = js.native
  /** Gets the type of the product. These values are currently supported: Application, Game, Consumable, UnmanagedConsumable, and Durable. */
  var productKind: java.lang.String = js.native
  /** Gets the list of available SKUs for the product. */
  var skus: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[StoreSku] = js.native
  /** Gets the Store ID for this product. */
  var storeId: java.lang.String = js.native
  /** Gets the product title from the Windows Store listing. */
  var title: java.lang.String = js.native
  /** Gets the videos from the Windows Store listing for the product. */
  var videos: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[StoreVideo] = js.native
  /**
    * Indicates whether any SKU of this product is installed on the current device. This method is intended to be used for products that have downloadable content (DLC).
    * @return An asynchronous operation that, on successful completion, returns true if a SKU of this product is installed on the current device; otherwise, false.
    */
  def getIsAnySkuInstalledAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Boolean] = js.native
  /**
    * Requests the purchase of the default SKU and availability for the product and displays the UI that is used to complete the transaction via the Windows Store.
    * @return An asynchronous operation that, on successful completion, returns a StorePurchaseResult object that provides status and error info about the purchase.
    */
  def requestPurchaseAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[StorePurchaseResult] = js.native
  /**
    * Requests the purchase of the default SKU and availability for the product and displays the UI that is used to complete the transaction via the Windows Store. This method provides the option to specify additional details for a specific offer within a large catalog of products that are represented by a single listing in the Windows Store, including the product name to display to the user during the purchase.
    * @param storePurchaseProperties An object that specifies additional info for the purchase request, including the product name to display to the user during the purchase.
    * @return An asynchronous operation that, on successful completion, returns a StorePurchaseResult object that provides status and error info about the purchase.
    */
  def requestPurchaseAsync(storePurchaseProperties: StorePurchaseProperties): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[StorePurchaseResult] = js.native
}


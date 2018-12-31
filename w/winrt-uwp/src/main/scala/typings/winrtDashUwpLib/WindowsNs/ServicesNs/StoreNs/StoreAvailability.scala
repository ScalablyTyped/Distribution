package typings
package winrtDashUwpLib.WindowsNs.ServicesNs.StoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a specific instance of a product SKU that can be purchased. */
@JSGlobal("Windows.Services.Store.StoreAvailability")
@js.native
abstract class StoreAvailability () extends js.Object {
  /** Gets the end date for the current SKU availability. */
  var endDate: stdLib.Date = js.native
  /** Gets complete data for the current SKU availability from the Store in JSON format. */
  var extendedJsonData: java.lang.String = js.native
  /** Gets price info for the current SKU availability, including the base price, current price, and sale info. */
  var price: StorePrice = js.native
  /** Gets the Store ID of the current SKU availability from the Windows Store catalog. */
  var storeId: java.lang.String = js.native
  /**
    * Requests the purchase of the current SKU availability and displays the UI that is used to complete the transaction via the Windows Store.
    * @return An asynchronous operation that, on successful completion, returns a StorePurchaseResult object that provides status and error info about the purchase.
    */
  def requestPurchaseAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[StorePurchaseResult] = js.native
  /**
    * Requests the purchase of the current SKU availability and displays the UI that is used to complete the transaction via the Windows Store. This method provides the option to specify additional details for a specific offer within a large catalog of products that are represented by a single listing in the Windows Store, including the product name to display to the user during the purchase.
    * @param {StorePurchaseProperties} storePurchaseProperties An object that specifies additional info for the purchase request, including the product name to display to the user during the purchase.
    * @return An asynchronous operation that, on successful completion, returns a StorePurchaseResult object that provides status and error info about the purchase.
    */
  def requestPurchaseAsync(storePurchaseProperties: StorePurchaseProperties): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[StorePurchaseResult] = js.native
}


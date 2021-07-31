package typings.winrtUwp.Windows.Services.Store

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a specific instance of a product SKU that can be purchased. */
@js.native
trait StoreAvailability extends StObject {
  
  /** Gets the end date for the current SKU availability. */
  var endDate: Date = js.native
  
  /** Gets complete data for the current SKU availability from the Store in JSON format. */
  var extendedJsonData: String = js.native
  
  /** Gets price info for the current SKU availability, including the base price, current price, and sale info. */
  var price: StorePrice = js.native
  
  /**
    * Requests the purchase of the current SKU availability and displays the UI that is used to complete the transaction via the Windows Store.
    * @return An asynchronous operation that, on successful completion, returns a StorePurchaseResult object that provides status and error info about the purchase.
    */
  def requestPurchaseAsync(): IPromiseWithIAsyncOperation[StorePurchaseResult] = js.native
  /**
    * Requests the purchase of the current SKU availability and displays the UI that is used to complete the transaction via the Windows Store. This method provides the option to specify additional details for a specific offer within a large catalog of products that are represented by a single listing in the Windows Store, including the product name to display to the user during the purchase.
    * @param {StorePurchaseProperties} storePurchaseProperties An object that specifies additional info for the purchase request, including the product name to display to the user during the purchase.
    * @return An asynchronous operation that, on successful completion, returns a StorePurchaseResult object that provides status and error info about the purchase.
    */
  def requestPurchaseAsync(storePurchaseProperties: StorePurchaseProperties): IPromiseWithIAsyncOperation[StorePurchaseResult] = js.native
  
  /** Gets the Store ID of the current SKU availability from the Windows Store catalog. */
  var storeId: String = js.native
}

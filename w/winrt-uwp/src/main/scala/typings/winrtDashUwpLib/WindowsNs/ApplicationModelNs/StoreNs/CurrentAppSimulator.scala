package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines methods and properties used to instantiate an object that you can use to get simulated license info during testing. */
@JSGlobal("Windows.ApplicationModel.Store.CurrentAppSimulator")
@js.native
abstract class CurrentAppSimulator () extends js.Object

/** Defines methods and properties used to instantiate an object that you can use to get simulated license info during testing. */
@JSGlobal("Windows.ApplicationModel.Store.CurrentAppSimulator")
@js.native
object CurrentAppSimulator extends js.Object {
  /** Gets a simulated app ID. Since CurrentAppSimulator is intended only for testing during app development, the returned CurrentAppSimulator.AppId will contain only 0's. */
  var appId: java.lang.String = js.native
  /** Gets the simulated license metadata for the current app as provided by the simulation. */
  var licenseInformation: winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.LicenseInformation = js.native
  /** Gets the simulated Uniform Resource Identifier (URI) that represents a Windows Store listing page for the current app. */
  var linkUri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri = js.native
  /**
    * Retrieves the promotion campaign ID for the current app.
    * @return The advertising campaign ID for your app.
    */
  def getAppPurchaseCampaignIdAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[java.lang.String] = js.native
  /**
    * Creates the async operation that the user can use to simulate requesting all receipts for this app and any in-app product purchases. For examples of how receipt information can be used, see Using receipts to verify product purchases.
    * @return An XML-formatted string that contains all receipts for this app and any in-app product purchases.
    */
  def getAppReceiptAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[java.lang.String] = js.native
  /**
    * Creates the async operation that the user can use to simulate requesting the receipt for the specified productId. For examples of how receipt information can be used, see Using receipts to verify product purchases.
    * @param productId The unique identifier for the product. This ID is that was specified when the product was submitted for the app to the Store.
    * @return An XML-formatted string that contains the receipt for the specified productId.
    */
  def getProductReceiptAsync(productId: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[java.lang.String] = js.native
  /**
    * Returns a list of purchased consumable in-app products that have not been fulfilled locally.
    * @return When the operation completes, a list of unfulfilled consumable in-app products ( UnfulfilledConsumable objects) is returned. Each item in this list provides the product ID, offer ID, and transaction ID associated with a product.
    */
  def getUnfulfilledConsumablesAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
  /**
    * Loads the simulated app listing information asynchronously. Implements the IAsyncInfo interface.
    * @return The app listing information as defined by the simulation. If the method fails, it returns an HRESULT error code.
    */
  def loadListingInformationAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.ListingInformation] = js.native
  /**
    * Windows Phone only. Loads the simulated app listing information asynchronously, returning in-app products in the ProductListings collection that match all supplied keywords. Implements the IAsyncInfo interface.
    * @param keywords The list of keywords by which to filter the ProductListings collection that is returned in the ListingInformation object.
    * @return The simulated app listing information, with ProductListings collection filtered by keywords. If the method fails, it returns an HRESULT error code. If no in-app products are found that match all of the given keywords, the ProductListings collection will be empty.
    */
  def loadListingInformationByKeywordsAsync(keywords: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String]): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.ListingInformation] = js.native
  /**
    * Windows Phone only. Loads the simulated app listing information asynchronously, returning available in-app products in the ProductListings collection that match any of the given products IDs. This method implements the IAsyncInfo interface.
    * @param productIds The list of product IDs by which to filter the ProductListings collection.
    * @return The simulated app listing information, with ProductListings collection filtered by product IDs. If the method fails, it returns an HRESULT error code. If no in-app products are found that match the given product IDs, the ProductListings collection will be empty.
    */
  def loadListingInformationByProductIdsAsync(productIds: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String]): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.ListingInformation] = js.native
  /**
    * Reloads the simulator using a StorageFile containing the WindowsStoreProxy.xml file.
    * @param simulatorSettingsFile The WindowsStoreProxy.xml file that the simulator uses. For more information, see CurrentAppSimulator .
    * @return The async operation that reloads the simulator.
    */
  def reloadSimulatorAsync(simulatorSettingsFile: winrtDashUwpLib.WindowsNs.StorageNs.StorageFile): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
    * Simulates notifying the Windows Store that the purchase of a consumable in-app product is fulfilled and that the user has the right to access the content.
    * @param productId Identifies the consumable in-app product.
    * @param transactionId Identifies a simulated transaction that includes the purchase of the consumable in-app product ( productId).
    * @return A value that indicates the status of fulfillment for a simulated consumable in-app product purchase.
    */
  def reportConsumableFulfillmentAsync(productId: java.lang.String, transactionId: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.FulfillmentResult] = js.native
  /**
    * Creates the async operation that simulates a user request to buy a full license for the current app.
    * @param includeReceipt Determines if the method should return the receipts for this app.
    * @return If the includeReceipt parameter is set to true, this string contains XML that represents all receipts for the app and any in-app product purchases. If includeReceipt is set to false, this string is empty.
    */
  def requestAppPurchaseAsync(includeReceipt: scala.Boolean): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[java.lang.String] = js.native
  /**
    * Creates the async operation that displays the UI that is used to simulate the purchase of in-app product from the Windows Store.
    * @param productId Specifies the id, as defined by the simulation, of the in-app product to buy.
    * @return A PurchaseResults object containing transaction details for the provided productId.
    */
  def requestProductPurchaseAsync(productId: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.PurchaseResults] = js.native
  /**
    * Creates the async operation that displays the UI that is used to simulate the purchase of an in-app product from the Windows Store.
    * @param productId Specifies the id, as defined by the simulation, of the in-app product to buy.
    * @param includeReceipt Determines if the method should return the receipts for the specified productId.
    * @return A string providing in-app product purchase details for the provided productId. If includeReceipt is set true, the returned string will include a full receipt xml.
    */
  def requestProductPurchaseAsync(productId: java.lang.String, includeReceipt: scala.Boolean): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[java.lang.String] = js.native
  /**
    * Creates the async operation that displays the UI that is used to simulate the purchase of an in-app product from the Windows Store.
    * @param productId The product ID used for listing in the Windows Store.
    * @param offerId The specific in-app product within the large purchase catalog represented on the Windows Store by the productId. This value correlates with the content your app is responsible for fulfilling. The Windows Store only uses this parameter value to itemize the PurchaseResults .
    * @param displayProperties The name of the in-app product that is displayed to the user at time of purchase.
    * @return The results of the in-app product purchase.
    */
  def requestProductPurchaseAsync(
    productId: java.lang.String,
    offerId: java.lang.String,
    displayProperties: winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.ProductPurchaseDisplayProperties
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.PurchaseResults] = js.native
}


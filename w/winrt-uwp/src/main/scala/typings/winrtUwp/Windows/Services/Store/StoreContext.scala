package typings.winrtUwp.Windows.Services.Store

import typings.winrtUwp.Windows.ApplicationModel.Package
import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.System.User
import typings.winrtUwp.Windows.WinRTEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides members you can use to access and manage Windows Store-related data for the current app. For example, you can use members of this class to get Windows Store listing and license info for the current app, purchase the current app or products that are offered by the app, or download and install package updates for the app. */
@js.native
trait StoreContext extends StObject {
  
  /**
    * Acquires a license for the specified downloadable content (DLC) package for the current app.
    * @param optionalPackage The DLC package for which to acquire a license.
    * @return An asynchronous operation that, on successful completion, returns a StoreAcquireLicenseResult object that contains the license.
    */
  def acquireStoreLicenseForOptionalPackageAsync(optionalPackage: Package): IPromiseWithIAsyncOperation[StoreAcquireLicenseResult] = js.native
  
  /**
    * Gets Store product details for the app or add-on that is associated with the specified package.
    * @param productKinds An array of strings that specify the types of Store products that might be associated with the package. For a list of the supported string values, see the ProductKind property.
    * @param package A Package that represents the package for which you want to get the corresponding Store product details.
    * @return An asynchronous operation that, on successful completion, returns a StoreProductResult object. Use the Product property of this object to access a StoreProduct that contains Store product details for the specified package.
    */
  def findStoreProductForPackageAsync(productKinds: IIterable[String], _package: Package): IPromiseWithIAsyncOperation[StoreProductResult] = js.native
  
  /**
    * Gets the collection of packages for the current app that have updates available for download from the Windows Store, including optional packages for the app (also called downloadable content or DLC).
    * @return An asynchronous operation that, on successful completion, returns a collection of StorePackageUpdate objects that represent the packages that have updates available.
    */
  def getAppAndOptionalStorePackageUpdatesAsync(): IPromiseWithIAsyncOperation[StorePackageUpdate] = js.native
  
  /**
    * Gets license info for the current app, including licenses for add-ons for the current app.
    * @return An asynchronous operation that, on successful completion, returns a StoreAppLicense object that contains license info for the current app, including add-on licenses.
    */
  def getAppLicenseAsync(): IPromiseWithIAsyncOperation[StoreAppLicense] = js.native
  
  /**
    * Gets the list of products that can be purchased from within the current app.
    * @param productKinds An array of strings that specify the types of products you want to get. For a list of the supported string values, see the ProductKind property.
    * @return An asynchronous operation that, on successful completion, returns a StoreProductQueryResult that provides access to the associated products and relevant error info.
    */
  def getAssociatedStoreProductsAsync(productKinds: IIterable[String]): IPromiseWithIAsyncOperation[StoreProductQueryResult] = js.native
  
  /**
    * Gets the list of products that can be purchased from within the current app. This method supports paging to return the results.
    * @param productKinds An array of strings that specify the types of products you want to get. For a list of the supported string values, see the ProductKind property.
    * @param maxItemsToRetrievePerPage The maximum number of products to return in each page of results.
    * @return An asynchronous operation that, on successful completion, returns a StoreProductPagedQueryResult that provides access to the associated products, relevant error info, and the next page of results.
    */
  def getAssociatedStoreProductsWithPagingAsync(productKinds: IIterable[String], maxItemsToRetrievePerPage: Double): IPromiseWithIAsyncOperation[StoreProductPagedQueryResult] = js.native
  
  /**
    * Gets the remaining balance for the specified consumable add-on for the current app.
    * @param productStoreId The Store ID for the add-on (as provided by the StoreId property of the StoreProduct that represents the add-on).
    * @return An asynchronous operation that, on successful completion, returns a StoreConsumableResult that provides the remaining balance and other info.
    */
  def getConsumableBalanceRemainingAsync(productStoreId: String): IPromiseWithIAsyncOperation[StoreConsumableResult] = js.native
  
  /**
    * Retrieves a Windows Store collections ID key that can be used to query for product entitlements or to consume product entitlements that are owned by the current user.
    * @param serviceTicket An Azure Active Directory access token that identifies the publisher of the current app. For more information about generating this token, see Manage product entitlements from a service.
    * @param publisherUserId An anonymous ID that identifies the current user in the context of services that are managed by the publisher of the current app. If the publisher maintains anonymous user IDs for use in their services, they can use this parameter to correlate these user IDs with the calls they make to Windows Store services. This parameter is optional.
    * @return An asynchronous operation that, on successful completion, returns the collections ID key for the current user. This key is valid for 90 days.
    */
  def getCustomerCollectionsIdAsync(serviceTicket: String): IPromiseWithIAsyncOperation[String] = js.native
  def getCustomerCollectionsIdAsync(serviceTicket: String, publisherUserId: String): IPromiseWithIAsyncOperation[String] = js.native
  
  /**
    * Retrieves a Windows Store purchase ID key that can be used to grant entitlements for free products on behalf of the current user.
    * @param serviceTicket An Azure Active Directory access token that identifies the publisher of the current app. For more information about generating this token, see Manage product entitlements from a service.
    * @param publisherUserId An anonymous ID that identifies the current user in the context of services that are managed by the publisher of the current app. If the publisher maintains anonymous user IDs for use in their services, they can use this parameter to correlate these user IDs with the calls they make to Windows Store services. This parameter is optional.
    * @return An asynchronous operation that, on successful completion, returns the purchase ID key for the current user. This key is valid for 90 days.
    */
  def getCustomerPurchaseIdAsync(serviceTicket: String): IPromiseWithIAsyncOperation[String] = js.native
  def getCustomerPurchaseIdAsync(serviceTicket: String, publisherUserId: String): IPromiseWithIAsyncOperation[String] = js.native
  
  /**
    * Gets Windows Store listing info for the current app and provides access to a method that you can use to purchase the app for the current user.
    * @return An asynchronous operation that, on successful completion, returns a StoreProductResult object that contains Windows Store listing info for the current app and any relevant error info.
    */
  def getStoreProductForCurrentAppAsync(): IPromiseWithIAsyncOperation[StoreProductResult] = js.native
  
  /**
    * Gets Windows Store listing info for the specified products that can be purchased from within the current app.
    * @param productKinds An array of strings that specify the types of products for which you want to retrieve listing info. For a list of the supported string values, see the ProductKind property.
    * @param storeIds An array of the Store ID strings for the products for which you want to retrieve listing info.
    * @return An asynchronous operation that, on successful completion, returns a StoreProductQueryResult object that contains Windows Store listing info for the specified products and any relevant error info.
    */
  def getStoreProductsAsync(productKinds: IIterable[String], storeIds: IIterable[String]): IPromiseWithIAsyncOperation[StoreProductQueryResult] = js.native
  
  /**
    * Gets Windows Store info for the add-ons of the current app for which the user has entitlements to use.
    * @param productKinds An array of strings that specify the types of add-ons for which you want to retrieve listing info. For a list of the supported string values, see the ProductKind property.
    * @return An asynchronous operation that, on successful completion, returns a StoreProductQueryResult object that contains Windows Store listing info for the add-ons of the current app for which the user has entitlements to use.
    */
  def getUserCollectionAsync(productKinds: IIterable[String]): IPromiseWithIAsyncOperation[StoreProductQueryResult] = js.native
  
  /**
    * Gets Windows Store info for the add-ons of the current app for which the user has entitlements to use. This method supports paging to return the results.
    * @param productKinds An array of strings that specify the types of add-ons for which you want to retrieve listing info. For a list of the supported string values, see the ProductKind property.
    * @param maxItemsToRetrievePerPage The maximum number of add-ons to return in each page of results.
    * @return An asynchronous operation that, on successful completion, returns a StoreProductPagedQueryResult object that provides access to the Windows Store listing info for the add-ons of the current app for which the user has entitlements to use, as well as the next page of results.
    */
  def getUserCollectionWithPagingAsync(productKinds: IIterable[String], maxItemsToRetrievePerPage: Double): IPromiseWithIAsyncOperation[StoreProductPagedQueryResult] = js.native
  
  /** Raised when the status of the app's license changes (for example, the trial period has expired or the user has purchased the full version of the app). */
  def onofflinelicenseschanged(ev: js.Object & WinRTEvent[StoreContext]): Unit = js.native
  /** Raised when the status of the app's license changes (for example, the trial period has expired or the user has purchased the full version of the app). */
  @JSName("onofflinelicenseschanged")
  var onofflinelicenseschanged_Original: TypedEventHandler[StoreContext, js.Object] = js.native
  
  /**
    * Reports a consumable add-on for the current app as fulfilled in the Windows Store.
    * @param productStoreId The Store ID of the consumable add-on that you want to report as fulfilled.
    * @param quantity The number of units of the consumable add-on that you want to report as fulfilled. For a Store-managed consumable (that is, a consumable where Microsoft keeps track of the balance), specify the number of units that have been consumed. For a developer-managed consumable (that is, a consumable where the developer keeps track of the balance), specify 1.
    * @param trackingId A developer-supplied GUID that identifies the specific transaction that the fulfillment operation is associated with for tracking purposes. For more information, see the remarks.
    * @return An asynchronous operation that, on successful completion, returns a StoreConsumableResult object that contains info about the fulfillment operation, such as the remaining balance of add-on units.
    */
  def reportConsumableFulfillmentAsync(productStoreId: String, quantity: Double, trackingId: String): IPromiseWithIAsyncOperation[StoreConsumableResult] = js.native
  
  /**
    * Downloads and installs the specified package updates for the current app from the Windows Store.
    * @param storePackageUpdates The set of StorePackageUpdate objects that represent the updated packages to download and install.
    * @return An object that the caller can observe to track progress and completion for the operation. On successful completion, the result is a StorePackageUpdateResult object that provides info about the package updates.
    */
  def requestDownloadAndInstallStorePackageUpdatesAsync(storePackageUpdates: IIterable[StorePackageUpdate]): IPromiseWithIAsyncOperationWithProgress[StorePackageUpdateResult, StorePackageUpdateStatus] = js.native
  
  /**
    * Downloads and installs the specified downloadable content (DLC) packages for the current app from the Windows Store.
    * @param storeIds The product IDs of the add-on packages to install.
    * @return An object that the caller can observe to track progress and completion for the operation. On successful completion, the result is a StorePackageUpdateResult object that provides info about the package updates.
    */
  def requestDownloadAndInstallStorePackagesAsync(storeIds: IIterable[String]): IPromiseWithIAsyncOperationWithProgress[StorePackageUpdateResult, StorePackageUpdateStatus] = js.native
  
  /**
    * Downloads the specified package updates for the current app from the Windows Store.
    * @param storePackageUpdates The set of StorePackageUpdate objects that represent the updated packages to download.
    * @return An object that the caller can observe to track progress and completion for the operation. On successful completion, the result is a StorePackageUpdateResult object that provides info about the package updates.
    */
  def requestDownloadStorePackageUpdatesAsync(storePackageUpdates: IIterable[StorePackageUpdate]): IPromiseWithIAsyncOperationWithProgress[StorePackageUpdateResult, StorePackageUpdateStatus] = js.native
  
  /**
    * Requests the purchase for the specified app or add-on and displays the UI that is used to complete the transaction via the Windows Store.
    * @param storeId The Store ID of the app or the add-on that you want to purchase for the current user.
    * @return An asynchronous operation that, on successful completion, returns a StorePurchaseResult object that provides status and error info about the purchase.
    */
  def requestPurchaseAsync(storeId: String): IPromiseWithIAsyncOperation[StorePurchaseResult] = js.native
  /**
    * Requests the purchase for the specified app or add-on and displays the UI that is used to complete the transaction via the Windows Store. This method provides the option to specify additional details for a specific offer within a large catalog of products that are represented by a single listing in the Windows Store, including the product name to display to the user during the purchase.
    * @param storeId The Store ID of the app or the add-on that you want to purchase for the current user.
    * @param storePurchaseProperties An object that specifies additional info for the purchase request, including the product name to display to the user during the purchase.
    * @return An asynchronous operation that, on successful completion, returns a StorePurchaseResult object that provides status and error info about the purchase.
    */
  def requestPurchaseAsync(storeId: String, storePurchaseProperties: StorePurchaseProperties): IPromiseWithIAsyncOperation[StorePurchaseResult] = js.native
  
  /** Gets an object that provides info about the current user. */
  var user: User = js.native
}

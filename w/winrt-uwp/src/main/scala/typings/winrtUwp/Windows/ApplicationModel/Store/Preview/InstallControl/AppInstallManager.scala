package typings.winrtUwp.Windows.ApplicationModel.Store.Preview.InstallControl

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.itemcompleted
import typings.winrtUwp.winrtUwpStrings.itemstatuschanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides members for programmatically installing apps, including the ability to start an app install and get a list of app installs currently in progress. */
@JSGlobal("Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallManager")
@js.native
/** Creates and initializes a new instance of the AppInstallManager class */
class AppInstallManager () extends js.Object {
  /** Gets or sets the user identity associated with the app installs. */
  var acquisitionIdentity: String = js.native
  /** Retrieves information about all apps that are currently in the installation queue. */
  var appInstallItems: IVectorView[AppInstallItem] = js.native
  /** Gets or sets the auto update setting for apps on the current computer or device. */
  var autoUpdateSetting: AutoUpdateSetting = js.native
  /** Occurs when an app has finished installing. */
  @JSName("onitemcompleted")
  var onitemcompleted_Original: TypedEventHandler[AppInstallManager, AppInstallManagerItemEventArgs] = js.native
  /** Occurs when the status of an app in the installation queue has changed. */
  @JSName("onitemstatuschanged")
  var onitemstatuschanged_Original: TypedEventHandler[AppInstallManager, AppInstallManagerItemEventArgs] = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_itemcompleted(
    `type`: itemcompleted,
    listener: TypedEventHandler[AppInstallManager, AppInstallManagerItemEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_itemstatuschanged(
    `type`: itemstatuschanged,
    listener: TypedEventHandler[AppInstallManager, AppInstallManagerItemEventArgs]
  ): Unit = js.native
  /**
    * Cancels the installation of the specified app.
    * @param productId The product ID of the app whose installation should be canceled.
    */
  def cancel(productId: String): Unit = js.native
  /**
    * Cancels the installation of the specified app, with the option to generate telemetry data.
    * @param productId The product ID of the app whose installation should be canceled.
    * @param correlationVector A correlation vector string that can be used to generate telemetry data.
    */
  def cancel(productId: String, correlationVector: String): Unit = js.native
  /**
    * Determines whether the specified app has permission to install on the current computer or device.
    * @param productId The product ID of the app that this method will check to determine if it has permission to be installed.
    * @return An asynchronous operation that, on successful completion, returns true if the app has permission to be installed; otherwise false.
    */
  def getIsAppAllowedToInstallAsync(productId: String): IPromiseWithIAsyncOperation[Boolean] = js.native
  /**
    * Determines whether the specified app has permission to install on the current computer or device, with the option to generate telemetry data.
    * @param productId The product ID of the app that this method will check to determine if it has permission to be installed.
    * @param skuId The SKU ID of the app that this method will check to determine if it has permission to be installed.
    * @param catalogId The catalog ID of the app that this method will check to determine if it has permission to be installed.
    * @param correlationVector A correlation vector string that can be used to generate telemetry data.
    * @return An asynchronous operation that, on successful completion, returns true if the app has permission to be installed; otherwise false.
    */
  def getIsAppAllowedToInstallAsync(productId: String, skuId: String, catalogId: String, correlationVector: String): IPromiseWithIAsyncOperation[Boolean] = js.native
  /**
    * Determines whether the specified app can be installed on the current computer or device.
    * @param productId The product ID of the app that this method will check to determine if it can be installed.
    * @param skuId The SKU ID of the app that this method will check to determine if it can be installed.
    * @return An asynchronous operation that, on successful completion, returns true if the app can be installed; otherwise false.
    */
  def getIsApplicableAsync(productId: String, skuId: String): IPromiseWithIAsyncOperation[Boolean] = js.native
  /**
    * Determines whether the specified app is blocked by policy on the current computer or device.
    * @param storeClientName The name of the app that this method will check to determine if is blocked by policy.
    * @param storeClientPublisher The publisher name of the app that this method will check to determine if is blocked by policy.
    * @return An asynchronous operation that, on successful completion, returns true if the app can be installed; otherwise false.
    */
  def isStoreBlockedByPolicyAsync(storeClientName: String, storeClientPublisher: String): IPromiseWithIAsyncOperation[Boolean] = js.native
  /** Occurs when an app has finished installing. */
  def onitemcompleted(ev: AppInstallManagerItemEventArgs with WinRTEvent[AppInstallManager]): Unit = js.native
  /** Occurs when the status of an app in the installation queue has changed. */
  def onitemstatuschanged(ev: AppInstallManagerItemEventArgs with WinRTEvent[AppInstallManager]): Unit = js.native
  /**
    * Pauses the installation of the specified app.
    * @param productId The product ID of the app whose installation should be paused.
    */
  def pause(productId: String): Unit = js.native
  /**
    * Pauses the installation of the specified app, with the option to generate telemetry data.
    * @param productId The product ID of the app whose installation should be paused.
    * @param correlationVector A correlation vector string that can be used to generate telemetry data.
    */
  def pause(productId: String, correlationVector: String): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_itemcompleted(
    `type`: itemcompleted,
    listener: TypedEventHandler[AppInstallManager, AppInstallManagerItemEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_itemstatuschanged(
    `type`: itemstatuschanged,
    listener: TypedEventHandler[AppInstallManager, AppInstallManagerItemEventArgs]
  ): Unit = js.native
  /**
    * Restarts the installation of the specified app.
    * @param productId The product ID of the app whose installation should be restarted.
    */
  def restart(productId: String): Unit = js.native
  /**
    * Restarts the installation of the specified app, with the option to generate telemetry data.
    * @param productId The product ID of the app whose installation should be restarted.
    * @param correlationVector A correlation vector string that can be used to generate telemetry data.
    */
  def restart(productId: String, correlationVector: String): Unit = js.native
  /**
    * Searches for all available updates to apps installed on the current computer or device.
    * @return An asynchronous operation that, on successful completion, returns the collection of apps that have available updates. If you use Asynchronous programming, the result type is a read-only list/vector of AppInstallItem items. (You can use APIs of IVectorView<AppInstallItem> for C++ or JavaScript, APIs of IReadOnlyList<AppInstallItem> for .NET.)
    */
  def searchForAllUpdatesAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Searches for all available updates to apps installed on the current computer or device, with the option to generate telemetry data.
    * @param correlationVector A correlation vector string that can be used to generate telemetry data.
    * @return An asynchronous operation that, on successful completion, returns the collection of apps that have available updates. If you use Asynchronous programming, the result type is a read-only list/vector of AppInstallItem items. (You can use APIs of IVectorView<AppInstallItem> for C++ or JavaScript, APIs of IReadOnlyList<AppInstallItem> for .NET.)
    */
  def searchForAllUpdatesAsync(correlationVector: String): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Searches for updates for the specified app.
    * @param productId The product ID of the app to be queried for updates.
    * @param skuId The SKU to be queried for updates.
    * @return An asynchronous operation that, on successful completion, returns an AppInstallItem that represents the available update.
    */
  def searchForUpdatesAsync(productId: String, skuId: String): IPromiseWithIAsyncOperation[AppInstallItem] = js.native
  /**
    * Searches for updates for the specified app, with the option to generate telemetry data.
    * @param productId The product ID of the app to be queried for updates.
    * @param skuId The SKU ID of the app to be queried for updates.
    * @param catalogId The catalog ID of the app to be queried for updates.
    * @param correlationVector A correlation vector string that can be used to generate telemetry data.
    * @return An asynchronous operation that, on successful completion, returns an AppInstallItem that represents the available update.
    */
  def searchForUpdatesAsync(productId: String, skuId: String, catalogId: String, correlationVector: String): IPromiseWithIAsyncOperation[AppInstallItem] = js.native
  /**
    * Starts the installation of the specified app.
    * @param productId The product ID of the app to install.
    * @param skuId The SKU ID of the app to install.
    * @param repair True to attempt to repair the installation of an app that is already installed; otherwise, false.
    * @param forceUseOfNonRemovableStorage True to install the app to non-removable storage even if the user has configured apps to install to SD card; false to install the app to non-removable storage or SD card according to the user's settings.
    * @return An asynchronous operation that, on successful completion, returns an AppInstallItem that represents the app that was added to the installation queue.
    */
  def startAppInstallAsync(productId: String, skuId: String, repair: Boolean, forceUseOfNonRemovableStorage: Boolean): IPromiseWithIAsyncOperation[AppInstallItem] = js.native
  /**
    * Starts the installation of the specified app, with the option to generate telemetry data.
    * @param productId The product ID of the app to install.
    * @param skuId The SKU ID of the app to install.
    * @param repair True to attempt to repair the installation of an app that is already installed; otherwise, false.
    * @param forceUseOfNonRemovableStorage True to install the app to non-removable storage even if the user has configured apps to install to SD card; false to install the app to non-removable storage or SD card according to the user's settings.
    * @param catalogId The catalog ID of the app to install.
    * @param bundleId The bundle ID of the app to install.
    * @param correlationVector A correlation vector string that can be used to generate telemetry data.
    * @return An asynchronous operation that, on successful completion, returns an AppInstallItem that represents the app that was added to the installation queue.
    */
  def startAppInstallAsync(
    productId: String,
    skuId: String,
    repair: Boolean,
    forceUseOfNonRemovableStorage: Boolean,
    catalogId: String,
    bundleId: String,
    correlationVector: String
  ): IPromiseWithIAsyncOperation[AppInstallItem] = js.native
  /**
    * Starts the update of an app specified by the package family name.
    * @param packageFamilyName The package family name of the app to update.
    * @return An asynchronous operation that, on successful completion, returns an AppInstallItem that represents the app update that was added to the installation queue.
    */
  def updateAppByPackageFamilyNameAsync(packageFamilyName: String): IPromiseWithIAsyncOperation[AppInstallItem] = js.native
  /**
    * Starts the update of an app specified by the package family name, with the option to generate telemetry data.
    * @param packageFamilyName The package family name of the app to update.
    * @param correlationVector A correlation vector string that can be used to generate telemetry data.
    * @return An asynchronous operation that, on successful completion, returns an AppInstallItem that represents the app update that was added to the installation queue.
    */
  def updateAppByPackageFamilyNameAsync(packageFamilyName: String, correlationVector: String): IPromiseWithIAsyncOperation[AppInstallItem] = js.native
}


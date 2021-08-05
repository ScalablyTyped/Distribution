package typings.winrtUwp.Windows.ApplicationModel.Store.Preview

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTError
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.completed
import typings.winrtUwp.winrtUwpStrings.itemcompleted
import typings.winrtUwp.winrtUwpStrings.itemstatuschanged
import typings.winrtUwp.winrtUwpStrings.statuschanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides an API for programmatically managing the installation of apps and app updates. This API is accessible through the AppInstallManager class. */
object InstallControl {
  
  @js.native
  sealed trait AppInstallState extends StObject
  /** Defines the app install states that are returned by the InstallState property of the AppInstallStatus class. */
  @JSGlobal("Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallState")
  @js.native
  object AppInstallState extends StObject {
    
    /** The license is being acquired for the app. */
    @js.native
    sealed trait acquiringLicense
      extends StObject
         with AppInstallState
    
    /** The app install is canceled. */
    @js.native
    sealed trait canceled
      extends StObject
         with AppInstallState
    
    /** The app install is complete. */
    @js.native
    sealed trait completed
      extends StObject
         with AppInstallState
    
    /** The app is being downloaded. */
    @js.native
    sealed trait downloading
      extends StObject
         with AppInstallState
    
    /** The ap install encountered an error. */
    @js.native
    sealed trait error
      extends StObject
         with AppInstallState
    
    /** The app is in the process of being installed. */
    @js.native
    sealed trait installing
      extends StObject
         with AppInstallState
    
    /** The app install was paused. */
    @js.native
    sealed trait paused
      extends StObject
         with AppInstallState
    
    /** The app install was paused because the battery is low. */
    @js.native
    sealed trait pausedLowBattery
      extends StObject
         with AppInstallState
    
    /** The app install was paused because the app package was large enough to trigger a prompt for the user to download the app over Wi-Fi. */
    @js.native
    sealed trait pausedWiFiRecommended
      extends StObject
         with AppInstallState
    
    /** The app install was paused because the app package was large enough to require the user to download the app over Wi-Fi. */
    @js.native
    sealed trait pausedWiFiRequired
      extends StObject
         with AppInstallState
    
    /** The app install is pending. */
    @js.native
    sealed trait pending
      extends StObject
         with AppInstallState
    
    /** The app is ready to download. */
    @js.native
    sealed trait readyToDownload
      extends StObject
         with AppInstallState
    
    /** The app data is being restored. */
    @js.native
    sealed trait restoringData
      extends StObject
         with AppInstallState
    
    /** The app install is starting. */
    @js.native
    sealed trait starting
      extends StObject
         with AppInstallState
  }
  
  @js.native
  sealed trait AppInstallType extends StObject
  /** Defines the different app install types that are returned by the InstallType property of the AppInstallItem class. */
  @JSGlobal("Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallType")
  @js.native
  object AppInstallType extends StObject {
    
    /** The app is being installed. */
    @js.native
    sealed trait install
      extends StObject
         with AppInstallType
    
    /** The app installation is being repaired. */
    @js.native
    sealed trait repair
      extends StObject
         with AppInstallType
    
    /** The app is being updated. */
    @js.native
    sealed trait update
      extends StObject
         with AppInstallType
  }
  
  @js.native
  sealed trait AutoUpdateSetting extends StObject
  /** Defines the automatic app update setting values that can be returned by the AutoUpdateSetting property of the AppInstallManager class. */
  @JSGlobal("Windows.ApplicationModel.Store.Preview.InstallControl.AutoUpdateSetting")
  @js.native
  object AutoUpdateSetting extends StObject {
    
    /** Automatic app updates are disabled by the user. */
    @js.native
    sealed trait disabled
      extends StObject
         with AutoUpdateSetting
    
    /** Automatic app updates are disabled by policy. */
    @js.native
    sealed trait disabledByPolicy
      extends StObject
         with AutoUpdateSetting
    
    /** Automatic app updates are enabled by the user. */
    @js.native
    sealed trait enabled
      extends StObject
         with AutoUpdateSetting
    
    /** Automatic app updates are enabled by policy. */
    @js.native
    sealed trait enabledByPolicy
      extends StObject
         with AutoUpdateSetting
  }
  
  /** Represents an app that is in the installation queue. */
  @js.native
  trait AppInstallItem extends StObject {
    
    def addEventListener(`type`: String, listener: EventHandler[js.Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_completed(`type`: completed, listener: TypedEventHandler[AppInstallItem, js.Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_statuschanged(`type`: statuschanged, listener: TypedEventHandler[AppInstallItem, js.Any]): Unit = js.native
    
    /** Cancels the installation of the current app. */
    def cancel(): Unit = js.native
    /**
      * Cancels the installation of the current app, with the option to generate telemetry data.
      * @param correlationVector A correlation vector string that can be used to generate telemetry data.
      */
    def cancel(correlationVector: String): Unit = js.native
    
    /**
      * Gets the installation status of the current app.
      * @return A value that specifies the installation status of the current app.
      */
    def getCurrentStatus(): AppInstallStatus = js.native
    
    /** Gets the type of the current app install. */
    var installType: AppInstallType = js.native
    
    /** Indicates whether the current app install was initiated by the user. */
    var isUserInitiated: Boolean = js.native
    
    /** Occurs when the installation of the current app has finished. */
    def oncompleted(ev: js.Any & WinRTEvent[AppInstallItem]): Unit = js.native
    /** Occurs when the installation of the current app has finished. */
    @JSName("oncompleted")
    var oncompleted_Original: TypedEventHandler[AppInstallItem, js.Any] = js.native
    
    /** Occurs when the installation status of the current app has changed. */
    def onstatuschanged(ev: js.Any & WinRTEvent[AppInstallItem]): Unit = js.native
    /** Occurs when the installation status of the current app has changed. */
    @JSName("onstatuschanged")
    var onstatuschanged_Original: TypedEventHandler[AppInstallItem, js.Any] = js.native
    
    /** Gets the package family name for the current app. */
    var packageFamilyName: String = js.native
    
    /** Pauses the installation of the current app. */
    def pause(): Unit = js.native
    /**
      * Pauses the installation of the current app, with the option to generate telemetry data.
      * @param correlationVector A correlation vector string that can be used to generate telemetry data.
      */
    def pause(correlationVector: String): Unit = js.native
    
    /** Gets the product ID for the current app. */
    var productId: String = js.native
    
    def removeEventListener(`type`: String, listener: EventHandler[js.Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_completed(`type`: completed, listener: TypedEventHandler[AppInstallItem, js.Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_statuschanged(`type`: statuschanged, listener: TypedEventHandler[AppInstallItem, js.Any]): Unit = js.native
    
    /** Restarts the installation of the current app. */
    def restart(): Unit = js.native
    /**
      * Restarts the installation of the current app, with the option to generate telemetry data.
      * @param correlationVector A correlation vector string that can be used to generate telemetry data.
      */
    def restart(correlationVector: String): Unit = js.native
  }
  
  /** Provides members for programmatically installing apps, including the ability to start an app install and get a list of app installs currently in progress. */
  @js.native
  trait AppInstallManager extends StObject {
    
    /** Gets or sets the user identity associated with the app installs. */
    var acquisitionIdentity: String = js.native
    
    def addEventListener(`type`: String, listener: EventHandler[js.Any]): Unit = js.native
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
    
    /** Retrieves information about all apps that are currently in the installation queue. */
    var appInstallItems: IVectorView[AppInstallItem] = js.native
    
    /** Gets or sets the auto update setting for apps on the current computer or device. */
    var autoUpdateSetting: AutoUpdateSetting = js.native
    
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
    def onitemcompleted(ev: AppInstallManagerItemEventArgs & WinRTEvent[AppInstallManager]): Unit = js.native
    /** Occurs when an app has finished installing. */
    @JSName("onitemcompleted")
    var onitemcompleted_Original: TypedEventHandler[AppInstallManager, AppInstallManagerItemEventArgs] = js.native
    
    /** Occurs when the status of an app in the installation queue has changed. */
    def onitemstatuschanged(ev: AppInstallManagerItemEventArgs & WinRTEvent[AppInstallManager]): Unit = js.native
    /** Occurs when the status of an app in the installation queue has changed. */
    @JSName("onitemstatuschanged")
    var onitemstatuschanged_Original: TypedEventHandler[AppInstallManager, AppInstallManagerItemEventArgs] = js.native
    
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
    
    def removeEventListener(`type`: String, listener: EventHandler[js.Any]): Unit = js.native
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
    def searchForAllUpdatesAsync(): IPromiseWithIAsyncOperation[IVectorView[js.Any]] = js.native
    /**
      * Searches for all available updates to apps installed on the current computer or device, with the option to generate telemetry data.
      * @param correlationVector A correlation vector string that can be used to generate telemetry data.
      * @return An asynchronous operation that, on successful completion, returns the collection of apps that have available updates. If you use Asynchronous programming, the result type is a read-only list/vector of AppInstallItem items. (You can use APIs of IVectorView<AppInstallItem> for C++ or JavaScript, APIs of IReadOnlyList<AppInstallItem> for .NET.)
      */
    def searchForAllUpdatesAsync(correlationVector: String): IPromiseWithIAsyncOperation[IVectorView[js.Any]] = js.native
    
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
  
  /** Provides data for the ItemCompleted and ItemStatusChanged events. */
  trait AppInstallManagerItemEventArgs extends StObject {
    
    /** Gets an object that describes the app that has finished installing (for the ItemCompleted event) or whose installation status has changed (for the ItemStatusChanged event). */
    var item: AppInstallItem
  }
  object AppInstallManagerItemEventArgs {
    
    inline def apply(item: AppInstallItem): AppInstallManagerItemEventArgs = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppInstallManagerItemEventArgs]
    }
    
    extension [Self <: AppInstallManagerItemEventArgs](x: Self) {
      
      inline def setItem(value: AppInstallItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
  
  /** Describes the status of an app that is in the installation queue. */
  trait AppInstallStatus extends StObject {
    
    /** Gets the number of bytes that have been downloaded for the current app. */
    var bytesDownloaded: Double
    
    /** Gets the download size in bytes for the current app. */
    var downloadSizeInBytes: Double
    
    /** Gets the error code for an app that has encountered an installation failure. */
    var errorCode: WinRTError
    
    /** Gets the installation state of the current app. */
    var installState: AppInstallState
    
    /** Gets the completion percentage for the installation of the current app. */
    var percentComplete: Double
  }
  object AppInstallStatus {
    
    inline def apply(
      bytesDownloaded: Double,
      downloadSizeInBytes: Double,
      errorCode: WinRTError,
      installState: AppInstallState,
      percentComplete: Double
    ): AppInstallStatus = {
      val __obj = js.Dynamic.literal(bytesDownloaded = bytesDownloaded.asInstanceOf[js.Any], downloadSizeInBytes = downloadSizeInBytes.asInstanceOf[js.Any], errorCode = errorCode.asInstanceOf[js.Any], installState = installState.asInstanceOf[js.Any], percentComplete = percentComplete.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppInstallStatus]
    }
    
    extension [Self <: AppInstallStatus](x: Self) {
      
      inline def setBytesDownloaded(value: Double): Self = StObject.set(x, "bytesDownloaded", value.asInstanceOf[js.Any])
      
      inline def setDownloadSizeInBytes(value: Double): Self = StObject.set(x, "downloadSizeInBytes", value.asInstanceOf[js.Any])
      
      inline def setErrorCode(value: WinRTError): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
      
      inline def setInstallState(value: AppInstallState): Self = StObject.set(x, "installState", value.asInstanceOf[js.Any])
      
      inline def setPercentComplete(value: Double): Self = StObject.set(x, "percentComplete", value.asInstanceOf[js.Any])
    }
  }
}

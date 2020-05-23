package typings.winrtUwp.global.Windows.ApplicationModel.Store

import typings.std.Date
import typings.winrtUwp.Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallState
import typings.winrtUwp.Windows.ApplicationModel.Store.Preview.StorePreviewProductPurchaseStatus
import typings.winrtUwp.Windows.ApplicationModel.Store.Preview.StoreSystemFeature
import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the following APIs that are currently accessible only via restricted or private capabilities. */
@JSGlobal("Windows.ApplicationModel.Store.Preview")
@js.native
object Preview extends js.Object {
  /** Defines static methods and properties for accessing information about the device hardware and configuring information about the system, the mobile operator, and the active user account. These members are used in various Windows Store scenarios. */
  @js.native
  abstract class StoreConfiguration ()
    extends typings.winrtUwp.Windows.ApplicationModel.Store.Preview.StoreConfiguration
  
  /** Provides information about the manufacturer for the current device. */
  @js.native
  abstract class StoreHardwareManufacturerInfo ()
    extends typings.winrtUwp.Windows.ApplicationModel.Store.Preview.StoreHardwareManufacturerInfo {
    /** Gets the hardware manufacture ID for the current device. */
    /* CompleteClass */
    override var hardwareManufacturerId: String = js.native
    /** Gets the name of the hardware manufacturer for the current device. */
    /* CompleteClass */
    override var manufacturerName: String = js.native
    /** Gets the model name for the current device. */
    /* CompleteClass */
    override var modelName: String = js.native
    /** Gets the ID of the Windows Store content modifier. */
    /* CompleteClass */
    override var storeContentModifierId: String = js.native
  }
  
  /** Defines static methods for retrieving the in-app product SKUs available for the current app and requesting the purchase of an in-app product SKU for the app. */
  @js.native
  abstract class StorePreview ()
    extends typings.winrtUwp.Windows.ApplicationModel.Store.Preview.StorePreview
  
  /** Provides information about an in-app product, including details about available SKUs. */
  @js.native
  abstract class StorePreviewProductInfo ()
    extends typings.winrtUwp.Windows.ApplicationModel.Store.Preview.StorePreviewProductInfo {
    /** Gets the description of the in-app product. */
    /* CompleteClass */
    override var description: String = js.native
    /** Gets the ID of the in-app product. */
    /* CompleteClass */
    override var productId: String = js.native
    /** Gets the type of the in-app product. */
    /* CompleteClass */
    override var productType: String = js.native
    /** Gets information about the available SKUs for the in-app product. */
    /* CompleteClass */
    override var skuInfoList: IVectorView[typings.winrtUwp.Windows.ApplicationModel.Store.Preview.StorePreviewSkuInfo] = js.native
    /** Gets the name of the in-app product that is displayed to customers. */
    /* CompleteClass */
    override var title: String = js.native
  }
  
  /** Contains information about the results of a purchase transaction for an in-app product SKU that was purchased by using the RequestProductPurchaseByProductIdAndSkuIdAsync method. */
  @js.native
  abstract class StorePreviewPurchaseResults ()
    extends typings.winrtUwp.Windows.ApplicationModel.Store.Preview.StorePreviewPurchaseResults {
    /** Gets the current state of the purchase transaction for an in-app product SKU that was purchased by using the RequestProductPurchaseByProductIdAndSkuIdAsync method. */
    /* CompleteClass */
    override var productPurchaseStatus: StorePreviewProductPurchaseStatus = js.native
  }
  
  /** Provides information about the available SKUs for an in-app product. */
  @js.native
  abstract class StorePreviewSkuInfo ()
    extends typings.winrtUwp.Windows.ApplicationModel.Store.Preview.StorePreviewSkuInfo {
    /** Gets the currency code for the current market. */
    /* CompleteClass */
    override var currencyCode: String = js.native
    /** Gets custom developer data for the current SKU. */
    /* CompleteClass */
    override var customDeveloperData: String = js.native
    /** Gets the description for the current SKU. */
    /* CompleteClass */
    override var description: String = js.native
    /** Gets extended data for the current SKU. */
    /* CompleteClass */
    override var extendedData: String = js.native
    /** Gets the current SKU's purchase price with the appropriate formatting for the current market. */
    /* CompleteClass */
    override var formattedListPrice: String = js.native
    /** Gets the ID of the product that this SKU is associated with. */
    /* CompleteClass */
    override var productId: String = js.native
    /** Gets the ID of this SKU. */
    /* CompleteClass */
    override var skuId: String = js.native
    /** Gets a string that specifies the type of the in-app product SKU. */
    /* CompleteClass */
    override var skuType: String = js.native
    /** Gets the name of the in-app product SKU that is displayed to customers. */
    /* CompleteClass */
    override var title: String = js.native
  }
  
  /** Provides an API for programmatically managing the installation of apps and app updates. This API is accessible through the AppInstallManager class. */
  @js.native
  object InstallControl extends js.Object {
    /** Represents an app that is in the installation queue. */
    @js.native
    abstract class AppInstallItem ()
      extends typings.winrtUwp.Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallItem
    
    /** Provides members for programmatically installing apps, including the ability to start an app install and get a list of app installs currently in progress. */
    @js.native
    /** Creates and initializes a new instance of the AppInstallManager class */
    class AppInstallManager ()
      extends typings.winrtUwp.Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallManager
    
    /** Provides data for the ItemCompleted and ItemStatusChanged events. */
    @js.native
    abstract class AppInstallManagerItemEventArgs ()
      extends typings.winrtUwp.Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallManagerItemEventArgs {
      /** Gets an object that describes the app that has finished installing (for the ItemCompleted event) or whose installation status has changed (for the ItemStatusChanged event). */
      /* CompleteClass */
      override var item: typings.winrtUwp.Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallItem = js.native
    }
    
    /** Describes the status of an app that is in the installation queue. */
    @js.native
    abstract class AppInstallStatus ()
      extends typings.winrtUwp.Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallStatus {
      /** Gets the number of bytes that have been downloaded for the current app. */
      /* CompleteClass */
      override var bytesDownloaded: Double = js.native
      /** Gets the download size in bytes for the current app. */
      /* CompleteClass */
      override var downloadSizeInBytes: Double = js.native
      /** Gets the error code for an app that has encountered an installation failure. */
      /* CompleteClass */
      override var errorCode: WinRTError = js.native
      /** Gets the installation state of the current app. */
      /* CompleteClass */
      override var installState: AppInstallState = js.native
      /** Gets the completion percentage for the installation of the current app. */
      /* CompleteClass */
      override var percentComplete: Double = js.native
    }
    
    /** Defines the app install states that are returned by the InstallState property of the AppInstallStatus class. */
    @js.native
    object AppInstallState extends js.Object {
      /* 2 */ val acquiringLicense: typings.winrtUwp.Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallState.acquiringLicense with Double = js.native
      /* 7 */ val canceled: typings.winrtUwp.Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallState.canceled with Double = js.native
      /* 6 */ val completed: typings.winrtUwp.Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallState.completed with Double = js.native
      /* 3 */ val downloading: typings.winrtUwp.Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallState.downloading with Double = js.native
      /* 9 */ val error: typings.winrtUwp.Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallState.error with Double = js.native
      /* 5 */ val installing: typings.winrtUwp.Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallState.installing with Double = js.native
      /* 8 */ val paused: typings.winrtUwp.Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallState.paused with Double = js.native
      /* 10 */ val pausedLowBattery: typings.winrtUwp.Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallState.pausedLowBattery with Double = js.native
      /* 11 */ val pausedWiFiRecommended: typings.winrtUwp.Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallState.pausedWiFiRecommended with Double = js.native
      /* 12 */ val pausedWiFiRequired: typings.winrtUwp.Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallState.pausedWiFiRequired with Double = js.native
      /* 0 */ val pending: typings.winrtUwp.Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallState.pending with Double = js.native
      /* 13 */ val readyToDownload: typings.winrtUwp.Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallState.readyToDownload with Double = js.native
      /* 4 */ val restoringData: typings.winrtUwp.Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallState.restoringData with Double = js.native
      /* 1 */ val starting: typings.winrtUwp.Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallState.starting with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallState with Double
          ] = js.native
    }
    
    /** Defines the different app install types that are returned by the InstallType property of the AppInstallItem class. */
    @js.native
    object AppInstallType extends js.Object {
      /* 0 */ val install: typings.winrtUwp.Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallType.install with Double = js.native
      /* 2 */ val repair: typings.winrtUwp.Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallType.repair with Double = js.native
      /* 1 */ val update: typings.winrtUwp.Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallType.update with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallType with Double
          ] = js.native
    }
    
    /** Defines the automatic app update setting values that can be returned by the AutoUpdateSetting property of the AppInstallManager class. */
    @js.native
    object AutoUpdateSetting extends js.Object {
      /* 0 */ val disabled: typings.winrtUwp.Windows.ApplicationModel.Store.Preview.InstallControl.AutoUpdateSetting.disabled with Double = js.native
      /* 2 */ val disabledByPolicy: typings.winrtUwp.Windows.ApplicationModel.Store.Preview.InstallControl.AutoUpdateSetting.disabledByPolicy with Double = js.native
      /* 1 */ val enabled: typings.winrtUwp.Windows.ApplicationModel.Store.Preview.InstallControl.AutoUpdateSetting.enabled with Double = js.native
      /* 3 */ val enabledByPolicy: typings.winrtUwp.Windows.ApplicationModel.Store.Preview.InstallControl.AutoUpdateSetting.enabledByPolicy with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.ApplicationModel.Store.Preview.InstallControl.AutoUpdateSetting with Double
          ] = js.native
    }
    
  }
  
  /* static members */
  @js.native
  object StoreConfiguration extends js.Object {
    /** Gets hardware manufacturer information for the current device. */
    var hardwareManufacturerInfo: typings.winrtUwp.Windows.ApplicationModel.Store.Preview.StoreHardwareManufacturerInfo = js.native
    /** Gets or sets a value that indicates whether the Windows Store prompts the user before making a purchase. */
    var purchasePromptingPolicy: Double = js.native
    /**
      * Given a list of hardware features, this method returns a modified list that contains only the hardware features that are supported on the current device.
      * @param systemFeatures A list of StoreSystemFeature objects that represent the hardware features to be queried on the current device.
      * @return An asynchronous operation that, on successful completion, returns a list of hardware features that are supported on the current device. If you use Asynchronous programming, the result type is a read-only list/vector of StoreSystemFeature items. (You can use APIs of IVectorView<StoreSystemFeature> for C++ or JavaScript, APIs of IReadOnlyList<StoreSystemFeature> for .NET.)
      */
    def filterUnsupportedSystemFeaturesAsync(systemFeatures: IIterable[StoreSystemFeature]): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
    /**
      * Determines whether a given user ID is also being used to sign in to the Windows Store. Typically, this method is used to determine whether a user ID that is currently signed in to an app is also signed in to the Windows Store.
      * @param webAccountId The user ID (typically obtained from the WebAccount.Id property) to check.
      * @return True if the user account specified by webAccountId is the same account that is signed in to the Windows Store; otherwise false.
      */
    def isStoreWebAccountId(webAccountId: String): Boolean = js.native
    /**
      * Configures mobile operator information for the device.
      * @param mobileOperatorId The mobile operator ID.
      * @param appDownloadLimitInMegabytes The maximum app download size defined by the mobile operator, in MB.
      * @param updateDownloadLimitInMegabytes The maximum OS update download size defined by the mobile operator, in MB.
      */
    def setMobileOperatorConfiguration(
      mobileOperatorId: String,
      appDownloadLimitInMegabytes: Double,
      updateDownloadLimitInMegabytes: Double
    ): Unit = js.native
    /**
      * Sets the ID of the user account that is signed in to the Windows Store so that other apps can query against this ID.
      * @param webAccountId The user account ID (typically obtained from the WebAccount.Id property) that is signed in to the Windows Store.
      */
    def setStoreWebAccountId(webAccountId: String): Unit = js.native
    /**
      * Configures miscellaneous system information for the device.
      * @param catalogHardwareManufacturerId The ID of the hardware manufacturer.
      * @param catalogStoreContentModifierId The ID of the Windows Store content modifier.
      * @param systemConfigurationExpiration The expiration date for the system configuration.
      * @param catalogHardwareDescriptor A descriptor string that specifies the hardware components supported by the device.
      */
    def setSystemConfiguration(
      catalogHardwareManufacturerId: String,
      catalogStoreContentModifierId: String,
      systemConfigurationExpiration: Date,
      catalogHardwareDescriptor: String
    ): Unit = js.native
  }
  
  /* static members */
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
    def requestProductPurchaseByProductIdAndSkuIdAsync(productId: String, skuId: String): IPromiseWithIAsyncOperation[
        typings.winrtUwp.Windows.ApplicationModel.Store.Preview.StorePreviewPurchaseResults
      ] = js.native
  }
  
  /** Defines values that are used to indicate the transaction status when purchasing an in-app product SKU by using the RequestProductPurchaseByProductIdAndSkuIdAsync method. */
  @js.native
  object StorePreviewProductPurchaseStatus extends js.Object {
    /* 1 */ val alreadyPurchased: typings.winrtUwp.Windows.ApplicationModel.Store.Preview.StorePreviewProductPurchaseStatus.alreadyPurchased with Double = js.native
    /* 2 */ val notFulfilled: typings.winrtUwp.Windows.ApplicationModel.Store.Preview.StorePreviewProductPurchaseStatus.notFulfilled with Double = js.native
    /* 3 */ val notPurchased: typings.winrtUwp.Windows.ApplicationModel.Store.Preview.StorePreviewProductPurchaseStatus.notPurchased with Double = js.native
    /* 0 */ val succeeded: typings.winrtUwp.Windows.ApplicationModel.Store.Preview.StorePreviewProductPurchaseStatus.succeeded with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.ApplicationModel.Store.Preview.StorePreviewProductPurchaseStatus with Double
      ] = js.native
  }
  
  /** Defines values that represent hardware features that can be queried for the current device by using the FilterUnsupportedSystemFeaturesAsync method. */
  @js.native
  object StoreSystemFeature extends js.Object {
    /* 2 */ val architectureArm: typings.winrtUwp.Windows.ApplicationModel.Store.Preview.StoreSystemFeature.architectureArm with Double = js.native
    /* 1 */ val architectureX64: typings.winrtUwp.Windows.ApplicationModel.Store.Preview.StoreSystemFeature.architectureX64 with Double = js.native
    /* 0 */ val architectureX86: typings.winrtUwp.Windows.ApplicationModel.Store.Preview.StoreSystemFeature.architectureX86 with Double = js.native
    /* 12 */ val cameraFront: typings.winrtUwp.Windows.ApplicationModel.Store.Preview.StoreSystemFeature.cameraFront with Double = js.native
    /* 13 */ val cameraRear: typings.winrtUwp.Windows.ApplicationModel.Store.Preview.StoreSystemFeature.cameraRear with Double = js.native
    /* 6 */ val d3D12HardwareFL11: typings.winrtUwp.Windows.ApplicationModel.Store.Preview.StoreSystemFeature.d3D12HardwareFL11 with Double = js.native
    /* 7 */ val d3D12HardwareFL12: typings.winrtUwp.Windows.ApplicationModel.Store.Preview.StoreSystemFeature.d3D12HardwareFL12 with Double = js.native
    /* 4 */ val directX10: typings.winrtUwp.Windows.ApplicationModel.Store.Preview.StoreSystemFeature.directX10 with Double = js.native
    /* 5 */ val directX11: typings.winrtUwp.Windows.ApplicationModel.Store.Preview.StoreSystemFeature.directX11 with Double = js.native
    /* 3 */ val directX9: typings.winrtUwp.Windows.ApplicationModel.Store.Preview.StoreSystemFeature.directX9 with Double = js.native
    /* 14 */ val gyroscope: typings.winrtUwp.Windows.ApplicationModel.Store.Preview.StoreSystemFeature.gyroscope with Double = js.native
    /* 15 */ val hover: typings.winrtUwp.Windows.ApplicationModel.Store.Preview.StoreSystemFeature.hover with Double = js.native
    /* 16 */ val magnetometer: typings.winrtUwp.Windows.ApplicationModel.Store.Preview.StoreSystemFeature.magnetometer with Double = js.native
    /* 10 */ val memory1GB: typings.winrtUwp.Windows.ApplicationModel.Store.Preview.StoreSystemFeature.memory1GB with Double = js.native
    /* 11 */ val memory2GB: typings.winrtUwp.Windows.ApplicationModel.Store.Preview.StoreSystemFeature.memory2GB with Double = js.native
    /* 8 */ val memory300MB: typings.winrtUwp.Windows.ApplicationModel.Store.Preview.StoreSystemFeature.memory300MB with Double = js.native
    /* 9 */ val memory750MB: typings.winrtUwp.Windows.ApplicationModel.Store.Preview.StoreSystemFeature.memory750MB with Double = js.native
    /* 17 */ val nfc: typings.winrtUwp.Windows.ApplicationModel.Store.Preview.StoreSystemFeature.nfc with Double = js.native
    /* 18 */ val resolution720P: typings.winrtUwp.Windows.ApplicationModel.Store.Preview.StoreSystemFeature.resolution720P with Double = js.native
    /* 19 */ val resolutionWvga: typings.winrtUwp.Windows.ApplicationModel.Store.Preview.StoreSystemFeature.resolutionWvga with Double = js.native
    /* 20 */ val resolutionWvgaOr720P: typings.winrtUwp.Windows.ApplicationModel.Store.Preview.StoreSystemFeature.resolutionWvgaOr720P with Double = js.native
    /* 22 */ val resolutionWvgaOrWxga: typings.winrtUwp.Windows.ApplicationModel.Store.Preview.StoreSystemFeature.resolutionWvgaOrWxga with Double = js.native
    /* 21 */ val resolutionWxga: typings.winrtUwp.Windows.ApplicationModel.Store.Preview.StoreSystemFeature.resolutionWxga with Double = js.native
    /* 23 */ val resolutionWxgaOr720P: typings.winrtUwp.Windows.ApplicationModel.Store.Preview.StoreSystemFeature.resolutionWxgaOr720P with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.ApplicationModel.Store.Preview.StoreSystemFeature with Double
      ] = js.native
  }
  
}


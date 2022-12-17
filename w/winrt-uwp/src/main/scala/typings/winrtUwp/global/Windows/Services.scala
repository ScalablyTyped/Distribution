package typings.winrtUwp.global.Windows

import typings.winrtUwp.Windows.ApplicationModel.Package
import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Services.Store.StoreConsumableStatus
import typings.winrtUwp.Windows.Services.Store.StoreDurationUnit
import typings.winrtUwp.Windows.Services.Store.StorePackageUpdateState
import typings.winrtUwp.Windows.Services.Store.StorePackageUpdateStatus
import typings.winrtUwp.Windows.Services.Store.StorePurchaseStatus
import typings.winrtUwp.Windows.System.User
import typings.winrtUwp.Windows.Web.Http.HttpStatusCode
import typings.winrtUwp.Windows.WinRTError
import typings.winrtUwp.Windows.WinRTEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Services {
  
  /** The Windows.Services.Maps namespace contains classes that provide location, routing, and geocoding services. */
  object Maps {
    
    /** Provides APIs for turn-by-turn guided navigation. */
    object Guidance {
      
      /** Specifies the path of the lane. */
      @JSGlobal("Windows.Services.Maps.Guidance.GuidanceLaneMarkers")
      @js.native
      object GuidanceLaneMarkers extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers & Double] = js.native
        
        /* 6 */ val hardLeft: typings.winrtUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers.hardLeft & Double = js.native
        
        /* 3 */ val hardRight: typings.winrtUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers.hardRight & Double = js.native
        
        /* 7 */ val left: typings.winrtUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers.left & Double = js.native
        
        /* 8 */ val lightLeft: typings.winrtUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers.lightLeft & Double = js.native
        
        /* 1 */ val lightRight: typings.winrtUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers.lightRight & Double = js.native
        
        /* 0 */ val none: typings.winrtUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers.none & Double = js.native
        
        /* 2 */ val right: typings.winrtUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers.right & Double = js.native
        
        /* 4 */ val straight: typings.winrtUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers.straight & Double = js.native
        
        /* 10 */ val unknown: typings.winrtUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers.unknown & Double = js.native
        
        /* 5 */ val uturnLeft: typings.winrtUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers.uturnLeft & Double = js.native
        
        /* 9 */ val uturnRight: typings.winrtUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers.uturnRight & Double = js.native
      }
    }
  }
  
  /** Provides types and members you can use to access and manage Windows Store-related data for the current app. */
  object Store {
    
    /** Provides response data for a request to acquire a downloadable content (DLC) package license. */
    /* note: abstract class */ @JSGlobal("Windows.Services.Store.StoreAcquireLicenseResult")
    @js.native
    open class StoreAcquireLicenseResult ()
      extends StObject
         with typings.winrtUwp.Windows.Services.Store.StoreAcquireLicenseResult {
      
      /** Gets the error code for the request, if the operation encountered an error. */
      /* CompleteClass */
      var extendedError: WinRTError = js.native
      
      /** Gets an object that represents the downloadable content (DLC) package license. */
      /* CompleteClass */
      var storePackageLicense: typings.winrtUwp.Windows.Services.Store.StorePackageLicense = js.native
    }
    
    /** Provides license info for the current app, including licenses for products that are offered by the app. */
    /* note: abstract class */ @JSGlobal("Windows.Services.Store.StoreAppLicense")
    @js.native
    open class StoreAppLicense ()
      extends StObject
         with typings.winrtUwp.Windows.Services.Store.StoreAppLicense {
      
      /** Gets the collection of licenses for add-ons that can be used offline (typically durable add-ons), for which the user has entitlements to use. This property does not include licenses for consumable add-ons. */
      /* CompleteClass */
      var addOnLicenses: IMapView[String, typings.winrtUwp.Windows.Services.Store.StoreLicense] = js.native
      
      /** Gets the expiration date and time for the app license. */
      /* CompleteClass */
      var expirationDate: js.Date = js.native
      
      /** Gets complete license data in JSON format. */
      /* CompleteClass */
      var extendedJsonData: String = js.native
      
      /** Gets a value that indicates whether the license is active. */
      /* CompleteClass */
      var isActive: Boolean = js.native
      
      /** Gets a value that indicates whether the license is a trial license. */
      /* CompleteClass */
      var isTrial: Boolean = js.native
      
      /** Gets a value that indicates whether the current user has an entitlement for the usage-limited trial that is associated with this app license. */
      /* CompleteClass */
      var isTrialOwnedByThisUser: Boolean = js.native
      
      /** Gets the Store ID of the licensed app SKU from the Windows Store catalog. */
      /* CompleteClass */
      var skuStoreId: String = js.native
      
      /** Gets the remaining time for the usage-limited trial that is associated with this app license. */
      /* CompleteClass */
      var trialTimeRemaining: Double = js.native
      
      /** Gets a unique ID that identifies the combination of the current user and the usage-limited trial that is associated with this app license. */
      /* CompleteClass */
      var trialUniqueId: String = js.native
    }
    
    /** Represents a specific instance of a product SKU that can be purchased. */
    /* note: abstract class */ @JSGlobal("Windows.Services.Store.StoreAvailability")
    @js.native
    open class StoreAvailability ()
      extends StObject
         with typings.winrtUwp.Windows.Services.Store.StoreAvailability
    
    /** Provides additional data for a product SKU that the user has an entitlement to use. */
    /* note: abstract class */ @JSGlobal("Windows.Services.Store.StoreCollectionData")
    @js.native
    open class StoreCollectionData ()
      extends StObject
         with typings.winrtUwp.Windows.Services.Store.StoreCollectionData {
      
      /** Gets the date on which the product SKU was acquired. */
      /* CompleteClass */
      var acquiredDate: js.Date = js.native
      
      /** Gets the promotion campaign ID that is associated with the product SKU. */
      /* CompleteClass */
      var campaignId: String = js.native
      
      /** Gets the developer offer ID that is associated with the product SKU. */
      /* CompleteClass */
      var developerOfferId: String = js.native
      
      /** Gets the end date of the trial for the product SKU, if the SKU is a trial version or a durable add-on that expires after a set duration. */
      /* CompleteClass */
      var endDate: js.Date = js.native
      
      /** Gets complete collection data for the product SKU in JSON format. */
      /* CompleteClass */
      var extendedJsonData: String = js.native
      
      /** Gets a value that indicates whether the product SKU is a trial version. */
      /* CompleteClass */
      var isTrial: Boolean = js.native
      
      /** Gets the start date of the trial for the product SKU, if the SKU is a trial version or a durable add-on that expires after a set duration. */
      /* CompleteClass */
      var startDate: js.Date = js.native
      
      /** Gets the remaining trial time for the product SKU. */
      /* CompleteClass */
      var trialTimeRemaining: Double = js.native
    }
    
    /** Provides response data for a request that involves a consumable add-on for the current app. */
    /* note: abstract class */ @JSGlobal("Windows.Services.Store.StoreConsumableResult")
    @js.native
    open class StoreConsumableResult ()
      extends StObject
         with typings.winrtUwp.Windows.Services.Store.StoreConsumableResult {
      
      /** Gets the remaining balance for the consumable add-on. */
      /* CompleteClass */
      var balanceRemaining: Double = js.native
      
      /** Gets the error code for the request, if the operation encountered an error. */
      /* CompleteClass */
      var extendedError: WinRTError = js.native
      
      /** Gets the status of the request. */
      /* CompleteClass */
      var status: StoreConsumableStatus = js.native
      
      /** Gets the tracking ID that was submitted with the ReportConsumableFulfillmentAsync request. */
      /* CompleteClass */
      var trackingId: String = js.native
    }
    
    /** Defines values that represent the status of an request that is related to a consumable add-on. */
    @JSGlobal("Windows.Services.Store.StoreConsumableStatus")
    @js.native
    object StoreConsumableStatus extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Services.Store.StoreConsumableStatus & Double] = js.native
      
      /* 1 */ val insufficentQuantity: typings.winrtUwp.Windows.Services.Store.StoreConsumableStatus.insufficentQuantity & Double = js.native
      
      /* 2 */ val networkError: typings.winrtUwp.Windows.Services.Store.StoreConsumableStatus.networkError & Double = js.native
      
      /* 3 */ val serverError: typings.winrtUwp.Windows.Services.Store.StoreConsumableStatus.serverError & Double = js.native
      
      /* 0 */ val succeeded: typings.winrtUwp.Windows.Services.Store.StoreConsumableStatus.succeeded & Double = js.native
    }
    
    /** Provides members you can use to access and manage Windows Store-related data for the current app. For example, you can use members of this class to get Windows Store listing and license info for the current app, purchase the current app or products that are offered by the app, or download and install package updates for the app. */
    /* note: abstract class */ @JSGlobal("Windows.Services.Store.StoreContext")
    @js.native
    open class StoreContext ()
      extends StObject
         with typings.winrtUwp.Windows.Services.Store.StoreContext
    object StoreContext {
      
      @JSGlobal("Windows.Services.Store.StoreContext")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Gets a StoreContext object that can be used to access and manage Windows Store-related data for the current user in the context of the current app.
        * @return An object that you can use to access and manage Windows Store-related data for the current user.
        */
      /* static member */
      inline def getDefault(): typings.winrtUwp.Windows.Services.Store.StoreContext = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefault")().asInstanceOf[typings.winrtUwp.Windows.Services.Store.StoreContext]
      
      /**
        * Gets a StoreContext object that can be used to access and manage Windows Store-related data for the specified user in the context of the current app.
        * @param user An object that identifies the user whose Windows Store-related data you want to access and manage.
        * @return An object that you can use to access and manage Windows Store-related data for the specified user.
        */
      /* static member */
      inline def getForUser(user: User): typings.winrtUwp.Windows.Services.Store.StoreContext = ^.asInstanceOf[js.Dynamic].applyDynamic("getForUser")(user.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.Services.Store.StoreContext]
    }
    
    /** Defines values that represent the units of a trial period or billing period for a subscription. */
    @JSGlobal("Windows.Services.Store.StoreDurationUnit")
    @js.native
    object StoreDurationUnit extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Services.Store.StoreDurationUnit & Double] = js.native
      
      /* 2 */ val day: typings.winrtUwp.Windows.Services.Store.StoreDurationUnit.day & Double = js.native
      
      /* 1 */ val hour: typings.winrtUwp.Windows.Services.Store.StoreDurationUnit.hour & Double = js.native
      
      /* 0 */ val minute: typings.winrtUwp.Windows.Services.Store.StoreDurationUnit.minute & Double = js.native
      
      /* 4 */ val month: typings.winrtUwp.Windows.Services.Store.StoreDurationUnit.month & Double = js.native
      
      /* 3 */ val week: typings.winrtUwp.Windows.Services.Store.StoreDurationUnit.week & Double = js.native
      
      /* 5 */ val year: typings.winrtUwp.Windows.Services.Store.StoreDurationUnit.year & Double = js.native
    }
    
    /** Represents an image that is associated with a product listing in the Windows Store. */
    /* note: abstract class */ @JSGlobal("Windows.Services.Store.StoreImage")
    @js.native
    open class StoreImage ()
      extends StObject
         with typings.winrtUwp.Windows.Services.Store.StoreImage {
      
      /** Gets the caption for the image. */
      /* CompleteClass */
      var caption: String = js.native
      
      /** Gets the height of the image, in pixels. */
      /* CompleteClass */
      var height: Double = js.native
      
      /** Gets the tag for the image. */
      /* CompleteClass */
      var imagePurposeTag: String = js.native
      
      /** Gets the URI of the image. */
      /* CompleteClass */
      var uri: Uri = js.native
      
      /** Gets the width of the image, in pixels. */
      /* CompleteClass */
      var width: Double = js.native
    }
    
    /** Provides license info for an add-on that is associated with the current app. */
    /* note: abstract class */ @JSGlobal("Windows.Services.Store.StoreLicense")
    @js.native
    open class StoreLicense ()
      extends StObject
         with typings.winrtUwp.Windows.Services.Store.StoreLicense {
      
      /** Gets the expiration date and time for the add-on license. */
      /* CompleteClass */
      var expirationDate: js.Date = js.native
      
      /** Gets complete license data in JSON format. */
      /* CompleteClass */
      var extendedJsonData: String = js.native
      
      /** Gets in the product ID for the add-on. */
      /* CompleteClass */
      var inAppOfferToken: String = js.native
      
      /** Gets a value that indicates whether the add-on license is active. */
      /* CompleteClass */
      var isActive: Boolean = js.native
      
      /** Gets the Store ID of the licensed add-on SKU from the Windows Store catalog. */
      /* CompleteClass */
      var skuStoreId: String = js.native
    }
    
    /** Provides license info for a downloadable content (DLC) package for the current app. */
    /* note: abstract class */ @JSGlobal("Windows.Services.Store.StorePackageLicense")
    @js.native
    open class StorePackageLicense ()
      extends StObject
         with typings.winrtUwp.Windows.Services.Store.StorePackageLicense {
      
      /** Gets the downloadable content (DLC) package that is associated with the license. */
      /* CompleteClass */
      @JSName("package")
      var _package: Package = js.native
      
      /** Closes and releases any resources used by this StorePackageLicense. */
      /* CompleteClass */
      override def close(): Unit = js.native
      
      /** Gets a value that indicates whether the license is valid. */
      /* CompleteClass */
      var isValid: Boolean = js.native
      
      /** Raised when user no longer has rights to the license on the current device (for example, the user has acquired the license on a different device). */
      /* CompleteClass */
      override def onlicenselost(ev: WinRTEvent[typings.winrtUwp.Windows.Services.Store.StorePackageLicense]): Unit = js.native
      /** Raised when user no longer has rights to the license on the current device (for example, the user has acquired the license on a different device). */
      /* CompleteClass */
      @JSName("onlicenselost")
      var onlicenselost_Original: TypedEventHandler[typings.winrtUwp.Windows.Services.Store.StorePackageLicense, js.Object] = js.native
      
      /** Releases the license for the downloadable content (DLC) package. */
      /* CompleteClass */
      override def releaseLicense(): Unit = js.native
    }
    
    /** Provides info about a package for the current app that has an update available for download from the Windows Store. */
    /* note: abstract class */ @JSGlobal("Windows.Services.Store.StorePackageUpdate")
    @js.native
    open class StorePackageUpdate ()
      extends StObject
         with typings.winrtUwp.Windows.Services.Store.StorePackageUpdate {
      
      /** Gets the package that has an update available for download from the Windows Store. */
      /* CompleteClass */
      @JSName("package")
      var _package: Package = js.native
      
      /** Gets a value that indicates whether the package that has an update available for download from the Windows Store is a mandatory package, as specified by the developer in the Windows Dev Center dashboard. */
      /* CompleteClass */
      var mandatory: Boolean = js.native
    }
    
    /** Provides info about a completed package update request for the current app. */
    /* note: abstract class */ @JSGlobal("Windows.Services.Store.StorePackageUpdateResult")
    @js.native
    open class StorePackageUpdateResult ()
      extends StObject
         with typings.winrtUwp.Windows.Services.Store.StorePackageUpdateResult {
      
      /** Gets the state of the completed package update request. */
      /* CompleteClass */
      var overallState: StorePackageUpdateState = js.native
      
      /** Gets info about the status of each of the package updates that are associated with the completed request. */
      /* CompleteClass */
      var storePackageUpdateStatuses: IVectorView[StorePackageUpdateStatus] = js.native
    }
    
    /** Defines values that represent the state of a package download or installation request. */
    @JSGlobal("Windows.Services.Store.StorePackageUpdateState")
    @js.native
    object StorePackageUpdateState extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Services.Store.StorePackageUpdateState & Double] = js.native
      
      /* 4 */ val canceled: typings.winrtUwp.Windows.Services.Store.StorePackageUpdateState.canceled & Double = js.native
      
      /* 3 */ val completed: typings.winrtUwp.Windows.Services.Store.StorePackageUpdateState.completed & Double = js.native
      
      /* 2 */ val deploying: typings.winrtUwp.Windows.Services.Store.StorePackageUpdateState.deploying & Double = js.native
      
      /* 1 */ val downloading: typings.winrtUwp.Windows.Services.Store.StorePackageUpdateState.downloading & Double = js.native
      
      /* 6 */ val errorLowBattery: typings.winrtUwp.Windows.Services.Store.StorePackageUpdateState.errorLowBattery & Double = js.native
      
      /* 7 */ val errorWiFiRecommended: typings.winrtUwp.Windows.Services.Store.StorePackageUpdateState.errorWiFiRecommended & Double = js.native
      
      /* 8 */ val errorWiFiRequired: typings.winrtUwp.Windows.Services.Store.StorePackageUpdateState.errorWiFiRequired & Double = js.native
      
      /* 5 */ val otherError: typings.winrtUwp.Windows.Services.Store.StorePackageUpdateState.otherError & Double = js.native
      
      /* 0 */ val pending: typings.winrtUwp.Windows.Services.Store.StorePackageUpdateState.pending & Double = js.native
    }
    
    /** Contains pricing info for a product listing in the Windows Store. */
    /* note: abstract class */ @JSGlobal("Windows.Services.Store.StorePrice")
    @js.native
    open class StorePrice ()
      extends StObject
         with typings.winrtUwp.Windows.Services.Store.StorePrice {
      
      /** Gets the ISO 4217 currency code for the market of the current user. */
      /* CompleteClass */
      var currencyCode: String = js.native
      
      /** Gets the base price for the product with the appropriate formatting for the market of the current user. */
      /* CompleteClass */
      var formattedBasePrice: String = js.native
      
      /** Gets the purchase price for the product with the appropriate formatting for the market of the current user. */
      /* CompleteClass */
      var formattedPrice: String = js.native
      
      /** Gets the recurring price for the product with the appropriate formatting for the market of the current user, if recurring billing is enabled for this product. */
      /* CompleteClass */
      var formattedRecurrencePrice: String = js.native
      
      /** Gets a value that indicates whether the product is on sale. */
      /* CompleteClass */
      var isOnSale: Boolean = js.native
      
      /** Gets the end date for the sale period for the product, if the product is on sale. */
      /* CompleteClass */
      var saleEndDate: js.Date = js.native
    }
    
    /** Represents a product that is available in the Windows Store. */
    /* note: abstract class */ @JSGlobal("Windows.Services.Store.StoreProduct")
    @js.native
    open class StoreProduct ()
      extends StObject
         with typings.winrtUwp.Windows.Services.Store.StoreProduct
    
    /** Provides response data for a paged request to retrieve details about products that can be purchased from within the current app. */
    /* note: abstract class */ @JSGlobal("Windows.Services.Store.StoreProductPagedQueryResult")
    @js.native
    open class StoreProductPagedQueryResult ()
      extends StObject
         with typings.winrtUwp.Windows.Services.Store.StoreProductPagedQueryResult {
      
      /** Gets the error code for the request, if the operation encountered an error. */
      /* CompleteClass */
      var extendedError: WinRTError = js.native
      
      /**
        * Returns the next page of results. To determine if there are more pages of results, use the HasMoreResults property.
        * @return An asynchronous operation that, on successful completion, returns a StoreProductPagedQueryResult object that provides the next page of results.
        */
      /* CompleteClass */
      override def getNextAsync(): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Services.Store.StoreProductPagedQueryResult] = js.native
      
      /** Gets a value that indicates whether there are additional pages of results. To get the next page of results, use the GetNextAsync method. */
      /* CompleteClass */
      var hasMoreResults: Boolean = js.native
      
      /** Gets the collection of products returned by the request. */
      /* CompleteClass */
      var products: IMapView[String, typings.winrtUwp.Windows.Services.Store.StoreProduct] = js.native
    }
    
    /** Provides response data for a request to retrieve details about products that can be purchased from within the current app. */
    /* note: abstract class */ @JSGlobal("Windows.Services.Store.StoreProductQueryResult")
    @js.native
    open class StoreProductQueryResult ()
      extends StObject
         with typings.winrtUwp.Windows.Services.Store.StoreProductQueryResult {
      
      /** Gets the error code for the request, if the operation encountered an error. */
      /* CompleteClass */
      var extendedError: WinRTError = js.native
      
      /** Gets the collection of products returned by the request. */
      /* CompleteClass */
      var products: IMapView[String, typings.winrtUwp.Windows.Services.Store.StoreProduct] = js.native
    }
    
    /** Provides response data for a request to retrieve details about the current app. */
    /* note: abstract class */ @JSGlobal("Windows.Services.Store.StoreProductResult")
    @js.native
    open class StoreProductResult ()
      extends StObject
         with typings.winrtUwp.Windows.Services.Store.StoreProductResult {
      
      /** Gets the error code for the request, if the operation encountered an error. */
      /* CompleteClass */
      var extendedError: WinRTError = js.native
      
      /** Gets info about the current app. */
      /* CompleteClass */
      var product: typings.winrtUwp.Windows.Services.Store.StoreProduct = js.native
    }
    
    /** Contains additional details that you can pass to a purchase request for a product, including the product name to display to the user during the purchase. */
    @JSGlobal("Windows.Services.Store.StorePurchaseProperties")
    @js.native
    /** Initializes a new instance of the StorePurchaseProperties class. */
    open class StorePurchaseProperties ()
      extends StObject
         with typings.winrtUwp.Windows.Services.Store.StorePurchaseProperties {
      /** Initializes a new instance of the StorePurchaseProperties class. This overload provides the option to specify the product name that is displayed to the user during the purchase.
        * @param name The product name that is displayed to the user during the purchase.
        */
      def this(name: String) = this()
      
      /** Gets or sets a JSON-formatted string that contains extended data to pass with the purchase request to the Windows Store. */
      /* CompleteClass */
      var extendedJsonData: String = js.native
      
      /** Gets or sets the product name that is displayed to the user during the purchase. The specified name appears in the title bar of the purchase UI. */
      /* CompleteClass */
      var name: String = js.native
    }
    
    /** Provides response data for a request to purchase an app or product that is offered by the app. */
    /* note: abstract class */ @JSGlobal("Windows.Services.Store.StorePurchaseResult")
    @js.native
    open class StorePurchaseResult ()
      extends StObject
         with typings.winrtUwp.Windows.Services.Store.StorePurchaseResult {
      
      /** Gets the error code for the purchase request, if the operation encountered an error. */
      /* CompleteClass */
      var extendedError: WinRTError = js.native
      
      /** Gets the status of the purchase request. */
      /* CompleteClass */
      var status: StorePurchaseStatus = js.native
    }
    
    /** Defines values that represent the status of a request to purchase an app or add-on. */
    @JSGlobal("Windows.Services.Store.StorePurchaseStatus")
    @js.native
    object StorePurchaseStatus extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Services.Store.StorePurchaseStatus & Double] = js.native
      
      /* 1 */ val alreadyPurchased: typings.winrtUwp.Windows.Services.Store.StorePurchaseStatus.alreadyPurchased & Double = js.native
      
      /* 3 */ val networkError: typings.winrtUwp.Windows.Services.Store.StorePurchaseStatus.networkError & Double = js.native
      
      /* 2 */ val notPurchased: typings.winrtUwp.Windows.Services.Store.StorePurchaseStatus.notPurchased & Double = js.native
      
      /* 4 */ val serverError: typings.winrtUwp.Windows.Services.Store.StorePurchaseStatus.serverError & Double = js.native
      
      /* 0 */ val succeeded: typings.winrtUwp.Windows.Services.Store.StorePurchaseStatus.succeeded & Double = js.native
    }
    
    /** Provides a helper method that can be used to send requests to the Windows Store for operations that do not yet have a corresponding API available in the Windows SDK. */
    /* note: abstract class */ @JSGlobal("Windows.Services.Store.StoreRequestHelper")
    @js.native
    open class StoreRequestHelper ()
      extends StObject
         with typings.winrtUwp.Windows.Services.Store.StoreRequestHelper
    object StoreRequestHelper {
      
      @JSGlobal("Windows.Services.Store.StoreRequestHelper")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Sends the specified request to the Windows Store with the provided context and parameters.
        * @param context An object that specifies the user for which to perform the operation. If your app is a single-user app (that is, it runs only in the context of the user that launched the app), use the StoreContext.GetDefault method to get a StoreContext object that you can use to send a request that operates in the context of the user. If your app is a multi-user app, use the StoreContext.GetForUser method to get a StoreContext object that you can use to send a request that operates in the context of a specific user.
        * @param requestKind A value that identifies the request that you want to send to the Windows Store.
        * @param parametersAsJson A JSON-formatted string that contains the arguments to pass to the request.
        * @return An asynchronous operation that, on successful completion, returns a StoreSendRequestResult object that provides status and error info about the request.
        */
      /* static member */
      inline def sendRequestAsync(
        context: typings.winrtUwp.Windows.Services.Store.StoreContext,
        requestKind: Double,
        parametersAsJson: String
      ): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Services.Store.StoreSendRequestResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendRequestAsync")(context.asInstanceOf[js.Any], requestKind.asInstanceOf[js.Any], parametersAsJson.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Services.Store.StoreSendRequestResult]]
    }
    
    /** Provides response data for a request that is sent to the Windows Store. */
    /* note: abstract class */ @JSGlobal("Windows.Services.Store.StoreSendRequestResult")
    @js.native
    open class StoreSendRequestResult ()
      extends StObject
         with typings.winrtUwp.Windows.Services.Store.StoreSendRequestResult {
      
      /** Gets the error code for the request, if the operation encountered an error. */
      /* CompleteClass */
      var extendedError: WinRTError = js.native
      
      /** Gets the HTTP status code for the request. */
      /* CompleteClass */
      var httpStatusCode: HttpStatusCode = js.native
      
      /** Gets the response data for the request. */
      /* CompleteClass */
      var response: String = js.native
    }
    
    /** Provides info for a SKU of a product in the Windows Store. */
    /* note: abstract class */ @JSGlobal("Windows.Services.Store.StoreSku")
    @js.native
    open class StoreSku ()
      extends StObject
         with typings.winrtUwp.Windows.Services.Store.StoreSku
    
    /** Provides subscription info for a product SKU that represents a subscription with recurring billing. */
    /* note: abstract class */ @JSGlobal("Windows.Services.Store.StoreSubscriptionInfo")
    @js.native
    open class StoreSubscriptionInfo ()
      extends StObject
         with typings.winrtUwp.Windows.Services.Store.StoreSubscriptionInfo {
      
      /** Gets the duration of the billing period for a subscription, in the units specified by the BillingPeriodUnit property. */
      /* CompleteClass */
      var billingPeriod: Double = js.native
      
      /** Gets the units of the billing period for a subscription. */
      /* CompleteClass */
      var billingPeriodUnit: StoreDurationUnit = js.native
      
      /** Gets a value that indicates whether the subscription contains a trial period. */
      /* CompleteClass */
      var hasTrialPeriod: Boolean = js.native
      
      /** Gets the duration of the trial period for the subscription, in the units specified by the TrialPeriodUnit property. To determine whether the subscription has a trial period, use the HasTrialPeriod property. */
      /* CompleteClass */
      var trialPeriod: Double = js.native
      
      /** Gets the units of the trial period for the subscription. */
      /* CompleteClass */
      var trialPeriodUnit: StoreDurationUnit = js.native
    }
    
    /** Represents a video that is associated with a product listing in the Windows Store. */
    /* note: abstract class */ @JSGlobal("Windows.Services.Store.StoreVideo")
    @js.native
    open class StoreVideo ()
      extends StObject
         with typings.winrtUwp.Windows.Services.Store.StoreVideo {
      
      /** Gets the caption for the video. */
      /* CompleteClass */
      var caption: String = js.native
      
      /** Gets the height of the video, in pixels. */
      /* CompleteClass */
      var height: Double = js.native
      
      /** Gets the preview image that is displayed for the video. */
      /* CompleteClass */
      var previewImage: typings.winrtUwp.Windows.Services.Store.StoreImage = js.native
      
      /** Gets the URI of the video. */
      /* CompleteClass */
      var uri: Uri = js.native
      
      /** Gets the tag for the video. */
      /* CompleteClass */
      var videoPurposeTag: String = js.native
      
      /** Gets the width of the video, in pixels. */
      /* CompleteClass */
      var width: Double = js.native
    }
  }
}

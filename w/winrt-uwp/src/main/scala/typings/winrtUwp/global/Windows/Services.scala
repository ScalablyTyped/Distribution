package typings.winrtUwp.global.Windows

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.System.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
        def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers with Double] = js.native
        
        /* 6 */ val hardLeft: typings.winrtUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers.hardLeft with Double = js.native
        
        /* 3 */ val hardRight: typings.winrtUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers.hardRight with Double = js.native
        
        /* 7 */ val left: typings.winrtUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers.left with Double = js.native
        
        /* 8 */ val lightLeft: typings.winrtUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers.lightLeft with Double = js.native
        
        /* 1 */ val lightRight: typings.winrtUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers.lightRight with Double = js.native
        
        /* 0 */ val none: typings.winrtUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers.none with Double = js.native
        
        /* 2 */ val right: typings.winrtUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers.right with Double = js.native
        
        /* 4 */ val straight: typings.winrtUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers.straight with Double = js.native
        
        /* 10 */ val unknown: typings.winrtUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers.unknown with Double = js.native
        
        /* 5 */ val uturnLeft: typings.winrtUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers.uturnLeft with Double = js.native
        
        /* 9 */ val uturnRight: typings.winrtUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers.uturnRight with Double = js.native
      }
    }
  }
  
  /** Provides types and members you can use to access and manage Windows Store-related data for the current app. */
  object Store {
    
    /** Provides response data for a request to acquire a downloadable content (DLC) package license. */
    @JSGlobal("Windows.Services.Store.StoreAcquireLicenseResult")
    @js.native
    abstract class StoreAcquireLicenseResult ()
      extends typings.winrtUwp.Windows.Services.Store.StoreAcquireLicenseResult
    
    /** Provides license info for the current app, including licenses for products that are offered by the app. */
    @JSGlobal("Windows.Services.Store.StoreAppLicense")
    @js.native
    abstract class StoreAppLicense ()
      extends typings.winrtUwp.Windows.Services.Store.StoreAppLicense
    
    /** Represents a specific instance of a product SKU that can be purchased. */
    @JSGlobal("Windows.Services.Store.StoreAvailability")
    @js.native
    abstract class StoreAvailability ()
      extends typings.winrtUwp.Windows.Services.Store.StoreAvailability
    
    /** Provides additional data for a product SKU that the user has an entitlement to use. */
    @JSGlobal("Windows.Services.Store.StoreCollectionData")
    @js.native
    abstract class StoreCollectionData ()
      extends typings.winrtUwp.Windows.Services.Store.StoreCollectionData
    
    /** Provides response data for a request that involves a consumable add-on for the current app. */
    @JSGlobal("Windows.Services.Store.StoreConsumableResult")
    @js.native
    abstract class StoreConsumableResult ()
      extends typings.winrtUwp.Windows.Services.Store.StoreConsumableResult
    
    /** Defines values that represent the status of an request that is related to a consumable add-on. */
    @JSGlobal("Windows.Services.Store.StoreConsumableStatus")
    @js.native
    object StoreConsumableStatus extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Services.Store.StoreConsumableStatus with Double] = js.native
      
      /* 1 */ val insufficentQuantity: typings.winrtUwp.Windows.Services.Store.StoreConsumableStatus.insufficentQuantity with Double = js.native
      
      /* 2 */ val networkError: typings.winrtUwp.Windows.Services.Store.StoreConsumableStatus.networkError with Double = js.native
      
      /* 3 */ val serverError: typings.winrtUwp.Windows.Services.Store.StoreConsumableStatus.serverError with Double = js.native
      
      /* 0 */ val succeeded: typings.winrtUwp.Windows.Services.Store.StoreConsumableStatus.succeeded with Double = js.native
    }
    
    /** Provides members you can use to access and manage Windows Store-related data for the current app. For example, you can use members of this class to get Windows Store listing and license info for the current app, purchase the current app or products that are offered by the app, or download and install package updates for the app. */
    @JSGlobal("Windows.Services.Store.StoreContext")
    @js.native
    abstract class StoreContext ()
      extends typings.winrtUwp.Windows.Services.Store.StoreContext
    object StoreContext {
      
      /**
        * Gets a StoreContext object that can be used to access and manage Windows Store-related data for the current user in the context of the current app.
        * @return An object that you can use to access and manage Windows Store-related data for the current user.
        */
      /* static member */
      @JSGlobal("Windows.Services.Store.StoreContext.getDefault")
      @js.native
      def getDefault(): typings.winrtUwp.Windows.Services.Store.StoreContext = js.native
      
      /**
        * Gets a StoreContext object that can be used to access and manage Windows Store-related data for the specified user in the context of the current app.
        * @param user An object that identifies the user whose Windows Store-related data you want to access and manage.
        * @return An object that you can use to access and manage Windows Store-related data for the specified user.
        */
      /* static member */
      @JSGlobal("Windows.Services.Store.StoreContext.getForUser")
      @js.native
      def getForUser(user: User): typings.winrtUwp.Windows.Services.Store.StoreContext = js.native
    }
    
    /** Defines values that represent the units of a trial period or billing period for a subscription. */
    @JSGlobal("Windows.Services.Store.StoreDurationUnit")
    @js.native
    object StoreDurationUnit extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Services.Store.StoreDurationUnit with Double] = js.native
      
      /* 2 */ val day: typings.winrtUwp.Windows.Services.Store.StoreDurationUnit.day with Double = js.native
      
      /* 1 */ val hour: typings.winrtUwp.Windows.Services.Store.StoreDurationUnit.hour with Double = js.native
      
      /* 0 */ val minute: typings.winrtUwp.Windows.Services.Store.StoreDurationUnit.minute with Double = js.native
      
      /* 4 */ val month: typings.winrtUwp.Windows.Services.Store.StoreDurationUnit.month with Double = js.native
      
      /* 3 */ val week: typings.winrtUwp.Windows.Services.Store.StoreDurationUnit.week with Double = js.native
      
      /* 5 */ val year: typings.winrtUwp.Windows.Services.Store.StoreDurationUnit.year with Double = js.native
    }
    
    /** Represents an image that is associated with a product listing in the Windows Store. */
    @JSGlobal("Windows.Services.Store.StoreImage")
    @js.native
    abstract class StoreImage ()
      extends typings.winrtUwp.Windows.Services.Store.StoreImage
    
    /** Provides license info for an add-on that is associated with the current app. */
    @JSGlobal("Windows.Services.Store.StoreLicense")
    @js.native
    abstract class StoreLicense ()
      extends typings.winrtUwp.Windows.Services.Store.StoreLicense
    
    /** Provides license info for a downloadable content (DLC) package for the current app. */
    @JSGlobal("Windows.Services.Store.StorePackageLicense")
    @js.native
    abstract class StorePackageLicense ()
      extends typings.winrtUwp.Windows.Services.Store.StorePackageLicense
    
    /** Provides info about a package for the current app that has an update available for download from the Windows Store. */
    @JSGlobal("Windows.Services.Store.StorePackageUpdate")
    @js.native
    abstract class StorePackageUpdate ()
      extends typings.winrtUwp.Windows.Services.Store.StorePackageUpdate
    
    /** Provides info about a completed package update request for the current app. */
    @JSGlobal("Windows.Services.Store.StorePackageUpdateResult")
    @js.native
    abstract class StorePackageUpdateResult ()
      extends typings.winrtUwp.Windows.Services.Store.StorePackageUpdateResult
    
    /** Defines values that represent the state of a package download or installation request. */
    @JSGlobal("Windows.Services.Store.StorePackageUpdateState")
    @js.native
    object StorePackageUpdateState extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Services.Store.StorePackageUpdateState with Double] = js.native
      
      /* 4 */ val canceled: typings.winrtUwp.Windows.Services.Store.StorePackageUpdateState.canceled with Double = js.native
      
      /* 3 */ val completed: typings.winrtUwp.Windows.Services.Store.StorePackageUpdateState.completed with Double = js.native
      
      /* 2 */ val deploying: typings.winrtUwp.Windows.Services.Store.StorePackageUpdateState.deploying with Double = js.native
      
      /* 1 */ val downloading: typings.winrtUwp.Windows.Services.Store.StorePackageUpdateState.downloading with Double = js.native
      
      /* 6 */ val errorLowBattery: typings.winrtUwp.Windows.Services.Store.StorePackageUpdateState.errorLowBattery with Double = js.native
      
      /* 7 */ val errorWiFiRecommended: typings.winrtUwp.Windows.Services.Store.StorePackageUpdateState.errorWiFiRecommended with Double = js.native
      
      /* 8 */ val errorWiFiRequired: typings.winrtUwp.Windows.Services.Store.StorePackageUpdateState.errorWiFiRequired with Double = js.native
      
      /* 5 */ val otherError: typings.winrtUwp.Windows.Services.Store.StorePackageUpdateState.otherError with Double = js.native
      
      /* 0 */ val pending: typings.winrtUwp.Windows.Services.Store.StorePackageUpdateState.pending with Double = js.native
    }
    
    /** Contains pricing info for a product listing in the Windows Store. */
    @JSGlobal("Windows.Services.Store.StorePrice")
    @js.native
    abstract class StorePrice ()
      extends typings.winrtUwp.Windows.Services.Store.StorePrice
    
    /** Represents a product that is available in the Windows Store. */
    @JSGlobal("Windows.Services.Store.StoreProduct")
    @js.native
    abstract class StoreProduct ()
      extends typings.winrtUwp.Windows.Services.Store.StoreProduct
    
    /** Provides response data for a paged request to retrieve details about products that can be purchased from within the current app. */
    @JSGlobal("Windows.Services.Store.StoreProductPagedQueryResult")
    @js.native
    abstract class StoreProductPagedQueryResult ()
      extends typings.winrtUwp.Windows.Services.Store.StoreProductPagedQueryResult
    
    /** Provides response data for a request to retrieve details about products that can be purchased from within the current app. */
    @JSGlobal("Windows.Services.Store.StoreProductQueryResult")
    @js.native
    abstract class StoreProductQueryResult ()
      extends typings.winrtUwp.Windows.Services.Store.StoreProductQueryResult
    
    /** Provides response data for a request to retrieve details about the current app. */
    @JSGlobal("Windows.Services.Store.StoreProductResult")
    @js.native
    abstract class StoreProductResult ()
      extends typings.winrtUwp.Windows.Services.Store.StoreProductResult
    
    /** Contains additional details that you can pass to a purchase request for a product, including the product name to display to the user during the purchase. */
    @JSGlobal("Windows.Services.Store.StorePurchaseProperties")
    @js.native
    /** Initializes a new instance of the StorePurchaseProperties class. */
    class StorePurchaseProperties ()
      extends typings.winrtUwp.Windows.Services.Store.StorePurchaseProperties {
      /** Initializes a new instance of the StorePurchaseProperties class. This overload provides the option to specify the product name that is displayed to the user during the purchase.
        * @param name The product name that is displayed to the user during the purchase.
        */
      def this(name: String) = this()
    }
    
    /** Provides response data for a request to purchase an app or product that is offered by the app. */
    @JSGlobal("Windows.Services.Store.StorePurchaseResult")
    @js.native
    abstract class StorePurchaseResult ()
      extends typings.winrtUwp.Windows.Services.Store.StorePurchaseResult
    
    /** Defines values that represent the status of a request to purchase an app or add-on. */
    @JSGlobal("Windows.Services.Store.StorePurchaseStatus")
    @js.native
    object StorePurchaseStatus extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Services.Store.StorePurchaseStatus with Double] = js.native
      
      /* 1 */ val alreadyPurchased: typings.winrtUwp.Windows.Services.Store.StorePurchaseStatus.alreadyPurchased with Double = js.native
      
      /* 3 */ val networkError: typings.winrtUwp.Windows.Services.Store.StorePurchaseStatus.networkError with Double = js.native
      
      /* 2 */ val notPurchased: typings.winrtUwp.Windows.Services.Store.StorePurchaseStatus.notPurchased with Double = js.native
      
      /* 4 */ val serverError: typings.winrtUwp.Windows.Services.Store.StorePurchaseStatus.serverError with Double = js.native
      
      /* 0 */ val succeeded: typings.winrtUwp.Windows.Services.Store.StorePurchaseStatus.succeeded with Double = js.native
    }
    
    /** Provides a helper method that can be used to send requests to the Windows Store for operations that do not yet have a corresponding API available in the Windows SDK. */
    @JSGlobal("Windows.Services.Store.StoreRequestHelper")
    @js.native
    abstract class StoreRequestHelper ()
      extends typings.winrtUwp.Windows.Services.Store.StoreRequestHelper
    object StoreRequestHelper {
      
      /**
        * Sends the specified request to the Windows Store with the provided context and parameters.
        * @param context An object that specifies the user for which to perform the operation. If your app is a single-user app (that is, it runs only in the context of the user that launched the app), use the StoreContext.GetDefault method to get a StoreContext object that you can use to send a request that operates in the context of the user. If your app is a multi-user app, use the StoreContext.GetForUser method to get a StoreContext object that you can use to send a request that operates in the context of a specific user.
        * @param requestKind A value that identifies the request that you want to send to the Windows Store.
        * @param parametersAsJson A JSON-formatted string that contains the arguments to pass to the request.
        * @return An asynchronous operation that, on successful completion, returns a StoreSendRequestResult object that provides status and error info about the request.
        */
      /* static member */
      @JSGlobal("Windows.Services.Store.StoreRequestHelper.sendRequestAsync")
      @js.native
      def sendRequestAsync(
        context: typings.winrtUwp.Windows.Services.Store.StoreContext,
        requestKind: Double,
        parametersAsJson: String
      ): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Services.Store.StoreSendRequestResult] = js.native
    }
    
    /** Provides response data for a request that is sent to the Windows Store. */
    @JSGlobal("Windows.Services.Store.StoreSendRequestResult")
    @js.native
    abstract class StoreSendRequestResult ()
      extends typings.winrtUwp.Windows.Services.Store.StoreSendRequestResult
    
    /** Provides info for a SKU of a product in the Windows Store. */
    @JSGlobal("Windows.Services.Store.StoreSku")
    @js.native
    abstract class StoreSku ()
      extends typings.winrtUwp.Windows.Services.Store.StoreSku
    
    /** Provides subscription info for a product SKU that represents a subscription with recurring billing. */
    @JSGlobal("Windows.Services.Store.StoreSubscriptionInfo")
    @js.native
    abstract class StoreSubscriptionInfo ()
      extends typings.winrtUwp.Windows.Services.Store.StoreSubscriptionInfo
    
    /** Represents a video that is associated with a product listing in the Windows Store. */
    @JSGlobal("Windows.Services.Store.StoreVideo")
    @js.native
    abstract class StoreVideo ()
      extends typings.winrtUwp.Windows.Services.Store.StoreVideo
  }
}

package typings.winrt.global.Windows.ApplicationModel

import typings.winrt.Windows.Foundation.Collections.IMapView
import typings.winrt.Windows.Foundation.IAsyncAction
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Storage.StorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Store {
  
  @JSGlobal("Windows.ApplicationModel.Store.CurrentApp")
  @js.native
  open class CurrentApp ()
    extends StObject
       with typings.winrt.Windows.ApplicationModel.Store.CurrentApp
  /* static members */
  object CurrentApp {
    
    @JSGlobal("Windows.ApplicationModel.Store.CurrentApp")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Windows.ApplicationModel.Store.CurrentApp.appId")
    @js.native
    def appId: String = js.native
    inline def appId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("appId")(x.asInstanceOf[js.Any])
    
    inline def getAppReceiptAsync(): IAsyncOperation[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAppReceiptAsync")().asInstanceOf[IAsyncOperation[String]]
    
    inline def getProductReceiptAsync(productId: String): IAsyncOperation[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getProductReceiptAsync")(productId.asInstanceOf[js.Any]).asInstanceOf[IAsyncOperation[String]]
    
    @JSGlobal("Windows.ApplicationModel.Store.CurrentApp.licenseInformation")
    @js.native
    def licenseInformation: typings.winrt.Windows.ApplicationModel.Store.LicenseInformation = js.native
    inline def licenseInformation_=(x: typings.winrt.Windows.ApplicationModel.Store.LicenseInformation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("licenseInformation")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.ApplicationModel.Store.CurrentApp.linkUri")
    @js.native
    def linkUri: Uri = js.native
    inline def linkUri_=(x: Uri): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("linkUri")(x.asInstanceOf[js.Any])
    
    inline def loadListingInformationAsync(): IAsyncOperation[typings.winrt.Windows.ApplicationModel.Store.ListingInformation] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadListingInformationAsync")().asInstanceOf[IAsyncOperation[typings.winrt.Windows.ApplicationModel.Store.ListingInformation]]
    
    inline def requestAppPurchaseAsync(includeReceipt: Boolean): IAsyncOperation[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestAppPurchaseAsync")(includeReceipt.asInstanceOf[js.Any]).asInstanceOf[IAsyncOperation[String]]
    
    inline def requestProductPurchaseAsync(productId: String, includeReceipt: Boolean): IAsyncOperation[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("requestProductPurchaseAsync")(productId.asInstanceOf[js.Any], includeReceipt.asInstanceOf[js.Any])).asInstanceOf[IAsyncOperation[String]]
  }
  
  @JSGlobal("Windows.ApplicationModel.Store.CurrentAppSimulator")
  @js.native
  open class CurrentAppSimulator ()
    extends StObject
       with typings.winrt.Windows.ApplicationModel.Store.CurrentAppSimulator
  /* static members */
  object CurrentAppSimulator {
    
    @JSGlobal("Windows.ApplicationModel.Store.CurrentAppSimulator")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Windows.ApplicationModel.Store.CurrentAppSimulator.appId")
    @js.native
    def appId: String = js.native
    inline def appId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("appId")(x.asInstanceOf[js.Any])
    
    inline def getAppReceiptAsync(): IAsyncOperation[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAppReceiptAsync")().asInstanceOf[IAsyncOperation[String]]
    
    inline def getProductReceiptAsync(productId: String): IAsyncOperation[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getProductReceiptAsync")(productId.asInstanceOf[js.Any]).asInstanceOf[IAsyncOperation[String]]
    
    @JSGlobal("Windows.ApplicationModel.Store.CurrentAppSimulator.licenseInformation")
    @js.native
    def licenseInformation: typings.winrt.Windows.ApplicationModel.Store.LicenseInformation = js.native
    inline def licenseInformation_=(x: typings.winrt.Windows.ApplicationModel.Store.LicenseInformation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("licenseInformation")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.ApplicationModel.Store.CurrentAppSimulator.linkUri")
    @js.native
    def linkUri: Uri = js.native
    inline def linkUri_=(x: Uri): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("linkUri")(x.asInstanceOf[js.Any])
    
    inline def loadListingInformationAsync(): IAsyncOperation[typings.winrt.Windows.ApplicationModel.Store.ListingInformation] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadListingInformationAsync")().asInstanceOf[IAsyncOperation[typings.winrt.Windows.ApplicationModel.Store.ListingInformation]]
    
    inline def reloadSimulatorAsync(simulatorSettingsFile: StorageFile): IAsyncAction = ^.asInstanceOf[js.Dynamic].applyDynamic("reloadSimulatorAsync")(simulatorSettingsFile.asInstanceOf[js.Any]).asInstanceOf[IAsyncAction]
    
    inline def requestAppPurchaseAsync(includeReceipt: Boolean): IAsyncOperation[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestAppPurchaseAsync")(includeReceipt.asInstanceOf[js.Any]).asInstanceOf[IAsyncOperation[String]]
    
    inline def requestProductPurchaseAsync(productId: String, includeReceipt: Boolean): IAsyncOperation[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("requestProductPurchaseAsync")(productId.asInstanceOf[js.Any], includeReceipt.asInstanceOf[js.Any])).asInstanceOf[IAsyncOperation[String]]
  }
  
  @JSGlobal("Windows.ApplicationModel.Store.LicenseInformation")
  @js.native
  open class LicenseInformation ()
    extends StObject
       with typings.winrt.Windows.ApplicationModel.Store.LicenseInformation {
    
    /* CompleteClass */
    var expirationDate: js.Date = js.native
    
    /* CompleteClass */
    var isActive: Boolean = js.native
    
    /* CompleteClass */
    var isTrial: Boolean = js.native
    
    /* CompleteClass */
    var onlicensechanged: Any = js.native
    
    /* CompleteClass */
    var productLicenses: IMapView[String, typings.winrt.Windows.ApplicationModel.Store.ProductLicense] = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Store.ListingInformation")
  @js.native
  open class ListingInformation ()
    extends StObject
       with typings.winrt.Windows.ApplicationModel.Store.ListingInformation {
    
    /* CompleteClass */
    var ageRating: Double = js.native
    
    /* CompleteClass */
    var currentMarket: String = js.native
    
    /* CompleteClass */
    var description: String = js.native
    
    /* CompleteClass */
    var formattedPrice: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var productListings: IMapView[String, typings.winrt.Windows.ApplicationModel.Store.ProductListing] = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Store.ProductLicense")
  @js.native
  open class ProductLicense ()
    extends StObject
       with typings.winrt.Windows.ApplicationModel.Store.ProductLicense {
    
    /* CompleteClass */
    var expirationDate: js.Date = js.native
    
    /* CompleteClass */
    var isActive: Boolean = js.native
    
    /* CompleteClass */
    var productId: String = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Store.ProductListing")
  @js.native
  open class ProductListing ()
    extends StObject
       with typings.winrt.Windows.ApplicationModel.Store.ProductListing {
    
    /* CompleteClass */
    var formattedPrice: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var productId: String = js.native
  }
}

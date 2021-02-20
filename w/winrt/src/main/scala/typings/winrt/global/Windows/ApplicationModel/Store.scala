package typings.winrt.global.Windows.ApplicationModel

import typings.winrt.Windows.Foundation.IAsyncAction
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Storage.StorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Store {
  
  @JSGlobal("Windows.ApplicationModel.Store.CurrentApp")
  @js.native
  class CurrentApp ()
    extends typings.winrt.Windows.ApplicationModel.Store.CurrentApp
  /* static members */
  object CurrentApp {
    
    @JSGlobal("Windows.ApplicationModel.Store.CurrentApp")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Windows.ApplicationModel.Store.CurrentApp.appId")
    @js.native
    def appId: String = js.native
    @scala.inline
    def appId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("appId")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.ApplicationModel.Store.CurrentApp.getAppReceiptAsync")
    @js.native
    def getAppReceiptAsync(): IAsyncOperation[String] = js.native
    
    @JSGlobal("Windows.ApplicationModel.Store.CurrentApp.getProductReceiptAsync")
    @js.native
    def getProductReceiptAsync(productId: String): IAsyncOperation[String] = js.native
    
    @JSGlobal("Windows.ApplicationModel.Store.CurrentApp.licenseInformation")
    @js.native
    def licenseInformation: typings.winrt.Windows.ApplicationModel.Store.LicenseInformation = js.native
    @scala.inline
    def licenseInformation_=(x: typings.winrt.Windows.ApplicationModel.Store.LicenseInformation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("licenseInformation")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.ApplicationModel.Store.CurrentApp.linkUri")
    @js.native
    def linkUri: Uri = js.native
    @scala.inline
    def linkUri_=(x: Uri): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("linkUri")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.ApplicationModel.Store.CurrentApp.loadListingInformationAsync")
    @js.native
    def loadListingInformationAsync(): IAsyncOperation[typings.winrt.Windows.ApplicationModel.Store.ListingInformation] = js.native
    
    @JSGlobal("Windows.ApplicationModel.Store.CurrentApp.requestAppPurchaseAsync")
    @js.native
    def requestAppPurchaseAsync(includeReceipt: Boolean): IAsyncOperation[String] = js.native
    
    @JSGlobal("Windows.ApplicationModel.Store.CurrentApp.requestProductPurchaseAsync")
    @js.native
    def requestProductPurchaseAsync(productId: String, includeReceipt: Boolean): IAsyncOperation[String] = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Store.CurrentAppSimulator")
  @js.native
  class CurrentAppSimulator ()
    extends typings.winrt.Windows.ApplicationModel.Store.CurrentAppSimulator
  /* static members */
  object CurrentAppSimulator {
    
    @JSGlobal("Windows.ApplicationModel.Store.CurrentAppSimulator")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Windows.ApplicationModel.Store.CurrentAppSimulator.appId")
    @js.native
    def appId: String = js.native
    @scala.inline
    def appId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("appId")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.ApplicationModel.Store.CurrentAppSimulator.getAppReceiptAsync")
    @js.native
    def getAppReceiptAsync(): IAsyncOperation[String] = js.native
    
    @JSGlobal("Windows.ApplicationModel.Store.CurrentAppSimulator.getProductReceiptAsync")
    @js.native
    def getProductReceiptAsync(productId: String): IAsyncOperation[String] = js.native
    
    @JSGlobal("Windows.ApplicationModel.Store.CurrentAppSimulator.licenseInformation")
    @js.native
    def licenseInformation: typings.winrt.Windows.ApplicationModel.Store.LicenseInformation = js.native
    @scala.inline
    def licenseInformation_=(x: typings.winrt.Windows.ApplicationModel.Store.LicenseInformation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("licenseInformation")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.ApplicationModel.Store.CurrentAppSimulator.linkUri")
    @js.native
    def linkUri: Uri = js.native
    @scala.inline
    def linkUri_=(x: Uri): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("linkUri")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.ApplicationModel.Store.CurrentAppSimulator.loadListingInformationAsync")
    @js.native
    def loadListingInformationAsync(): IAsyncOperation[typings.winrt.Windows.ApplicationModel.Store.ListingInformation] = js.native
    
    @JSGlobal("Windows.ApplicationModel.Store.CurrentAppSimulator.reloadSimulatorAsync")
    @js.native
    def reloadSimulatorAsync(simulatorSettingsFile: StorageFile): IAsyncAction = js.native
    
    @JSGlobal("Windows.ApplicationModel.Store.CurrentAppSimulator.requestAppPurchaseAsync")
    @js.native
    def requestAppPurchaseAsync(includeReceipt: Boolean): IAsyncOperation[String] = js.native
    
    @JSGlobal("Windows.ApplicationModel.Store.CurrentAppSimulator.requestProductPurchaseAsync")
    @js.native
    def requestProductPurchaseAsync(productId: String, includeReceipt: Boolean): IAsyncOperation[String] = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Store.LicenseInformation")
  @js.native
  class LicenseInformation ()
    extends typings.winrt.Windows.ApplicationModel.Store.LicenseInformation
  
  @JSGlobal("Windows.ApplicationModel.Store.ListingInformation")
  @js.native
  class ListingInformation ()
    extends typings.winrt.Windows.ApplicationModel.Store.ListingInformation
  
  @JSGlobal("Windows.ApplicationModel.Store.ProductLicense")
  @js.native
  class ProductLicense ()
    extends typings.winrt.Windows.ApplicationModel.Store.ProductLicense
  
  @JSGlobal("Windows.ApplicationModel.Store.ProductListing")
  @js.native
  class ProductListing ()
    extends typings.winrt.Windows.ApplicationModel.Store.ProductListing
}

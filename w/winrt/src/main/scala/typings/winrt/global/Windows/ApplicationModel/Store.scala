package typings.winrt.global.Windows.ApplicationModel

import typings.winrt.Windows.Foundation.IAsyncAction
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.ApplicationModel.Store")
@js.native
object Store extends js.Object {
  
  @js.native
  class CurrentApp ()
    extends typings.winrt.Windows.ApplicationModel.Store.CurrentApp
  /* static members */
  @js.native
  object CurrentApp extends js.Object {
    
    var appId: String = js.native
    
    def getAppReceiptAsync(): IAsyncOperation[String] = js.native
    
    def getProductReceiptAsync(productId: String): IAsyncOperation[String] = js.native
    
    var licenseInformation: typings.winrt.Windows.ApplicationModel.Store.LicenseInformation = js.native
    
    var linkUri: Uri = js.native
    
    def loadListingInformationAsync(): IAsyncOperation[typings.winrt.Windows.ApplicationModel.Store.ListingInformation] = js.native
    
    def requestAppPurchaseAsync(includeReceipt: Boolean): IAsyncOperation[String] = js.native
    
    def requestProductPurchaseAsync(productId: String, includeReceipt: Boolean): IAsyncOperation[String] = js.native
  }
  
  @js.native
  class CurrentAppSimulator ()
    extends typings.winrt.Windows.ApplicationModel.Store.CurrentAppSimulator
  /* static members */
  @js.native
  object CurrentAppSimulator extends js.Object {
    
    var appId: String = js.native
    
    def getAppReceiptAsync(): IAsyncOperation[String] = js.native
    
    def getProductReceiptAsync(productId: String): IAsyncOperation[String] = js.native
    
    var licenseInformation: typings.winrt.Windows.ApplicationModel.Store.LicenseInformation = js.native
    
    var linkUri: Uri = js.native
    
    def loadListingInformationAsync(): IAsyncOperation[typings.winrt.Windows.ApplicationModel.Store.ListingInformation] = js.native
    
    def reloadSimulatorAsync(simulatorSettingsFile: StorageFile): IAsyncAction = js.native
    
    def requestAppPurchaseAsync(includeReceipt: Boolean): IAsyncOperation[String] = js.native
    
    def requestProductPurchaseAsync(productId: String, includeReceipt: Boolean): IAsyncOperation[String] = js.native
  }
  
  @js.native
  class LicenseInformation ()
    extends typings.winrt.Windows.ApplicationModel.Store.LicenseInformation
  
  @js.native
  class ListingInformation ()
    extends typings.winrt.Windows.ApplicationModel.Store.ListingInformation
  
  @js.native
  class ProductLicense ()
    extends typings.winrt.Windows.ApplicationModel.Store.ProductLicense
  
  @js.native
  class ProductListing ()
    extends typings.winrt.Windows.ApplicationModel.Store.ProductListing
}

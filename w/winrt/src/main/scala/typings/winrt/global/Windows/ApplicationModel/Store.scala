package typings.winrt.global.Windows.ApplicationModel

import typings.std.Date
import typings.winrt.Windows.Foundation.Collections.IMapView
import typings.winrt.Windows.Foundation.IAsyncAction
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Store")
@js.native
object Store extends js.Object {
  @js.native
  class CurrentApp ()
    extends typings.winrt.Windows.ApplicationModel.Store.CurrentApp
  
  @js.native
  class CurrentAppSimulator ()
    extends typings.winrt.Windows.ApplicationModel.Store.CurrentAppSimulator
  
  @js.native
  class LicenseInformation ()
    extends typings.winrt.Windows.ApplicationModel.Store.LicenseInformation {
    /* CompleteClass */
    override var expirationDate: Date = js.native
    /* CompleteClass */
    override var isActive: Boolean = js.native
    /* CompleteClass */
    override var isTrial: Boolean = js.native
    /* CompleteClass */
    override var onlicensechanged: js.Any = js.native
    /* CompleteClass */
    override var productLicenses: IMapView[String, typings.winrt.Windows.ApplicationModel.Store.ProductLicense] = js.native
  }
  
  @js.native
  class ListingInformation ()
    extends typings.winrt.Windows.ApplicationModel.Store.ListingInformation {
    /* CompleteClass */
    override var ageRating: Double = js.native
    /* CompleteClass */
    override var currentMarket: String = js.native
    /* CompleteClass */
    override var description: String = js.native
    /* CompleteClass */
    override var formattedPrice: String = js.native
    /* CompleteClass */
    override var name: String = js.native
    /* CompleteClass */
    override var productListings: IMapView[String, typings.winrt.Windows.ApplicationModel.Store.ProductListing] = js.native
  }
  
  @js.native
  class ProductLicense ()
    extends typings.winrt.Windows.ApplicationModel.Store.ProductLicense {
    /* CompleteClass */
    override var expirationDate: Date = js.native
    /* CompleteClass */
    override var isActive: Boolean = js.native
    /* CompleteClass */
    override var productId: String = js.native
  }
  
  @js.native
  class ProductListing ()
    extends typings.winrt.Windows.ApplicationModel.Store.ProductListing {
    /* CompleteClass */
    override var formattedPrice: String = js.native
    /* CompleteClass */
    override var name: String = js.native
    /* CompleteClass */
    override var productId: String = js.native
  }
  
  /* static members */
  @js.native
  object CurrentApp extends js.Object {
    var appId: String = js.native
    var licenseInformation: typings.winrt.Windows.ApplicationModel.Store.LicenseInformation = js.native
    var linkUri: Uri = js.native
    def getAppReceiptAsync(): IAsyncOperation[String] = js.native
    def getProductReceiptAsync(productId: String): IAsyncOperation[String] = js.native
    def loadListingInformationAsync(): IAsyncOperation[typings.winrt.Windows.ApplicationModel.Store.ListingInformation] = js.native
    def requestAppPurchaseAsync(includeReceipt: Boolean): IAsyncOperation[String] = js.native
    def requestProductPurchaseAsync(productId: String, includeReceipt: Boolean): IAsyncOperation[String] = js.native
  }
  
  /* static members */
  @js.native
  object CurrentAppSimulator extends js.Object {
    var appId: String = js.native
    var licenseInformation: typings.winrt.Windows.ApplicationModel.Store.LicenseInformation = js.native
    var linkUri: Uri = js.native
    def getAppReceiptAsync(): IAsyncOperation[String] = js.native
    def getProductReceiptAsync(productId: String): IAsyncOperation[String] = js.native
    def loadListingInformationAsync(): IAsyncOperation[typings.winrt.Windows.ApplicationModel.Store.ListingInformation] = js.native
    def reloadSimulatorAsync(simulatorSettingsFile: StorageFile): IAsyncAction = js.native
    def requestAppPurchaseAsync(includeReceipt: Boolean): IAsyncOperation[String] = js.native
    def requestProductPurchaseAsync(productId: String, includeReceipt: Boolean): IAsyncOperation[String] = js.native
  }
  
}


package typings.winrt.Windows.ApplicationModel.Store

import typings.winrt.Windows.Foundation.IAsyncAction
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICurrentAppSimulator extends js.Object {
  var appId: String
  var licenseInformation: LicenseInformation
  var linkUri: Uri
  def getAppReceiptAsync(): IAsyncOperation[String]
  def getProductReceiptAsync(productId: String): IAsyncOperation[String]
  def loadListingInformationAsync(): IAsyncOperation[ListingInformation]
  def reloadSimulatorAsync(simulatorSettingsFile: StorageFile): IAsyncAction
  def requestAppPurchaseAsync(includeReceipt: Boolean): IAsyncOperation[String]
  def requestProductPurchaseAsync(productId: String, includeReceipt: Boolean): IAsyncOperation[String]
}

object ICurrentAppSimulator {
  @scala.inline
  def apply(
    appId: String,
    getAppReceiptAsync: () => IAsyncOperation[String],
    getProductReceiptAsync: String => IAsyncOperation[String],
    licenseInformation: LicenseInformation,
    linkUri: Uri,
    loadListingInformationAsync: () => IAsyncOperation[ListingInformation],
    reloadSimulatorAsync: StorageFile => IAsyncAction,
    requestAppPurchaseAsync: Boolean => IAsyncOperation[String],
    requestProductPurchaseAsync: (String, Boolean) => IAsyncOperation[String]
  ): ICurrentAppSimulator = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], getAppReceiptAsync = js.Any.fromFunction0(getAppReceiptAsync), getProductReceiptAsync = js.Any.fromFunction1(getProductReceiptAsync), licenseInformation = licenseInformation.asInstanceOf[js.Any], linkUri = linkUri.asInstanceOf[js.Any], loadListingInformationAsync = js.Any.fromFunction0(loadListingInformationAsync), reloadSimulatorAsync = js.Any.fromFunction1(reloadSimulatorAsync), requestAppPurchaseAsync = js.Any.fromFunction1(requestAppPurchaseAsync), requestProductPurchaseAsync = js.Any.fromFunction2(requestProductPurchaseAsync))
  
    __obj.asInstanceOf[ICurrentAppSimulator]
  }
}


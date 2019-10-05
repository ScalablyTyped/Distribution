package typings.winrt.Windows.ApplicationModel.Store

import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICurrentApp extends js.Object {
  var appId: String
  var licenseInformation: LicenseInformation
  var linkUri: Uri
  def getAppReceiptAsync(): IAsyncOperation[String]
  def getProductReceiptAsync(productId: String): IAsyncOperation[String]
  def loadListingInformationAsync(): IAsyncOperation[ListingInformation]
  def requestAppPurchaseAsync(includeReceipt: Boolean): IAsyncOperation[String]
  def requestProductPurchaseAsync(productId: String, includeReceipt: Boolean): IAsyncOperation[String]
}

object ICurrentApp {
  @scala.inline
  def apply(
    appId: String,
    getAppReceiptAsync: () => IAsyncOperation[String],
    getProductReceiptAsync: String => IAsyncOperation[String],
    licenseInformation: LicenseInformation,
    linkUri: Uri,
    loadListingInformationAsync: () => IAsyncOperation[ListingInformation],
    requestAppPurchaseAsync: Boolean => IAsyncOperation[String],
    requestProductPurchaseAsync: (String, Boolean) => IAsyncOperation[String]
  ): ICurrentApp = {
    val __obj = js.Dynamic.literal(appId = appId, getAppReceiptAsync = js.Any.fromFunction0(getAppReceiptAsync), getProductReceiptAsync = js.Any.fromFunction1(getProductReceiptAsync), licenseInformation = licenseInformation, linkUri = linkUri, loadListingInformationAsync = js.Any.fromFunction0(loadListingInformationAsync), requestAppPurchaseAsync = js.Any.fromFunction1(requestAppPurchaseAsync), requestProductPurchaseAsync = js.Any.fromFunction2(requestProductPurchaseAsync))
  
    __obj.asInstanceOf[ICurrentApp]
  }
}


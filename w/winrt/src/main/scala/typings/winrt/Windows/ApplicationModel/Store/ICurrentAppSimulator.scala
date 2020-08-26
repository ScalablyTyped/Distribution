package typings.winrt.Windows.ApplicationModel.Store

import typings.winrt.Windows.Foundation.IAsyncAction
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICurrentAppSimulator extends js.Object {
  var appId: String = js.native
  var licenseInformation: LicenseInformation = js.native
  var linkUri: Uri = js.native
  def getAppReceiptAsync(): IAsyncOperation[String] = js.native
  def getProductReceiptAsync(productId: String): IAsyncOperation[String] = js.native
  def loadListingInformationAsync(): IAsyncOperation[ListingInformation] = js.native
  def reloadSimulatorAsync(simulatorSettingsFile: StorageFile): IAsyncAction = js.native
  def requestAppPurchaseAsync(includeReceipt: Boolean): IAsyncOperation[String] = js.native
  def requestProductPurchaseAsync(productId: String, includeReceipt: Boolean): IAsyncOperation[String] = js.native
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
  @scala.inline
  implicit class ICurrentAppSimulatorOps[Self <: ICurrentAppSimulator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAppId(value: String): Self = this.set("appId", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetAppReceiptAsync(value: () => IAsyncOperation[String]): Self = this.set("getAppReceiptAsync", js.Any.fromFunction0(value))
    @scala.inline
    def setGetProductReceiptAsync(value: String => IAsyncOperation[String]): Self = this.set("getProductReceiptAsync", js.Any.fromFunction1(value))
    @scala.inline
    def setLicenseInformation(value: LicenseInformation): Self = this.set("licenseInformation", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinkUri(value: Uri): Self = this.set("linkUri", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadListingInformationAsync(value: () => IAsyncOperation[ListingInformation]): Self = this.set("loadListingInformationAsync", js.Any.fromFunction0(value))
    @scala.inline
    def setReloadSimulatorAsync(value: StorageFile => IAsyncAction): Self = this.set("reloadSimulatorAsync", js.Any.fromFunction1(value))
    @scala.inline
    def setRequestAppPurchaseAsync(value: Boolean => IAsyncOperation[String]): Self = this.set("requestAppPurchaseAsync", js.Any.fromFunction1(value))
    @scala.inline
    def setRequestProductPurchaseAsync(value: (String, Boolean) => IAsyncOperation[String]): Self = this.set("requestProductPurchaseAsync", js.Any.fromFunction2(value))
  }
  
}


package typings
package winrtLib.WindowsNs.ApplicationModelNs.StoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICurrentAppSimulator extends js.Object {
  var appId: java.lang.String
  var licenseInformation: LicenseInformation
  var linkUri: winrtLib.WindowsNs.FoundationNs.Uri
  def getAppReceiptAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[java.lang.String]
  def getProductReceiptAsync(productId: java.lang.String): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[java.lang.String]
  def loadListingInformationAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[ListingInformation]
  def reloadSimulatorAsync(simulatorSettingsFile: winrtLib.WindowsNs.StorageNs.StorageFile): winrtLib.WindowsNs.FoundationNs.IAsyncAction
  def requestAppPurchaseAsync(includeReceipt: scala.Boolean): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[java.lang.String]
  def requestProductPurchaseAsync(productId: java.lang.String, includeReceipt: scala.Boolean): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[java.lang.String]
}

object ICurrentAppSimulator {
  @scala.inline
  def apply(
    appId: java.lang.String,
    getAppReceiptAsync: () => winrtLib.WindowsNs.FoundationNs.IAsyncOperation[java.lang.String],
    getProductReceiptAsync: java.lang.String => winrtLib.WindowsNs.FoundationNs.IAsyncOperation[java.lang.String],
    licenseInformation: LicenseInformation,
    linkUri: winrtLib.WindowsNs.FoundationNs.Uri,
    loadListingInformationAsync: () => winrtLib.WindowsNs.FoundationNs.IAsyncOperation[ListingInformation],
    reloadSimulatorAsync: winrtLib.WindowsNs.StorageNs.StorageFile => winrtLib.WindowsNs.FoundationNs.IAsyncAction,
    requestAppPurchaseAsync: scala.Boolean => winrtLib.WindowsNs.FoundationNs.IAsyncOperation[java.lang.String],
    requestProductPurchaseAsync: (java.lang.String, scala.Boolean) => winrtLib.WindowsNs.FoundationNs.IAsyncOperation[java.lang.String]
  ): ICurrentAppSimulator = {
    val __obj = js.Dynamic.literal(appId = appId, getAppReceiptAsync = js.Any.fromFunction0(getAppReceiptAsync), getProductReceiptAsync = js.Any.fromFunction1(getProductReceiptAsync), licenseInformation = licenseInformation, linkUri = linkUri, loadListingInformationAsync = js.Any.fromFunction0(loadListingInformationAsync), reloadSimulatorAsync = js.Any.fromFunction1(reloadSimulatorAsync), requestAppPurchaseAsync = js.Any.fromFunction1(requestAppPurchaseAsync), requestProductPurchaseAsync = js.Any.fromFunction2(requestProductPurchaseAsync))
  
    __obj.asInstanceOf[ICurrentAppSimulator]
  }
}


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


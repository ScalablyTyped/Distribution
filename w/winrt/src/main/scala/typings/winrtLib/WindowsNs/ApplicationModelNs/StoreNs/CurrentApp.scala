package typings
package winrtLib.WindowsNs.ApplicationModelNs.StoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Store.CurrentApp")
@js.native
class CurrentApp () extends js.Object

/* static members */
@JSGlobal("Windows.ApplicationModel.Store.CurrentApp")
@js.native
object CurrentApp extends js.Object {
  var appId: java.lang.String = js.native
  var licenseInformation: winrtLib.WindowsNs.ApplicationModelNs.StoreNs.LicenseInformation = js.native
  var linkUri: winrtLib.WindowsNs.FoundationNs.Uri = js.native
  def getAppReceiptAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[java.lang.String] = js.native
  def getProductReceiptAsync(productId: java.lang.String): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[java.lang.String] = js.native
  def loadListingInformationAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.ApplicationModelNs.StoreNs.ListingInformation] = js.native
  def requestAppPurchaseAsync(includeReceipt: scala.Boolean): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[java.lang.String] = js.native
  def requestProductPurchaseAsync(productId: java.lang.String, includeReceipt: scala.Boolean): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[java.lang.String] = js.native
}


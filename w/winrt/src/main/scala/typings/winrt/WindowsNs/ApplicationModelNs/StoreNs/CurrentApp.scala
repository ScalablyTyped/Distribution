package typings.winrt.WindowsNs.ApplicationModelNs.StoreNs

import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import typings.winrt.WindowsNs.FoundationNs.Uri
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
  var appId: String = js.native
  var licenseInformation: LicenseInformation = js.native
  var linkUri: Uri = js.native
  def getAppReceiptAsync(): IAsyncOperation[String] = js.native
  def getProductReceiptAsync(productId: String): IAsyncOperation[String] = js.native
  def loadListingInformationAsync(): IAsyncOperation[ListingInformation] = js.native
  def requestAppPurchaseAsync(includeReceipt: Boolean): IAsyncOperation[String] = js.native
  def requestProductPurchaseAsync(productId: String, includeReceipt: Boolean): IAsyncOperation[String] = js.native
}


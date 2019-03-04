package typings
package winrtLib.WindowsNs.ApplicationModelNs.StoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICurrentApp extends js.Object {
  var appId: java.lang.String
  var licenseInformation: LicenseInformation
  var linkUri: winrtLib.WindowsNs.FoundationNs.Uri
  def getAppReceiptAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[java.lang.String]
  def getProductReceiptAsync(productId: java.lang.String): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[java.lang.String]
  def loadListingInformationAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[ListingInformation]
  def requestAppPurchaseAsync(includeReceipt: scala.Boolean): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[java.lang.String]
  def requestProductPurchaseAsync(productId: java.lang.String, includeReceipt: scala.Boolean): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[java.lang.String]
}

object ICurrentApp {
  @scala.inline
  def apply(
    appId: java.lang.String,
    getAppReceiptAsync: js.Function0[winrtLib.WindowsNs.FoundationNs.IAsyncOperation[java.lang.String]],
    getProductReceiptAsync: js.Function1[
      java.lang.String, 
      winrtLib.WindowsNs.FoundationNs.IAsyncOperation[java.lang.String]
    ],
    licenseInformation: LicenseInformation,
    linkUri: winrtLib.WindowsNs.FoundationNs.Uri,
    loadListingInformationAsync: js.Function0[winrtLib.WindowsNs.FoundationNs.IAsyncOperation[ListingInformation]],
    requestAppPurchaseAsync: js.Function1[scala.Boolean, winrtLib.WindowsNs.FoundationNs.IAsyncOperation[java.lang.String]],
    requestProductPurchaseAsync: js.Function2[
      java.lang.String, 
      scala.Boolean, 
      winrtLib.WindowsNs.FoundationNs.IAsyncOperation[java.lang.String]
    ]
  ): ICurrentApp = {
    val __obj = js.Dynamic.literal(appId = appId, getAppReceiptAsync = getAppReceiptAsync, getProductReceiptAsync = getProductReceiptAsync, licenseInformation = licenseInformation, linkUri = linkUri, loadListingInformationAsync = loadListingInformationAsync, requestAppPurchaseAsync = requestAppPurchaseAsync, requestProductPurchaseAsync = requestProductPurchaseAsync)
  
    __obj.asInstanceOf[ICurrentApp]
  }
}


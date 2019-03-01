package typings
package winrtLib.WindowsNs.ApplicationModelNs.StoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILicenseInformation extends js.Object {
  var expirationDate: stdLib.Date
  var isActive: scala.Boolean
  var isTrial: scala.Boolean
  var onlicensechanged: js.Any
  var productLicenses: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, ProductLicense]
}

object ILicenseInformation {
  @scala.inline
  def apply(
    expirationDate: stdLib.Date,
    isActive: scala.Boolean,
    isTrial: scala.Boolean,
    onlicensechanged: js.Any,
    productLicenses: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, ProductLicense]
  ): ILicenseInformation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("expirationDate")(expirationDate)
    __obj.updateDynamic("isActive")(isActive)
    __obj.updateDynamic("isTrial")(isTrial)
    __obj.updateDynamic("onlicensechanged")(onlicensechanged)
    __obj.updateDynamic("productLicenses")(productLicenses)
    __obj.asInstanceOf[ILicenseInformation]
  }
}


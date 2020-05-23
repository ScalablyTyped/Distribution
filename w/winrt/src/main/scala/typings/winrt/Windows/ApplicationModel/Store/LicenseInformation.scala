package typings.winrt.Windows.ApplicationModel.Store

import typings.std.Date
import typings.winrt.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LicenseInformation extends ILicenseInformation

object LicenseInformation {
  @scala.inline
  def apply(
    expirationDate: Date,
    isActive: Boolean,
    isTrial: Boolean,
    onlicensechanged: js.Any,
    productLicenses: IMapView[String, ProductLicense]
  ): LicenseInformation = {
    val __obj = js.Dynamic.literal(expirationDate = expirationDate.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isTrial = isTrial.asInstanceOf[js.Any], onlicensechanged = onlicensechanged.asInstanceOf[js.Any], productLicenses = productLicenses.asInstanceOf[js.Any])
    __obj.asInstanceOf[LicenseInformation]
  }
}


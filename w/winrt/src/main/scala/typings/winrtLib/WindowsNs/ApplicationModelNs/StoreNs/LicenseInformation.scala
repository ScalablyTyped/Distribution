package typings
package winrtLib.WindowsNs.ApplicationModelNs.StoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Store.LicenseInformation")
@js.native
class LicenseInformation () extends ILicenseInformation {
  /* CompleteClass */
  override var expirationDate: stdLib.Date = js.native
  /* CompleteClass */
  override var isActive: scala.Boolean = js.native
  /* CompleteClass */
  override var isTrial: scala.Boolean = js.native
  /* CompleteClass */
  override var onlicensechanged: js.Any = js.native
  /* CompleteClass */
  override var productLicenses: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, ProductLicense] = js.native
}


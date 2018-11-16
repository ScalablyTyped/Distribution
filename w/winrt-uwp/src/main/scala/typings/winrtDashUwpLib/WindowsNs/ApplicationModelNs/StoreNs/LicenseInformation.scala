package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to the current app's license metadata. */
@JSGlobal("Windows.ApplicationModel.Store.LicenseInformation")
@js.native
abstract class LicenseInformation () extends js.Object {
  /** Gets the license expiration date and time relative to the system clock. */
  var expirationDate: stdLib.Date = js.native
  /** Gets a value that indicates whether the license is active. */
  var isActive: scala.Boolean = js.native
  /** Gets a value that indicates whether the license is a trial license. */
  var isTrial: scala.Boolean = js.native
  /** Raises a notification event when the status of the app's license changes. */
  @JSName("onlicensechanged")
  var onlicensechanged_Original: LicenseChangedEventHandler = js.native
  /** Gets the associative list of licenses for in-app products that a user is currently entitled to. */
  var productLicenses: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, ProductLicense] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_licensechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.licensechanged,
    listener: LicenseChangedEventHandler
  ): scala.Unit = js.native
  /** Raises a notification event when the status of the app's license changes. */
  def onlicensechanged(ev: winrtDashUwpLib.WindowsNs.WinRTEvent[scala.Unit]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_licensechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.licensechanged,
    listener: LicenseChangedEventHandler
  ): scala.Unit = js.native
}


package typings.winrtDashUwp.Windows.ApplicationModel.Store

import typings.std.Date
import typings.winrtDashUwp.Windows.Foundation.Collections.IMapView
import typings.winrtDashUwp.Windows.Foundation.EventHandler
import typings.winrtDashUwp.Windows.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.licensechanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to the current app's license metadata. */
@JSGlobal("Windows.ApplicationModel.Store.LicenseInformation")
@js.native
abstract class LicenseInformation () extends js.Object {
  /** Gets the license expiration date and time relative to the system clock. */
  var expirationDate: Date = js.native
  /** Gets a value that indicates whether the license is active. */
  var isActive: Boolean = js.native
  /** Gets a value that indicates whether the license is a trial license. */
  var isTrial: Boolean = js.native
  /** Raises a notification event when the status of the app's license changes. */
  @JSName("onlicensechanged")
  var onlicensechanged_Original: LicenseChangedEventHandler = js.native
  /** Gets the associative list of licenses for in-app products that a user is currently entitled to. */
  var productLicenses: IMapView[String, ProductLicense] = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_licensechanged(`type`: licensechanged, listener: LicenseChangedEventHandler): Unit = js.native
  /** Raises a notification event when the status of the app's license changes. */
  def onlicensechanged(ev: WinRTEvent[Unit]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_licensechanged(`type`: licensechanged, listener: LicenseChangedEventHandler): Unit = js.native
}


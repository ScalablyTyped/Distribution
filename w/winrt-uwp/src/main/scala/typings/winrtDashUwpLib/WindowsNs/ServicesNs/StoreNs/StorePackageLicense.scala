package typings
package winrtDashUwpLib.WindowsNs.ServicesNs.StoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides license info for a downloadable content (DLC) package for the current app. */
@JSGlobal("Windows.Services.Store.StorePackageLicense")
@js.native
abstract class StorePackageLicense () extends js.Object {
  /** Gets a value that indicates whether the license is valid. */
  var isValid: scala.Boolean = js.native
  /** Raised when user no longer has rights to the license on the current device (for example, the user has acquired the license on a different device). */
  @JSName("onlicenselost")
  var onlicenselost_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[StorePackageLicense, js.Object] = js.native
  /** Gets the downloadable content (DLC) package that is associated with the license. */
  var `package`: winrtDashUwpLib.WindowsNs.ApplicationModelNs.Package = js.native
  /** Closes and releases any resources used by this StorePackageLicense. */
  def close(): scala.Unit = js.native
  /** Raised when user no longer has rights to the license on the current device (for example, the user has acquired the license on a different device). */
  def onlicenselost(ev: js.Object with winrtDashUwpLib.WindowsNs.WinRTEvent[StorePackageLicense]): scala.Unit = js.native
  /** Releases the license for the downloadable content (DLC) package. */
  def releaseLicense(): scala.Unit = js.native
}


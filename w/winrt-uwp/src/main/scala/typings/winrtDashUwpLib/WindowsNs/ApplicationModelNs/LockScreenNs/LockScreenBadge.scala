package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.LockScreenNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a lock screen badge for an app. */
@JSGlobal("Windows.ApplicationModel.LockScreen.LockScreenBadge")
@js.native
abstract class LockScreenBadge () extends js.Object {
  /** Gets the name. */
  var automationName: java.lang.String = js.native
  /** Gets the glyph to display. */
  var glyph: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream = js.native
  /** Gets the logo to display with the badge. */
  var logo: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream = js.native
  /** Gets the number to display with the badge. */
  var number: scala.Double = js.native
  /** Launches the app corresponding to the badge. */
  def launchApp(): scala.Unit = js.native
}


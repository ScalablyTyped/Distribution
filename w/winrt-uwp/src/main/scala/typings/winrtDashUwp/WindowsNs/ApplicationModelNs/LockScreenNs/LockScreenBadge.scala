package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.LockScreenNs

import typings.winrtDashUwp.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a lock screen badge for an app. */
@JSGlobal("Windows.ApplicationModel.LockScreen.LockScreenBadge")
@js.native
abstract class LockScreenBadge () extends js.Object {
  /** Gets the name. */
  var automationName: String = js.native
  /** Gets the glyph to display. */
  var glyph: IRandomAccessStream = js.native
  /** Gets the logo to display with the badge. */
  var logo: IRandomAccessStream = js.native
  /** Gets the number to display with the badge. */
  var number: Double = js.native
  /** Launches the app corresponding to the badge. */
  def launchApp(): Unit = js.native
}


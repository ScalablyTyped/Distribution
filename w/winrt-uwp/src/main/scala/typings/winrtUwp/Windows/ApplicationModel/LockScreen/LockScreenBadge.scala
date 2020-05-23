package typings.winrtUwp.Windows.ApplicationModel.LockScreen

import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a lock screen badge for an app. */
trait LockScreenBadge extends js.Object {
  /** Gets the name. */
  var automationName: String
  /** Gets the glyph to display. */
  var glyph: IRandomAccessStream
  /** Gets the logo to display with the badge. */
  var logo: IRandomAccessStream
  /** Gets the number to display with the badge. */
  var number: Double
  /** Launches the app corresponding to the badge. */
  def launchApp(): Unit
}

object LockScreenBadge {
  @scala.inline
  def apply(
    automationName: String,
    glyph: IRandomAccessStream,
    launchApp: () => Unit,
    logo: IRandomAccessStream,
    number: Double
  ): LockScreenBadge = {
    val __obj = js.Dynamic.literal(automationName = automationName.asInstanceOf[js.Any], glyph = glyph.asInstanceOf[js.Any], launchApp = js.Any.fromFunction0(launchApp), logo = logo.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[LockScreenBadge]
  }
}


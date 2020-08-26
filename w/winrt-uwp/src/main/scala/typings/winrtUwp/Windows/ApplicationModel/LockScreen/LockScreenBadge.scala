package typings.winrtUwp.Windows.ApplicationModel.LockScreen

import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a lock screen badge for an app. */
@js.native
trait LockScreenBadge extends js.Object {
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
  @scala.inline
  implicit class LockScreenBadgeOps[Self <: LockScreenBadge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutomationName(value: String): Self = this.set("automationName", value.asInstanceOf[js.Any])
    @scala.inline
    def setGlyph(value: IRandomAccessStream): Self = this.set("glyph", value.asInstanceOf[js.Any])
    @scala.inline
    def setLaunchApp(value: () => Unit): Self = this.set("launchApp", js.Any.fromFunction0(value))
    @scala.inline
    def setLogo(value: IRandomAccessStream): Self = this.set("logo", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumber(value: Double): Self = this.set("number", value.asInstanceOf[js.Any])
  }
  
}


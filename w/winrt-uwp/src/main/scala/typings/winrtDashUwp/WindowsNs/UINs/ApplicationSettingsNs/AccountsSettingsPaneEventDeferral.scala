package typings.winrtDashUwp.WindowsNs.UINs.ApplicationSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables the app to signal when it has finished populating command collections while handling the AccountCommandsRequested event. */
@JSGlobal("Windows.UI.ApplicationSettings.AccountsSettingsPaneEventDeferral")
@js.native
abstract class AccountsSettingsPaneEventDeferral () extends js.Object {
  /** Signals that the app has finished populating command collections while handling the AccountCommandsRequested event. */
  def complete(): Unit = js.native
}


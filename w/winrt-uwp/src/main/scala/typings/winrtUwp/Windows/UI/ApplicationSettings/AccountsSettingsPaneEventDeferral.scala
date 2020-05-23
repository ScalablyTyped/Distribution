package typings.winrtUwp.Windows.UI.ApplicationSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables the app to signal when it has finished populating command collections while handling the AccountCommandsRequested event. */
trait AccountsSettingsPaneEventDeferral extends js.Object {
  /** Signals that the app has finished populating command collections while handling the AccountCommandsRequested event. */
  def complete(): Unit
}

object AccountsSettingsPaneEventDeferral {
  @scala.inline
  def apply(complete: () => Unit): AccountsSettingsPaneEventDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[AccountsSettingsPaneEventDeferral]
  }
}


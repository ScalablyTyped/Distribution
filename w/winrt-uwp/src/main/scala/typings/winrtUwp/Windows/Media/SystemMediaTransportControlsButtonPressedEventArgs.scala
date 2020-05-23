package typings.winrtUwp.Windows.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the SystemMediaTransportControls.ButtonPressed event. */
trait SystemMediaTransportControlsButtonPressedEventArgs extends js.Object {
  /** Gets the button on the SystemMediaTransportControls that was pressed. */
  var button: SystemMediaTransportControlsButton
}

object SystemMediaTransportControlsButtonPressedEventArgs {
  @scala.inline
  def apply(button: SystemMediaTransportControlsButton): SystemMediaTransportControlsButtonPressedEventArgs = {
    val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemMediaTransportControlsButtonPressedEventArgs]
  }
}


package typings.winrtUwp.Windows.Gaming.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the current state of the controller. */
trait GamepadReading extends js.Object {
  /** The state of the controller buttons. */
  var buttons: GamepadButtons
  /** The position of the left thumbstick on the X-asxis. The value is between -1.0 and 1.0. */
  var leftThumbstickX: Double
  /** The position of the left thumbstick on the Y-axis.The value is between -1.0 and 1.0. */
  var leftThumbstickY: Double
  /** The position of the left trigger. The value is between 0.0 (not depressed) and 1.0 (fully depressed). */
  var leftTrigger: Double
  /** The position of the right thumbstick on the X-axis.The value is between -1.0 and 1.0. */
  var rightThumbstickX: Double
  /** The position of the right thumbstick on the Y-axis. The value is between -1.0 and 1.0. */
  var rightThumbstickY: Double
  /** The position of the right trigger. The value is between 0.0 (not depressed) and 1.0 (fully depressed). */
  var rightTrigger: Double
  /** Time when the state was retrieved from the controller. */
  var timestamp: Double
}

object GamepadReading {
  @scala.inline
  def apply(
    buttons: GamepadButtons,
    leftThumbstickX: Double,
    leftThumbstickY: Double,
    leftTrigger: Double,
    rightThumbstickX: Double,
    rightThumbstickY: Double,
    rightTrigger: Double,
    timestamp: Double
  ): GamepadReading = {
    val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any], leftThumbstickX = leftThumbstickX.asInstanceOf[js.Any], leftThumbstickY = leftThumbstickY.asInstanceOf[js.Any], leftTrigger = leftTrigger.asInstanceOf[js.Any], rightThumbstickX = rightThumbstickX.asInstanceOf[js.Any], rightThumbstickY = rightThumbstickY.asInstanceOf[js.Any], rightTrigger = rightTrigger.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[GamepadReading]
  }
}


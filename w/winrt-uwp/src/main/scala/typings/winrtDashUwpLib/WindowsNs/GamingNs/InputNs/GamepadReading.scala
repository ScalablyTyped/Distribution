package typings
package winrtDashUwpLib.WindowsNs.GamingNs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the current state of the controller. */
trait GamepadReading extends js.Object {
  /** The state of the controller buttons. */
  var buttons: GamepadButtons
  /** The position of the left thumbstick on the X-asxis. The value is between -1.0 and 1.0. */
  var leftThumbstickX: scala.Double
  /** The position of the left thumbstick on the Y-axis.The value is between -1.0 and 1.0. */
  var leftThumbstickY: scala.Double
  /** The position of the left trigger. The value is between 0.0 (not depressed) and 1.0 (fully depressed). */
  var leftTrigger: scala.Double
  /** The position of the right thumbstick on the X-axis.The value is between -1.0 and 1.0. */
  var rightThumbstickX: scala.Double
  /** The position of the right thumbstick on the Y-axis. The value is between -1.0 and 1.0. */
  var rightThumbstickY: scala.Double
  /** The position of the right trigger. The value is between 0.0 (not depressed) and 1.0 (fully depressed). */
  var rightTrigger: scala.Double
  /** Time when the state was retrieved from the controller. */
  var timestamp: scala.Double
}

object GamepadReading {
  @scala.inline
  def apply(
    buttons: GamepadButtons,
    leftThumbstickX: scala.Double,
    leftThumbstickY: scala.Double,
    leftTrigger: scala.Double,
    rightThumbstickX: scala.Double,
    rightThumbstickY: scala.Double,
    rightTrigger: scala.Double,
    timestamp: scala.Double
  ): GamepadReading = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("buttons")(buttons)
    __obj.updateDynamic("leftThumbstickX")(leftThumbstickX)
    __obj.updateDynamic("leftThumbstickY")(leftThumbstickY)
    __obj.updateDynamic("leftTrigger")(leftTrigger)
    __obj.updateDynamic("rightThumbstickX")(rightThumbstickX)
    __obj.updateDynamic("rightThumbstickY")(rightThumbstickY)
    __obj.updateDynamic("rightTrigger")(rightTrigger)
    __obj.updateDynamic("timestamp")(timestamp)
    __obj.asInstanceOf[GamepadReading]
  }
}


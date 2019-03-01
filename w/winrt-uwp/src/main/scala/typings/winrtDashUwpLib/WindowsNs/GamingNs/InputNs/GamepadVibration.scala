package typings
package winrtDashUwpLib.WindowsNs.GamingNs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes the speed of the gamepad's four available vibration motors. */
trait GamepadVibration extends js.Object {
  /** The level of the left vibration motor. Valid values are between 0.0 and 1.0, where 0.0 signifies no motor use and 1.0 signifies max vibration. */
  var leftMotor: scala.Double
  /** The left trigger vibration level. Valid values are between 0.0 and 1.0, where 0.0 signifies no motor use and 1.0 signifies max vibration. */
  var leftTrigger: scala.Double
  /** The level of the right vibration motor. Valid values are between 0.0 and 1.0, where 0.0 signifies no motor use and 1.0 signifies max vibration. */
  var rightMotor: scala.Double
  /** The right trigger vibration level, Valid values are between 0.0 and 1.0, where 0.0 signifies no motor use and 1.0 signifies max vibration. */
  var rightTrigger: scala.Double
}

object GamepadVibration {
  @scala.inline
  def apply(
    leftMotor: scala.Double,
    leftTrigger: scala.Double,
    rightMotor: scala.Double,
    rightTrigger: scala.Double
  ): GamepadVibration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("leftMotor")(leftMotor)
    __obj.updateDynamic("leftTrigger")(leftTrigger)
    __obj.updateDynamic("rightMotor")(rightMotor)
    __obj.updateDynamic("rightTrigger")(rightTrigger)
    __obj.asInstanceOf[GamepadVibration]
  }
}


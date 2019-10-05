package typings.winrtDashUwp.Windows.Gaming.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes the speed of the gamepad's four available vibration motors. */
trait GamepadVibration extends js.Object {
  /** The level of the left vibration motor. Valid values are between 0.0 and 1.0, where 0.0 signifies no motor use and 1.0 signifies max vibration. */
  var leftMotor: Double
  /** The left trigger vibration level. Valid values are between 0.0 and 1.0, where 0.0 signifies no motor use and 1.0 signifies max vibration. */
  var leftTrigger: Double
  /** The level of the right vibration motor. Valid values are between 0.0 and 1.0, where 0.0 signifies no motor use and 1.0 signifies max vibration. */
  var rightMotor: Double
  /** The right trigger vibration level, Valid values are between 0.0 and 1.0, where 0.0 signifies no motor use and 1.0 signifies max vibration. */
  var rightTrigger: Double
}

object GamepadVibration {
  @scala.inline
  def apply(leftMotor: Double, leftTrigger: Double, rightMotor: Double, rightTrigger: Double): GamepadVibration = {
    val __obj = js.Dynamic.literal(leftMotor = leftMotor, leftTrigger = leftTrigger, rightMotor = rightMotor, rightTrigger = rightTrigger)
  
    __obj.asInstanceOf[GamepadVibration]
  }
}


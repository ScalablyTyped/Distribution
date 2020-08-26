package typings.winrtUwp.Windows.Gaming.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes the speed of the gamepad's four available vibration motors. */
@js.native
trait GamepadVibration extends js.Object {
  /** The level of the left vibration motor. Valid values are between 0.0 and 1.0, where 0.0 signifies no motor use and 1.0 signifies max vibration. */
  var leftMotor: Double = js.native
  /** The left trigger vibration level. Valid values are between 0.0 and 1.0, where 0.0 signifies no motor use and 1.0 signifies max vibration. */
  var leftTrigger: Double = js.native
  /** The level of the right vibration motor. Valid values are between 0.0 and 1.0, where 0.0 signifies no motor use and 1.0 signifies max vibration. */
  var rightMotor: Double = js.native
  /** The right trigger vibration level, Valid values are between 0.0 and 1.0, where 0.0 signifies no motor use and 1.0 signifies max vibration. */
  var rightTrigger: Double = js.native
}

object GamepadVibration {
  @scala.inline
  def apply(leftMotor: Double, leftTrigger: Double, rightMotor: Double, rightTrigger: Double): GamepadVibration = {
    val __obj = js.Dynamic.literal(leftMotor = leftMotor.asInstanceOf[js.Any], leftTrigger = leftTrigger.asInstanceOf[js.Any], rightMotor = rightMotor.asInstanceOf[js.Any], rightTrigger = rightTrigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[GamepadVibration]
  }
  @scala.inline
  implicit class GamepadVibrationOps[Self <: GamepadVibration] (val x: Self) extends AnyVal {
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
    def setLeftMotor(value: Double): Self = this.set("leftMotor", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeftTrigger(value: Double): Self = this.set("leftTrigger", value.asInstanceOf[js.Any])
    @scala.inline
    def setRightMotor(value: Double): Self = this.set("rightMotor", value.asInstanceOf[js.Any])
    @scala.inline
    def setRightTrigger(value: Double): Self = this.set("rightTrigger", value.asInstanceOf[js.Any])
  }
  
}


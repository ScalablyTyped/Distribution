package typings.titanium.Titanium.UI.iOS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired every time the stepper value changes.
  */
trait StepperChangeEvent extends StepperBaseEvent {
  /**
    * The maximum value of the stepper.
    */
  var maximum: Double
  /**
    * The minimum value of the stepper.
    */
  var minimum: Double
  /**
    * The current value of the stepper.
    */
  var value: Double
}

object StepperChangeEvent {
  @scala.inline
  def apply(maximum: Double, minimum: Double, source: Stepper, value: Double): StepperChangeEvent = {
    val __obj = js.Dynamic.literal(maximum = maximum.asInstanceOf[js.Any], minimum = minimum.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepperChangeEvent]
  }
}


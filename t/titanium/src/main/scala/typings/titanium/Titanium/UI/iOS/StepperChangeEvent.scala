package typings.titanium.Titanium.UI.iOS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired every time the stepper value changes.
  */
@js.native
trait StepperChangeEvent extends StepperBaseEvent {
  
  /**
    * The maximum value of the stepper.
    */
  var maximum: Double = js.native
  
  /**
    * The minimum value of the stepper.
    */
  var minimum: Double = js.native
  
  /**
    * The current value of the stepper.
    */
  var value: Double = js.native
}
object StepperChangeEvent {
  
  @scala.inline
  def apply(maximum: Double, minimum: Double, source: Stepper, value: Double): StepperChangeEvent = {
    val __obj = js.Dynamic.literal(maximum = maximum.asInstanceOf[js.Any], minimum = minimum.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepperChangeEvent]
  }
  
  @scala.inline
  implicit class StepperChangeEventMutableBuilder[Self <: StepperChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaximum(value: Double): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimum(value: Double): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

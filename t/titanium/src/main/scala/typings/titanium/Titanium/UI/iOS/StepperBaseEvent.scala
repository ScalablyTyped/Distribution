package typings.titanium.Titanium.UI.iOS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Base event for class Titanium.UI.iOS.Stepper
			 */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ trait StepperBaseEvent extends js.Object {
  /**
  				 * Source object that fired the event.
  				 */
  var source: Stepper
}

object StepperBaseEvent {
  @scala.inline
  def apply(source: Stepper): StepperBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepperBaseEvent]
  }
}


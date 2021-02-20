package typings.titanium.Titanium.UI.iOS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base event for class Titanium.UI.iOS.Stepper
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait StepperBaseEvent extends StObject {
  
  /**
    * Source object that fired the event.
    */
  var source: Stepper = js.native
}
object StepperBaseEvent {
  
  @scala.inline
  def apply(source: Stepper): StepperBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepperBaseEvent]
  }
  
  @scala.inline
  implicit class StepperBaseEventMutableBuilder[Self <: StepperBaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: Stepper): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}

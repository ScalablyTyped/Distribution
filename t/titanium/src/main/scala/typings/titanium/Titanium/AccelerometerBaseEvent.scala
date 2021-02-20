package typings.titanium.Titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base event for class Titanium.Accelerometer
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait AccelerometerBaseEvent extends StObject {
  
  /**
    * Source object that fired the event.
    */
  var source: Accelerometer = js.native
}
object AccelerometerBaseEvent {
  
  @scala.inline
  def apply(source: Accelerometer): AccelerometerBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccelerometerBaseEvent]
  }
  
  @scala.inline
  implicit class AccelerometerBaseEventMutableBuilder[Self <: AccelerometerBaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: Accelerometer): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}

package typings.titanium.Titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base event for class Titanium.Gesture
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait GestureBaseEvent extends StObject {
  
  /**
    * Source object that fired the event.
    */
  var source: Gesture = js.native
}
object GestureBaseEvent {
  
  @scala.inline
  def apply(source: Gesture): GestureBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[GestureBaseEvent]
  }
  
  @scala.inline
  implicit class GestureBaseEventMutableBuilder[Self <: GestureBaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: Gesture): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}

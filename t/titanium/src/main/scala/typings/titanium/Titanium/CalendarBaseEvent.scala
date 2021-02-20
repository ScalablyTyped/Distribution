package typings.titanium.Titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base event for class Titanium.Calendar
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait CalendarBaseEvent extends StObject {
  
  /**
    * Source object that fired the event.
    */
  var source: Calendar = js.native
}
object CalendarBaseEvent {
  
  @scala.inline
  def apply(source: Calendar): CalendarBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarBaseEvent]
  }
  
  @scala.inline
  implicit class CalendarBaseEventMutableBuilder[Self <: CalendarBaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: Calendar): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}

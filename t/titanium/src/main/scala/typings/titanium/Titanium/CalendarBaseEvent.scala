package typings.titanium.Titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Base event for class Titanium.Calendar
	 */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ trait CalendarBaseEvent extends js.Object {
  /**
  		 * Source object that fired the event.
  		 */
  var source: Calendar
}

object CalendarBaseEvent {
  @scala.inline
  def apply(source: Calendar): CalendarBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarBaseEvent]
  }
}


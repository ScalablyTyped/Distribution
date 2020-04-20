package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Base event for class Titanium.UI.DashboardView
		 */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ trait DashboardViewBaseEvent extends js.Object {
  /**
  			 * Source object that fired the event.
  			 */
  var source: DashboardView
}

object DashboardViewBaseEvent {
  @scala.inline
  def apply(source: DashboardView): DashboardViewBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashboardViewBaseEvent]
  }
}


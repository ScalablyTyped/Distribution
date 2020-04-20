package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Base event for class Titanium.UI.ListView
		 */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ trait ListViewBaseEvent extends js.Object {
  /**
  			 * Source object that fired the event.
  			 */
  var source: ListView
}

object ListViewBaseEvent {
  @scala.inline
  def apply(source: ListView): ListViewBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListViewBaseEvent]
  }
}


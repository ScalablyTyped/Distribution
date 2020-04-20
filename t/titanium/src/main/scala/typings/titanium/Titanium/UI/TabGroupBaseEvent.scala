package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Base event for class Titanium.UI.TabGroup
		 */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ trait TabGroupBaseEvent extends js.Object {
  /**
  			 * Source object that fired the event.
  			 */
  var source: TabGroup
}

object TabGroupBaseEvent {
  @scala.inline
  def apply(source: TabGroup): TabGroupBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabGroupBaseEvent]
  }
}


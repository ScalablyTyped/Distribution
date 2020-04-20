package typings.titanium.Titanium.UI.iPad

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Base event for class Titanium.UI.iPad.Popover
			 */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ trait PopoverBaseEvent extends js.Object {
  /**
  				 * Source object that fired the event.
  				 */
  var source: Popover
}

object PopoverBaseEvent {
  @scala.inline
  def apply(source: Popover): PopoverBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopoverBaseEvent]
  }
}


package typings.titanium.Titanium.UI.iOS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Base event for class Titanium.UI.iOS.Toolbar
			 */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ trait ToolbarBaseEvent extends js.Object {
  /**
  				 * Source object that fired the event.
  				 */
  var source: Toolbar
}

object ToolbarBaseEvent {
  @scala.inline
  def apply(source: Toolbar): ToolbarBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolbarBaseEvent]
  }
}


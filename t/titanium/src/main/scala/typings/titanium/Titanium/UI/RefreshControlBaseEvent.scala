package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Base event for class Titanium.UI.RefreshControl
		 */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ trait RefreshControlBaseEvent extends js.Object {
  /**
  			 * Source object that fired the event.
  			 */
  var source: RefreshControl
}

object RefreshControlBaseEvent {
  @scala.inline
  def apply(source: RefreshControl): RefreshControlBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshControlBaseEvent]
  }
}


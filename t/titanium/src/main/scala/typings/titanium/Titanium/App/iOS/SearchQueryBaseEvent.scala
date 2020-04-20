package typings.titanium.Titanium.App.iOS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Base event for class Titanium.App.iOS.SearchQuery
			 */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ trait SearchQueryBaseEvent extends js.Object {
  /**
  				 * Source object that fired the event.
  				 */
  var source: SearchQuery
}

object SearchQueryBaseEvent {
  @scala.inline
  def apply(source: SearchQuery): SearchQueryBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchQueryBaseEvent]
  }
}


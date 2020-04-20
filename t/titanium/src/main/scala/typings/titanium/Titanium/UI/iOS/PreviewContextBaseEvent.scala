package typings.titanium.Titanium.UI.iOS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Base event for class Titanium.UI.iOS.PreviewContext
			 */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ trait PreviewContextBaseEvent extends js.Object {
  /**
  				 * Source object that fired the event.
  				 */
  var source: PreviewContext
}

object PreviewContextBaseEvent {
  @scala.inline
  def apply(source: PreviewContext): PreviewContextBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviewContextBaseEvent]
  }
}


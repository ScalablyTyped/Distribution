package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Base event for class Titanium.UI.ScrollView
		 */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ trait ScrollViewBaseEvent extends js.Object {
  /**
  			 * Source object that fired the event.
  			 */
  var source: ScrollView
}

object ScrollViewBaseEvent {
  @scala.inline
  def apply(source: ScrollView): ScrollViewBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollViewBaseEvent]
  }
}


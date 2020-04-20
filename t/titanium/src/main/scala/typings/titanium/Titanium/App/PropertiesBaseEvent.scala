package typings.titanium.Titanium.App

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Base event for class Titanium.App.Properties
		 */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ trait PropertiesBaseEvent extends js.Object {
  /**
  			 * Source object that fired the event.
  			 */
  var source: Properties
}

object PropertiesBaseEvent {
  @scala.inline
  def apply(source: Properties): PropertiesBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesBaseEvent]
  }
}


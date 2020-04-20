package typings.titanium.Titanium.App

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Base event for class Titanium.App.iOS
		 */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ trait iOSBaseEvent extends js.Object {
  /**
  			 * Source object that fired the event.
  			 */
  var source: iOS
}

object iOSBaseEvent {
  @scala.inline
  def apply(source: iOS): iOSBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[iOSBaseEvent]
  }
}


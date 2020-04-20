package typings.titanium.Titanium.Android

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Base event for class Titanium.Android.Activity
		 */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ trait ActivityBaseEvent extends js.Object {
  /**
  			 * Source object that fired the event.
  			 */
  var source: Activity
}

object ActivityBaseEvent {
  @scala.inline
  def apply(source: Activity): ActivityBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityBaseEvent]
  }
}


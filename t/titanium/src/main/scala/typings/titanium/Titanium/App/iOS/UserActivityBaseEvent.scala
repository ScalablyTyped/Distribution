package typings.titanium.Titanium.App.iOS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Base event for class Titanium.App.iOS.UserActivity
			 */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ trait UserActivityBaseEvent extends js.Object {
  /**
  				 * Source object that fired the event.
  				 */
  var source: UserActivity
}

object UserActivityBaseEvent {
  @scala.inline
  def apply(source: UserActivity): UserActivityBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserActivityBaseEvent]
  }
}


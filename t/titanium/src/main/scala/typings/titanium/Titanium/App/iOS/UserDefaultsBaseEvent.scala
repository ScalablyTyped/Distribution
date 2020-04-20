package typings.titanium.Titanium.App.iOS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Base event for class Titanium.App.iOS.UserDefaults
			 */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ trait UserDefaultsBaseEvent extends js.Object {
  /**
  				 * Source object that fired the event.
  				 */
  var source: UserDefaults
}

object UserDefaultsBaseEvent {
  @scala.inline
  def apply(source: UserDefaults): UserDefaultsBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserDefaultsBaseEvent]
  }
}


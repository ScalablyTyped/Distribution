package typings.titanium.Titanium.Android

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Base event for class Titanium.Android.MenuItem
		 */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ trait MenuItemBaseEvent extends js.Object {
  /**
  			 * Source object that fired the event.
  			 */
  var source: MenuItem
}

object MenuItemBaseEvent {
  @scala.inline
  def apply(source: MenuItem): MenuItemBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuItemBaseEvent]
  }
}


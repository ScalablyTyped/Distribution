package typings.titanium.Titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Base event for class Titanium.Contacts
	 */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ trait ContactsBaseEvent extends js.Object {
  /**
  		 * Source object that fired the event.
  		 */
  var source: Contacts
}

object ContactsBaseEvent {
  @scala.inline
  def apply(source: Contacts): ContactsBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactsBaseEvent]
  }
}


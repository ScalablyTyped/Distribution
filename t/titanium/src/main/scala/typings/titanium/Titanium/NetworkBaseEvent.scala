package typings.titanium.Titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Base event for class Titanium.Network
	 */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ trait NetworkBaseEvent extends js.Object {
  /**
  		 * Source object that fired the event.
  		 */
  var source: Network
}

object NetworkBaseEvent {
  @scala.inline
  def apply(source: Network): NetworkBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkBaseEvent]
  }
}


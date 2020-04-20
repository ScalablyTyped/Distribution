package typings.titanium.Titanium.Network

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Base event for class Titanium.Network.BonjourService
		 */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ trait BonjourServiceBaseEvent extends js.Object {
  /**
  			 * Source object that fired the event.
  			 */
  var source: BonjourService
}

object BonjourServiceBaseEvent {
  @scala.inline
  def apply(source: BonjourService): BonjourServiceBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[BonjourServiceBaseEvent]
  }
}


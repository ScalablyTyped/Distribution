package typings.titanium.Titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Base event for class Titanium.WatchSession
	 */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ trait WatchSessionBaseEvent extends js.Object {
  /**
  		 * Source object that fired the event.
  		 */
  var source: WatchSession
}

object WatchSessionBaseEvent {
  @scala.inline
  def apply(source: WatchSession): WatchSessionBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchSessionBaseEvent]
  }
}


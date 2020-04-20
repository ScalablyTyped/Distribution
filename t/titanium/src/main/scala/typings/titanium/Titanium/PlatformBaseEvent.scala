package typings.titanium.Titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Base event for class Titanium.Platform
	 */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ trait PlatformBaseEvent extends js.Object {
  /**
  		 * Source object that fired the event.
  		 */
  var source: Platform
}

object PlatformBaseEvent {
  @scala.inline
  def apply(source: Platform): PlatformBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformBaseEvent]
  }
}


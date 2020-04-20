package typings.titanium.Titanium.UI.iOS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Base event for class Titanium.UI.iOS.CollisionBehavior
			 */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ trait CollisionBehaviorBaseEvent extends js.Object {
  /**
  				 * Source object that fired the event.
  				 */
  var source: CollisionBehavior
}

object CollisionBehaviorBaseEvent {
  @scala.inline
  def apply(source: CollisionBehavior): CollisionBehaviorBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollisionBehaviorBaseEvent]
  }
}


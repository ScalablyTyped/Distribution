package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Base event for class Titanium.UI.Animation
		 */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ trait AnimationBaseEvent extends js.Object {
  /**
  			 * Source object that fired the event.
  			 */
  var source: Animation
}

object AnimationBaseEvent {
  @scala.inline
  def apply(source: Animation): AnimationBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationBaseEvent]
  }
}


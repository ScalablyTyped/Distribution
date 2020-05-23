package typings.titanium.Titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base event for class Titanium.Gesture
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ trait GestureBaseEvent extends js.Object {
  /**
    * Source object that fired the event.
    */
  var source: Gesture
}

object GestureBaseEvent {
  @scala.inline
  def apply(source: Gesture): GestureBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[GestureBaseEvent]
  }
}


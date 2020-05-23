package typings.titanium.Titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base event for class Titanium.Media
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ trait MediaBaseEvent extends js.Object {
  /**
    * Source object that fired the event.
    */
  var source: Media
}

object MediaBaseEvent {
  @scala.inline
  def apply(source: Media): MediaBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaBaseEvent]
  }
}


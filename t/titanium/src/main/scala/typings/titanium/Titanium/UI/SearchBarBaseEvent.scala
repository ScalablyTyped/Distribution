package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base event for class Titanium.UI.SearchBar
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ trait SearchBarBaseEvent extends js.Object {
  /**
    * Source object that fired the event.
    */
  var source: SearchBar
}

object SearchBarBaseEvent {
  @scala.inline
  def apply(source: SearchBar): SearchBarBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchBarBaseEvent]
  }
}


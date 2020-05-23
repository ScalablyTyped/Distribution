package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base event for class Titanium.UI.TabbedBar
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ trait TabbedBarBaseEvent extends js.Object {
  /**
    * Source object that fired the event.
    */
  var source: TabbedBar
}

object TabbedBarBaseEvent {
  @scala.inline
  def apply(source: TabbedBar): TabbedBarBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabbedBarBaseEvent]
  }
}


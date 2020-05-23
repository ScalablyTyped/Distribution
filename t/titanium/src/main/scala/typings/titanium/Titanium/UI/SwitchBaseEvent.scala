package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base event for class Titanium.UI.Switch
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ trait SwitchBaseEvent extends js.Object {
  /**
    * Source object that fired the event.
    */
  var source: Switch
}

object SwitchBaseEvent {
  @scala.inline
  def apply(source: Switch): SwitchBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwitchBaseEvent]
  }
}


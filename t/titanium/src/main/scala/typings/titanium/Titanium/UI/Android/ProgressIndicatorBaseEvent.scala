package typings.titanium.Titanium.UI.Android

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base event for class Titanium.UI.Android.ProgressIndicator
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ trait ProgressIndicatorBaseEvent extends js.Object {
  /**
    * Source object that fired the event.
    */
  var source: ProgressIndicator
}

object ProgressIndicatorBaseEvent {
  @scala.inline
  def apply(source: ProgressIndicator): ProgressIndicatorBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressIndicatorBaseEvent]
  }
}


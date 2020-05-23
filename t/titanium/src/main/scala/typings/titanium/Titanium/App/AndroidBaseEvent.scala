package typings.titanium.Titanium.App

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base event for class Titanium.App.Android
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ trait AndroidBaseEvent extends js.Object {
  /**
    * Source object that fired the event.
    */
  var source: Android
}

object AndroidBaseEvent {
  @scala.inline
  def apply(source: Android): AndroidBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[AndroidBaseEvent]
  }
}


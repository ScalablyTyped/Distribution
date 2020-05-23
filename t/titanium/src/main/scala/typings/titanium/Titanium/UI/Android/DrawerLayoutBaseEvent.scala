package typings.titanium.Titanium.UI.Android

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base event for class Titanium.UI.Android.DrawerLayout
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ trait DrawerLayoutBaseEvent extends js.Object {
  /**
    * Source object that fired the event.
    */
  var source: DrawerLayout
}

object DrawerLayoutBaseEvent {
  @scala.inline
  def apply(source: DrawerLayout): DrawerLayoutBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerLayoutBaseEvent]
  }
}


package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base event for class Titanium.UI.DashboardItem
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ trait DashboardItemBaseEvent extends js.Object {
  /**
    * Source object that fired the event.
    */
  var source: DashboardItem
}

object DashboardItemBaseEvent {
  @scala.inline
  def apply(source: DashboardItem): DashboardItemBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashboardItemBaseEvent]
  }
}


package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base event for class Titanium.UI.DashboardItem
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait DashboardItemBaseEvent extends StObject {
  
  /**
    * Source object that fired the event.
    */
  var source: DashboardItem = js.native
}
object DashboardItemBaseEvent {
  
  @scala.inline
  def apply(source: DashboardItem): DashboardItemBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashboardItemBaseEvent]
  }
  
  @scala.inline
  implicit class DashboardItemBaseEventMutableBuilder[Self <: DashboardItemBaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: DashboardItem): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}

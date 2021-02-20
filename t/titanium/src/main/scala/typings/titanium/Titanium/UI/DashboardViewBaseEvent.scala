package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base event for class Titanium.UI.DashboardView
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait DashboardViewBaseEvent extends StObject {
  
  /**
    * Source object that fired the event.
    */
  var source: DashboardView = js.native
}
object DashboardViewBaseEvent {
  
  @scala.inline
  def apply(source: DashboardView): DashboardViewBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashboardViewBaseEvent]
  }
  
  @scala.inline
  implicit class DashboardViewBaseEventMutableBuilder[Self <: DashboardViewBaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: DashboardView): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}

package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base event for class Titanium.UI.NavigationWindow
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait NavigationWindowBaseEvent extends StObject {
  
  /**
    * Source object that fired the event.
    */
  var source: NavigationWindow = js.native
}
object NavigationWindowBaseEvent {
  
  @scala.inline
  def apply(source: NavigationWindow): NavigationWindowBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationWindowBaseEvent]
  }
  
  @scala.inline
  implicit class NavigationWindowBaseEventMutableBuilder[Self <: NavigationWindowBaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: NavigationWindow): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}

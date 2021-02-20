package typings.titanium.Titanium.UI.iOS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base event for class Titanium.UI.iOS.MenuPopup
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait MenuPopupBaseEvent extends StObject {
  
  /**
    * Source object that fired the event.
    */
  var source: MenuPopup = js.native
}
object MenuPopupBaseEvent {
  
  @scala.inline
  def apply(source: MenuPopup): MenuPopupBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuPopupBaseEvent]
  }
  
  @scala.inline
  implicit class MenuPopupBaseEventMutableBuilder[Self <: MenuPopupBaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: MenuPopup): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}

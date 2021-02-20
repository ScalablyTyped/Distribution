package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base event for class Titanium.UI.EmailDialog
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait EmailDialogBaseEvent extends StObject {
  
  /**
    * Source object that fired the event.
    */
  var source: EmailDialog = js.native
}
object EmailDialogBaseEvent {
  
  @scala.inline
  def apply(source: EmailDialog): EmailDialogBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailDialogBaseEvent]
  }
  
  @scala.inline
  implicit class EmailDialogBaseEventMutableBuilder[Self <: EmailDialogBaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: EmailDialog): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}

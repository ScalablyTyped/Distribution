package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base event for class Titanium.UI.AlertDialog
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait AlertDialogBaseEvent extends StObject {
  
  /**
    * Source object that fired the event.
    */
  var source: AlertDialog = js.native
}
object AlertDialogBaseEvent {
  
  @scala.inline
  def apply(source: AlertDialog): AlertDialogBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlertDialogBaseEvent]
  }
  
  @scala.inline
  implicit class AlertDialogBaseEventMutableBuilder[Self <: AlertDialogBaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: AlertDialog): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}

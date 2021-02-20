package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base event for class Titanium.UI.OptionDialog
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait OptionDialogBaseEvent extends StObject {
  
  /**
    * Source object that fired the event.
    */
  var source: OptionDialog = js.native
}
object OptionDialogBaseEvent {
  
  @scala.inline
  def apply(source: OptionDialog): OptionDialogBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionDialogBaseEvent]
  }
  
  @scala.inline
  implicit class OptionDialogBaseEventMutableBuilder[Self <: OptionDialogBaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: OptionDialog): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}

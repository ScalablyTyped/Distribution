package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base event for class Titanium.UI.Picker
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait PickerBaseEvent extends StObject {
  
  /**
    * Source object that fired the event.
    */
  var source: Picker = js.native
}
object PickerBaseEvent {
  
  @scala.inline
  def apply(source: Picker): PickerBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerBaseEvent]
  }
  
  @scala.inline
  implicit class PickerBaseEventMutableBuilder[Self <: PickerBaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: Picker): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}

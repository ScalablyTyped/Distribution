package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base event for class Titanium.UI.Switch
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait SwitchBaseEvent extends StObject {
  
  /**
    * Source object that fired the event.
    */
  var source: Switch = js.native
}
object SwitchBaseEvent {
  
  @scala.inline
  def apply(source: Switch): SwitchBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwitchBaseEvent]
  }
  
  @scala.inline
  implicit class SwitchBaseEventMutableBuilder[Self <: SwitchBaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: Switch): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}

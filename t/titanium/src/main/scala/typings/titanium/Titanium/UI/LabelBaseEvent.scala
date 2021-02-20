package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base event for class Titanium.UI.Label
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait LabelBaseEvent extends StObject {
  
  /**
    * Source object that fired the event.
    */
  var source: Label = js.native
}
object LabelBaseEvent {
  
  @scala.inline
  def apply(source: Label): LabelBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelBaseEvent]
  }
  
  @scala.inline
  implicit class LabelBaseEventMutableBuilder[Self <: LabelBaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: Label): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}

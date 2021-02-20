package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base event for class Titanium.UI.TextArea
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait TextAreaBaseEvent extends StObject {
  
  /**
    * Source object that fired the event.
    */
  var source: TextArea = js.native
}
object TextAreaBaseEvent {
  
  @scala.inline
  def apply(source: TextArea): TextAreaBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextAreaBaseEvent]
  }
  
  @scala.inline
  implicit class TextAreaBaseEventMutableBuilder[Self <: TextAreaBaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: TextArea): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}

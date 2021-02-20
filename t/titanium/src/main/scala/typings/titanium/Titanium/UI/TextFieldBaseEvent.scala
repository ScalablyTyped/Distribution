package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base event for class Titanium.UI.TextField
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait TextFieldBaseEvent extends StObject {
  
  /**
    * Source object that fired the event.
    */
  var source: TextField = js.native
}
object TextFieldBaseEvent {
  
  @scala.inline
  def apply(source: TextField): TextFieldBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextFieldBaseEvent]
  }
  
  @scala.inline
  implicit class TextFieldBaseEventMutableBuilder[Self <: TextFieldBaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: TextField): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}

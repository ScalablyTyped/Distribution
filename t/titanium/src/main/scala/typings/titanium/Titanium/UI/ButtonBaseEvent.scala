package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base event for class Titanium.UI.Button
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait ButtonBaseEvent extends StObject {
  
  /**
    * Source object that fired the event.
    */
  var source: Button = js.native
}
object ButtonBaseEvent {
  
  @scala.inline
  def apply(source: Button): ButtonBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonBaseEvent]
  }
  
  @scala.inline
  implicit class ButtonBaseEventMutableBuilder[Self <: ButtonBaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: Button): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}

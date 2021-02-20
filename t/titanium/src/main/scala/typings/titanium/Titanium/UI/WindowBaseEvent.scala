package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base event for class Titanium.UI.Window
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait WindowBaseEvent extends StObject {
  
  /**
    * Source object that fired the event.
    */
  var source: Window = js.native
}
object WindowBaseEvent {
  
  @scala.inline
  def apply(source: Window): WindowBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowBaseEvent]
  }
  
  @scala.inline
  implicit class WindowBaseEventMutableBuilder[Self <: WindowBaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: Window): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}

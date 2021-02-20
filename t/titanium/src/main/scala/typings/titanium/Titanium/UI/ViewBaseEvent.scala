package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base event for class Titanium.UI.View
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait ViewBaseEvent extends StObject {
  
  /**
    * Source object that fired the event.
    */
  var source: View = js.native
}
object ViewBaseEvent {
  
  @scala.inline
  def apply(source: View): ViewBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewBaseEvent]
  }
  
  @scala.inline
  implicit class ViewBaseEventMutableBuilder[Self <: ViewBaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: View): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}

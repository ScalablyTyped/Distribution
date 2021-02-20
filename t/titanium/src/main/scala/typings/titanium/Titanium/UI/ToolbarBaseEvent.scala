package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base event for class Titanium.UI.Toolbar
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait ToolbarBaseEvent extends StObject {
  
  /**
    * Source object that fired the event.
    */
  var source: Toolbar = js.native
}
object ToolbarBaseEvent {
  
  @scala.inline
  def apply(source: Toolbar): ToolbarBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolbarBaseEvent]
  }
  
  @scala.inline
  implicit class ToolbarBaseEventMutableBuilder[Self <: ToolbarBaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: Toolbar): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}

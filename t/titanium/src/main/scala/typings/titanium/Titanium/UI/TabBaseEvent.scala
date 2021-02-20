package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base event for class Titanium.UI.Tab
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait TabBaseEvent extends StObject {
  
  /**
    * Source object that fired the event.
    */
  var source: Tab = js.native
}
object TabBaseEvent {
  
  @scala.inline
  def apply(source: Tab): TabBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabBaseEvent]
  }
  
  @scala.inline
  implicit class TabBaseEventMutableBuilder[Self <: TabBaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: Tab): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}

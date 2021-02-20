package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base event for class Titanium.UI.TabGroup
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait TabGroupBaseEvent extends StObject {
  
  /**
    * Source object that fired the event.
    */
  var source: TabGroup = js.native
}
object TabGroupBaseEvent {
  
  @scala.inline
  def apply(source: TabGroup): TabGroupBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabGroupBaseEvent]
  }
  
  @scala.inline
  implicit class TabGroupBaseEventMutableBuilder[Self <: TabGroupBaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: TabGroup): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}

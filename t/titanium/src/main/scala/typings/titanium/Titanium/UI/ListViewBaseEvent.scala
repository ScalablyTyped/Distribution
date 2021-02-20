package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base event for class Titanium.UI.ListView
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait ListViewBaseEvent extends StObject {
  
  /**
    * Source object that fired the event.
    */
  var source: ListView = js.native
}
object ListViewBaseEvent {
  
  @scala.inline
  def apply(source: ListView): ListViewBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListViewBaseEvent]
  }
  
  @scala.inline
  implicit class ListViewBaseEventMutableBuilder[Self <: ListViewBaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: ListView): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}

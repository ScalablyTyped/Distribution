package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base event for class Titanium.UI.TableViewRow
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait TableViewRowBaseEvent extends StObject {
  
  /**
    * Source object that fired the event.
    */
  var source: TableViewRow = js.native
}
object TableViewRowBaseEvent {
  
  @scala.inline
  def apply(source: TableViewRow): TableViewRowBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableViewRowBaseEvent]
  }
  
  @scala.inline
  implicit class TableViewRowBaseEventMutableBuilder[Self <: TableViewRowBaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: TableViewRow): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}

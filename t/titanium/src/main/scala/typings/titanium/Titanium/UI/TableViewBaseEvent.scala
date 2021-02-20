package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base event for class Titanium.UI.TableView
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait TableViewBaseEvent extends StObject {
  
  /**
    * Source object that fired the event.
    */
  var source: TableView = js.native
}
object TableViewBaseEvent {
  
  @scala.inline
  def apply(source: TableView): TableViewBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableViewBaseEvent]
  }
  
  @scala.inline
  implicit class TableViewBaseEventMutableBuilder[Self <: TableViewBaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: TableView): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}

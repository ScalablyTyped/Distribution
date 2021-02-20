package typings.tableau.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableauEvent extends StObject {
  
  /** Gets the name of the event, which is a string, but is also one of the items in the TableauEventName enum. */
  def getEventName(): TableauEventName = js.native
  
  /** Gets the Viz object associated with the event. */
  def getViz(): Viz = js.native
}
object TableauEvent {
  
  @scala.inline
  def apply(getEventName: () => TableauEventName, getViz: () => Viz): TableauEvent = {
    val __obj = js.Dynamic.literal(getEventName = js.Any.fromFunction0(getEventName), getViz = js.Any.fromFunction0(getViz))
    __obj.asInstanceOf[TableauEvent]
  }
  
  @scala.inline
  implicit class TableauEventMutableBuilder[Self <: TableauEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetEventName(value: () => TableauEventName): Self = StObject.set(x, "getEventName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetViz(value: () => Viz): Self = StObject.set(x, "getViz", js.Any.fromFunction0(value))
  }
}

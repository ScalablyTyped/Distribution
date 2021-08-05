package typings.tableau.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableauEvent extends StObject {
  
  /** Gets the name of the event, which is a string, but is also one of the items in the TableauEventName enum. */
  def getEventName(): TableauEventName
  
  /** Gets the Viz object associated with the event. */
  def getViz(): Viz
}
object TableauEvent {
  
  inline def apply(getEventName: () => TableauEventName, getViz: () => Viz): TableauEvent = {
    val __obj = js.Dynamic.literal(getEventName = js.Any.fromFunction0(getEventName), getViz = js.Any.fromFunction0(getViz))
    __obj.asInstanceOf[TableauEvent]
  }
  
  extension [Self <: TableauEvent](x: Self) {
    
    inline def setGetEventName(value: () => TableauEventName): Self = StObject.set(x, "getEventName", js.Any.fromFunction0(value))
    
    inline def setGetViz(value: () => Viz): Self = StObject.set(x, "getViz", js.Any.fromFunction0(value))
  }
}

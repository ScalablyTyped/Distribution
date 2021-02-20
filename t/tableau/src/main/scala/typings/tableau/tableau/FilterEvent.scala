package typings.tableau.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterEvent extends TableauEvent {
  
  /** Gets the name of the field. */
  def getFieldName(): String = js.native
  
  /** Gets the Filter object associated with the event. */
  def getFilterAsync(): js.Promise[ConcreteFilter] = js.native
  
  /** Gets the Worksheet object associated with the event. */
  def getWorksheet(): Worksheet = js.native
}
object FilterEvent {
  
  @scala.inline
  def apply(
    getEventName: () => TableauEventName,
    getFieldName: () => String,
    getFilterAsync: () => js.Promise[ConcreteFilter],
    getViz: () => Viz,
    getWorksheet: () => Worksheet
  ): FilterEvent = {
    val __obj = js.Dynamic.literal(getEventName = js.Any.fromFunction0(getEventName), getFieldName = js.Any.fromFunction0(getFieldName), getFilterAsync = js.Any.fromFunction0(getFilterAsync), getViz = js.Any.fromFunction0(getViz), getWorksheet = js.Any.fromFunction0(getWorksheet))
    __obj.asInstanceOf[FilterEvent]
  }
  
  @scala.inline
  implicit class FilterEventMutableBuilder[Self <: FilterEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetFieldName(value: () => String): Self = StObject.set(x, "getFieldName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFilterAsync(value: () => js.Promise[ConcreteFilter]): Self = StObject.set(x, "getFilterAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWorksheet(value: () => Worksheet): Self = StObject.set(x, "getWorksheet", js.Any.fromFunction0(value))
  }
}

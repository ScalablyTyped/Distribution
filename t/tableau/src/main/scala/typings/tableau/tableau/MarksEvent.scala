package typings.tableau.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarksEvent
  extends StObject
     with TableauEvent {
  
  /** Gets the selected marks on the Worksheet that triggered the event. */
  def getMarksAsync(): js.Promise[js.Array[Mark]]
  
  /** Gets the Worksheet object associated with the event. */
  def getWorksheet(): Worksheet
}
object MarksEvent {
  
  @scala.inline
  def apply(
    getEventName: () => TableauEventName,
    getMarksAsync: () => js.Promise[js.Array[Mark]],
    getViz: () => Viz,
    getWorksheet: () => Worksheet
  ): MarksEvent = {
    val __obj = js.Dynamic.literal(getEventName = js.Any.fromFunction0(getEventName), getMarksAsync = js.Any.fromFunction0(getMarksAsync), getViz = js.Any.fromFunction0(getViz), getWorksheet = js.Any.fromFunction0(getWorksheet))
    __obj.asInstanceOf[MarksEvent]
  }
  
  @scala.inline
  implicit class MarksEventMutableBuilder[Self <: MarksEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetMarksAsync(value: () => js.Promise[js.Array[Mark]]): Self = StObject.set(x, "getMarksAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWorksheet(value: () => Worksheet): Self = StObject.set(x, "getWorksheet", js.Any.fromFunction0(value))
  }
}

package typings.tableau.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomViewEvent
  extends StObject
     with TableauEvent {
  
  /** Gets the CustomView object associated with the event. */
  def getCustomViewAsync(): js.Promise[CustomView]
}
object CustomViewEvent {
  
  @scala.inline
  def apply(
    getCustomViewAsync: () => js.Promise[CustomView],
    getEventName: () => TableauEventName,
    getViz: () => Viz
  ): CustomViewEvent = {
    val __obj = js.Dynamic.literal(getCustomViewAsync = js.Any.fromFunction0(getCustomViewAsync), getEventName = js.Any.fromFunction0(getEventName), getViz = js.Any.fromFunction0(getViz))
    __obj.asInstanceOf[CustomViewEvent]
  }
  
  @scala.inline
  implicit class CustomViewEventMutableBuilder[Self <: CustomViewEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetCustomViewAsync(value: () => js.Promise[CustomView]): Self = StObject.set(x, "getCustomViewAsync", js.Any.fromFunction0(value))
  }
}

package typings.tableau.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParameterEvent
  extends StObject
     with TableauEvent {
  
  /** Gets the Parameter object that triggered the event. */
  def getParameterAsync(): js.Promise[Parameter]
  
  /** Gets the name of the parameter that changed. */
  def getParameterName(): String
}
object ParameterEvent {
  
  inline def apply(
    getEventName: () => TableauEventName,
    getParameterAsync: () => js.Promise[Parameter],
    getParameterName: () => String,
    getViz: () => Viz
  ): ParameterEvent = {
    val __obj = js.Dynamic.literal(getEventName = js.Any.fromFunction0(getEventName), getParameterAsync = js.Any.fromFunction0(getParameterAsync), getParameterName = js.Any.fromFunction0(getParameterName), getViz = js.Any.fromFunction0(getViz))
    __obj.asInstanceOf[ParameterEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParameterEvent] (val x: Self) extends AnyVal {
    
    inline def setGetParameterAsync(value: () => js.Promise[Parameter]): Self = StObject.set(x, "getParameterAsync", js.Any.fromFunction0(value))
    
    inline def setGetParameterName(value: () => String): Self = StObject.set(x, "getParameterName", js.Any.fromFunction0(value))
  }
}

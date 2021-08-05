package typings.tableau.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToolbarStateEvent
  extends StObject
     with TableauEvent {
  
  /** Returns the new ToolbarState. */
  def getToolbarState(): ToolbarState
}
object ToolbarStateEvent {
  
  inline def apply(getEventName: () => TableauEventName, getToolbarState: () => ToolbarState, getViz: () => Viz): ToolbarStateEvent = {
    val __obj = js.Dynamic.literal(getEventName = js.Any.fromFunction0(getEventName), getToolbarState = js.Any.fromFunction0(getToolbarState), getViz = js.Any.fromFunction0(getViz))
    __obj.asInstanceOf[ToolbarStateEvent]
  }
  
  extension [Self <: ToolbarStateEvent](x: Self) {
    
    inline def setGetToolbarState(value: () => ToolbarState): Self = StObject.set(x, "getToolbarState", js.Any.fromFunction0(value))
  }
}

package typings.tableau.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToolbarStateEvent extends TableauEvent {
  
  /** Returns the new ToolbarState. */
  def getToolbarState(): ToolbarState = js.native
}
object ToolbarStateEvent {
  
  @scala.inline
  def apply(getEventName: () => TableauEventName, getToolbarState: () => ToolbarState, getViz: () => Viz): ToolbarStateEvent = {
    val __obj = js.Dynamic.literal(getEventName = js.Any.fromFunction0(getEventName), getToolbarState = js.Any.fromFunction0(getToolbarState), getViz = js.Any.fromFunction0(getViz))
    __obj.asInstanceOf[ToolbarStateEvent]
  }
  
  @scala.inline
  implicit class ToolbarStateEventMutableBuilder[Self <: ToolbarStateEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetToolbarState(value: () => ToolbarState): Self = StObject.set(x, "getToolbarState", js.Any.fromFunction0(value))
  }
}

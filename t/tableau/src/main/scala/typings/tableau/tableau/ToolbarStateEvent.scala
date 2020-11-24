package typings.tableau.tableau

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
  implicit class ToolbarStateEventOps[Self <: ToolbarStateEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetToolbarState(value: () => ToolbarState): Self = this.set("getToolbarState", js.Any.fromFunction0(value))
  }
}

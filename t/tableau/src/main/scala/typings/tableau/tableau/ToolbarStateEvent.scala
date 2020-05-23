package typings.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolbarStateEvent extends TableauEvent {
  /** Returns the new ToolbarState. */
  def getToolbarState(): ToolbarState
}

object ToolbarStateEvent {
  @scala.inline
  def apply(getEventName: () => TableauEventName, getToolbarState: () => ToolbarState, getViz: () => Viz): ToolbarStateEvent = {
    val __obj = js.Dynamic.literal(getEventName = js.Any.fromFunction0(getEventName), getToolbarState = js.Any.fromFunction0(getToolbarState), getViz = js.Any.fromFunction0(getViz))
    __obj.asInstanceOf[ToolbarStateEvent]
  }
}


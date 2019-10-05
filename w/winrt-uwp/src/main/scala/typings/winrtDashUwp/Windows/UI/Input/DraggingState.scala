package typings.winrtDashUwp.Windows.UI.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DraggingState extends js.Object

/** Specifies the possible states of the Dragging event. */
@JSGlobal("Windows.UI.Input.DraggingState")
@js.native
object DraggingState extends js.Object {
  /** The mouse or pen/stylus contact is lifted and inertia has concluded. */
  @js.native
  sealed trait completed extends DraggingState
  
  /** The dragging interaction is in progress. */
  @js.native
  sealed trait continuing extends DraggingState
  
  /** A dragging interaction has been detected. */
  @js.native
  sealed trait started extends DraggingState
  
  /* 2 */ val completed: typings.winrtDashUwp.Windows.UI.Input.DraggingState.completed with Double = js.native
  /* 1 */ val continuing: typings.winrtDashUwp.Windows.UI.Input.DraggingState.continuing with Double = js.native
  /* 0 */ val started: typings.winrtDashUwp.Windows.UI.Input.DraggingState.started with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DraggingState with Double] = js.native
}


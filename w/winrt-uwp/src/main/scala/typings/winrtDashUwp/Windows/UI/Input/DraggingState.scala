package typings.winrtDashUwp.Windows.UI.Input

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.UI.Input.DraggingState.completed
import typings.winrtDashUwp.Windows.UI.Input.DraggingState.continuing
import typings.winrtDashUwp.Windows.UI.Input.DraggingState.started
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DraggingState with Double] = js.native
  /* 2 */ @js.native
  object completed extends TopLevel[completed with Double]
  
  /* 1 */ @js.native
  object continuing extends TopLevel[continuing with Double]
  
  /* 0 */ @js.native
  object started extends TopLevel[started with Double]
  
}


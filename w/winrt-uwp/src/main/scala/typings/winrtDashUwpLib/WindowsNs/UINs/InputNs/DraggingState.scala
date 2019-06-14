package typings
package winrtDashUwpLib.WindowsNs.UINs.InputNs

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
  sealed trait completed
    extends winrtDashUwpLib.WindowsNs.UINs.InputNs.DraggingState
  
  /** The dragging interaction is in progress. */
  @js.native
  sealed trait continuing
    extends winrtDashUwpLib.WindowsNs.UINs.InputNs.DraggingState
  
  /** A dragging interaction has been detected. */
  @js.native
  sealed trait started
    extends winrtDashUwpLib.WindowsNs.UINs.InputNs.DraggingState
  
  /* 2 */ val completed: completed with scala.Double = js.native
  /* 1 */ val continuing: continuing with scala.Double = js.native
  /* 0 */ val started: started with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.UINs.InputNs.DraggingState with scala.Double] = js.native
}


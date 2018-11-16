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
  
  val completed: completed with java.lang.String = js.native
  val continuing: continuing with java.lang.String = js.native
  val started: started with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.UINs.InputNs.DraggingState with java.lang.String] = js.native
}


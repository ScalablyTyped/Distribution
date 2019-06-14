package typings
package winrtDashUwpLib.WindowsNs.UINs.InputNs.InkingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait InkManipulationMode extends js.Object

/** Identifies the ink input mode. */
@JSGlobal("Windows.UI.Input.Inking.InkManipulationMode")
@js.native
object InkManipulationMode extends js.Object {
  /** All strokes are hit tested against all strokes in the stroke collection. If there is an intersection, InkManager deletes the stroke automatically and returns an invalidated rectangle for processPointerUpdate calls. */
  @js.native
  sealed trait erasing
    extends winrtDashUwpLib.WindowsNs.UINs.InputNs.InkingNs.InkManipulationMode
  
  /** All points are passed to the InkStrokeBuilder and an InkStroke is created. The stroke is appended to the stroke collection of the InkManager or InkStrokeContainer . */
  @js.native
  sealed trait inking
    extends winrtDashUwpLib.WindowsNs.UINs.InputNs.InkingNs.InkManipulationMode
  
  /** All points are used to create a polyline. When you call processPointerUp , the polyline is hit tested against entire stroke collection and all strokes within the polyline are marked as selected. */
  @js.native
  sealed trait selecting
    extends winrtDashUwpLib.WindowsNs.UINs.InputNs.InkingNs.InkManipulationMode
  
  /* 1 */ val erasing: erasing with scala.Double = js.native
  /* 0 */ val inking: inking with scala.Double = js.native
  /* 2 */ val selecting: selecting with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.UINs.InputNs.InkingNs.InkManipulationMode with scala.Double
  ] = js.native
}


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
  
  val erasing: erasing with java.lang.String = js.native
  val inking: inking with java.lang.String = js.native
  val selecting: selecting with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.UINs.InputNs.InkingNs.InkManipulationMode with java.lang.String
  ] = js.native
}


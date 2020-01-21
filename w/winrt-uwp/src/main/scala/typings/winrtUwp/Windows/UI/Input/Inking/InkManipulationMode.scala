package typings.winrtUwp.Windows.UI.Input.Inking

import org.scalablytyped.runtime.TopLevel
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
  sealed trait erasing extends InkManipulationMode
  
  /** All points are passed to the InkStrokeBuilder and an InkStroke is created. The stroke is appended to the stroke collection of the InkManager or InkStrokeContainer . */
  @js.native
  sealed trait inking extends InkManipulationMode
  
  /** All points are used to create a polyline. When you call processPointerUp , the polyline is hit tested against entire stroke collection and all strokes within the polyline are marked as selected. */
  @js.native
  sealed trait selecting extends InkManipulationMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InkManipulationMode with Double] = js.native
  /* 1 */ @js.native
  object erasing extends TopLevel[erasing with Double]
  
  /* 0 */ @js.native
  object inking extends TopLevel[inking with Double]
  
  /* 2 */ @js.native
  object selecting extends TopLevel[selecting with Double]
  
}


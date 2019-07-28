package typings.vscode.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DecorationRangeBehavior extends js.Object

@JSImport("vscode", "DecorationRangeBehavior")
@js.native
object DecorationRangeBehavior extends js.Object {
  /**
  		 * The decoration's range will not widen when edits occur at the start of end.
  		 */
  @js.native
  sealed trait ClosedClosed extends DecorationRangeBehavior
  
  /**
  		 * The decoration's range will widen when edits occur at the end, but not at the start.
  		 */
  @js.native
  sealed trait ClosedOpen extends DecorationRangeBehavior
  
  /**
  		 * The decoration's range will widen when edits occur at the start, but not at the end.
  		 */
  @js.native
  sealed trait OpenClosed extends DecorationRangeBehavior
  
  /**
  		 * The decoration's range will widen when edits occur at the start or end.
  		 */
  @js.native
  sealed trait OpenOpen extends DecorationRangeBehavior
  
  /* 1 */ val ClosedClosed: typings.vscode.vscodeMod.DecorationRangeBehavior.ClosedClosed with Double = js.native
  /* 3 */ val ClosedOpen: typings.vscode.vscodeMod.DecorationRangeBehavior.ClosedOpen with Double = js.native
  /* 2 */ val OpenClosed: typings.vscode.vscodeMod.DecorationRangeBehavior.OpenClosed with Double = js.native
  /* 0 */ val OpenOpen: typings.vscode.vscodeMod.DecorationRangeBehavior.OpenOpen with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DecorationRangeBehavior with Double] = js.native
}


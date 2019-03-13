package typings
package vscodeLib.vscodeMod

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
  sealed trait ClosedClosed
    extends vscodeLib.vscodeMod.DecorationRangeBehavior
  
  /**
  		 * The decoration's range will widen when edits occur at the end, but not at the start.
  		 */
  @js.native
  sealed trait ClosedOpen
    extends vscodeLib.vscodeMod.DecorationRangeBehavior
  
  /**
  		 * The decoration's range will widen when edits occur at the start, but not at the end.
  		 */
  @js.native
  sealed trait OpenClosed
    extends vscodeLib.vscodeMod.DecorationRangeBehavior
  
  /**
  		 * The decoration's range will widen when edits occur at the start or end.
  		 */
  @js.native
  sealed trait OpenOpen
    extends vscodeLib.vscodeMod.DecorationRangeBehavior
  
  /* 1 */ val ClosedClosed: ClosedClosed with scala.Double = js.native
  /* 3 */ val ClosedOpen: ClosedOpen with scala.Double = js.native
  /* 2 */ val OpenClosed: OpenClosed with scala.Double = js.native
  /* 0 */ val OpenOpen: OpenOpen with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vscodeLib.vscodeMod.DecorationRangeBehavior with scala.Double] = js.native
}


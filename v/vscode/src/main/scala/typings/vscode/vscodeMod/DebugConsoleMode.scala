package typings.vscode.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DebugConsoleMode extends js.Object

@JSImport("vscode", "DebugConsoleMode")
@js.native
object DebugConsoleMode extends js.Object {
  /**
  		 * Debug session should share debug console with its parent session.
  		 * This value has no effect for sessions which do not have a parent session.
  		 */
  @js.native
  sealed trait MergeWithParent extends DebugConsoleMode
  
  /**
  		 * Debug session should have a separate debug console.
  		 */
  @js.native
  sealed trait Separate extends DebugConsoleMode
  
  /* 1 */ val MergeWithParent: typings.vscode.vscodeMod.DebugConsoleMode.MergeWithParent with Double = js.native
  /* 0 */ val Separate: typings.vscode.vscodeMod.DebugConsoleMode.Separate with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DebugConsoleMode with Double] = js.native
}


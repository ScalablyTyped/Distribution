package typings.vscode.mod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DebugConsoleMode with Double] = js.native
  /* 1 */ @js.native
  object MergeWithParent extends TopLevel[MergeWithParent with Double]
  
  /* 0 */ @js.native
  object Separate extends TopLevel[Separate with Double]
  
}


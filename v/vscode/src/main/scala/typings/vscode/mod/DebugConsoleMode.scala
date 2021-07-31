package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DebugConsoleMode extends StObject
@JSImport("vscode", "DebugConsoleMode")
@js.native
object DebugConsoleMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DebugConsoleMode & Double] = js.native
  
  /**
    * Debug session should share debug console with its parent session.
    * This value has no effect for sessions which do not have a parent session.
    */
  @js.native
  sealed trait MergeWithParent
    extends StObject
       with DebugConsoleMode
  /* 1 */ val MergeWithParent: typings.vscode.mod.DebugConsoleMode.MergeWithParent & Double = js.native
  
  /**
    * Debug session should have a separate debug console.
    */
  @js.native
  sealed trait Separate
    extends StObject
       with DebugConsoleMode
  /* 0 */ val Separate: typings.vscode.mod.DebugConsoleMode.Separate & Double = js.native
}

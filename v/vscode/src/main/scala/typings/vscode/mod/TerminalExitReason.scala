package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TerminalExitReason extends StObject
@JSImport("vscode", "TerminalExitReason")
@js.native
object TerminalExitReason extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TerminalExitReason & Double] = js.native
  
  /**
  		 * An extension disposed the terminal.
  		 */
  @js.native
  sealed trait Extension
    extends StObject
       with TerminalExitReason
  /* 4 */ val Extension: typings.vscode.mod.TerminalExitReason.Extension & Double = js.native
  
  /**
  		 * The shell process exited.
  		 */
  @js.native
  sealed trait Process
    extends StObject
       with TerminalExitReason
  /* 2 */ val Process: typings.vscode.mod.TerminalExitReason.Process & Double = js.native
  
  /**
  		 * The window closed/reloaded.
  		 */
  @js.native
  sealed trait Shutdown
    extends StObject
       with TerminalExitReason
  /* 1 */ val Shutdown: typings.vscode.mod.TerminalExitReason.Shutdown & Double = js.native
  
  /**
  		 * Unknown reason.
  		 */
  @js.native
  sealed trait Unknown
    extends StObject
       with TerminalExitReason
  /* 0 */ val Unknown: typings.vscode.mod.TerminalExitReason.Unknown & Double = js.native
  
  /**
  		 * The user closed the terminal.
  		 */
  @js.native
  sealed trait User
    extends StObject
       with TerminalExitReason
  /* 3 */ val User: typings.vscode.mod.TerminalExitReason.User & Double = js.native
}

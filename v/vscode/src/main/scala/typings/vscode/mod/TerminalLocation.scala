package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TerminalLocation extends StObject
@JSImport("vscode", "TerminalLocation")
@js.native
object TerminalLocation extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TerminalLocation & Double] = js.native
  
  /**
  		 * In the editor area
  		 */
  @js.native
  sealed trait Editor
    extends StObject
       with TerminalLocation
  /* 2 */ val Editor: typings.vscode.mod.TerminalLocation.Editor & Double = js.native
  
  /**
  		 * In the terminal view
  		 */
  @js.native
  sealed trait Panel
    extends StObject
       with TerminalLocation
  /* 1 */ val Panel: typings.vscode.mod.TerminalLocation.Panel & Double = js.native
}

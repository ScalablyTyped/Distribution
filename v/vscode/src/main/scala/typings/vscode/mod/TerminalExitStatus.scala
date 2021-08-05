package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TerminalExitStatus extends StObject {
  
  /**
    * The exit code that a terminal exited with, it can have the following values:
    * - Zero: the terminal process or custom execution succeeded.
    * - Non-zero: the terminal process or custom execution failed.
    * - `undefined`: the user forcibly closed the terminal or a custom execution exited
    *   without providing an exit code.
    */
  val code: js.UndefOr[Double] = js.undefined
}
object TerminalExitStatus {
  
  inline def apply(): TerminalExitStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerminalExitStatus]
  }
  
  extension [Self <: TerminalExitStatus](x: Self) {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
  }
}

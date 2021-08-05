package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TerminalLinkContext extends StObject {
  
  /**
    * This is the text from the unwrapped line in the terminal.
    */
  var line: String
  
  /**
    * The terminal the link belongs to.
    */
  var terminal: Terminal
}
object TerminalLinkContext {
  
  inline def apply(line: String, terminal: Terminal): TerminalLinkContext = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any], terminal = terminal.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerminalLinkContext]
  }
  
  extension [Self <: TerminalLinkContext](x: Self) {
    
    inline def setLine(value: String): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setTerminal(value: Terminal): Self = StObject.set(x, "terminal", value.asInstanceOf[js.Any])
  }
}

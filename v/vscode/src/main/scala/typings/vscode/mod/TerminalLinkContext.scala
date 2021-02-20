package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TerminalLinkContext extends StObject {
  
  /**
    * This is the text from the unwrapped line in the terminal.
    */
  var line: String = js.native
  
  /**
    * The terminal the link belongs to.
    */
  var terminal: Terminal = js.native
}
object TerminalLinkContext {
  
  @scala.inline
  def apply(line: String, terminal: Terminal): TerminalLinkContext = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any], terminal = terminal.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerminalLinkContext]
  }
  
  @scala.inline
  implicit class TerminalLinkContextMutableBuilder[Self <: TerminalLinkContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLine(value: String): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerminal(value: Terminal): Self = StObject.set(x, "terminal", value.asInstanceOf[js.Any])
  }
}

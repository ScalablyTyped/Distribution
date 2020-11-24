package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TerminalLinkContext extends js.Object {
  
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
  implicit class TerminalLinkContextOps[Self <: TerminalLinkContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLine(value: String): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerminal(value: Terminal): Self = this.set("terminal", value.asInstanceOf[js.Any])
  }
}

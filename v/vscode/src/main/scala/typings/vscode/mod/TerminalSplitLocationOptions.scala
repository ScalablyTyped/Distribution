package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TerminalSplitLocationOptions extends StObject {
  
  /**
  		 * The parent terminal to split this terminal beside. This works whether the parent terminal
  		 * is in the panel or the editor area.
  		 */
  var parentTerminal: Terminal
}
object TerminalSplitLocationOptions {
  
  inline def apply(parentTerminal: Terminal): TerminalSplitLocationOptions = {
    val __obj = js.Dynamic.literal(parentTerminal = parentTerminal.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerminalSplitLocationOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TerminalSplitLocationOptions] (val x: Self) extends AnyVal {
    
    inline def setParentTerminal(value: Terminal): Self = StObject.set(x, "parentTerminal", value.asInstanceOf[js.Any])
  }
}

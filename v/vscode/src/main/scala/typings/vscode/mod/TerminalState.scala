package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TerminalState extends StObject {
  
  /**
    * Whether the {@link Terminal} has been interacted with. Interaction means that the
    * terminal has sent data to the process which depending on the terminal's _mode_. By
    * default input is sent when a key is pressed or when a command or extension sends text,
    * but based on the terminal's mode it can also happen on:
    *
    * - a pointer click event
    * - a pointer scroll event
    * - a pointer move event
    * - terminal focus in/out
    *
    * For more information on events that can send data see "DEC Private Mode Set (DECSET)" on
    * https://invisible-island.net/xterm/ctlseqs/ctlseqs.html
    */
  val isInteractedWith: Boolean
}
object TerminalState {
  
  inline def apply(isInteractedWith: Boolean): TerminalState = {
    val __obj = js.Dynamic.literal(isInteractedWith = isInteractedWith.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerminalState]
  }
  
  extension [Self <: TerminalState](x: Self) {
    
    inline def setIsInteractedWith(value: Boolean): Self = StObject.set(x, "isInteractedWith", value.asInstanceOf[js.Any])
  }
}

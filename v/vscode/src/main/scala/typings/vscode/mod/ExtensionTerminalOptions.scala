package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionTerminalOptions extends StObject {
  
  /**
    * A human-readable string which will be used to represent the terminal in the UI.
    */
  var name: String
  
  /**
    * An implementation of [Pseudoterminal](#Pseudoterminal) that allows an extension to
    * control a terminal.
    */
  var pty: Pseudoterminal
}
object ExtensionTerminalOptions {
  
  inline def apply(name: String, pty: Pseudoterminal): ExtensionTerminalOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pty = pty.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionTerminalOptions]
  }
  
  extension [Self <: ExtensionTerminalOptions](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPty(value: Pseudoterminal): Self = StObject.set(x, "pty", value.asInstanceOf[js.Any])
  }
}

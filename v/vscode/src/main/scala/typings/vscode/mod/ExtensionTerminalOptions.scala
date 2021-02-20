package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtensionTerminalOptions extends StObject {
  
  /**
    * A human-readable string which will be used to represent the terminal in the UI.
    */
  var name: String = js.native
  
  /**
    * An implementation of [Pseudoterminal](#Pseudoterminal) that allows an extension to
    * control a terminal.
    */
  var pty: Pseudoterminal = js.native
}
object ExtensionTerminalOptions {
  
  @scala.inline
  def apply(name: String, pty: Pseudoterminal): ExtensionTerminalOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pty = pty.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionTerminalOptions]
  }
  
  @scala.inline
  implicit class ExtensionTerminalOptionsMutableBuilder[Self <: ExtensionTerminalOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPty(value: Pseudoterminal): Self = StObject.set(x, "pty", value.asInstanceOf[js.Any])
  }
}

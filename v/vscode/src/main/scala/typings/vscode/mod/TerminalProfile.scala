package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "TerminalProfile")
@js.native
open class TerminalProfile protected () extends StObject {
  def this(options: ExtensionTerminalOptions) = this()
  /**
  		 * Creates a new terminal profile.
  		 * @param options The options that the terminal will launch with.
  		 */
  def this(options: TerminalOptions) = this()
  
  /**
  		 * The options that the terminal will launch with.
  		 */
  var options: TerminalOptions | ExtensionTerminalOptions = js.native
}

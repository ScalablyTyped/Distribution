package typings.vscodeLanguageclient.clientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Command {
  
  /**
    * Creates a new Command literal.
    */
  @JSImport("vscode-languageclient/lib/client", "Command.create")
  @js.native
  def create(title: String, command: String, args: js.Any*): typings.vscodeLanguageserverTypes.mod.Command = js.native
  
  /**
    * Checks whether the given literal conforms to the [Command](#Command) interface.
    */
  @JSImport("vscode-languageclient/lib/client", "Command.is")
  @js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.Command */ Boolean = js.native
}

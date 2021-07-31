package typings.vscodeLanguageclient.clientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Command {
  
  @JSImport("vscode-languageclient/lib/client", "Command")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new Command literal.
    */
  @scala.inline
  def create(title: String, command: String, args: js.Any*): typings.vscodeLanguageserverTypes.mod.Command = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(title.asInstanceOf[js.Any], command.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.Command]
  
  /**
    * Checks whether the given literal conforms to the [Command](#Command) interface.
    */
  @scala.inline
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.Command */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.Command */ Boolean]
}

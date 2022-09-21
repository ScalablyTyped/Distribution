package typings.vscodeLanguageclient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Command {
  
  @JSImport("vscode-languageclient", "Command")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new Command literal.
    */
  inline def create(title: String, command: String, args: Any*): typings.vscodeLanguageserverTypes.mod.Command = (^.asInstanceOf[js.Dynamic].applyDynamic("create")((List(title.asInstanceOf[js.Any], command.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.vscodeLanguageserverTypes.mod.Command]
  
  /**
    * Checks whether the given literal conforms to the [Command](#Command) interface.
    */
  inline def is(value: Any): /* is vscode-languageserver-types.vscode-languageserver-types.Command */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.Command */ Boolean]
}

package typings.vscodeDashLanguageclient.vscodeDashLanguageclientMod

import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Command
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "Command")
@js.native
object CommandNs extends js.Object {
  /**
    * Creates a new Command literal.
    */
  def create(title: String, command: String, args: js.Any*): Command = js.native
  /**
    * Checks whether the given literal conforms to the [Command](#Command) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.Command */ Boolean = js.native
}


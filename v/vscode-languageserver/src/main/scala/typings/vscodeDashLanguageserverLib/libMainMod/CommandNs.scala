package typings
package vscodeDashLanguageserverLib.libMainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver/lib/main", "Command")
@js.native
object CommandNs extends js.Object {
  /**
    * Creates a new Command literal.
    */
  def create(title: java.lang.String, command: java.lang.String, args: js.Any*): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Command = js.native
  /**
    * Checks whether the given literal conforms to the [Command](#Command) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.Command */ scala.Boolean = js.native
}


package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeJsonrpc.mod.RequestType
import typings.vscodeLanguageserverTypes.mod.CodeAction
import typings.vscodeLanguageserverTypes.mod.Command
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol", "CodeActionRequest")
@js.native
object CodeActionRequest extends js.Object {
  val `type`: RequestType[
    CodeActionParams, 
    (js.Array[Command | CodeAction]) | Null, 
    Unit, 
    CodeActionRegistrationOptions
  ] = js.native
}


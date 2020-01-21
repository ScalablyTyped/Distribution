package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeJsonrpc.mod.RequestType
import typings.vscodeLanguageserverTypes.mod.SignatureHelp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol", "SignatureHelpRequest")
@js.native
object SignatureHelpRequest extends js.Object {
  val `type`: RequestType[
    TextDocumentPositionParams, 
    SignatureHelp | Null, 
    Unit, 
    SignatureHelpRegistrationOptions
  ] = js.native
}


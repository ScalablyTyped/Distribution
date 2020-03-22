package typings.vscodeLanguageserverProtocol.mod

import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.protocolMod.SignatureHelpParams
import typings.vscodeLanguageserverProtocol.protocolMod.SignatureHelpRegistrationOptions
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashsignatureHelp
import typings.vscodeLanguageserverTypes.mod.SignatureHelp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol", "SignatureHelpRequest")
@js.native
object SignatureHelpRequest extends js.Object {
  val method: textDocumentSlashsignatureHelp = js.native
  val `type`: ProtocolRequestType[
    SignatureHelpParams, 
    SignatureHelp | Null, 
    scala.Nothing, 
    Unit, 
    SignatureHelpRegistrationOptions
  ] = js.native
}


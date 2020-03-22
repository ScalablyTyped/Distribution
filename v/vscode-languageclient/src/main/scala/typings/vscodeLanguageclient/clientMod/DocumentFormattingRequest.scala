package typings.vscodeLanguageclient.clientMod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashformatting
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.protocolMod.DocumentFormattingParams
import typings.vscodeLanguageserverProtocol.protocolMod.DocumentFormattingRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "DocumentFormattingRequest")
@js.native
object DocumentFormattingRequest extends js.Object {
  val method: textDocumentSlashformatting = js.native
  val `type`: ProtocolRequestType[
    DocumentFormattingParams, 
    js.Array[typings.vscodeLanguageserverTypes.mod.TextEdit] | Null, 
    scala.Nothing, 
    Unit, 
    DocumentFormattingRegistrationOptions
  ] = js.native
}


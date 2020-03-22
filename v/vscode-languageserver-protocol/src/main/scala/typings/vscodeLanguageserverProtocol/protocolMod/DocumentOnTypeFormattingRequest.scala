package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashonTypeFormatting
import typings.vscodeLanguageserverTypes.mod.TextEdit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol", "DocumentOnTypeFormattingRequest")
@js.native
object DocumentOnTypeFormattingRequest extends js.Object {
  val method: textDocumentSlashonTypeFormatting = js.native
  val `type`: ProtocolRequestType[
    DocumentOnTypeFormattingParams, 
    js.Array[TextEdit] | Null, 
    scala.Nothing, 
    Unit, 
    DocumentOnTypeFormattingRegistrationOptions
  ] = js.native
}


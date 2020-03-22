package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashrangeFormatting
import typings.vscodeLanguageserverTypes.mod.TextEdit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol", "DocumentRangeFormattingRequest")
@js.native
object DocumentRangeFormattingRequest extends js.Object {
  val method: textDocumentSlashrangeFormatting = js.native
  val `type`: ProtocolRequestType[
    DocumentRangeFormattingParams, 
    js.Array[TextEdit] | Null, 
    scala.Nothing, 
    Unit, 
    DocumentRangeFormattingRegistrationOptions
  ] = js.native
}


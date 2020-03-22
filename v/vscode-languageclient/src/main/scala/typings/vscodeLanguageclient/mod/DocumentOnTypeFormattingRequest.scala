package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashonTypeFormatting
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.protocolMod.DocumentOnTypeFormattingParams
import typings.vscodeLanguageserverProtocol.protocolMod.DocumentOnTypeFormattingRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "DocumentOnTypeFormattingRequest")
@js.native
object DocumentOnTypeFormattingRequest extends js.Object {
  val method: textDocumentSlashonTypeFormatting = js.native
  val `type`: ProtocolRequestType[
    DocumentOnTypeFormattingParams, 
    js.Array[typings.vscodeLanguageserverTypes.mod.TextEdit] | Null, 
    scala.Nothing, 
    Unit, 
    DocumentOnTypeFormattingRegistrationOptions
  ] = js.native
}


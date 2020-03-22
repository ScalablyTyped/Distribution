package typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod

import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashsemanticTokensSlashrange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol.sematicTokens.proposed", "SemanticTokensRangeRequest")
@js.native
object SemanticTokensRangeRequest extends js.Object {
  val method: textDocumentSlashsemanticTokensSlashrange = js.native
  val `type`: ProtocolRequestType[
    SemanticTokensRangeParams, 
    SemanticTokens | Null, 
    SemanticTokensPartialResult, 
    Unit, 
    Unit
  ] = js.native
}


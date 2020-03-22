package typings.vscodeLanguageserverProtocol.mod

import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.protocolFoldingRangeMod.FoldingRangeParams
import typings.vscodeLanguageserverProtocol.protocolFoldingRangeMod.FoldingRangeRegistrationOptions
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashfoldingRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol", "FoldingRangeRequest")
@js.native
object FoldingRangeRequest extends js.Object {
  val method: textDocumentSlashfoldingRange = js.native
  /** @deprecated Use FoldingRangeRequest.type */
  val resultType: typings.vscodeJsonrpc.mod.ProgressType[
    js.Array[typings.vscodeLanguageserverProtocol.protocolFoldingRangeMod.FoldingRange]
  ] = js.native
  val `type`: ProtocolRequestType[
    FoldingRangeParams, 
    js.Array[typings.vscodeLanguageserverProtocol.protocolFoldingRangeMod.FoldingRange] | Null, 
    js.Array[typings.vscodeLanguageserverProtocol.protocolFoldingRangeMod.FoldingRange], 
    js.Any, 
    FoldingRangeRegistrationOptions
  ] = js.native
}


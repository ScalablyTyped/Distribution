package typings.vscodeLanguageserverProtocol.protocolSelectionRangeMod

import typings.vscodeJsonrpc.mod.ProgressType
import typings.vscodeJsonrpc.mod.RequestHandler
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashselectionRange
import typings.vscodeLanguageserverTypes.mod.SelectionRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver-protocol/lib/protocol.selectionRange", "SelectionRangeRequest")
@js.native
object SelectionRangeRequest extends js.Object {
  
  val method: textDocumentSlashselectionRange = js.native
  
  /** @deprecated  Use SelectionRangeRequest.type */
  val resultType: ProgressType[js.Array[SelectionRange]] = js.native
  
  val `type`: ProtocolRequestType[
    SelectionRangeParams, 
    js.Array[SelectionRange] | Null, 
    js.Array[SelectionRange], 
    js.Any, 
    SelectionRangeRegistrationOptions
  ] = js.native
  
  type HandlerSignature = RequestHandler[SelectionRangeParams, js.Array[SelectionRange] | Null, Unit]
}

package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeJsonrpc.mod.ProgressType
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.protocolSelectionRangeMod.SelectionRangeParams
import typings.vscodeLanguageserverProtocol.protocolSelectionRangeMod.SelectionRangeRegistrationOptions
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashselectionRange
import typings.vscodeLanguageserverTypes.mod.SelectionRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SelectionRangeRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/protocol", "SelectionRangeRequest.method")
  @js.native
  val method: textDocumentSlashselectionRange = js.native
  
  /** @deprecated  Use SelectionRangeRequest.type */
  @JSImport("vscode-languageserver-protocol/lib/protocol", "SelectionRangeRequest.resultType")
  @js.native
  val resultType: ProgressType[js.Array[SelectionRange]] = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/protocol", "SelectionRangeRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    SelectionRangeParams, 
    js.Array[SelectionRange] | Null, 
    js.Array[SelectionRange], 
    js.Any, 
    SelectionRangeRegistrationOptions
  ] = js.native
}

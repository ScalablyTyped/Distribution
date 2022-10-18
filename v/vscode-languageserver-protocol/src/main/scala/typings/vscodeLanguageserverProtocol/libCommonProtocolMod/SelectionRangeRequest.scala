package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotselectionRangeMod.SelectionRangeParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotselectionRangeMod.SelectionRangeRegistrationOptions
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashselectionRange
import typings.vscodeLanguageserverTypes.mod.SelectionRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SelectionRangeRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "SelectionRangeRequest.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "SelectionRangeRequest.method")
  @js.native
  val method: textDocumentSlashselectionRange = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "SelectionRangeRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    SelectionRangeParams, 
    js.Array[SelectionRange] | Null, 
    js.Array[SelectionRange], 
    Unit, 
    SelectionRangeRegistrationOptions
  ] = js.native
}

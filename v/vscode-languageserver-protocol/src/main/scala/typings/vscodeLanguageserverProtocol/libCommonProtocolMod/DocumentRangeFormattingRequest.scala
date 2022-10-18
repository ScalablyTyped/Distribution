package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashrangeFormatting
import typings.vscodeLanguageserverTypes.mod.TextEdit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DocumentRangeFormattingRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "DocumentRangeFormattingRequest.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "DocumentRangeFormattingRequest.method")
  @js.native
  val method: textDocumentSlashrangeFormatting = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "DocumentRangeFormattingRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    DocumentRangeFormattingParams, 
    js.Array[TextEdit] | Null, 
    scala.Nothing, 
    Unit, 
    DocumentRangeFormattingRegistrationOptions
  ] = js.native
}

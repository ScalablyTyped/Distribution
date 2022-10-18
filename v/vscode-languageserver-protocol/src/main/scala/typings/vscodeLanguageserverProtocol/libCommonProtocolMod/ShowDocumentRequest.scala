package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotshowDocumentMod.ShowDocumentParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotshowDocumentMod.ShowDocumentResult
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.windowSlashshowDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ShowDocumentRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "ShowDocumentRequest.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "ShowDocumentRequest.method")
  @js.native
  val method: windowSlashshowDocument = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "ShowDocumentRequest.type")
  @js.native
  val `type`: ProtocolRequestType[ShowDocumentParams, ShowDocumentResult, Unit, Unit, Unit] = js.native
}

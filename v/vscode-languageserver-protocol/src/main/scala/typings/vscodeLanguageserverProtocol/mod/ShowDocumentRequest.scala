package typings.vscodeLanguageserverProtocol.mod

import typings.vscodeLanguageserverProtocol.protocolShowDocumentMod.ShowDocumentParams
import typings.vscodeLanguageserverProtocol.protocolShowDocumentMod.ShowDocumentResult
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.windowSlashshowDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ShowDocumentRequest {
  
  @JSImport("vscode-languageserver-protocol", "ShowDocumentRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.messagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol", "ShowDocumentRequest.method")
  @js.native
  val method: windowSlashshowDocument = js.native
  
  @JSImport("vscode-languageserver-protocol", "ShowDocumentRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType[ShowDocumentParams, ShowDocumentResult, Unit, Unit, Unit] = js.native
}

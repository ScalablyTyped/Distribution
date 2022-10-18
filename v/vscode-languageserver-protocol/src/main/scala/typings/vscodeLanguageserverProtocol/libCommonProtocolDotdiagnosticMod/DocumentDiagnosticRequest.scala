package typings.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod

import typings.vscodeJsonrpc.libCommonConnectionMod.RequestHandler
import typings.vscodeJsonrpc.mod.ProgressType
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashdiagnostic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DocumentDiagnosticRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol.diagnostic", "DocumentDiagnosticRequest.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol.diagnostic", "DocumentDiagnosticRequest.method")
  @js.native
  val method: textDocumentSlashdiagnostic = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol.diagnostic", "DocumentDiagnosticRequest.partialResult")
  @js.native
  val partialResult: ProgressType[DocumentDiagnosticReportPartialResult] = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol.diagnostic", "DocumentDiagnosticRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    DocumentDiagnosticParams, 
    DocumentDiagnosticReport, 
    DocumentDiagnosticReportPartialResult, 
    DiagnosticServerCancellationData, 
    DiagnosticRegistrationOptions
  ] = js.native
  
  type HandlerSignature = RequestHandler[DocumentDiagnosticParams, DocumentDiagnosticReport, Unit]
}

package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeJsonrpc.mod.ProgressType
import typings.vscodeLanguageserverProtocol.messagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.protocolDiagnosticMod.DiagnosticRegistrationOptions
import typings.vscodeLanguageserverProtocol.protocolDiagnosticMod.DocumentDiagnosticParams
import typings.vscodeLanguageserverProtocol.protocolDiagnosticMod.DocumentDiagnosticReport
import typings.vscodeLanguageserverProtocol.protocolDiagnosticMod.DocumentDiagnosticReportPartialResult
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashdiagnostic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DocumentDiagnosticRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "DocumentDiagnosticRequest.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "DocumentDiagnosticRequest.method")
  @js.native
  val method: textDocumentSlashdiagnostic = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "DocumentDiagnosticRequest.partialResult")
  @js.native
  val partialResult: ProgressType[DocumentDiagnosticReportPartialResult] = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "DocumentDiagnosticRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    DocumentDiagnosticParams, 
    DocumentDiagnosticReport, 
    DocumentDiagnosticReportPartialResult, 
    typings.vscodeLanguageserverProtocol.protocolDiagnosticMod.DiagnosticServerCancellationData, 
    DiagnosticRegistrationOptions
  ] = js.native
}

package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashdiagnostic
import typings.vscodeLanguageserverProtocol.protocolDiagnosticMod.DiagnosticRegistrationOptions
import typings.vscodeLanguageserverProtocol.protocolDiagnosticMod.DocumentDiagnosticParams
import typings.vscodeLanguageserverProtocol.protocolDiagnosticMod.DocumentDiagnosticReport
import typings.vscodeLanguageserverProtocol.protocolDiagnosticMod.DocumentDiagnosticReportPartialResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DocumentDiagnosticRequest {
  
  @JSImport("vscode-languageclient", "DocumentDiagnosticRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.messagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageclient", "DocumentDiagnosticRequest.method")
  @js.native
  val method: textDocumentSlashdiagnostic = js.native
  
  @JSImport("vscode-languageclient", "DocumentDiagnosticRequest.partialResult")
  @js.native
  val partialResult: typings.vscodeJsonrpc.mod.ProgressType[DocumentDiagnosticReportPartialResult] = js.native
  
  @JSImport("vscode-languageclient", "DocumentDiagnosticRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType[
    DocumentDiagnosticParams, 
    DocumentDiagnosticReport, 
    DocumentDiagnosticReportPartialResult, 
    typings.vscodeLanguageserverProtocol.protocolDiagnosticMod.DiagnosticServerCancellationData, 
    DiagnosticRegistrationOptions
  ] = js.native
}

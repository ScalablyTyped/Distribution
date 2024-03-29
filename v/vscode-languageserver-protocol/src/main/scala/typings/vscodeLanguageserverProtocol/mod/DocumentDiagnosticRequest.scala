package typings.vscodeLanguageserverProtocol.mod

import typings.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod.DiagnosticRegistrationOptions
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod.DocumentDiagnosticParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod.DocumentDiagnosticReport
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod.DocumentDiagnosticReportPartialResult
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashdiagnostic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DocumentDiagnosticRequest {
  
  @JSImport("vscode-languageserver-protocol", "DocumentDiagnosticRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol", "DocumentDiagnosticRequest.method")
  @js.native
  val method: textDocumentSlashdiagnostic = js.native
  
  @JSImport("vscode-languageserver-protocol", "DocumentDiagnosticRequest.partialResult")
  @js.native
  val partialResult: typings.vscodeJsonrpc.mod.ProgressType[DocumentDiagnosticReportPartialResult] = js.native
  
  @JSImport("vscode-languageserver-protocol", "DocumentDiagnosticRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    DocumentDiagnosticParams, 
    DocumentDiagnosticReport, 
    DocumentDiagnosticReportPartialResult, 
    typings.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod.DiagnosticServerCancellationData, 
    DiagnosticRegistrationOptions
  ] = js.native
}

package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashdiagnostic
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod.DiagnosticRegistrationOptions
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod.DocumentDiagnosticParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod.DocumentDiagnosticReport
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod.DocumentDiagnosticReportPartialResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DocumentDiagnosticRequest {
  
  @JSImport("vscode-languageclient", "DocumentDiagnosticRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageclient", "DocumentDiagnosticRequest.method")
  @js.native
  val method: textDocumentSlashdiagnostic = js.native
  
  @JSImport("vscode-languageclient", "DocumentDiagnosticRequest.partialResult")
  @js.native
  val partialResult: typings.vscodeJsonrpc.mod.ProgressType[DocumentDiagnosticReportPartialResult] = js.native
  
  @JSImport("vscode-languageclient", "DocumentDiagnosticRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    DocumentDiagnosticParams, 
    DocumentDiagnosticReport, 
    DocumentDiagnosticReportPartialResult, 
    typings.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod.DiagnosticServerCancellationData, 
    DiagnosticRegistrationOptions
  ] = js.native
}

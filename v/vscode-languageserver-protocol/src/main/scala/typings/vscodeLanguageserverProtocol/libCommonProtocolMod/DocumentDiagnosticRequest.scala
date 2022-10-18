package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeJsonrpc.mod.ProgressType
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod.DiagnosticRegistrationOptions
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod.DocumentDiagnosticParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod.DocumentDiagnosticReport
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod.DocumentDiagnosticReportPartialResult
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
    typings.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod.DiagnosticServerCancellationData, 
    DiagnosticRegistrationOptions
  ] = js.native
}

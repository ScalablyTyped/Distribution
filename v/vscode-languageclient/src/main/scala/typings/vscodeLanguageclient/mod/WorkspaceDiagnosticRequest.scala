package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.workspaceSlashdiagnostic
import typings.vscodeLanguageserverProtocol.protocolDiagnosticMod.WorkspaceDiagnosticParams
import typings.vscodeLanguageserverProtocol.protocolDiagnosticMod.WorkspaceDiagnosticReport
import typings.vscodeLanguageserverProtocol.protocolDiagnosticMod.WorkspaceDiagnosticReportPartialResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WorkspaceDiagnosticRequest {
  
  @JSImport("vscode-languageclient", "WorkspaceDiagnosticRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.messagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageclient", "WorkspaceDiagnosticRequest.method")
  @js.native
  val method: workspaceSlashdiagnostic = js.native
  
  @JSImport("vscode-languageclient", "WorkspaceDiagnosticRequest.partialResult")
  @js.native
  val partialResult: typings.vscodeJsonrpc.mod.ProgressType[WorkspaceDiagnosticReportPartialResult] = js.native
  
  @JSImport("vscode-languageclient", "WorkspaceDiagnosticRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType[
    WorkspaceDiagnosticParams, 
    WorkspaceDiagnosticReport, 
    WorkspaceDiagnosticReportPartialResult, 
    typings.vscodeLanguageserverProtocol.protocolDiagnosticMod.DiagnosticServerCancellationData, 
    Unit
  ] = js.native
}

package typings.vscodeLanguageserverProtocol.mod

import typings.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod.WorkspaceDiagnosticParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod.WorkspaceDiagnosticReport
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod.WorkspaceDiagnosticReportPartialResult
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.workspaceSlashdiagnostic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WorkspaceDiagnosticRequest {
  
  @JSImport("vscode-languageserver-protocol", "WorkspaceDiagnosticRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol", "WorkspaceDiagnosticRequest.method")
  @js.native
  val method: workspaceSlashdiagnostic = js.native
  
  @JSImport("vscode-languageserver-protocol", "WorkspaceDiagnosticRequest.partialResult")
  @js.native
  val partialResult: typings.vscodeJsonrpc.mod.ProgressType[WorkspaceDiagnosticReportPartialResult] = js.native
  
  @JSImport("vscode-languageserver-protocol", "WorkspaceDiagnosticRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    WorkspaceDiagnosticParams, 
    WorkspaceDiagnosticReport, 
    WorkspaceDiagnosticReportPartialResult, 
    typings.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod.DiagnosticServerCancellationData, 
    Unit
  ] = js.native
}

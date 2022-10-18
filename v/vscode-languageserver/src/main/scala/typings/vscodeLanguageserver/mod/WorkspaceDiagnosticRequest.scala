package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserver.vscodeLanguageserverStrings.workspaceSlashdiagnostic
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod.WorkspaceDiagnosticParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod.WorkspaceDiagnosticReport
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod.WorkspaceDiagnosticReportPartialResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WorkspaceDiagnosticRequest {
  
  @JSImport("vscode-languageserver", "WorkspaceDiagnosticRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver", "WorkspaceDiagnosticRequest.method")
  @js.native
  val method: workspaceSlashdiagnostic = js.native
  
  @JSImport("vscode-languageserver", "WorkspaceDiagnosticRequest.partialResult")
  @js.native
  val partialResult: typings.vscodeJsonrpc.mod.ProgressType[WorkspaceDiagnosticReportPartialResult] = js.native
  
  @JSImport("vscode-languageserver", "WorkspaceDiagnosticRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    WorkspaceDiagnosticParams, 
    WorkspaceDiagnosticReport, 
    WorkspaceDiagnosticReportPartialResult, 
    typings.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod.DiagnosticServerCancellationData, 
    Unit
  ] = js.native
}

package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeJsonrpc.mod.ProgressType
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod.WorkspaceDiagnosticParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod.WorkspaceDiagnosticReport
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod.WorkspaceDiagnosticReportPartialResult
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.workspaceSlashdiagnostic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WorkspaceDiagnosticRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "WorkspaceDiagnosticRequest.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "WorkspaceDiagnosticRequest.method")
  @js.native
  val method: workspaceSlashdiagnostic = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "WorkspaceDiagnosticRequest.partialResult")
  @js.native
  val partialResult: ProgressType[WorkspaceDiagnosticReportPartialResult] = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "WorkspaceDiagnosticRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    WorkspaceDiagnosticParams, 
    WorkspaceDiagnosticReport, 
    WorkspaceDiagnosticReportPartialResult, 
    typings.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod.DiagnosticServerCancellationData, 
    Unit
  ] = js.native
}

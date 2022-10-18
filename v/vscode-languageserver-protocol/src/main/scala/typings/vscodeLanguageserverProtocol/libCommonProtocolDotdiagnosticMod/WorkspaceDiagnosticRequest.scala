package typings.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod

import typings.vscodeJsonrpc.libCommonConnectionMod.RequestHandler
import typings.vscodeJsonrpc.mod.ProgressType
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.workspaceSlashdiagnostic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WorkspaceDiagnosticRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol.diagnostic", "WorkspaceDiagnosticRequest.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol.diagnostic", "WorkspaceDiagnosticRequest.method")
  @js.native
  val method: workspaceSlashdiagnostic = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol.diagnostic", "WorkspaceDiagnosticRequest.partialResult")
  @js.native
  val partialResult: ProgressType[WorkspaceDiagnosticReportPartialResult] = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol.diagnostic", "WorkspaceDiagnosticRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    WorkspaceDiagnosticParams, 
    WorkspaceDiagnosticReport, 
    WorkspaceDiagnosticReportPartialResult, 
    DiagnosticServerCancellationData, 
    Unit
  ] = js.native
  
  type HandlerSignature = RequestHandler[WorkspaceDiagnosticParams, WorkspaceDiagnosticReport | Null, Unit]
}

package typings.vscodeLanguageserver.anon

import typings.vscodeJsonrpc.libCommonDisposableMod.Disposable
import typings.vscodeLanguageserver.libCommonServerMod.ServerRequestHandler
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod.DiagnosticServerCancellationData
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod.DocumentDiagnosticParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod.DocumentDiagnosticReport
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod.DocumentDiagnosticReportPartialResult
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod.WorkspaceDiagnosticParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod.WorkspaceDiagnosticReport
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod.WorkspaceDiagnosticReportPartialResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait On extends StObject {
  
  /**
    * Installs a handler for the document diagnostic request.
    *
    * @param handler The corresponding handler.
    */
  def on(
    handler: ServerRequestHandler[
      DocumentDiagnosticParams, 
      DocumentDiagnosticReport, 
      DocumentDiagnosticReportPartialResult, 
      DiagnosticServerCancellationData
    ]
  ): Disposable
  
  /**
    * Installs a handler for the workspace diagnostic request.
    *
    * @param handler The corresponding handler.
    */
  def onWorkspace(
    handler: ServerRequestHandler[
      WorkspaceDiagnosticParams, 
      WorkspaceDiagnosticReport, 
      WorkspaceDiagnosticReportPartialResult, 
      DiagnosticServerCancellationData
    ]
  ): Disposable
  
  /**
    * Asks the client to refresh all diagnostics provided by this server by
    * pull for the corresponding documents again.
    */
  def refresh(): Unit
}
object On {
  
  inline def apply(
    on: ServerRequestHandler[
      DocumentDiagnosticParams, 
      DocumentDiagnosticReport, 
      DocumentDiagnosticReportPartialResult, 
      DiagnosticServerCancellationData
    ] => Disposable,
    onWorkspace: ServerRequestHandler[
      WorkspaceDiagnosticParams, 
      WorkspaceDiagnosticReport, 
      WorkspaceDiagnosticReportPartialResult, 
      DiagnosticServerCancellationData
    ] => Disposable,
    refresh: () => Unit
  ): On = {
    val __obj = js.Dynamic.literal(on = js.Any.fromFunction1(on), onWorkspace = js.Any.fromFunction1(onWorkspace), refresh = js.Any.fromFunction0(refresh))
    __obj.asInstanceOf[On]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: On] (val x: Self) extends AnyVal {
    
    inline def setOn(
      value: ServerRequestHandler[
          DocumentDiagnosticParams, 
          DocumentDiagnosticReport, 
          DocumentDiagnosticReportPartialResult, 
          DiagnosticServerCancellationData
        ] => Disposable
    ): Self = StObject.set(x, "on", js.Any.fromFunction1(value))
    
    inline def setOnWorkspace(
      value: ServerRequestHandler[
          WorkspaceDiagnosticParams, 
          WorkspaceDiagnosticReport, 
          WorkspaceDiagnosticReportPartialResult, 
          DiagnosticServerCancellationData
        ] => Disposable
    ): Self = StObject.set(x, "onWorkspace", js.Any.fromFunction1(value))
    
    inline def setRefresh(value: () => Unit): Self = StObject.set(x, "refresh", js.Any.fromFunction0(value))
  }
}

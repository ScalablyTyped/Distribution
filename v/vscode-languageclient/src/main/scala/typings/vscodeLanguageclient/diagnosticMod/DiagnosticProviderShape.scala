package typings.vscodeLanguageclient.diagnosticMod

import typings.vscode.mod.EventEmitter
import typings.vscodeLanguageclient.diagnosticMod.vsdiag.DiagnosticProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagnosticProviderShape extends StObject {
  
  var diagnostics: DiagnosticProvider
  
  var onDidChangeDiagnosticsEmitter: EventEmitter[Unit]
}
object DiagnosticProviderShape {
  
  inline def apply(diagnostics: DiagnosticProvider, onDidChangeDiagnosticsEmitter: EventEmitter[Unit]): DiagnosticProviderShape = {
    val __obj = js.Dynamic.literal(diagnostics = diagnostics.asInstanceOf[js.Any], onDidChangeDiagnosticsEmitter = onDidChangeDiagnosticsEmitter.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagnosticProviderShape]
  }
  
  extension [Self <: DiagnosticProviderShape](x: Self) {
    
    inline def setDiagnostics(value: DiagnosticProvider): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    inline def setOnDidChangeDiagnosticsEmitter(value: EventEmitter[Unit]): Self = StObject.set(x, "onDidChangeDiagnosticsEmitter", value.asInstanceOf[js.Any])
  }
}

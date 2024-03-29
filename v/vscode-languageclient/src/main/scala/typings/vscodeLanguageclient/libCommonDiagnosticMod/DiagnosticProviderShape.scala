package typings.vscodeLanguageclient.libCommonDiagnosticMod

import typings.vscode.mod.EventEmitter
import typings.vscodeLanguageclient.libCommonDiagnosticMod.vsdiag.DiagnosticProvider
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DiagnosticProviderShape] (val x: Self) extends AnyVal {
    
    inline def setDiagnostics(value: DiagnosticProvider): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    inline def setOnDidChangeDiagnosticsEmitter(value: EventEmitter[Unit]): Self = StObject.set(x, "onDidChangeDiagnosticsEmitter", value.asInstanceOf[js.Any])
  }
}
